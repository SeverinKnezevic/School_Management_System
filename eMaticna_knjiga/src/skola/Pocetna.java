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
/**
 *
 * @author Severin
 */
public class Pocetna extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;
PreparedStatement pst1;
ResultSet rs;
    /**
     * Creates new form pocetna
     */
    public Pocetna() {
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

        pozadina = new javax.swing.JPanel();
        eMatična_knjiga = new javax.swing.JLabel();
        dobrodosli = new javax.swing.JLabel();
        loading = new javax.swing.JProgressBar();
        postotak__ucitavanja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pozadina.setBackground(new java.awt.Color(0, 153, 255));
        pozadina.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        eMatična_knjiga.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        eMatična_knjiga.setForeground(new java.awt.Color(255, 255, 255));
        eMatična_knjiga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMatična_knjiga.setText("eMatična knjiga ");

        dobrodosli.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        dobrodosli.setForeground(new java.awt.Color(255, 255, 255));
        dobrodosli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dobrodosli.setText("Dobrodošli");

        loading.setBackground(new java.awt.Color(255, 255, 255));
        loading.setForeground(new java.awt.Color(0, 153, 255));

        postotak__ucitavanja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        postotak__ucitavanja.setForeground(new java.awt.Color(255, 255, 255));
        postotak__ucitavanja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postotak__ucitavanja.setText("0%");

        javax.swing.GroupLayout pozadinaLayout = new javax.swing.GroupLayout(pozadina);
        pozadina.setLayout(pozadinaLayout);
        pozadinaLayout.setHorizontalGroup(
            pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pozadinaLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loading, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(postotak__ucitavanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pozadinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eMatična_knjiga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(dobrodosli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pozadinaLayout.setVerticalGroup(
            pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pozadinaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(dobrodosli)
                .addGap(38, 38, 38)
                .addComponent(eMatična_knjiga, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postotak__ucitavanja)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pozadina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(579, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        Pocetna p =new Pocetna();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               p.setVisible(true);
            }
        });
        
        Prijava_korisnik p_u = new Prijava_korisnik();
        
        try {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                p.loading.setValue(i);
                p.postotak__ucitavanja.setText(Integer.toString(i)+"%");
            }
                
        } catch (Exception e ) {
            
        }
        new Pocetna().setVisible(false);  
        p_u.setVisible(true);
        p.dispose();;
                
            }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dobrodosli;
    private javax.swing.JLabel eMatična_knjiga;
    public static javax.swing.JProgressBar loading;
    public static javax.swing.JLabel postotak__ucitavanja;
    private javax.swing.JPanel pozadina;
    // End of variables declaration//GEN-END:variables
}
