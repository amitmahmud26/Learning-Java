import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame{
    JButton button;
    JLabel text;
    MyFrame(){
        setVisible(true);
        button = new JButton("OK");
        text = new JLabel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,500);
        setLayout(new BorderLayout());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("Hello World");
            }
        });
        add(button,BorderLayout.SOUTH);
        add(text,BorderLayout.NORTH);
    }

}
public class Main {
    public static void main(String[] args) {
        new MyFrame();
    }
}
