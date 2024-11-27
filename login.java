/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener, baseClass{
    
    //LinkedList storage = new LinkedList();
    JPanel red = new JPanel();
    JLabel title = new JLabel();
    JLabel mang = new JLabel();
    JLabel sys = new JLabel();
    JLabel labels = new JLabel();
    JButton usersBTN = new JButton();
    JButton AdminBTN = new JButton();
    JButton libBTN = new JButton();
    JButton login = new JButton();
    JButton signup = new JButton();
    JTextField nnField = new JTextField();
    JPasswordField ppField = new JPasswordField();
     JFrame dash = new JFrame();
        JPanel pnl1 = new JPanel();
        JPanel pnl2 = new JPanel();
        JButton list = new JButton();
        JButton brrw = new JButton();
        JButton rtn = new JButton();
        JButton payment = new JButton();
        JButton report = new JButton();
        JLabel lbllist = new JLabel();
        JLabel lbllist1 = new JLabel();
        JLabel lbllist2 = new JLabel();
        JLabel lblbrw = new JLabel();
        JLabel lblrtn = new JLabel();
        JLabel lblpay = new JLabel();
        JLabel lblpay1 = new JLabel();
        JLabel lblrep = new JLabel();
        JLabel lblrep1 = new JLabel();
        JLabel greet = new JLabel();
        JLabel w = new JLabel();
    
     JFrame loginFrame = null; //
    JFrame signupFrame = null;

    @Override
    
    public void actionPerformed(ActionEvent e) {
        /*
        if (e.getSource().equals(libBTN) || e.getSource().equals(AdminBTN)) {
            logDes();
        } else if (e.getSource().equals(usersBTN)) {
            sigDes();
        } else if (e.getSource().equals(login)) {
            String username = nnField.getText();
            String password = new String(ppField.getPassword());
            if (storage.verifyLogin(username, password)) {
                JOptionPane.showMessageDialog(null, "Successfully Logged In");
                // You could add further actions here if needed.
            } else {
                JOptionPane.showMessageDialog(null, "Error: Incorrect Username or Password");
            }
        } else if (e.getSource().equals(signup)) {
            sigDes();
            
        }
        */
    }

    @Override
    public void mainDes() {
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

        AdminBTN.setBounds(910, 395, 354, 100);
        AdminBTN.setText("Admin");
        AdminBTN.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
        AdminBTN.setForeground(Color.white);
        AdminBTN.setBackground(new Color(0x99582A));

        usersBTN.setBounds(910, 563, 354, 100);
        usersBTN.setText("User");
        usersBTN.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
        usersBTN.setForeground(Color.white);
        usersBTN.setBackground(new Color(0x99582A));

        libBTN.addActionListener(this);
        AdminBTN.addActionListener(this);
        usersBTN.addActionListener(this);

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

    @Override
    public void logDes() {
       if (loginFrame == null) {
            loginFrame = new JFrame("Log-in Form");
            loginFrame.setSize(719, 358);
            loginFrame.setResizable(false);
            loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setLayout(null);
            
            
             JLabel formTitle = new JLabel("Login Form"); // Add title label
              formTitle.setBounds(456, 10, 300, 40);
                formTitle.setFont(new Font("Bebas Neue", Font.BOLD, 36));
         formTitle.setForeground(new Color(0x6F1D1B));
             loginFrame.add(formTitle);

            JLabel nn = new JLabel("Username:");
            JLabel pp = new JLabel("Password:");
            nn.setBounds(39, 60, 200, 37);
            nn.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 24));
            pp.setBounds(39, 140, 200, 37);
            pp.setFont(new Font("Plus Jakarta Sans", Font.BOLD, 24));

            nnField.setBounds(170, 60, 493, 48);
            nnField.setBackground(new Color(0xD9D9D9));

            ppField.setBounds(170, 140, 493, 48);
            ppField.setBackground(new Color(0xD9D9D9));

            login.setBounds(170, 240, 234, 48);
            login.setText("Log-In");
            login.setFont(new Font("Bebas Neue", Font.BOLD, 40));
            login.setForeground(Color.white);
            login.setBackground(new Color(0xBB9457));
            login.addActionListener(this);

            signup.setBounds(428, 240, 234, 48);
            signup.setText("Sign-Up");
            signup.setFont(new Font("Bebas Neue", Font.BOLD, 40));
            signup.setForeground(Color.white);
            signup.setBackground(new Color(0x99582A));
            signup.addActionListener(this);

            loginFrame.add(nn);
            loginFrame.add(pp);
            loginFrame.add(nnField);
            loginFrame.add(ppField);
            loginFrame.add(login);
            loginFrame.add(signup);
        }
        loginFrame.setVisible(true); // Show the login frame
    }

       
    


    @Override
    public void sigDes() {
       if (signupFrame == null) {
            signupFrame = new JFrame("Sign-up Form");
            signupFrame.setSize(719, 584);
            signupFrame.setResizable(false);
            signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            signupFrame.setLocationRelativeTo(null);
            signupFrame.setLayout(null);
            
                JLabel formTitle = new JLabel("Sign up Form"); // Add title label
              formTitle.setBounds(370, 10, 500, 70);
                formTitle.setFont(new Font("Bebas Neue", Font.BOLD, 50));
         formTitle.setForeground(new Color(0x6F1D1B));
             signupFrame.add(formTitle);

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
            
            nn.setForeground(new Color(0xFFFFFF));
               pp.setForeground(new Color(0xFFFFFF));
                  cp.setForeground(new Color(0xFFFFFF));
                     contact.setForeground(new Color(0xFFFFFF));

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
                int contactNumber = Integer.parseInt(contactField.getText());
            });
