import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame4 extends JFrame{
    Container container;
    myFrame4(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,500);
        setLayout(null);

        container = getContentPane();

        JButton b1 = new JButton("red");
        JButton b2 = new JButton("blue");
        JButton b3 = new JButton("black");

        b1.setBounds(10,10,50,50);
        b2.setBounds(80,10,50,50);
        b3.setBounds(150,10,50,50);

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground(Color.red);
            }
        });

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground(Color.blue);
            }
        });

        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground(Color.black);
            }
        });
    }
}
public class GUI_4_multipleButtons {
    public static void main(String[] args) {
        new myFrame4();
    }
}
