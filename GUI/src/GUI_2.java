import javax.swing.*;
import java.awt.*;

public class GUI_2 {
    public static void main(String[] args) {
        new myFrame();
    }
}

class myFrame extends JFrame{
    JLabel label = new JLabel("First label");
    JLabel label2 = new JLabel("Second label");
    myFrame(){
        super("This is the title");
        setVisible(true);
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());  //eta na dile 2 ta label eksathe add kora jayna
//        setLayout(new GridBagLayout());
        add(label);
        label.setText("this is the overridden text");
        Font font = new Font("Areal",Font.BOLD,20);
        label.setFont(font);
        add(label2);
    }
}
