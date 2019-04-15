import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model;
import Page2;

class Page1 {
    static Model model1 = new Model(1, "Hello", "World");
    static Model model2 = new Model(1, "Hi", "World");
    static Model model3 = new Model(1, "Bye", "World");

    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame Example");
        
        JPanel panel = new JPanel();  
        panel.setLayout(new GridLayout(3, 2)); 

        //Model 1 
        JLabel label1 = new JLabel("One");  
        JButton button1 = new JButton();  
        button1.setText("Button1"); 
        button1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Dialog Box");
                JButton yes = new JButton();
                yes.setText("Yes");
                yes.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Page2 page2 = new Page2();
                        page2.showFrame(model1);
                    }
                });
                dialog.add(yes);
                dialog.setSize(100,100);
                dialog.setVisible(true);
            }
        });
        panel.add(label1);  
        panel.add(button1);   

        //Model 2
        JLabel label2 = new JLabel("Two");  
        JButton button2 = new JButton();  
        button2.setText("Button2"); 
        button2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Dialog Box");
                JButton yes = new JButton();
                yes.setText("Yes");
                yes.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Page2 page2 = new Page2();
                        page2.showFrame(model2);
                    }
                });
                dialog.add(yes);
                dialog.setSize(100,100);
                dialog.setVisible(true);
            }
        });
        panel.add(label2);  
        panel.add(button2);  

        //Model 3 
        JLabel label3 = new JLabel("Three");  
        JButton button3 = new JButton();  
        button3.setText("Button3"); 
        button3.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Dialog Box");
                JButton yes = new JButton();
                yes.setText("Yes");
                yes.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Page2 page2 = new Page2();
                        page2.showFrame(model3);
                    }
                });
                dialog.add(yes);
                dialog.setSize(100,100);
                dialog.setVisible(true);
            }
        });
        panel.add(label3);  
        panel.add(button3);  


        frame.add(panel);


        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}