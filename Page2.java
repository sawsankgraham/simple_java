import java.awt.FlowLayout;

import javax.swing.*;

class Page2 {

    void showFrame(Model modelPassed){
        JFrame frame = new JFrame("Page2");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel(modelPassed.data1 + " " + modelPassed.data2);
        panel.add(label);
        frame.add(panel);

        frame.setSize(100, 100);
        frame.setVisible(true);
    }
}