import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import javax.swing.table.DefaultTableModel;

/**
 * Created by MAGDA on 2016-11-10.
 */

class ButtonNajlepsi extends JPanel {

    ButtonNajlepsi() throws Exception {

        InputStream input1 = null;
        InputStream input2 = null;
        Properties prop1 = new Properties();
        Properties prop2 = new Properties();

        input1 = getClass().getClassLoader().getResourceAsStream("bestScoresPoints.properties");
        input2 = getClass().getClassLoader().getResourceAsStream("bestScoresNick.properties");
        if ((input1 == null) || (input2 == null)) {
            System.out.println("Nie udało sie znalezc pliku z wynikami ");
            return;
        }

        prop1.load(input1);
        prop2.load(input2);
        ArrayList<Integer> pointsList = new ArrayList<>();
        ArrayList<String> nickList = new ArrayList<>();

        Enumeration<?> e = prop1.propertyNames();
        while (e.hasMoreElements()) {

            String key = (String) e.nextElement();
            int a = (Integer.valueOf(prop1.getProperty(key))).intValue();
            pointsList.add(a);
            nickList.add(prop2.getProperty(key));
        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Pozycja");
        model.addColumn("NICK");
        model.addColumn("Punkty");
        JTable table = new JTable(model);

        model = (DefaultTableModel) table.getModel();

        //Collections.sort(pointsList);
        //Collections.reverse(pointsList);
        int i=0;
        for(int counter: pointsList) {
            i++;
            String s1 = Integer.toString(counter);
            String iS = Integer.toString(i);
            model.addRow(new Object[]{iS, nickList.get(i-1), s1});
        }
        
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        JOptionPane.showMessageDialog(new MyFrame(), new JScrollPane(table), "Najlepsze wyniki", JOptionPane.CLOSED_OPTION);
        
    }
}


    
    
    
    