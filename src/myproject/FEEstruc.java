/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author hp
 */
import java.sql.*;
import javax.swing.JOptionPane;
import oracle.jdbc.driver.*;


public class FEEstruc extends javax.swing.JFrame {

    /**
     * Creates new form FEEstruc
     */
     Connection cnn;
    Statement st;
    ResultSet rs;
    
    public FEEstruc() {
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
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        LABEL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("FEE STRUCTURE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 20, 490, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("COURSE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 100, 90, 30);

        jComboBox1.setBackground(new java.awt.Color(153, 255, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Btech", "Mtech", "Phd", "B.Sc", "M.Sc" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(510, 100, 220, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton1.setText("HOSTELER");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(510, 140, 90, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton2.setText("DAY SCHOLAR");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(610, 140, 110, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("CATEGORY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 180, 90, 30);

        jComboBox2.setBackground(new java.awt.Color(153, 255, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL(below 5 lac)", "GENERAL(above 5 lac)", "SC", "ST", "OBC" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(500, 180, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("COLLEGE FEE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 220, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("HOSTEL FEE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 260, 120, 30);
        jPanel1.add(t6);
        t6.setBounds(510, 220, 200, 30);
        jPanel1.add(t7);
        t7.setBounds(510, 260, 200, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 320, 160, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 320, 170, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("NAME");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 100, 60, 30);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(180, 100, 180, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("ROLL NO.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 140, 80, 30);
        jPanel1.add(t2);
        t2.setBounds(180, 140, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("BRANCH");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 180, 70, 30);
        jPanel1.add(t3);
        t3.setBounds(180, 180, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("D.O.B");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(120, 220, 60, 30);
        jPanel1.add(t4);
        t4.setBounds(180, 220, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("SEMESTER");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 250, 90, 40);

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(180, 260, 180, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 10, 55, 23);

        LABEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg9.jpg"))); // NOI18N
        jPanel1.add(LABEL);
        LABEL.setBounds(0, 0, 860, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        student a=new student();
        a.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        paymentPortal p=new paymentPortal();
        p.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            DriverManager.registerDriver(new OracleDriver());
      Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","wisdom22");
      
      String nm=t1.getText();
      String rn=t2.getText();
      String branch=t3.getText();
      String dob=t4.getText();
      String sem=t5.getText();
      String course=jComboBox1.getSelectedItem().toString();
      String cat=jComboBox2.getSelectedItem().toString();
      String clgfee=t6.getText();
      String hostelfee=t7.getText();
      
       String q="insert into feeForm values('"+nm+"','"+rn+"','"+branch+"','"+dob+"','"+sem+"','"+course+"','"+cat+"','"+clgfee+"','"+hostelfee+"')";
      
       st=cnn.createStatement();
       st.executeUpdate(q);
       JOptionPane.showMessageDialog(null, "saved");
     
      
        } catch (Exception e) {
            
            System.out.print(e);
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

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
            java.util.logging.Logger.getLogger(FEEstruc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEEstruc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEEstruc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEEstruc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEEstruc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABEL;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}
