/**
 * Created by MAGDA on 2016-11-05.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonStart extends JFrame{

    ButtonStart() {
        JFrame jfr = new JFrame("Wybór poziomu");
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setPreferredSize(new Dimension(400, 200));
        JLabel label = new JLabel("Wybierz poziom: ");
        jfr.add(label, BorderLayout.PAGE_START);
        jfr.add(label);
        
        String[] levels = { " ", "Łatwy", "Średni", "Hardcorowy" };
        JComboBox levelsList = new JComboBox(levels);
        levelsList.setSelectedIndex(0);
        levelsList.setPreferredSize(new Dimension(200,40));
        jfr.add(levelsList, BorderLayout.PAGE_START);
        levelsList.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        levelsList.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {

                int choice = levelsList.getSelectedIndex();

                switch(choice){
                    case 0:
                        break;
                    case 1:
                        jfr.setVisible(false);
                        new GamePanel();
                        break;
                    case 2:
                        jfr.setVisible(false);
                        new GamePanel();
                        break;
                    case 3:
                        jfr.setVisible(false);
                        new GamePanel();
                        break;
                }
        };
        });
         
        JButton button = new JButton("Powrót do menu");
        //jfr.add(button, BorderLayout.PAGE_END);
        //button.setAlignmentX(jfr.CENTER_ALIGNMENT);
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
