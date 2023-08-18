import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public static void main(String[] args){
        JFrame fr = new JFrame ("Run!");
        fr. setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);
        fr.setSize (250, 100);

        fr.setLayout(new FlowLayout());
        fr.setVisible(true);

        JLabel label = new JLabel ();
        JButton button = new JButton ("Click!");

        fr.add(button);
        fr.add(label);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count =3;
                    label.setText(String.valueOf(count));
                    if (count == 0){
                        label.setText("GO");
                    }
                    count--;
            }

        });
    }
}