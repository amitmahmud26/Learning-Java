import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame7 extends JFrame implements ActionListener {
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    ButtonGroup bg1,bg2;
    JLabel l1,l2,l4,l5;
    myFrame7(){
        setVisible(true);                                   //motamuti thik ache code
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(500,500);

        l1 = new JLabel();
        add(l1);
        l1.setBounds(10,180,300,50);

        l2 = new JLabel();
        add(l2);
        l2.setBounds(10,200,300,50);

        l4 = new JLabel();
        add(l4);
        l2.setBounds(10,220,300,50);


        l5 = new JLabel("I am a girl");


        JButton button = new JBUtton("ok");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });












        bg1 = new ButtonGroup();
        bg2 = new ButtonGroup();

        rb1 = new JRadioButton("Football");
        rb2 = new JRadioButton("Cricket");
        rb3 = new JRadioButton("Hockey");
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);

        rb4 = new JRadioButton("Male");
        rb5 = new JRadioButton("Female");

        bg2.add(rb4);
        bg2.add(rb5);


        rb1.setBounds(10,10,300,30);
        rb2.setBounds(10,30,300,30);
        rb3.setBounds(10,50,300,30);
        rb4.setBounds(10,120,300,30);
        rb5.setBounds(10,150,300,30);

        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);

//        rb1.setSelected(true);
//        rb4.setSelected(true);

        rb3.setEnabled(false);

        rb1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if (rb1.isSelected()){
            l1.setText("I love Football");
        }
        if (rb2.isSelected()){
            l2.setText("I love Cricket");
        }
        if (rb4.isSelected()){
            l4.setText("I am a Boy");
        }
    }
}
public class GUI_7_radioButton {
    public static void main(String[] args) {
        new myFrame7();
    }
}
