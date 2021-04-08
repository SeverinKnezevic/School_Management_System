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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Severin
 */
public class Dodavanje_admina extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    /**
     * Creates new form dodavanje_admina
     */
    public Dodavanje_admina() {
        initComponents();
        admini();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_zaglavlje = new javax.swing.JPanel();
        jLabel_administratori_aplikacije = new javax.swing.JLabel();
        jPanel_formular = new javax.swing.JPanel();
        jLabel_admin_ime = new javax.swing.JLabel();
        jLabel_admin_lozinka = new javax.swing.JLabel();
        jLabel_ponovi_lozinku = new javax.swing.JLabel();
        txtKorisnicko_ime = new javax.swing.JTextField();
        txtLozinka = new javax.swing.JPasswordField();
        txtPonovi_lozinku = new javax.swing.JPasswordField();
        jButton_Odustani_ = new javax.swing.JButton();
        jButton_Dodaj_admina_ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_obrisi_korisnika = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton_Obrisi_ = new javax.swing.JButton();
        jScrollPane_tablica = new javax.swing.JScrollPane();
        jTable_tablica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_zaglavlje.setBackground(new java.awt.Color(0, 153, 255));
        jPanel_zaglavlje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_administratori_aplikacije.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel_administratori_aplikacije.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_administratori_aplikacije.setText("Administratori aplikacije");

        javax.swing.GroupLayout jPanel_zaglavljeLayout = new javax.swing.GroupLayout(jPanel_zaglavlje);
        jPanel_zaglavlje.setLayout(jPanel_zaglavljeLayout);
        jPanel_zaglavljeLayout.setHorizontalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaglavljeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_administratori_aplikacije)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_zaglavljeLayout.setVerticalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaglavljeLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel_administratori_aplikacije)
                .addGap(40, 40, 40))
        );

        jPanel_formular.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_formular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_admin_ime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_admin_ime.setText("Admin ime");

        jLabel_admin_lozinka.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_admin_lozinka.setText("Admin lozinka");

        jLabel_ponovi_lozinku.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_ponovi_lozinku.setText("Ponovi lozinku ");

        jButton_Odustani_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Odustani_.setText("Odustani");
        jButton_Odustani_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Odustani_ActionPerformed(evt);
            }
        });

        jButton_Dodaj_admina_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Dodaj_admina_.setText("Dodaj administratora");
        jButton_Dodaj_admina_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dodaj_admina_ActionPerformed(evt);
            }
        });

        jLabel_obrisi_korisnika.setText("Obriši korisnika:  ID");

        jButton_Obrisi_.setText("Obriši");
        jButton_Obrisi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Obrisi_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_formularLayout = new javax.swing.GroupLayout(jPanel_formular);
        jPanel_formular.setLayout(jPanel_formularLayout);
        jPanel_formularLayout.setHorizontalGroup(
            jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_formularLayout.createSequentialGroup()
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_formularLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel_formularLayout.createSequentialGroup()
                        .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_formularLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_ponovi_lozinku)
                                    .addGroup(jPanel_formularLayout.createSequentialGroup()
                                        .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_admin_ime)
                                            .addComponent(jLabel_admin_lozinka))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(txtKorisnicko_ime)
                                            .addComponent(txtPonovi_lozinku)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_formularLayout.createSequentialGroup()
                                        .addComponent(jButton_Dodaj_admina_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_Odustani_))))
                            .addGroup(jPanel_formularLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_obrisi_korisnika)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Obrisi_)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_formularLayout.setVerticalGroup(
            jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_formularLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admin_ime)
                    .addComponent(txtKorisnicko_ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admin_lozinka)
                    .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ponovi_lozinku)
                    .addComponent(txtPonovi_lozinku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Odustani_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Dodaj_admina_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_obrisi_korisnika)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Obrisi_))
                .addContainerGap())
        );

        jTable_tablica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Admin ime", "Admin lozinka"
            }
        ));
        jTable_tablica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tablicaMouseClicked(evt);
            }
        });
        jScrollPane_tablica.setViewportView(jTable_tablica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_zaglavlje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_formular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_tablica, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_zaglavlje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_formular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane_tablica, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Odustani_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Odustani_ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton_Odustani_ActionPerformed

    private void jButton_Dodaj_admina_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dodaj_admina_ActionPerformed
        // TODO add your handling code here:

        if(txtKorisnicko_ime.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Unesite Vaše korisničko ime");
        }
        else if(txtLozinka.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Unesite Vašu lozinku");
        }
        else if(txtLozinka.getText().equals(txtPonovi_lozinku.getText()) == false)
        {
            JOptionPane.showMessageDialog(this,"Lozinka nije ispravna");
        }

        else
        {
            try {

                String admin_ime = txtKorisnicko_ime.getText();
                String lozinka = txtPonovi_lozinku.getText();

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root","");
                pst = con.prepareStatement("insert into admin(admin_ime,lozinka)values(?,?)");
                pst.setString(1, admin_ime);
                pst.setString(2, lozinka);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Novi administrator je registriran");
                txtKorisnicko_ime.setText("");
                txtLozinka.setText("");
                txtPonovi_lozinku.setText("");

                txtKorisnicko_ime.requestFocus();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Dodavanje_admina.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Dodavanje_admina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.hide();
        Dodavanje_admina d_a = new Dodavanje_admina();
        d_a.setVisible(true);
    }//GEN-LAST:event_jButton_Dodaj_admina_ActionPerformed

    private void jButton_Obrisi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Obrisi_ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza", "root", "");

            pst = con.prepareStatement("delete from admin where id="+txtid.getText());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_admina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_admina.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.hide();
        Dodavanje_admina d_a = new Dodavanje_admina();
        d_a.setVisible(true);
    }//GEN-LAST:event_jButton_Obrisi_ActionPerformed
//  TABLICA
public void admini()
     {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root","");    
            
            pst = con.prepareStatement("select * from admin");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData rd = Rs.getMetaData();
            int c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jTable_tablica.getModel();
            df.setRowCount(0);
            
             while(Rs.next())
            {
               Vector v2 = new Vector();
               
               for(int i=1; i<c; i++)
               {   
                   v2.add(Rs.getString("id"));
                   v2.add(Rs.getString("admin_ime"));
                   v2.add(Rs.getString("lozinka"));
               }
               df.addRow(v2);
            }
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_admina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_admina.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    private void jTable_tablicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tablicaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel)jTable_tablica.getModel();
        int selectedIndex = jTable_tablica.getSelectedRow();

        txtid.setText(df.getValueAt(selectedIndex, 0).toString());
    }//GEN-LAST:event_jTable_tablicaMouseClicked

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
            java.util.logging.Logger.getLogger(Dodavanje_admina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_admina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_admina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_admina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodavanje_admina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Dodaj_admina_;
    private javax.swing.JButton jButton_Obrisi_;
    private javax.swing.JButton jButton_Odustani_;
    private javax.swing.JLabel jLabel_admin_ime;
    private javax.swing.JLabel jLabel_admin_lozinka;
    private javax.swing.JLabel jLabel_administratori_aplikacije;
    private javax.swing.JLabel jLabel_obrisi_korisnika;
    private javax.swing.JLabel jLabel_ponovi_lozinku;
    private javax.swing.JPanel jPanel_formular;
    private javax.swing.JPanel jPanel_zaglavlje;
    private javax.swing.JScrollPane jScrollPane_tablica;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_tablica;
    private javax.swing.JTextField txtKorisnicko_ime;
    private javax.swing.JPasswordField txtLozinka;
    private javax.swing.JPasswordField txtPonovi_lozinku;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
