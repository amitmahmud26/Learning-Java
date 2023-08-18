import javax.swing.*;
import java.awt.*;

class myFrame3 extends JFrame {
    JButton button;

    myFrame3() {
        super("This is the title");
        setVisible(true);
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        button = new JButton("Click");
        add(button);
        Font font = new Font("Areal",Font.BOLD,20);
        button.setFont(font);
        button.setBounds(100,100,100,100);
        button.setForeground(Color.red);
        button.setBackground(Color.green);
        button.setOpaque(true);
        button.setBorderPainted(false);
        Container container = getContentPane();
        container.setBackground(Color.blue);
    }
}
public class GUI_button {
    public static void main(String[] args) {
        new myFrame3();
    }
}