/**
 * Created by MAGDA on 2016-11-05.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Nick extends JFrame {
    
    public Nick()
    {
        JFrame jfr = new JFrame("Nick");
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setSize(400, 300);
        
        JTextField nick = new JTextField(15);
        jfr.add(nick);
        nick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nick2 = nick.getText();
            }
        });



        JButton button = new JButton("Anuluj");
        jfr.add(button);
        button.getBaselineResizeBehavior();
        button.setAlignmentX(jfr.CENTER_ALIGNMENT);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jfr.setVisible(false);
                new MyFrame();
            }
        });
        
        jfr.setVisible(true);
    }
    
}
