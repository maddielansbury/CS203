package clockapp;

import java.net.URISyntaxException;

public class ClockApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException {
        TimeModel timeModel = new TimeModel();
        AlarmModel alarmModel = new AlarmModel();
        ClockView clockView = new ClockView();
        clockView.setVisible(true);
        TimeController timeController = new TimeController(timeModel, alarmModel, clockView);
        
    }
    
}
