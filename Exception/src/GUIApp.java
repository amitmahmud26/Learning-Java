import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIApp {
    public GUIApp() {
        JFrame fr = new JFrame("Book");
        fr.setSize(800, 600);

        JTextField searchBoxTF = new JTextField();
        searchBoxTF.setBounds(50, 50, 200, 20);
        fr.add(searchBoxTF);

        JButton btn = new JButton("search");
        btn.setBounds(275, 50, 100, 20);
        fr.add(btn);


        JLabel showLabel = new JLabel();
        showLabel.setBounds(50, 300, 200, 20);
        fr.add(showLabel);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookName = searchBoxTF.getText();
                FinalWithFile f1 = new FinalWithFile();
                String data= f1.checkSearchBookName(bookName);
                showLabel.setText(data);
            }
        });



        fr.setVisible(true);
    }
}
