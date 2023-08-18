import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practiceLab_1 {
    public static void main(String[] args) {
        new myFrame8();
    }
}
class myFrame8 extends JFrame {
    myFrame8(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,500);
        setLayout(new BorderLayout());
        Container container = getContentPane();

        JButton button = new JButton("Vallagena?");
        add(button,BorderLayout.NORTH);
//        button.setBounds(10,10,100,50);

        JLabel label = new JLabel();
        add(label,BorderLayout.CENTER);
//        label.setBounds(10,70,100,50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Muri khan");
                container.setBackground(Color.red);
            }
        });
    }
}
