    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


    public class BOOKHISTORYUI extends JFrame implements ActionListener{
       LinkedListBook bookList = new LinkedListBook();
        JButton exit = new JButton();
        
        private String[] headers = {"Title", "Author", "ISBN", "Genre", "Borrowed Date", "Due Date", "Overdue Fine"};
        DefaultTableModel defTab = new    DefaultTableModel(bookList.getBookData(), headers);
        JTable table = new JTable(defTab);
         JScrollPane sp = new JScrollPane(table);
         
        private JPanel pnl1, pnl2, pnl3, pnl4;
        
        private JLabel a, b;
        private String username;
        
        public BOOKHISTORYUI(String username){
            this.username = username;
        
        a = new JLabel(username);
        a.setFont(new Font("Bebas Neue", Font.BOLD, 48));
        a.setBounds(116, 20, 315, 60);    
            
        b = new JLabel("BORROWED BOOKS");
        b.setFont(new Font("Bebas Neue", Font.BOLD, 80));
        b.setBounds(300, 150, 1000, 60);
        b.setForeground(new Color(0xBB9457));
        
        a = new JLabel(username);
        a.setFont(new Font("Bebas Neue", Font.BOLD, 48));
        a.setBounds(116, 20, 315, 60);
        
        exit = new JButton();
        exit.setBounds(1259, 15, 187, 56);
        exit.setText("Back");
        exit.setFont(new Font("Bebas Neue",Font.BOLD, 40));
        exit.setForeground(Color.white);
        exit.setBackground(new Color(0xBB9457));
        exit.setLayout(null);
        exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    new DashboardUser(username);
                }
            
        });
        
        pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBackground(new Color(0xD9D9D9));
        pnl2.setBounds(0, 0, 1530, 86);
        
        pnl1 = new JPanel();
        pnl1.setLayout(null);
        pnl1.setBackground(new Color(0x6F1D1B));
        pnl1.setBounds(-7, 86, 2150, 875);
        
        sp.setBounds(33, 240, 1390, 100);
        

        pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBackground(new Color(0xD9D9D9));
        pnl2.setBounds(0, 0, 1530, 86);
        
         
        pnl2.add(exit);
        pnl2.add(a);
        pnl1.add(b);
        pnl1.add(sp);
 
        this.add(pnl2);
        this.add(pnl1);
         
        this.setSize(1476, 896);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Books History"); 
       
        
        }

    @Override
    public void actionPerformed(ActionEvent e) {
//       if(e.getSource().equals(back)){
//           dispose();
//           new DashboardUser(username);
//       }
//    }
    }
    }
























//       JButton backB = new JButton("Back");
//        JLabel BH = new JLabel();
//        
//        ArrayList <User> users;
//        
//        static String row[][] = {{"100645", "Bob Ong", "Si", "ROMCOM", "JUNE 17, 2023", "AUGUST 23, 2023", "AUGUST 21, 2023", "10:00"}, 
//            {"100645", "Bob Ong", "Si", "ROMCOM", "JUNE 17, 2023", "AUGUST 23, 2023", "AUGUST 21, 2023", "10:00"}, {"100645", "Bob Ong", "Si", "ROMCOM", "JUNE 17, 2023", "AUGUST 23, 2023", "AUGUST 21, 2023", "10:00"}};
//        static String column[] = {"ISBN", "AUTHOR", "TITLE", "GENRE", "DATE BORROWED", "DUE DATE", "DATE RETURN", "TIME"};
//        
//        JTable jt = new JTable(row, column);
//        JScrollPane sp = new JScrollPane(jt);
//        
//        public BOOKHISTORYUI(){    
//            add(BH);
//            add(sp);
//            add(backB);
//
//           BH.setBounds(30, 20, 1000, 100);
//           BH.setText("BORROWED HISTORY");
//           BH.setForeground(Color.white);
//           BH.setFont(new Font("Bebas Neue", Font.CENTER_BASELINE,50)); 
//        
//           sp.setBounds(40, 100, 1200, 550);
//           sp.setBackground(new Color(0xBB9457));
//           sp.setForeground(Color.WHITE);
//           sp.setFont(new Font("Futura", Font.CENTER_BASELINE,30));
//           
//           backB.setBounds(700, 550, 276, 44);
//           backB.setForeground(new Color(0x032714));
//           backB.setFont(new Font("Futura", Font.CENTER_BASELINE,20));
//        
//        
//           this.setSize(1476, 896);
//           this.getContentPane().setBackground(new Color(0x6F1D1B));
//           this.setLocationRelativeTo(null);
//           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//           setResizable(false);
//           setLayout(null);
//           setTitle("Borrower's Account");
//           this.setVisible(true);
//    }
//        public static void main(String[] args) {
//            new BOOKHISTORYUI();
//        }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//            
//    }
//
//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        
//    }
//}

