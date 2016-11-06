/**
 * Created by MAGDA on 2016-11-03.
 */
import javax.swing.*;
import java.awt.EventQueue;

public class FirstProject {

    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MyFrame myFrame = new MyFrame();
                //Nick nick = new Nick();
            }
        });
    }
}

