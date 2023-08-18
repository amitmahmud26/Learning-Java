import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new myFrame1();
//        new myFrame2();
    }
}

class myFrame1 extends JFrame implements ActionListener{
    public int ct1, ct2, att, mid, Final;
    public JLabel l1, l2, l3, l4, l5;
    public JTextField t1, t2, t3, t4, t5;

    public JButton button;
    myFrame1(){
        super("Online - 4");
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);

        l1 = new JLabel("CT1 marks-10");
        t1 = new JTextField(ct1);
        l2 = new JLabel("CT2 marks-10");
        t2 = new JTextField(ct2);
        l3 = new JLabel("Attendance-10");
        t3 = new JTextField(att);
        l4 = new JLabel("Mid-30");
        t4 = new JTextField(mid);
        l5 = new JLabel("Final-40");
        t5 = new JTextField(Final);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(l5);
        add(t5);
        l1.setBounds(20,1,100,100);
        l2.setBounds(20,40,100,100);
        l3.setBounds(20,80,100,100);
        l4.setBounds(20,120,100,100);
        l5.setBounds(20,160,100,100);

        t1.setBounds(120,40,150,20);
        t2.setBounds(120,80,150,20);
        t3.setBounds(120,120,150,20);
        t4.setBounds(120,160,150,20);
        t5.setBounds(120,200,150,20);

        button = new JButton("Submit");
        button.addActionListener(this);

        add(button);
        button.setBounds(150,300,80,20);

    }
    public void actionPerformed(ActionEvent e){
        int sum = ct1 + ct2 + att + mid + Final;
        System.out.println(sum);
        JFrame frame = new JFrame();
        int sum2 = 398;

        frame.setVisible(true);
        frame.setSize(400,300);
        JTextField textField = new JTextField(sum2);
        add(textField);
//        JLabel jLabel = new JLabel(sum);
//        add(jLabel);
    }
}
//class myFrame2 extends JFrame {
//    myFrame2() {
//        myFrame1();
//    }
//}