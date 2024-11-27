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
        JButton back = new JButton();
        
        private String[] headers = {"Title", "Author", "ISBN", "Genre", "Availability"};
        DefaultTableModel defTab = new    DefaultTableModel(bookList.getBookData(), headers);
        JTable table = new JTable(defTab);
         JScrollPane sp = new JScrollPane(table);
         
        private JPanel pnl1, pnl2, pnl3, pnl4;
        
        private JLabel a, b;
        
        private String username;
        
        public BOOKHISTORYUI(String username){
            this.username = username;
            
        b = new JLabel("BORROWED BOOKS");
        b.setFont(new Font("Bebas Neue", Font.BOLD, 80));
        b.setBounds(300, 150, 1000, 60);
        b.setForeground(new Color(0xBB9457));
        
        a = new JLabel(username);
        a.setFont(new Font("Bebas Neue", Font.BOLD, 48));
        a.setBounds(116, 20, 315, 60);
        
        pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBackground(new Color(0xD9D9D9));
        pnl2.setBounds(0, 0, 1530, 86);
        
        pnl1 = new JPanel();
        pnl1.setLayout(null);
        pnl1.setBackground(new Color(0x6F1D1B));
        pnl1.setBounds(-7, 86, 2150, 875);
        
        sp.setBounds(33, 240, 1390, 100);
        
        back = new JButton("Back");
        back.setBounds(1200, 750, 226, 88);
        back.setFont(new Font("Bebas Neue", Font.BOLD, 50));
        back.setForeground(new Color(0x6F1D1B));
        back.setBackground(Color.white);
        back.addActionListener(this);

//        pnl3 = new JPanel();
//        pnl3.setLayout(null);
//        pnl3.setBounds(836, 86, 640, 840);
//        pnl3.setBackground(new Color(0x6F1D1B));
//        pnl3.setBackground(new Color(0x99582A));
        
        
//        pnl4 = new JPanel();
//        pnl4.setLayout(null);
//        pnl4.setBounds(896, 221, 528, 513);
//        pnl4.setBackground(new Color(0xBB9457));
        
        pnl2.add(a);
        pnl1.add(b);
        pnl1.add(sp);
        pnl1.add(back);
//        this.add(pnl4);
//        this.add(pnl3);
        this.add(pnl2);
        this.add(pnl1);
         
        this.setSize(1476, 896);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        this.getContentPane().setBackground(new Color(0x6F1D1B));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Books History"); 
       
        
        }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(back)){
           dispose();
           new DashboardUser(username);
       }
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

