/**
 * Created by MAGDA on 2016-11-03.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

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
        
        JButton buttonStart = new JButton("START");
        JButton buttonNajlepsi = new JButton("Najlepsi");
        JButton buttonInfo = new JButton("INFO");
        JButton buttonExit = new JButton("EXIT");
        
        panel.add(buttonStart);
        buttonStart.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        buttonStart.setSize(150, 60);
        buttonStart.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60)); // button.getMinimumSize().height
        buttonStart.setMinimumSize(getSize());
        
        panel.add(buttonNajlepsi);
        buttonNajlepsi.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        buttonNajlepsi.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        buttonNajlepsi.setMinimumSize(getSize());
        
        panel.add(buttonInfo);
        buttonInfo.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        buttonInfo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        buttonInfo.setMinimumSize(getSize());
        
        panel.add(buttonExit);
        buttonExit.setAlignmentX(panel.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(15,15)));
        panel.setVisible(true);
        buttonExit.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        buttonExit.setMinimumSize(getSize());

        buttonStart.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {
                jfr.setVisible(false);
                new ButtonStart();
            }
        });
        buttonNajlepsi.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {
                jfr.setVisible(false);
                new ButtonNajlepsi();                
                
            }
        });
        buttonInfo.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {
                jfr.setVisible(false);
                new ButtonInfo();
            }
        });
        buttonExit.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        

        jfr.pack();
        jfr.setVisible(true);
    }
}
