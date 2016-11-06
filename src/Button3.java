/**
 * Created by MAGDA on 2016-11-05.
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class Button3 extends JFrame {
    Button3() {
        JFrame jfr = new JFrame("Informacje o grze");
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setPreferredSize(new Dimension(600, 500));
        jfr.setLayout(new FlowLayout());

        JTextField infoField = new JTextField("Tutaj bedzie opisana gra");
        jfr.add(infoField);
        infoField.setVisible(true);
        
        JButton button = new JButton("Powrót do menu");
        jfr.add(button);
        button.getBaselineResizeBehavior();
        button.setAlignmentX(jfr.CENTER_ALIGNMENT);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jfr.setVisible(false);
                new MyFrame();
            }
        });

        jfr.pack();
        jfr.setVisible(true);

    }
}
