/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
import java.sql.*;
import javax.swing.JOptionPane;
import oracle.jdbc.driver.*;


public class paymentPortal extends javax.swing.JFrame {

    /**
     * Creates new form stuAttendanceUpdate
     */
    Connection cnn;
    Statement st;
    ResultSet rs;
    
    public paymentPortal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("BANK");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 70, 70, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICICI", "SBI", "PNB", "ALLAHABAD BANK", "ANDHRA BANK", "BANK OF INDIA", "CANARA BANK", "INDIAN OVERSEAS BANK", "SYNDICATE BANK", "PUNJAB AND SIND BANK", "UNION BANK OF INDIA" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(250, 70, 360, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("MODE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 100, 100, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/debitcard1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 140, 250, 180);

        jRadioButton1.setText("DEBIT CARD");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(130, 320, 140, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/credit-card-icon.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 140, 310, 210);

        jRadioButton2.setText("CREDIT CARD");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(410, 340, 140, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Online banking icon graphic.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 360, 190, 130);

        jRadioButton3.setText("NET BANKING");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(150, 500, 120, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chalan.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 370, 170, 140);

        jRadioButton4.setText("E-CHALLAN");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(420, 520, 130, 23);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 400, 63, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 10, 90, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("ROLL NO.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 30, 90, 30);
        jPanel1.add(t1);
        t1.setBounds(250, 30, 360, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/last page.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-30, 0, 870, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
             JOptionPane.showMessageDialog(null,"congrats!!!your transaction has been successful");
             
              DriverManager.registerDriver(new OracleDriver());
      Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","wisdom22");
       
             
             String rn=t1.getText();
             String s="paid";
             
             String q="insert into payment values('"+rn+"','"+s+"')";
             
              st=cnn.createStatement();
       st.executeUpdate(q);
      
             
        } catch (Exception e) {
            
            System.out.print(e);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        FEEstruc f=new FEEstruc();
        f.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(paymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
