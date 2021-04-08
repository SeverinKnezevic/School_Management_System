/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Severin
 */
public class Prijava_korisnik extends javax.swing.JFrame {
//  POVEZIVANJE BAZE I DEFINIRANJE NJIHOVIH VARIJABLI  
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    

    
    /**
     * Creates new form prijava_ucenika
     */
    public Prijava_korisnik() {
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

        jPanel1_pozadina = new javax.swing.JPanel();
        jPanel2_zaglavlje = new javax.swing.JPanel();
        jLabel1_prijava = new javax.swing.JLabel();
        jButton_administracija_ = new javax.swing.JButton();
        jLabel2_korisnicko_ime = new javax.swing.JLabel();
        jLabel3_lozinka = new javax.swing.JLabel();
        txtKorisnicko_ime = new javax.swing.JTextField();
        txtLozinka = new javax.swing.JPasswordField();
        jButton1_prijava_ = new javax.swing.JButton();
        jButton2_odustani_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1_pozadina.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1_pozadina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2_zaglavlje.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2_zaglavlje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1_prijava.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1_prijava.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_prijava.setText("Prijava");

        jButton_administracija_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_administracija_.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton_administracija_.setText("Administracija");
        jButton_administracija_.setAutoscrolls(true);
        jButton_administracija_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_administracija_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2_zaglavljeLayout = new javax.swing.GroupLayout(jPanel2_zaglavlje);
        jPanel2_zaglavlje.setLayout(jPanel2_zaglavljeLayout);
        jPanel2_zaglavljeLayout.setHorizontalGroup(
            jPanel2_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_zaglavljeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_prijava, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_administracija_)
                .addContainerGap())
        );
        jPanel2_zaglavljeLayout.setVerticalGroup(
            jPanel2_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_zaglavljeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_prijava, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_administracija_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2_korisnicko_ime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2_korisnicko_ime.setText("Korisničko ime ");

        jLabel3_lozinka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3_lozinka.setText("Lozinka");

        txtKorisnicko_ime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKorisnicko_imeActionPerformed(evt);
            }
        });

        jButton1_prijava_.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_prijava_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_prijava_.setText("Prijavi se");
        jButton1_prijava_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_prijava_ActionPerformed(evt);
            }
        });

        jButton2_odustani_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_odustani_.setText("Odustani");
        jButton2_odustani_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_odustani_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_pozadinaLayout = new javax.swing.GroupLayout(jPanel1_pozadina);
        jPanel1_pozadina.setLayout(jPanel1_pozadinaLayout);
        jPanel1_pozadinaLayout.setHorizontalGroup(
            jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2_zaglavlje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1_pozadinaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_korisnicko_ime)
                    .addComponent(jLabel3_lozinka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1_pozadinaLayout.createSequentialGroup()
                        .addComponent(jButton1_prijava_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2_odustani_))
                    .addGroup(jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtKorisnicko_ime, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1_pozadinaLayout.setVerticalGroup(
            jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_pozadinaLayout.createSequentialGroup()
                .addComponent(jPanel2_zaglavlje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_korisnicko_ime)
                    .addComponent(txtKorisnicko_ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_lozinka)
                    .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_prijava_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_odustani_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_administracija_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_administracija_ActionPerformed
        // TODO add your handling code here:
        Prijava_admin p_a = new Prijava_admin(); 
        this.hide();
        p_a.setVisible(true);
    }//GEN-LAST:event_jButton_administracija_ActionPerformed

    private void txtKorisnicko_imeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKorisnicko_imeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKorisnicko_imeActionPerformed

    private void jButton1_prijava_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_prijava_ActionPerformed
//  TRY CATCH BLOK
        try { 

            if(txtKorisnicko_ime.getText().isEmpty() || txtLozinka.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Niste unijeli sve podatke");
            }
            else
            {
                String korisnicko_ime = txtKorisnicko_ime.getText();
                String lozinka = txtLozinka.getText();
                
//  INCIJALIZACIJA DRIVERA BAZE PODATAKA
//  UČITAVANJE JDBC DRIVERA
                Class.forName("com.mysql.jdbc.Driver");
//  USPOSTAVLJANJE VEZE - S ODREĐENOM BAZOM PODATAKA
                con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root","");
//  IZVRŠAVANJE UPITA              
                pst = con.prepareStatement("select * from korisnik where korisnicko_ime = ? and lozinka=? ");
//  POSTAVLJAMO PARAMETRE
                pst.setString(1, korisnicko_ime);
                pst.setString(2, lozinka);
//  VRAĆA RESULTSET UPITA I KORISTI SE SA UPITIMA TIPA SELECT
//  IZVRŠAVANJE UPITA
                rs = pst.executeQuery();

                if(rs.next())
                {
                    Sucelje_korisnik s_k = new Sucelje_korisnik();
                    this.hide();
                    s_k.setVisible(true);
 /** Prijavljeni korisnik u sučelju aplikacije **/ 
                    s_k.korisnicko_ime(korisnicko_ime);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Korisnički podaci nisu valjani");
                    txtKorisnicko_ime.setText("");
                    txtLozinka.setText("");
                    txtKorisnicko_ime.requestFocus();
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prijava_korisnik.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Prijava_korisnik.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1_prijava_ActionPerformed

    private void jButton2_odustani_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_odustani_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2_odustani_ActionPerformed

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
            java.util.logging.Logger.getLogger(Prijava_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prijava_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prijava_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prijava_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prijava_korisnik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_prijava_;
    private javax.swing.JButton jButton2_odustani_;
    private javax.swing.JButton jButton_administracija_;
    private javax.swing.JLabel jLabel1_prijava;
    private javax.swing.JLabel jLabel2_korisnicko_ime;
    private javax.swing.JLabel jLabel3_lozinka;
    private javax.swing.JPanel jPanel1_pozadina;
    private javax.swing.JPanel jPanel2_zaglavlje;
    private javax.swing.JTextField txtKorisnicko_ime;
    private javax.swing.JPasswordField txtLozinka;
    // End of variables declaration//GEN-END:variables
}