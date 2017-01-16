package clockapp;

public class MinuteStrategy implements TimeStrategy{

    ClockView clockView = null;
    
    public MinuteStrategy(ClockView cv) {
        this.clockView = cv;
    }
    
    public void updateView(TimeModel tm) {
        clockView.setHourTime(tm.getHour());
        clockView.setMinuteTime(tm.getMinute());
        clockView.setSecondTime(tm.getSecond());
    }
    
    public void clockTick(TimeModel tm) {
    }

    public void upExecute(TimeModel tm) {
        tm.addMinute(1);
        updateView(tm);
    }

    public void downExecute(TimeModel tm) {
        tm.addMinute(-1);
        updateView(tm);
    }
    
}
