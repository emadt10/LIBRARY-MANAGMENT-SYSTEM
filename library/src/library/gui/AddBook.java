
package library.gui;

import library.gui.libf;
import javax.swing.JOptionPane;
import library.Connectiontodb;
import library.bookfn;


public class AddBook extends javax.swing.JFrame {

    Connectiontodb con_obj=new Connectiontodb();
    
    bookfn bok=new bookfn();
    
    public AddBook() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txtauthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Txtgenre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdomain = new javax.swing.JTextField();
        Btnsubmit = new javax.swing.JButton();
        Btnclear = new javax.swing.JButton();
        btnenter = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(533, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 161, 24);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 72, 42, 17);
        getContentPane().add(TxtTitle);
        TxtTitle.setBounds(99, 72, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ISBN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 80, 34, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Author");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 42, 17);
        getContentPane().add(Txtauthor);
        Txtauthor.setBounds(99, 120, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("genre");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 130, 51, 17);
        getContentPane().add(Txtgenre);
        Txtgenre.setBounds(381, 120, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 173, 31, 17);
        getContentPane().add(txttype);
        txttype.setBounds(99, 173, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Domain");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 180, 47, 17);
        getContentPane().add(txtdomain);
        txtdomain.setBounds(381, 173, 100, 30);

        Btnsubmit.setBackground(new java.awt.Color(51, 0, 204));
        Btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        Btnsubmit.setText("Submit");
        Btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsubmit);
        Btnsubmit.setBounds(130, 240, 80, 23);

        Btnclear.setBackground(new java.awt.Color(51, 51, 51));
        Btnclear.setForeground(new java.awt.Color(255, 255, 255));
        Btnclear.setText("Clear");
        Btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnclearActionPerformed(evt);
            }
        });
        getContentPane().add(Btnclear);
        Btnclear.setBounds(250, 240, 80, 23);

        btnenter.setBackground(new java.awt.Color(51, 51, 255));
        btnenter.setForeground(new java.awt.Color(255, 255, 255));
        btnenter.setText("BACK");
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });
        getContentPane().add(btnenter);
        btnenter.setBounds(380, 240, 90, 23);
        getContentPane().add(txtid);
        txtid.setBounds(381, 72, 100, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seema\\Desktop\\pic projrct\\wallpaper.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 530, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnclearActionPerformed
        TxtTitle.setText("");
        txtid.setText("");
        txttype.setText("");
        Txtauthor.setText("");
        txtdomain.setText("");
        txtid.setText("");
        Txtgenre.setText("");
    }//GEN-LAST:event_BtnclearActionPerformed

    private void BtnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsubmitActionPerformed
        String tit=TxtTitle.getText();
        String id=txtid.getText();
        String typ=txttype.getText();
        String aut=Txtauthor.getText();
        String dom=txtdomain.getText();
        String gen=Txtgenre.getText();
        boolean b=bok.addBook(tit, id, aut, gen, typ, dom);
        if(b)
        {
            JOptionPane.showMessageDialog(null,"BOOKS ADDED");
            this.setVisible(false);
            libf lf=new libf();
            lf.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"ERROR");
        }
    }//GEN-LAST:event_BtnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnclear;
    private javax.swing.JButton Btnsubmit;
    private javax.swing.JTextField TxtTitle;
    private javax.swing.JTextField Txtauthor;
    private javax.swing.JTextField Txtgenre;
    private javax.swing.JButton btnenter;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtdomain;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
