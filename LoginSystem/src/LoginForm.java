import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private HashMap<String, String> users;

    public LoginForm() {
        super("Login Form");

        // Initialize the HashMap to store the user credentials
        users = new HashMap<>();
        users.put("admin", "password");

        // Create a panel for the form
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Create labels and text fields for the username and password
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 10, 80, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 10, 165, 25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 40, 165, 25);
        panel.add(passwordField);

        // Create a login button and add an action listener
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Check if the entered credentials match the stored credentials
                if (users.containsKey(username) && users.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });
        panel.add(loginButton);

        // Add the panel to the frame and set the frame properties
        add(panel);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
