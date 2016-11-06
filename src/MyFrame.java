/**
 * Created by MAGDA on 2016-11-03.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
    public MyFrame()
    {
        JPanel panel = new JPanel();
        JFrame jfr = new JFrame("Witamy na naszej Ścieżce! ;)");
        jfr.setPreferredSize(new Dimension(400, 250));
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jfr.setLayout(new FlowLayout());
        jfr.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        panel.setBackground(Color.pink);

        JLabel label = new JLabel("M E N U");
        label.setLayout(new BoxLayout(label, BoxLayout.LINE_AXIS));
        label.setFont(new Font("Serif", Font.PLAIN, 22));
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        
        JButton button1 = new JButton("START");
        JButton button2 = new JButton("Najlepsi");
        JButton button3 = new JButton("INFO");
        JButton button4 = new JButton("EXIT");
        
        panel.add(button1);
        button1.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        button1.setSize(150, 60);
        button1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60)); // button.getMinimumSize().height
        button1.setMinimumSize(getSize());
        
        panel.add(button2);
        button2.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        button2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        button2.setMinimumSize(getSize());
        
        panel.add(button3);
        button3.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        button3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        button3.setMinimumSize(getSize());
        
        panel.add(button4);
        button4.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        panel.setVisible(true);
        button4.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        button4.setMinimumSize(getSize());

        button1.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {
                jfr.setVisible(false);
                new Button1();
            }
        });
        button2.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {

            }
        });
        button3.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {
                jfr.setVisible(false);
                new Button3();
            }
        });
        button4.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        

        jfr.pack();
        jfr.setVisible(true);
    }
}
