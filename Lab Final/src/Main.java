import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

//copying text from textFields
class myFrame extends JFrame{
    myFrame(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,500);
        setLayout(null);

        JLabel l1 = new JLabel("Name:");
        add(l1);
        l1.setBounds(10,10,50,30);
        JTextField textField;
        textField = new JTextField();
        add(textField);
        textField.setBounds(70,10,300,100);

        JLabel l2 = new JLabel("Run:");
        add(l2);
        l2.setBounds(10,120,50,30);
        JTextField textField2 = new JTextField();
        add(textField2);
        textField2.setBounds(70,120,300,100);

        JLabel l3 = new JLabel("Wicket:");
        add(l3);
        l3.setBounds(10,230,50,30);
        JTextField textField3 = new JTextField();
        add(textField3);
        textField3.setBounds(70,230,300,100);

        JButton button = new JButton("Submit");
        button.setBounds(170,350,100,50);
        add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                try{
                    FileWriter fw = new FileWriter("stat.txt", false);
                    fw.write(String.valueOf(textField.getText()) + " " + String.valueOf(String.valueOf(textField2.getText())) + " " + String.valueOf(String.valueOf(textField3.getText())));
                    fw.close();
                }
                catch (Exception e){

                }
                myFrame2 d = new myFrame2();
                d.setVisible(true);
            }
        });
    }
}
public class Main {
    public static void main(String[] args) {
        new myFrame();
    }
}
