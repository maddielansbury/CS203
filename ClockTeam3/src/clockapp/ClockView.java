package clockapp;

import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ClockView extends JFrame {

    // Buttons on the clock
    private JButton lockButton = new JButton("Lock");
    private JButton setTimeButton = new JButton("Set Time");
    private JButton setAlarmButton = new JButton("Set Alarm");
    private JButton hourButton = new JButton("Hour");
    private JButton minuteButton = new JButton("Minute");
    private JButton upButton = new JButton("Up");
    private JButton downButton = new JButton("Down");

    // Time displayed on clock
    private JLabel hourTime1 = new JLabel();
    private JLabel hourTime2 = new JLabel();
    private JLabel colon1 = new JLabel();
    private JLabel minuteTime1 = new JLabel();
    private JLabel minuteTime2 = new JLabel();
    private JLabel colon2 = new JLabel();
    private JLabel secondTime1 = new JLabel();
    private JLabel secondTime2 = new JLabel();

    // Background components
    private JLabel background = new JLabel();
    private JLabel space = new JLabel();

    // The number icons
    private final Icon zero = new ImageIcon("images/0.png");
    private final Icon one = new ImageIcon("images/1.png");
    private final Icon two = new ImageIcon("images/2.png");
    private final Icon three = new ImageIcon("images/3.png");
    private final Icon four = new ImageIcon("images/4.png");
    private final Icon five = new ImageIcon("images/5.png");
    private final Icon six = new ImageIcon("images/6.png");
    private final Icon seven = new ImageIcon("images/7.png");
    private final Icon eight = new ImageIcon("images/8.png");
    private final Icon nine = new ImageIcon("images/9.png");
    private final Icon colon = new ImageIcon("images/colon.png");

    // Background elements
    private final Icon skynight = new ImageIcon("images/nightsky.png");
    private final Icon sky6 = new ImageIcon("images/6sky.png");
    private final Icon sky7 = new ImageIcon("images/7sky.png");
    private final Icon sky8 = new ImageIcon("images/8sky.png");
    private final Icon sky9 = new ImageIcon("images/9sky.png");
    private final Icon sky10 = new ImageIcon("images/10sky.png");
    private final Icon sky11 = new ImageIcon("images/11sky.png");
    private final Icon sky12 = new ImageIcon("images/12sky.png");
    private final Icon sky13 = new ImageIcon("images/13sky.png");
    private final Icon sky14 = new ImageIcon("images/14sky.png");
    private final Icon sky15 = new ImageIcon("images/15sky.png");
    private final Icon sky16 = new ImageIcon("images/16sky.png");
    private final Icon sky17 = new ImageIcon("images/17sky.png");
    private final Icon sky18 = new ImageIcon("images/18sky.png");
    private final Icon spacer = new ImageIcon("images/spacer.png");
    
    // Constructor
    public ClockView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(604, 386);
        JPanel time = new JPanel();
        time.setOpaque(false);
        JPanel buttons = new JPanel();
        buttons.setOpaque(false);
        resetButtonState();

        
        // Set up background
        add(background);
        background.setLayout(new FlowLayout());        
        space.setIcon(spacer);

        // Set up colons
        colon1.setIcon(colon);
        colon2.setIcon(colon);

        // Add clock to the "time" panel
        time.add(hourTime1);
        time.add(hourTime2);
        time.add(colon1);
        time.add(minuteTime1);
        time.add(minuteTime2);
        time.add(colon2);
        time.add(secondTime1);
        time.add(secondTime2);

        // Add buttons to the "buttons" panel
        buttons.add(lockButton);
        buttons.add(setTimeButton);
        buttons.add(setAlarmButton);
        buttons.add(hourButton);
        buttons.add(minuteButton);
        buttons.add(upButton);
        buttons.add(downButton);

        // Add "space," "time," & "buttons" panel to the background
        background.add(space);
        background.add(time);
        background.add(buttons);
    }

    // Setters
    public void setHourTime(int hour) {
        int firstDigit = (int) hour / 10;
        int secondDigit = hour % 10;

        switch (firstDigit) {
            case 1:
                hourTime1.setIcon(one);
                break;
            case 2:
                hourTime1.setIcon(two);
                break;
            default:
                hourTime1.setIcon(zero);
                break;
        }
        switch (secondDigit) {
            case 1:
                hourTime2.setIcon(one);
                break;
            case 2:
                hourTime2.setIcon(two);
                break;
            case 3:
                hourTime2.setIcon(three);
                break;
            case 4:
                hourTime2.setIcon(four);
                break;
            case 5:
                hourTime2.setIcon(five);
                break;
            case 6:
                hourTime2.setIcon(six);
                break;
            case 7:
                hourTime2.setIcon(seven);
                break;
            case 8:
                hourTime2.setIcon(eight);
                break;
            case 9:
                hourTime2.setIcon(nine);
                break;
            default:
                hourTime2.setIcon(zero);
                break;
        }

        switch (hour) {
            case 6:
                background.setIcon(sky6);
                break;
            case 7:
                background.setIcon(sky7);
                break;
            case 8:
                background.setIcon(sky8);
                break;
            case 9:
                background.setIcon(sky9);
                break;
            case 10:
                background.setIcon(sky10);
                break;
            case 11:
                background.setIcon(sky11);
                break;
            case 12:
                background.setIcon(sky12);
                break;
            case 13:
                background.setIcon(sky13);
                break;
            case 14:
                background.setIcon(sky14);
                break;
            case 15:
                background.setIcon(sky15);
                break;
            case 16:
                background.setIcon(sky16);
                break;
            case 17:
                background.setIcon(sky17);
                break;
            case 18:
                background.setIcon(sky18);
                break;
            default:
                background.setIcon(skynight);
        }
    }

    public void setMinuteTime(int minute) {
        int firstDigit = (int) minute / 10;
        int secondDigit = minute % 10;

        switch (firstDigit) {
            case 1:
                minuteTime1.setIcon(one);
                break;
            case 2:
                minuteTime1.setIcon(two);
                break;
            case 3:
                minuteTime1.setIcon(three);
                break;
            case 4:
                minuteTime1.setIcon(four);
                break;
            case 5:
                minuteTime1.setIcon(five);
                break;
            default:
                minuteTime1.setIcon(zero);
                break;
        }
        switch (secondDigit) {
            case 1:
                minuteTime2.setIcon(one);
                break;
            case 2:
                minuteTime2.setIcon(two);
                break;
            case 3:
                minuteTime2.setIcon(three);
                break;
            case 4:
                minuteTime2.setIcon(four);
                break;
            case 5:
                minuteTime2.setIcon(five);
                break;
            case 6:
                minuteTime2.setIcon(six);
                break;
            case 7:
                minuteTime2.setIcon(seven);
                break;
            case 8:
                minuteTime2.setIcon(eight);
                break;
            case 9:
                minuteTime2.setIcon(nine);
                break;
            default:
                minuteTime2.setIcon(zero);
                break;
        }
    }

    public void setSecondTime(int second) {
        int firstDigit = (int) second / 10;
        int secondDigit = second % 10;

        switch (firstDigit) {
            case 1:
                secondTime1.setIcon(one);
                break;
            case 2:
                secondTime1.setIcon(two);
                break;
            case 3:
                secondTime1.setIcon(three);
                break;
            case 4:
                secondTime1.setIcon(four);
                break;
            case 5:
                secondTime1.setIcon(five);
                break;
            default:
                secondTime1.setIcon(zero);
                break;
        }
        switch (secondDigit) {
            case 1:
                secondTime2.setIcon(one);
                break;
            case 2:
                secondTime2.setIcon(two);
                break;
            case 3:
                secondTime2.setIcon(three);
                break;
            case 4:
                secondTime2.setIcon(four);
                break;
            case 5:
                secondTime2.setIcon(five);
                break;
            case 6:
                secondTime2.setIcon(six);
                break;
            case 7:
                secondTime2.setIcon(seven);
                break;
            case 8:
                secondTime2.setIcon(eight);
                break;
            case 9:
                secondTime2.setIcon(nine);
                break;
            default:
                secondTime2.setIcon(zero);
                break;
        }
    }

    // Change button states
    /**
     * Resets all button states to default
     */
    private void resetButtonState() {
        lockButton.setEnabled(true);
        setTimeButton.setEnabled(true);
        setAlarmButton.setEnabled(true);
        hourButton.setEnabled(false);
        minuteButton.setEnabled(false);
        upButton.setEnabled(false);
        downButton.setEnabled(false);
    }

    /**
     * Set button states to locked
     */
    public void lockButtonState() {
        resetButtonState();
    }

    /**
     * Set button states for when user clicks set time
     */
    public void setTimeState() {
        resetButtonState();
        setTimeButton.setEnabled(false);
        hourButton.setEnabled(true);
        minuteButton.setEnabled(true);
    }

    /**
     * Set button states for when user clicks set alarm
     */
    public void setAlarmState() {
        resetButtonState();
        setAlarmButton.setEnabled(false);
        hourButton.setEnabled(true);
        minuteButton.setEnabled(true);
    }

    /**
     * Set button states for when hour is being changed
     */
    public void hourState() {
        resetButtonState();
        setTimeButton.setEnabled(false);
        setAlarmButton.setEnabled(false);
        minuteButton.setEnabled(true);
        upButton.setEnabled(true);
        downButton.setEnabled(true);
    }

    /**
     * Set button states for when hour is being changed
     */
    public void minuteState() {
        resetButtonState();
        setTimeButton.setEnabled(false);
        setAlarmButton.setEnabled(false);
        hourButton.setEnabled(true);
        upButton.setEnabled(true);
        downButton.setEnabled(true);
    }

    // Action listeners
    public void addLockListener(ActionListener listenForLockButton) {
        lockButton.addActionListener(listenForLockButton);
    }

    public void addSetTimeListener(ActionListener listenForSetTimeButton) {
        setTimeButton.addActionListener(listenForSetTimeButton);
    }

    public void addHourListener(ActionListener listenForHourButton) {
        hourButton.addActionListener(listenForHourButton);
    }

    public void addMinuteListener(ActionListener listenForMinuteButton) {
        minuteButton.addActionListener(listenForMinuteButton);
    }

    public void addUpListener(ActionListener listenForUpButton) {
        upButton.addActionListener(listenForUpButton);
    }

    public void addDownListener(ActionListener listenForDownButton) {
        downButton.addActionListener(listenForDownButton);
    }

    public void addSetAlarmListener(ActionListener listenForSetAlarmButton) {
        setAlarmButton.addActionListener(listenForSetAlarmButton);
    }

    // Ring the alarm
    public void alarmRing() {
        //        Thread t = new Thread(new Runnable() {
        //            public void run() {
        //                JOptionPane.showMessageDialog(null, "the alarm went off!! :O");
        //            }
        //        });
        //        t.start();

        URI uri;
        try {
            uri = new URI("http://rick.amigocraft.net/");

            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    desktop.browse(uri);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(ClockView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
