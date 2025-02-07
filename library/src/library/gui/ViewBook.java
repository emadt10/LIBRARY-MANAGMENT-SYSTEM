package library.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import library.Book;
import library.bookfn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emad
 */
public class ViewBook extends javax.swing.JFrame {
    bookfn b = new bookfn();
    ArrayList<Book> book = b.displayBook();
    int i=0;
    /**
     * Creates new form ViewBook
     */
    public ViewBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        genre = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        domain = new javax.swing.JTextField();
        nextbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnenter = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 330));
        getContentPane().setLayout(null);
        getContentPane().add(title);
        title.setBounds(88, 66, 140, 30);
        getContentPane().add(author);
        author.setBounds(88, 120, 140, 30);
        getContentPane().add(genre);
        genre.setBounds(345, 120, 130, 30);
        getContentPane().add(type);
        type.setBounds(88, 175, 140, 30);
        getContentPane().add(isbn);
        isbn.setBounds(345, 66, 130, 30);
        getContentPane().add(domain);
        domain.setBounds(345, 175, 130, 30);

        nextbtn.setBackground(new java.awt.Color(255, 255, 255));
        nextbtn.setText("Next");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextbtn);
        nextbtn.setBounds(370, 260, 100, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("BOOK DISPLAY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 160, 22);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TITLE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 69, 50, 15);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AUTHOR");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 123, 60, 15);

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TYPE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 178, 50, 15);

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ISBN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(253, 69, 50, 15);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENRE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(253, 123, 60, 15);

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOMAIN");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(253, 178, 70, 15);

        btnenter.setBackground(new java.awt.Color(255, 255, 255));
        btnenter.setText("BACK");
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });
        getContentPane().add(btnenter);
        btnenter.setBounds(10, 260, 90, 23);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seema\\Desktop\\pic projrct\\viewbook.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 490, 303);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        if (i==book.size())
        {
            JOptionPane.showMessageDialog(null, "All Books Displayed!");
            this.setVisible(false);
            libf lf=new libf();
            lf.setVisible(true);
        }
        else {
        Book bobj = book.get(i);
        author.setText(bobj.getAuthor());
        domain.setText(bobj.getDomain());
        isbn.setText(bobj.getIsbn());
        type.setText(bobj.getType());
        genre.setText(bobj.getGenre());
        title.setText(bobj.getTitle());
        i=i+1;
        }        
    }//GEN-LAST:event_nextbtnActionPerformed

    private void btnenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterActionPerformed
        libf lf =new libf();
        this.setVisible(false);
        lf.setVisible(true);
        //        String uname = txtusername.getText();
        //        boolean b = bk.userdisplay(uname);
        //            txtname.setText(bk.name);
        //            txtaddress.setText(bk.add);
        //            txtno.setText(bk.pn);
        //            txtemail.setText(bk.em);
        //            JOptionPane.showMessageDialog(null, "USER DISPLAYED");
        //            this.setVisible(false);
        //            userd ud = new userd();
        //            ud.setVisible(true);
        //        } else {
        //            JOptionPane.showMessageDialog(null, "ERROR");
        //        }
    }//GEN-LAST:event_btnenterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JButton btnenter;
    private javax.swing.JTextField domain;
    private javax.swing.JTextField genre;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton nextbtn;
    private javax.swing.JTextField title;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
