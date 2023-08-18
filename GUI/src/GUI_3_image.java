import javax.swing.*;
import java.awt.*;

class myFrame2 extends JFrame {
    Label label;
    ImageIcon imageIcon;
    myFrame2() {
        super("This is the title");
        setVisible(true);
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        imageIcon = new ImageIcon("vallagena.jpeg");
//        label = new Label(imageIcon);

        // problem

    }
}
public class GUI_3_image {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
