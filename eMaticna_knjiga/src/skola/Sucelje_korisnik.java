/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skola;

/**
 *
 * @author Severin
 */
public class Sucelje_korisnik extends javax.swing.JFrame {

    /**
     * Creates new form sucelje_korisnik
     */
    public Sucelje_korisnik() {
        initComponents();
//      setLocationRelativeTo(null);
    }

//  Ime prijavljenog korisnika gore u zaglavlju 
 void korisnicko_ime (String korisnicko_ime){
    ime_prijavljenog_korisnika.setText(korisnicko_ime);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2_pozadina = new javax.swing.JPanel();
        jPanel3_zaglavlje = new javax.swing.JPanel();
        jButton_Odjavi_se_ = new javax.swing.JButton();
        ime_prijavljenog_korisnika = new javax.swing.JLabel();
        jLabel3_korisnik = new javax.swing.JLabel();
        jLabel4_eMaticna_knjiga = new javax.swing.JLabel();
        jPanel1_podnozje = new javax.swing.JPanel();
        jLabel2_autor = new javax.swing.JLabel();
        jButton_Oprogramu_ = new javax.swing.JButton();
        jPanel4_izbornik = new javax.swing.JPanel();
        jButton_Dodaj_novog_ucenika_ = new javax.swing.JButton();
        jButton_Maticni_podaci_ = new javax.swing.JButton();
        jButton_Evidencija_ucenika_ = new javax.swing.JButton();
        jButton_Upis_u_maticnu_knjigu_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2_pozadina.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3_zaglavlje.setBackground(new java.awt.Color(0, 153, 255));

        jButton_Odjavi_se_.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Odjavi_se_.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton_Odjavi_se_.setText("Odjavi se");
        jButton_Odjavi_se_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Odjavi_se_ActionPerformed(evt);
            }
        });

        ime_prijavljenog_korisnika.setFont(new java.awt.Font("Segoe UI Emoji", 3, 12)); // NOI18N
        ime_prijavljenog_korisnika.setForeground(new java.awt.Color(255, 255, 255));
        ime_prijavljenog_korisnika.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ime_prijavljenog_korisnika.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3_korisnik.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel3_korisnik.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3_korisnik.setText("Korisnik:");

        jLabel4_eMaticna_knjiga.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel4_eMaticna_knjiga.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_eMaticna_knjiga.setText("eMatična knjiga");

        javax.swing.GroupLayout jPanel3_zaglavljeLayout = new javax.swing.GroupLayout(jPanel3_zaglavlje);
        jPanel3_zaglavlje.setLayout(jPanel3_zaglavljeLayout);
        jPanel3_zaglavljeLayout.setHorizontalGroup(
            jPanel3_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3_zaglavljeLayout.createSequentialGroup()
                .addGroup(jPanel3_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3_zaglavljeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3_korisnik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel3_zaglavljeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4_eMaticna_knjiga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ime_prijavljenog_korisnika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Odjavi_se_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3_zaglavljeLayout.setVerticalGroup(
            jPanel3_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_zaglavljeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Odjavi_se_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_eMaticna_knjiga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ime_prijavljenog_korisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_korisnik))
                .addContainerGap())
        );

        jPanel1_podnozje.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2_autor.setFont(new java.awt.Font("Sitka Heading", 1, 12)); // NOI18N
        jLabel2_autor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_autor.setText("Produced by Severin Knežević");

        jButton_Oprogramu_.setBackground(new java.awt.Color(0, 153, 255));
        jButton_Oprogramu_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Oprogramu_.setText("O programu");
        jButton_Oprogramu_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Oprogramu_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_podnozjeLayout = new javax.swing.GroupLayout(jPanel1_podnozje);
        jPanel1_podnozje.setLayout(jPanel1_podnozjeLayout);
        jPanel1_podnozjeLayout.setHorizontalGroup(
            jPanel1_podnozjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_podnozjeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Oprogramu_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1_podnozjeLayout.setVerticalGroup(
            jPanel1_podnozjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1_podnozjeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1_podnozjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_autor)
                    .addComponent(jButton_Oprogramu_))
                .addGap(4, 4, 4))
        );

        jPanel4_izbornik.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4_izbornik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton_Dodaj_novog_ucenika_.setBackground(new java.awt.Color(51, 255, 255));
        jButton_Dodaj_novog_ucenika_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Dodaj_novog_ucenika_.setText("Dodaj novog učenika");
        jButton_Dodaj_novog_ucenika_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dodaj_novog_ucenika_ActionPerformed(evt);
            }
        });

        jButton_Maticni_podaci_.setBackground(new java.awt.Color(51, 255, 255));
        jButton_Maticni_podaci_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Maticni_podaci_.setText("Matični podaci ");
        jButton_Maticni_podaci_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Maticni_podaci_ActionPerformed(evt);
            }
        });

        jButton_Evidencija_ucenika_.setBackground(new java.awt.Color(51, 255, 255));
        jButton_Evidencija_ucenika_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Evidencija_ucenika_.setText("Evidencija učenika");
        jButton_Evidencija_ucenika_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Evidencija_ucenika_ActionPerformed(evt);
            }
        });

        jButton_Upis_u_maticnu_knjigu_.setBackground(new java.awt.Color(51, 255, 255));
        jButton_Upis_u_maticnu_knjigu_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Upis_u_maticnu_knjigu_.setText("Upis u matičnu knjigu");
        jButton_Upis_u_maticnu_knjigu_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Upis_u_maticnu_knjigu_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4_izbornikLayout = new javax.swing.GroupLayout(jPanel4_izbornik);
        jPanel4_izbornik.setLayout(jPanel4_izbornikLayout);
        jPanel4_izbornikLayout.setHorizontalGroup(
            jPanel4_izbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_izbornikLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4_izbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Dodaj_novog_ucenika_, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Evidencija_ucenika_, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel4_izbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Maticni_podaci_, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jButton_Upis_u_maticnu_knjigu_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );
        jPanel4_izbornikLayout.setVerticalGroup(
            jPanel4_izbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_izbornikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4_izbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Dodaj_novog_ucenika_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Maticni_podaci_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4_izbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Evidencija_ucenika_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Upis_u_maticnu_knjigu_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2_pozadinaLayout = new javax.swing.GroupLayout(jPanel2_pozadina);
        jPanel2_pozadina.setLayout(jPanel2_pozadinaLayout);
        jPanel2_pozadinaLayout.setHorizontalGroup(
            jPanel2_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3_zaglavlje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1_podnozje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_pozadinaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4_izbornik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2_pozadinaLayout.setVerticalGroup(
            jPanel2_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_pozadinaLayout.createSequentialGroup()
                .addComponent(jPanel3_zaglavlje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4_izbornik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1_podnozje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2_pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2_pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Odjavi_se_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Odjavi_se_ActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jButton_Odjavi_se_ActionPerformed

    private void jButton_Dodaj_novog_ucenika_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dodaj_novog_ucenika_ActionPerformed
        // TODO add your handling code here:
        Dodavanje_ucenika d_u = new Dodavanje_ucenika();
        d_u.setVisible(true);
    }//GEN-LAST:event_jButton_Dodaj_novog_ucenika_ActionPerformed

    private void jButton_Maticni_podaci_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Maticni_podaci_ActionPerformed
        // TODO add your handling code here:
        Maticni_podaci_korisnici m_p_k = new Maticni_podaci_korisnici();
        m_p_k.setVisible(true);
    }//GEN-LAST:event_jButton_Maticni_podaci_ActionPerformed

    private void jButton_Evidencija_ucenika_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Evidencija_ucenika_ActionPerformed
        // TODO add your handling code here:
        Popis_ucenika p_u = new Popis_ucenika();
        p_u.setVisible(true);
    }//GEN-LAST:event_jButton_Evidencija_ucenika_ActionPerformed

    private void jButton_Upis_u_maticnu_knjigu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Upis_u_maticnu_knjigu_ActionPerformed
        // TODO add your handling code here:
        Upis_maticni_podaci u_m_p = new Upis_maticni_podaci();
        u_m_p.setVisible(true);
    }//GEN-LAST:event_jButton_Upis_u_maticnu_knjigu_ActionPerformed

    private void jButton_Oprogramu_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Oprogramu_MouseClicked
        // TODO add your handling code here:
        Oprogramu o = new Oprogramu();
        o.setVisible(true);   
    }//GEN-LAST:event_jButton_Oprogramu_MouseClicked

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
            java.util.logging.Logger.getLogger(Sucelje_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucelje_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucelje_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucelje_korisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucelje_korisnik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ime_prijavljenog_korisnika;
    private javax.swing.JButton jButton_Dodaj_novog_ucenika_;
    private javax.swing.JButton jButton_Evidencija_ucenika_;
    private javax.swing.JButton jButton_Maticni_podaci_;
    private javax.swing.JButton jButton_Odjavi_se_;
    private javax.swing.JButton jButton_Oprogramu_;
    private javax.swing.JButton jButton_Upis_u_maticnu_knjigu_;
    private javax.swing.JLabel jLabel2_autor;
    private javax.swing.JLabel jLabel3_korisnik;
    private javax.swing.JLabel jLabel4_eMaticna_knjiga;
    private javax.swing.JPanel jPanel1_podnozje;
    private javax.swing.JPanel jPanel2_pozadina;
    private javax.swing.JPanel jPanel3_zaglavlje;
    private javax.swing.JPanel jPanel4_izbornik;
    // End of variables declaration//GEN-END:variables

   
}
