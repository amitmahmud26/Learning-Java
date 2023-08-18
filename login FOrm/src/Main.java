public class LoginFrame extends javax.swing.JFrame
{


    private static Scanner keyboard = new Scanner(System.in);
    String username;
    String password;
    String filePath = "UserDetails.txt";

    public LoginFrame() {
        initComponents();
    }

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {
        username = jTextFieldUsername.getText();
        password = jTextFieldPassword.getText();
        verifyLogin(username,password,filePath);
    }

    public static void verifyLogin(String username,
                                   String password, String filepath)
    {
        boolean match = false;
        String tempUserName = "";
        String tempPassword = "";
        try
        {
            keyboard = new Scanner(new
                    File(filepath));
            keyboard.useDelimiter("[:\n]");

            while(keyboard.hasNext() && !match)
            {
                tempUserName = keyboard.next();
                tempPassword = keyboard.next();

                if(tempUserName.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
                {
                    match = true;
                }
            }
            keyboard.close();
            System.out.print(match);
        }
        catch (Exception e)
        {
            System.out.print("Error");
        }
    }