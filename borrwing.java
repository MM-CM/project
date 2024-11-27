/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

/**
 *
 * @author ivan
 */
public class borrwing extends JFrame implements ActionListener,BookBase{
     
   private JComboBox<String> genreComboBox;
    private JPanel bookPanel;
    private Map<String, List<String>> booksByGenre;
    
    private JLabel a, lb1, lb2, lb3, lb4, b;
    private JTextField isbn;
    private JButton prc, cnl, bbrw;
    private JPanel pnl1, pnl2, pnl3, pnl4;
    private JTextField userId,date,days, transac;
      private JSpinner dateSpinnerBorrow;
    private JSpinner dateSpinnerDue;
    DefaultTableModel tb = new    DefaultTableModel(BookBase.data, BookBase.header);
    JTable table = new JTable(tb);
     JScrollPane sp = new JScrollPane(table);
    
    

    public  borrwing() {
        // Initialize main panels and components
        pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBackground(new Color(0xD9D9D9));
        pnl2.setBounds(0, 0, 1530, 86);

        a = new JLabel("Pangalan mo");
        a.setFont(new Font("Bebas Neue", Font.BOLD, 48));
        a.setBounds(116, 20, 315, 60);

        lb1 = new JLabel("ISBN");
        lb1.setFont(new Font("Bebas Neue", Font.BOLD, 36));
        lb1.setBounds(405, 100, 100, 43);
        lb1.setForeground(new Color(0xBB9457));

        isbn = new JTextField();
        isbn.setBounds(405, 144, 356, 76);
        isbn.setBackground(new Color(0xBB9457));
        isbn.setFont(new Font("Plus Jakarta Sans", Font.ITALIC, 24));
        isbn.setForeground(Color.white);

        lb2 = new JLabel("Genre");
        lb2.setFont(new Font("Bebas Neue", Font.BOLD, 36));
        lb2.setBounds(33, 100, 200, 43);
        lb2.setForeground(new Color(0xBB9457));

        genreComboBox = new JComboBox<>(new String[]{"Select Genre", "Fiction", "Non-Fiction", "Education"});
        genreComboBox.setSelectedIndex(0);
        genreComboBox.setBounds(33, 144, 333, 76);
        genreComboBox.setPreferredSize(new Dimension(333, 76));
        genreComboBox.setBackground(new Color(0x99582A));
        genreComboBox.setFont(new Font("Plus Jakarta Sans", Font.ITALIC, 24));
        genreComboBox.setForeground(Color.white);

        // Book panel for displaying books of the selected genre
        bookPanel = new JPanel();
        bookPanel.setLayout(new BoxLayout(bookPanel, BoxLayout.Y_AXIS));
        bookPanel.setBounds(33, 250, 728, 300);
        bookPanel.setBackground(new Color(0x6F1D1B));

        // Add ActionListener to genreComboBox
        genreComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGenre = (String) genreComboBox.getSelectedItem();
                //updateBookDisplay(selectedGenre);
            }
        });

        pnl1 = new JPanel();
        pnl1.setLayout(null);
        pnl1.setBackground(new Color(0x6F1D1B));
        pnl1.setBounds(-7, 86, 1537, 875);

        pnl3 = new JPanel();
        pnl3.setLayout(null);
        pnl3.setBounds(836, 86, 640, 840);
        pnl3.setBackground(new Color(0x99582A));

        prc = new JButton("Proceed");
        prc.setBounds(896, 750, 250, 88);
        prc.setFont(new Font("Bebas Neue", Font.BOLD, 50));
        prc.setForeground(new Color(0x6F1D1B));
        prc.setBackground(Color.white);
                prc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(prc)){
                    Confirm();
                }
                //updateBookDisplay(selectedGenre);
            }
        });
        

        cnl = new JButton("Cancel");
        cnl.setBounds(1200, 750, 226, 88);
        cnl.setFont(new Font("Bebas Neue", Font.BOLD, 50));
        cnl.setForeground(new Color(0x6F1D1B));
        cnl.setBackground(Color.white);

        pnl4 = new JPanel();
        pnl4.setLayout(null);
        pnl4.setBounds(896, 221, 528, 513);
        pnl4.setBackground(new Color(0xBB9457));

        b = new JLabel("Borrowing");
        b.setFont(new Font("Bebas Neue", Font.BOLD, 70));
        b.setBounds(270, 0, 826, 100);
        b.setForeground(new Color(0x6F1D1B));
        sp.setBounds(33, 262, 728, 588);

        pnl2.add(a);
        pnl1.add(lb1);
        pnl1.add(lb2);
        pnl1.add(isbn);
        pnl1.add(sp);
        pnl1.add(genreComboBox);
        pnl1.add(bookPanel);

        pnl3.add(b);
        this.add(cnl);
        this.add(prc);
        this.add(pnl4);
        this.add(pnl3);
        this.add(pnl2);
        this.add(pnl1);
        

        this.setSize(1476, 896);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Borrowing");

        // Initialize book data
        
    }

  
    public void Confirm(){
        JFrame frm = new JFrame();
        JLabel label = new JLabel("User ID");
         JLabel label1 = new JLabel("Borrow Date(DD/MM/YY)");
           JLabel label2 = new JLabel("Period(Days)");
         JLabel label3 = new JLabel("Transaction ID");
         
         label.setBounds(127, 107, 400, 43);
         label1.setBounds(126, 230, 400, 43);
         label2.setBounds(590, 230, 400, 43);
         label3.setBounds(127, 350, 400, 43);
       
         label.setFont(new Font ("Plus Jakarta Sans",Font.PLAIN, 24));
         label1.setFont(new Font ("Plus Jakarta Sans",Font.PLAIN, 24));
           label2.setFont(new Font ("Plus Jakarta Sans",Font.PLAIN, 24));
             label3.setFont(new Font ("Plus Jakarta Sans",Font.PLAIN, 24));
             
                label.setForeground(new Color(0x6F1D1B));
                   label1.setForeground(new Color(0x6F1D1B));
                      label2.setForeground(new Color(0x6F1D1B));
                         label3.setForeground(new Color(0x6F1D1B));
                         
                         
                                dateSpinnerBorrow = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editorBorrow = new JSpinner.DateEditor(dateSpinnerBorrow, "dd/MM/yyyy");
        dateSpinnerBorrow.setEditor(editorBorrow);
        dateSpinnerBorrow.setBounds(127, 274, 302, 76);
        dateSpinnerBorrow.setFont(new Font("Plus Jakarta Sans", Font.PLAIN, 24));
        dateSpinnerBorrow.setForeground(new Color(0x6F1D1B));
        dateSpinnerBorrow.setBackground(new Color(0xD9D9D9));

        // Due Date Picker using JSpinner
        dateSpinnerDue = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editorDue = new JSpinner.DateEditor(dateSpinnerDue, "dd/MM/yyyy");
        dateSpinnerDue.setEditor(editorDue);
        dateSpinnerDue.setBounds(458, 274, 281, 76);
        dateSpinnerDue.setFont(new Font("Plus Jakarta Sans", Font.PLAIN, 24));
        dateSpinnerDue.setForeground(new Color(0x6F1D1B));
        dateSpinnerDue.setBackground(new Color(0xD9D9D9));
         
         userId= new  JTextField();
          date= new  JTextField();
           days= new  JTextField();
            transac= new  JTextField();
         
         userId.setBounds(127, 154, 613, 76);
        // date.setBounds(127, 274, 302, 76);
         //days.setBounds(458, 274, 281, 76);
        
         transac.setBounds(126, 397, 613, 76);
       
         
         userId.setBackground(new Color(0xD9D9D9));
         date.setBackground(new Color(0xD9D9D9));
         days.setBackground(new Color(0xD9D9D9));
         transac.setBackground(new Color(0xD9D9D9));
         
         bbrw = new JButton();
         
         bbrw.setBounds(279, 524, 310, 88);
         bbrw.setBackground(new Color(0xD9D9D9));
         bbrw.setText("Confirm");
         bbrw.setForeground(new Color(0x6F1D1B));
         bbrw.setFont(new Font("Bebas Neue",Font.BOLD,64));
        
         frm.add(label);
          frm.add(label1);
           frm.add(label2);
            frm.add(label3);
            
              frm.add(userId);
            frm.add(transac);
            
          frm.add(dateSpinnerBorrow); // Add the Borrow Date spinner
        frm.add(dateSpinnerDue); 
        
        frm.add(bbrw);
        frm.setResizable(false);
        frm.setLayout(null);
        frm.setSize(868,689);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setTitle("Confirm transaction");
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    }
    
    public static void main (String [] args){
       new borrwing();
      // n.Confirm();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    
    

   

    }
   
    
}

