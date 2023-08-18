import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        new myFrame2();
    }
}
class myFrame2 extends JFrame{
    myFrame2() {
        String name = null, run=null , wicket= null;

        try{
            File file = new File("stat.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNext()){
                name = myReader.next();
                run = myReader.next();
                wicket = myReader.next();
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,500);
        setLayout(null);

        JLabel l4 = new JLabel("Name: "+name);
        add(l4);
        l4.setBounds(10,10,300,30);

        JLabel l5 = new JLabel("Run: "+run);
        add(l5);
        l5.setBounds(10,60,300,30);

        JLabel l6 = new JLabel("Wicket: "+wicket);
        add(l6);
        l6.setBounds(10,110,300,30);
    }
}
