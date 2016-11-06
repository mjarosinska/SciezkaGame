/**
 * Created by MAGDA on 2016-11-05.
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class ButtonInfo extends JFrame {
    ButtonInfo() {
        JFrame jfr = new JFrame("Informacje o grze");
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setPreferredSize(new Dimension(600, 500));

        JLabel label = new JLabel();
        label.setText("<html><br> Twórcy: <br><br> Magdalena Jarosińska <br> Wojciech Rogman" +
                "<br><br> Zasady gry:  ... </html>");
        jfr.add(label);
        
        JButton button = new JButton("Powrót do menu");
        jfr.add(button);
        button.getBaselineResizeBehavior();
        jfr.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        jfr.add(button, c);
        
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
