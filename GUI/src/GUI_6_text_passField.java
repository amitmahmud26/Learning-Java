import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//copying text from textFields
class myFrame6 extends JFrame{
    myFrame6(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,500); 
        setLayout(null);

        JTextField textField;
        textField = new JTextField("Write here");
        add(textField);
        textField.setBounds(10,10,300,100);


        JButton button = new JButton("Copy Text");
        button.setBounds(100,150,150,40);
        add(button);

        JTextField textField2;
        textField2 = new JTextField();
        add(textField2);
        textField2.setBounds(10,200,300,100);

        JPasswordField passwordField = new JPasswordField();
        add(passwordField);
        passwordField.setBounds(10,300,300,100);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input;
                input = textField.getText();
                textField2.setText(input);
                passwordField.setText(input);

            }
        });
    }
}
public class GUI_6_text_passField {
    public static void main(String[] args) {
        new myFrame6();
    }
}