/*
                if (storage.userExists(username)) {
                    JOptionPane.showMessageDialog(null, "Username already exists.");
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match.");
                } else {
                   // storage.signUp(username, password, contactNumber, confirmPassword);
                    JOptionPane.showMessageDialog(null, "Sign up successful!");
                }
            });
  */          
            sign.setBackground(new Color(0x6F1D1B));
            sign.setForeground(new Color(0xBB9457));
            
            signupFrame.getContentPane().setBackground(new Color (0xBB9457));
            signupFrame.add(nn);
            signupFrame.add(pp);
            signupFrame.add(cp);
            signupFrame.add(contact);
            signupFrame.add(ssField);
            signupFrame.add(ppsField);
            signupFrame.add(cpsField);
            signupFrame.add(contactField);
            signupFrame.add(sign);
           
        
        signupFrame.setVisible(true); 
    }
    }
    
    
    @Override
    public void dashb() {
         pnl2.setBackground(Color.white);
        pnl2.setBounds(-0, 0, 1530, 86);
       
        pnl1.setLayout(null);
        pnl1.setBackground(new Color(0x6F1D1B));
        pnl1.setBounds(-7, 86, 1537, 875);
        
                    list.setLayout(null);
                  list.setBounds(363, 332, 217, 380);
                  list.setBackground(new Color(0xBB9457));

                       lbllist.setText("View");
                      lbllist.setBounds(10, 240 , 104, 58);
                  lbllist.setForeground(Color.white);
                  lbllist.setFont(new Font("Bebas Neue",Font.BOLD,40));

                  lbllist1.setText("List Of");
                  lbllist1.setBounds(10, 290 , 203, 48);
                  lbllist1.setForeground(Color.white);
                  lbllist1.setFont(new Font("Bebas Neue",Font.BOLD,40));

                  lbllist2.setText("Books");
                  lbllist2.setBounds(10, 332 , 203, 48);
                  lbllist2.setForeground(Color.white);
                  lbllist2.setFont(new Font("Bebas Neue",Font.BOLD,40));

                  list.add(lbllist);
                  list.add(lbllist1);
                  list.add(lbllist2);

                   brrw.setBounds(611, 332, 217, 198);
                   brrw.setLayout(null);
                   brrw.setBackground(new Color(0xBB9457));

                      lblbrw.setText("Borrowing");
                      lblbrw.setForeground(Color.white);
                      lblbrw.setFont(new Font("Bebas Neue",Font.BOLD,30));
                      lblbrw.setBounds(35, 150, 203, 48);

                      brrw.add(lblbrw);

                   payment.setBounds(611, 573 , 217, 139);
                   payment.setLayout(null);
                   payment.setBackground(new Color(0xBB9457));
                      lblpay.setText("Record");
                      lblpay.setForeground(Color.white);
                      lblpay.setFont(new Font("Bebas Neue",Font.BOLD,40));
                      lblpay.setBounds(37, 30, 203, 48);

                       lblpay1.setText("Payment");
                      lblpay1.setForeground(Color.white);
                      lblpay1.setFont(new Font("Bebas Neue",Font.PLAIN,30));
                      lblpay1.setBounds(47, 70, 203, 48);


                      payment.add(lblpay1);
                      payment.add(lblpay);



                   rtn.setBounds(875, 332, 217, 139);
                   rtn.setLayout(null);
                   rtn.setBackground(new Color(0xBB9457));
                        lblrtn.setText("Returning");
                      lblrtn.setForeground(Color.white);
                      lblrtn.setFont(new Font("Bebas Neue",Font.BOLD,30));
                      lblrtn.setBounds(35, 90, 203, 48);

                      rtn.add(lblrtn);


                   report.setBounds(875, 522, 217, 193);
                   report.setLayout(null);
                   report.setBackground(new Color(0xBB9457));
                                  lblrep.setText("Generate");
                      lblrep.setForeground(Color.white);
                      lblrep.setFont(new Font("Bebas Neue",Font.BOLD,30));
                      lblrep.setBounds(20, 117, 203, 48);  

                        lblrep1.setText("Report");
                      lblrep1.setForeground(Color.white);
                      lblrep1.setFont(new Font("Bebas Neue",Font.BOLD,30));
                      lblrep1.setBounds(20, 145, 203, 48);  


                      report.add(lblrep);
                      report.add(lblrep1);
                
                      greet.setText("elcome To your Dashboard");
                      greet.setFont(new Font("Bebas Neue", Font.PLAIN,64));
                      greet.setBounds(175, 140, 826, 77);
                      greet.setForeground(Color.white);
                      
                      w.setText("W");
                      w.setFont(new Font("Bebas Neue", Font.BOLD,128));
                      w.setBounds(65, 100, 250, 110);
                      w.setForeground(Color.white);
                      
                      
                      pnl1.add(greet);
                      pnl1.add(w);

        
        
         pnl1.add(list);
         pnl1.add(brrw);
         pnl1.add(payment);
         pnl1.add(rtn);
         pnl1.add(report);
         
        
        
         dash.add(pnl2);
        dash.add(pnl1);
        
        dash.setSize(1476, 896);
        dash.setResizable(false);
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dash.setVisible(true);
        dash.setLayout(null);
        dash.setTitle("DashBoard");
        
       
        
    }
    
    public void taasNgDash(){
          
    }
    
    public static void main(String[] args) {
        login loginSys = new login();
        //loginSys.mainDes();
        loginSys.dashb();
    }

    
}

