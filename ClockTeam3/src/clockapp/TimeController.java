package clockapp;

import static clockapp.State.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class TimeController {

    private TimeModel timeModel = null;
    private ClockView clockView = null;
    private TimeStrategy timeStrategy = null;
    private AlarmModel alarmModel = null;

    /**
     * Keeps track of each state the controller can be in
     */
    private State state;

    /**
     * Constructor
     * 
     * @param timeModel
     * @param clockView 
     */
    public TimeController(TimeModel timeModel, AlarmModel alarmModel, ClockView clockView) throws URISyntaxException {
        this.timeModel = timeModel;
        this.alarmModel = alarmModel;
        this.clockView = clockView;
        
        // Default TimeStrategy
        timeStrategy = new LockStrategy(clockView);
        state = LOCK; // Default state

        addActionListeners();
        
        // Ticks the clock every 1000ms
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                if(state == SETALARM) {
                    new LockStrategy(clockView).clockInvisibleTick(timeModel);
                }
                timeStrategy.clockTick(timeModel);
                if(timeModel.getSeconds() == alarmModel.getSeconds()) {
                    clockView.alarmRing();
                }
            }
        }, 0, 1000);
    }

    /**
     * Adds the action listeners for all of the buttons
     */
    private void addActionListeners() {
        
        this.clockView.addLockListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                state = LOCK;
                timeStrategy = new LockStrategy(clockView);
                clockView.lockButtonState(); // Set active/inactive buttons
            }
        });
        
        this.clockView.addSetTimeListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                state = SETTIME;
                clockView.setTimeState(); // Set active/inactive buttons
                timeStrategy = new EmptyStrategy(clockView);
                timeStrategy.updateView(timeModel);
            }
        });
        
        this.clockView.addSetAlarmListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                state = SETALARM;
                clockView.setAlarmState(); // Set active/inactive buttons
                timeStrategy = new EmptyStrategy(clockView);
                timeStrategy.updateView(alarmModel);
            }
        });

        this.clockView.addHourListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (state == SETTIME || state == SETALARM) {
                    timeStrategy = new HourStrategy(clockView);
                    clockView.hourState(); // Set active/inactive buttons
                }
            }
        });

        this.clockView.addMinuteListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (state == SETTIME || state == SETALARM) {
                    timeStrategy = new MinuteStrategy(clockView);
                    clockView.minuteState(); // Set active/inactive buttons
                }
            }
        });

        this.clockView.addUpListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(state == SETTIME)
                    timeStrategy.upExecute(timeModel);
                else if(state == SETALARM)
                    timeStrategy.upExecute(alarmModel);
            }
        });
        
        this.clockView.addDownListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(state == SETTIME)
                    timeStrategy.downExecute(timeModel);
                else if(state == SETALARM)
                    timeStrategy.downExecute(alarmModel);
            }
        });
    }

}
