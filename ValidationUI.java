/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ValidationUI extends JFrame{
    JPanel red = new JPanel();
    JLabel title = new JLabel();
    JLabel mang = new JLabel();
    JLabel sys = new JLabel();
    JLabel labels = new JLabel();
    JButton usersBTN = new JButton();
    JButton AdminBTN = new JButton();
    JButton libBTN = new JButton();
    
    ValidationUI(){
         this.setSize(1447, 889);
        this.setVisible(true);
        this.setLayout(null);

        title.setText("Library");
        title.setFont(new Font("Bebas Neue", Font.BOLD, 120));
        title.setBounds(24, 180, 664, 180);
        title.setForeground(new Color(0xBB9457));

        mang.setText("Management");
        mang.setFont(new Font("Bebas Neue", Font.BOLD, 100));
        mang.setBounds(24, 300, 664, 180);
        mang.setForeground(new Color(0xBB9457));

        sys.setText("System");
        sys.setFont(new Font("Bebas Neue", Font.BOLD, 120));
        sys.setBounds(24, 420, 664, 180);
        sys.setForeground(new Color(0xBB9457));

        labels.setText("Select Role");
        labels.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
        labels.setBounds(980, 67, 664, 51);
        labels.setForeground(new Color(0x6F1D1B));

        libBTN.setBounds(910, 227, 354, 100);
        libBTN.setText("Librarian");
        libBTN.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
        libBTN.setForeground(Color.white);
        libBTN.setBackground(new Color(0x99582A));
            libBTN.addActionListener(e -> {
    // Open the login UI for Librarian
    new LoginUI();
   // dispose(); // Close the ValidationUI after login is initiated
});

        AdminBTN.setBounds(910, 395, 354, 100);
        AdminBTN.setText("Admin");
        AdminBTN.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
        AdminBTN.setForeground(Color.white);
        AdminBTN.setBackground(new Color(0x99582A));
            AdminBTN.addActionListener(e -> {
    // Open the login UI for Admin
    new LoginUI(); // You can create a separate AdminLoginUI if needed
     // Close the ValidationUI after login is initiated
});

        usersBTN.setBounds(910, 563, 354, 100);
        usersBTN.setText("User");
        usersBTN.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
        usersBTN.setForeground(Color.white);
        usersBTN.setBackground(new Color(0x99582A));
            usersBTN.addActionListener(e -> {
    // Open the login UI for Users
    new UserLogin();
   // Close the ValidationUI after login is initiated
});

        red.setBounds(0, 0, 699, 896);
        red.setLayout(null);
        red.setBackground(new Color(0x6F1D1B));
        red.add(title);
        red.add(mang);
        red.add(sys);

        this.setLocationRelativeTo(null);
        add(red);
        add(labels);
        add(usersBTN);
        add(AdminBTN);
        add(libBTN);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    
   
}
