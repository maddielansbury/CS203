package clockapp;

import java.util.ArrayList;

class LockStrategy implements TimeStrategy {

    ClockView clockView = null;
    
    public LockStrategy(ClockView cv) {
        this.clockView = cv;
    }

    public void updateView(TimeModel tm) {
        clockView.setHourTime(tm.getHour());
        clockView.setMinuteTime(tm.getMinute());
        clockView.setSecondTime(tm.getSecond());
    }
    
    public void clockTick(TimeModel tm) {
        tm.tick();
        updateView(tm);
    }
    
    public void clockInvisibleTick(TimeModel tm) {
        tm.tick();
    }
    
    public void upExecute(TimeModel tm) {
        
    }
    
    public void downExecute(TimeModel tm) {
        
    }
}
