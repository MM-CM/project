/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danic
 */
public class DashboardUser extends JFrame implements ActionListener {
         private String username;
        JPanel pnl1 = new JPanel();
        JPanel pnl2 = new JPanel();
        
        JButton exit = new JButton();
        JLabel greet = new JLabel();
        JLabel w = new JLabel();
        JLabel a = new JLabel();
        JLabel d = new JLabel();
    
        JButton historyB = new JButton();
        JLabel h1 = new JLabel();
        JLabel h2 = new JLabel();
        JLabel h3 = new JLabel();

        JButton browseB = new JButton();
        JLabel b1 = new JLabel();
        JLabel b2 = new JLabel();
        
        JButton changePass = new JButton();
        JLabel c1 = new JLabel();
        JLabel c2 = new JLabel();
        
//            JTextField textF = new JTextField();
//            JPasswordField passF = new JPasswordField();
//        

        public DashboardUser(String username){
         this.username = username;
            
            
            add(pnl1);
            add(pnl2);
//            add(textF);
//            add(passF);
            add(historyB);
            add(browseB);
         
            
            pnl1.setLayout(null);
            pnl1.setBackground(new Color(0x6F1D1B));
            pnl1.setBounds(-7, 86, 1537, 875);
            
            pnl2.setLayout(null);
            pnl2.setBackground(new Color(0xD9D9D9));
            pnl2.setBounds(0, 0, 1530, 86);
            
       
             historyB.setBounds(300, 290, 400, 300);
             historyB.setBackground(new Color(0xBB9457));
             historyB.setLayout(null);
             historyB.addActionListener(this);
           
//              h1.setText("History");
//              h1.setBounds(10, 110 , 280, 90);
//              h1.setForeground(Color.white);
//              h1.setFont(new Font("Bebas Neue",Font.BOLD,70));

              h2.setText("Borrowing");
              h2.setBounds(10, 120 , 400, 100);
              h2.setForeground(Color.white);
              h2.setFont(new Font("Bebas Neue",Font.BOLD,70));

              h3.setText("History");
              h3.setBounds(10, 220 , 300, 60);
              h3.setForeground(Color.white);
              h3.setFont(new Font("Bebas Neue",Font.BOLD,65));
                  historyB.add(h1);
                  historyB.add(h2);
                  historyB.add(h3);
           
          
             browseB.setBounds(750, 290, 400, 300);
             browseB.setBackground(new Color(0xBB9457));
             browseB.setForeground(Color.WHITE);
             browseB.setFont(new Font("Bebas Neue", Font.CENTER_BASELINE,20));
             browseB.setLayout(null);
             browseB.addActionListener(this);
           
                b1.setText("Search");
                b1.setBounds(10, 120, 280, 90);
                b1.setForeground(Color.white);
                b1.setFont(new Font("Bebas Neue",Font.BOLD,70));

                b2.setText("Books");
                b2.setBounds(10, 220 , 270, 60);
                b2.setForeground(Color.white);
                b2.setFont(new Font("Bebas Neue",Font.BOLD,65));
                    browseB.add(b1);
                    browseB.add(b2);
            
                  w.setText("W");
                  w.setFont(new Font("Bebas Neue", Font.BOLD,128));
                  w.setBounds(65, 100, 250, 110);
                  w.setForeground(Color.white);
                      
                  greet.setText("elcome To your Dashboard");
                  greet.setFont(new Font("Bebas Neue", Font.PLAIN,64));
                  greet.setBounds(175, 140, 826, 77);
                  greet.setForeground(Color.white);
                      pnl1.add(w);
                      pnl1.add(greet);
                      
                      
                      a.setText(username);
                      a.setFont(new Font("Bebas Neue",Font.BOLD, 48));
                      a.setBounds(116, 20, 315, 60);
                      
                      exit.setBounds(1259, 15, 187, 56);
                      exit.setBackground(new Color(0xBB9457));
                      exit.setLayout(null);
                      exit.addActionListener(this);
                      
                      d.setText("Exit");
                      d.setBounds(50, 10, 150, 47);
                      d.setFont(new Font("Bebas Neue",Font.BOLD, 40));
                      d.setForeground(Color.white);
                      exit.add(d);             
                      pnl2.add(exit);
                      pnl2.add(a);
                      
//                        c1.setText("Change Password");
//                        b2.setBounds(10, 220 , 270, 60);
//                        b2.setForeground(Color.white);
//                        b2.setFont(new Font("Bebas Neue",Font.BOLD,70));
//                        changePass.add(b2);
//                      
//                      changePass.setBounds(530, 600, 400, 300);
//                      changePass.setBackground(new Color(0xBB9457));
//                        changePass.setForeground(Color.WHITE);
//                        changePass.setFont(new Font("Bebas Neue", Font.CENTER_BASELINE,20));
//                        changePass.setLayout(null);
//                        changePass.addActionListener(this);
                        
                        
                        
                      
            
                    pnl1.add(historyB);
                    pnl1.add(browseB);
//                    pnl1.add(changePass);         
                   
           this.setSize(1476, 896);
           this.setResizable(false);
           this.setLocationRelativeTo(null);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setResizable(false);
           setLayout(null);   
           this.setVisible(true);
           setTitle("Dashboard"); 
}
       

            @Override
    public void actionPerformed(ActionEvent e) {       
         if (e.getSource().equals(historyB)) {
             this.dispose();
             new BOOKHISTORYUI(username);
             
         }
             if (e.getSource().equals(browseB)) {
             this.dispose();
             new BROWSEUI(username);
            
         }
                 if (e.getSource().equals(exit)) {
                 this.dispose();
                 new login();
                 
          
           
    }
    }
}

      
  


