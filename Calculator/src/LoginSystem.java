import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class LoginSystem {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton showButton;
    private JLabel statusLabel;

    public LoginSystem() {
        frame = new JFrame("Login System");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        frame.add(usernameLabel);

        usernameField = new JTextField(15);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        frame.add(passwordLabel);

        passwordField = new JPasswordField(15);
        frame.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                boolean success = login(username, password);
                if (success) {
                    statusLabel.setText("Login successful!");
                } else {
                    statusLabel.setText("Login failed. Please try again.");
                }
            }
        });
        frame.add(loginButton);

        showButton = new JButton("Show");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showData();
            }
        });
        frame.add(showButton);

        statusLabel = new JLabel("Enter your username and password to login.");
        frame.add(statusLabel);

        frame.setVisible(true);
    }

    private boolean login(String username, String password) {
        try {
            File file = new File("login.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    br.close();
                    return true;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void showData() {
        try {
            File file = new File("login.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String data = "";
            while ((line = br.readLine()) != null) {
                data += line + "\n";
            }
            JOptionPane.showMessageDialog(frame, data);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();

        }}}