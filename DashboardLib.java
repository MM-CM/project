
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

public class DashboardLib extends JFrame implements ActionListener {
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
         JLabel a = new JLabel();
          JLabel d = new JLabel();
            JButton exit = new JButton();
        // LinkedList storage = new LinkedList();
    
    DashboardLib()
    {
         pnl2.setLayout(null);
        pnl2.setBackground(new Color(0xD9D9D9));
        pnl2.setBounds(0, 0, 1530, 86);
       
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
                   brrw.addActionListener(this);
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
                      
                      a.setText("Pangalan mo");
                      a.setFont(new Font("Bebas Neue",Font.BOLD, 48));
                      a.setBounds(116, 20, 315, 60);
                      
                      exit.setBounds(1259, 15, 187, 56);
                      exit.setBackground(new Color(0xBB9457));
                      exit.setLayout(null);
                      
                      d.setText("Exit");
                      d.setBounds(50, 10, 150, 47);
                     d.setFont(new Font("Bebas Neue",Font.BOLD, 40));
                     d.setForeground(Color.white);
                      
                      exit.add(d);
                      
                      pnl2.add(exit);
                      pnl2.add(a);
                      
                pnl1.add(list);
                pnl1.add(brrw);
                pnl1.add(payment);
                pnl1.add(rtn);
                pnl1.add(report);
               dash.add(pnl1);
               dash.add(pnl2);

               dash.setSize(1476, 896);
               dash.setResizable(false);
               dash.setLocationRelativeTo(null);
               dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               dash.setVisible(true);
               dash.setLayout(null);
               dash.setTitle("DashBoard");
           }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(brrw)){
           dispose();
           new borrwing();
       }
    }

   
    }


