package clockapp;

public interface TimeStrategy {
    
    public void clockTick(TimeModel tm);
    public void upExecute(TimeModel tm);
    public void downExecute(TimeModel tm);
    public void updateView(TimeModel tm);
}
