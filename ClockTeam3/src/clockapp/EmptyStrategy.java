package clockapp;

public class EmptyStrategy implements TimeStrategy{

    ClockView clockView = null;
    
    public EmptyStrategy(ClockView cv) {
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

    }

    public void downExecute(TimeModel tm) {

    }
    
}
