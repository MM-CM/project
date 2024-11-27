/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUI extends JFrame implements User{
    private JTextField nnField;
    private JPasswordField ppField;

    public LoginUI() {
        
        setTitle("Log-in Form");
        setSize(719, 358);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel formTitle = new JLabel("Login Form");
        formTitle.setBounds(456, 10, 300, 40);
        formTitle.setFont(new Font("Bebas Neue", Font.BOLD, 36));
        formTitle.setForeground(new Color(0x6F1D1B));
        add(formTitle);

        JLabel nn = new JLabel("Username:");
        JLabel pp = new JLabel("Password:");
        nn.setBounds(39, 60, 200, 37);
        nn.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 24));
        pp.setBounds(39, 140, 200, 37);
        pp.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 24));

        nnField = new JTextField();
        nnField.setBounds(170, 60, 493, 48);
        nnField.setBackground(new Color(0xD9D9D9));

        ppField = new JPasswordField();
        ppField.setBounds(170, 140, 493, 48);
        ppField.setBackground(new Color(0xD9D9D9));

        JButton login = new JButton("Log-In");
        login.setBounds(428, 240, 234, 48);
        login.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        login.setForeground(Color.white);
        login.setBackground(new Color(0xBB9457));
        login.addActionListener(e -> {
            String username = nnField.getText();
            String passwordInput = new String(ppField.getPassword());

           if (validateLogin(username, passwordInput)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Open DashboardUI (you can replace with your actual DashboardUI class)
                    new DashboardLib();
                    dispose();  // Close the login screen
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            });
     
                

     

        add(nn);
        add(pp);
        add(nnField);
        add(ppField);
        add(login);

        setVisible(true);
    }
       private boolean validateLogin(String username, String password) {
        // Default usernames and passwords for admin and librarian
        if (username.equals("admin") && password.equals("admin123")) {
            return true;  // Admin login success
        } else if (username.equals("librarian") && password.equals("lib123")) {
            return true;  // Librarian login success
        }
        return false;  // Invalid credentials
    }
  
}

