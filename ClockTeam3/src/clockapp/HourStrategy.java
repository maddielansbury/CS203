package clockapp;

public class HourStrategy implements TimeStrategy{

    ClockView clockView = null;
    
    public HourStrategy(ClockView cv) {
        this.clockView = cv;
    }
    
    public void updateView(TimeModel tm) {
        clockView.setHourTime(tm.getHour());
        clockView.setMinuteTime(tm.getMinute());
        clockView.setSecondTime(tm.getSecond());
    }
    
    public void clockTick(TimeModel tm) {
        // When your changing the clock don't tick the clock
    }

    public void upExecute(TimeModel tm) {
        tm.addHour(1);
        updateView(tm);
    }

    public void downExecute(TimeModel tm) {
        tm.addHour(-1);
        updateView(tm);
    }
    
}
