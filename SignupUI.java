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

   public class SignupUI extends JFrame implements User {
       
       
       public SignupUI() {
        setTitle("Sign-up Form");
        setSize(719, 584);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel formTitle = new JLabel("Sign up Form");
        formTitle.setBounds(370, 10, 500, 70);
        formTitle.setFont(new Font("Bebas Neue", Font.BOLD, 50));
        formTitle.setForeground(new Color(0x6F1D1B));
        add(formTitle);

        JLabel nn = new JLabel("Username:");
        JLabel pp = new JLabel("Password:");
        JLabel cp = new JLabel("Confirm Password:");
        JLabel contact = new JLabel("Contact Number:");

        nn.setBounds(90, 116, 200, 37);
        nn.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 20));
        pp.setBounds(90, 192, 200, 37);
        pp.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 20));
        cp.setBounds(15, 262, 200, 37);
        cp.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 20));
        contact.setBounds(20, 332, 200, 37);
        contact.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 20));

        JTextField ssField = new JTextField();
        JPasswordField ppsField = new JPasswordField();
        JPasswordField cpsField = new JPasswordField();
        JTextField contactField = new JTextField();

        ssField.setBounds(204, 116, 493, 48);
        ppsField.setBounds(204, 192, 493, 48);
        cpsField.setBounds(204, 262, 493, 48);
        contactField.setBounds(204, 332, 493, 48);

        JButton sign = new JButton("Sign Up");
        sign.setBounds(204, 440, 234, 48);
        sign.setFont(new Font("Bebas Neue", Font.BOLD, 40));
        sign.addActionListener(e -> {
            String username = ssField.getText();
            String password = new String(ppsField.getPassword());
            String confirmPassword = new String(cpsField.getPassword());
            String contactNumberInput = contactField.getText();

            if (userExists(username)) {
                JOptionPane.showMessageDialog(null, "Username already exists.");
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match.");
            } else {
               User.userID.add(username); // Explicitly refer to the interface field
        User.password.add(password); // No ambiguity
        User.contactNumber.add(contactNumberInput);
        JOptionPane.showMessageDialog(null, "Sign up successful!");
        dispose();
            }
        });

        sign.setBackground(new Color(0x6F1D1B));
        sign.setForeground(new Color(0xBB9457));

        add(nn);
        add(pp);
        add(cp);
        add(contact);
        add(ssField);
        add(ppsField);
        add(cpsField);
        add(contactField);
        add(sign);

        getContentPane().setBackground(new Color(0xBB9457));
        setVisible(true);
    }
 
       }


