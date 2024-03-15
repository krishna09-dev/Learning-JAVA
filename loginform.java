import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
  

public class loginform {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 200);
        frame.setLayout(null); // Using null layout

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(60, 40, 80, 25);
        frame.add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(130, 40, 160, 25);
        frame.add(idField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(60, 70, 80, 25);
        frame.add(passwordLabel);

        JTextField passwordField = new JPasswordField();
        passwordField.setBounds(130, 70, 160, 25);
        frame.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(130, 100, 80, 25);
    
        frame.add(loginButton);
        
        frame.setVisible(true);
    }

}
