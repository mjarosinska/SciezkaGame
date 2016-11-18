/**
 * Created by MAGDA on 2016-11-05.
 */
import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

class Nick extends JFrame {
    
    public Nick()
    {

        OutputStream output = null;
        Properties prop = new Properties();

        try {
            String jfr = JOptionPane.showInputDialog(null, "Podaj NICK", "Gratulacje!", JOptionPane.CLOSED_OPTION);

            output = new FileOutputStream("C:\\Users\\MAGDA\\IdeaProjects\\FirstProject\\src\\bestScoresNick.properties");

            prop.setProperty("10000", "Magda");
            prop.setProperty("10001", "Bartek");
            prop.setProperty("10003", "Wojtek");
            prop.setProperty("10005", jfr);
            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        
    }
    
}
