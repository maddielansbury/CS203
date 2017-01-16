package clockapp;

public class TimeModel {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    
    public TimeModel() {
        seconds = 40;
        minutes = 0;
        hours = 0;
    }
    
    public void tick() {
        if(seconds == 59) {
            if(minutes == 59) {
                hours = (hours + 1) % 24;
            }
            minutes = (minutes + 1) % 60;
        }
        seconds = (seconds + 1) % 60;
    }
    
    public int addHour(int h) {
        hours = (hours + h) % 24;
        if(hours < 0)
            hours = hours + 24;
        return hours;
    }
    
    public int getHour() {
        return hours;
    }
    

    public int addMinute(int m) {
        minutes = (minutes + m) % 60;
        if(minutes < 0)
            minutes = minutes + 60;
        return minutes;
    }
    
    public int getMinute() {
        return minutes;
    }
    
    public int addSecond(int s) {
        seconds = (seconds + s) % 60;
        if(seconds < 0)
            seconds = seconds + 60;
        return seconds;
    }
    
    public int getSecond() {
        return seconds;
    }
    
    public int getSeconds() {
        return seconds + 60*getMinute() + 3600*getHour();
    }
    
    public String toString() {
        return "Hour: " + getHour() + ". Minute: " + getMinute() + ". Second: " +
                getSecond() + ". Total Seconds: " + seconds;
    }
    
}
