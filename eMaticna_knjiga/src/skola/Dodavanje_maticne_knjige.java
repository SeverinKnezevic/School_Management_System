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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Severin
 */
public class Dodavanje_maticne_knjige extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    /**
     * Creates new form dodavanje_maticne_knjige
     */
    public Dodavanje_maticne_knjige() {
        initComponents();
        maticna_knjiga();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_pozadina = new javax.swing.JPanel();
        jPanel_zaglavlje = new javax.swing.JPanel();
        jLabel_dodaj_novu_maticnu = new javax.swing.JLabel();
        jPanel_formular = new javax.swing.JPanel();
        jLabel_upis_maticne = new javax.swing.JLabel();
        txtMaticna_knjiga = new javax.swing.JTextField();
        jButton_Dodaj_ = new javax.swing.JButton();
        jButton_Odustani_ = new javax.swing.JButton();
        jLabel_obrisi_maticnu_knjigu = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton_Obrisi_ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane_tablica = new javax.swing.JScrollPane();
        jTable_tablica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_zaglavlje.setBackground(new java.awt.Color(0, 153, 255));
        jPanel_zaglavlje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_dodaj_novu_maticnu.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel_dodaj_novu_maticnu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_dodaj_novu_maticnu.setText("Dodaj novu mati??nu knjigu ");

        javax.swing.GroupLayout jPanel_zaglavljeLayout = new javax.swing.GroupLayout(jPanel_zaglavlje);
        jPanel_zaglavlje.setLayout(jPanel_zaglavljeLayout);
        jPanel_zaglavljeLayout.setHorizontalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaglavljeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_dodaj_novu_maticnu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_zaglavljeLayout.setVerticalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_zaglavljeLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel_dodaj_novu_maticnu)
                .addGap(42, 42, 42))
        );

        jPanel_formular.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_formular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_upis_maticne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_upis_maticne.setText("Upi??i broj mati??ne knjige");

        jButton_Dodaj_.setBackground(new java.awt.Color(0, 255, 51));
        jButton_Dodaj_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Dodaj_.setText("Dodaj");
        jButton_Dodaj_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dodaj_ActionPerformed(evt);
            }
        });

        jButton_Odustani_.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Odustani_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Odustani_.setText("Odustani ");
        jButton_Odustani_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Odustani_ActionPerformed(evt);
            }
        });

        jLabel_obrisi_maticnu_knjigu.setText("Obri??i Mati??nu knjigu:  ID");

        jButton_Obrisi_.setText("Obri??i");
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
                    .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_formularLayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel_upis_maticne)
                            .addGap(18, 18, 18)
                            .addComponent(txtMaticna_knjiga, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_formularLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton_Dodaj_)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_Odustani_)))
                    .addGroup(jPanel_formularLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_obrisi_maticnu_knjigu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Obrisi_)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel_formularLayout.setVerticalGroup(
            jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_formularLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaticna_knjiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_upis_maticne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Odustani_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Dodaj_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Obrisi_)
                    .addComponent(jLabel_obrisi_maticnu_knjigu))
                .addContainerGap())
        );

        jTable_tablica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Broj Mati??ne knjige"
            }
        ));
        jTable_tablica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tablicaMouseClicked(evt);
            }
        });
        jScrollPane_tablica.setViewportView(jTable_tablica);

        javax.swing.GroupLayout jPanel_pozadinaLayout = new javax.swing.GroupLayout(jPanel_pozadina);
        jPanel_pozadina.setLayout(jPanel_pozadinaLayout);
        jPanel_pozadinaLayout.setHorizontalGroup(
            jPanel_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_zaglavlje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_pozadinaLayout.createSequentialGroup()
                .addComponent(jPanel_formular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_tablica, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_pozadinaLayout.setVerticalGroup(
            jPanel_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_pozadinaLayout.createSequentialGroup()
                .addComponent(jPanel_zaglavlje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_formular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane_tablica, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Dodaj_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dodaj_ActionPerformed
        // TODO add your handling code here:

        String maticna_knjiga = txtMaticna_knjiga.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root","");

            pst = con.prepareStatement("insert into maticna_knjiga(broj_maticne)values(?)");
            pst.setString(1, maticna_knjiga);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dodana je nova mati??na knjiga");
            txtMaticna_knjiga.setText("");
            txtMaticna_knjiga.requestFocus();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hide();
        Dodavanje_maticne_knjige d_m_k = new Dodavanje_maticne_knjige();
        d_m_k.setVisible(true);
    }//GEN-LAST:event_jButton_Dodaj_ActionPerformed

    private void jButton_Odustani_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Odustani_ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton_Odustani_ActionPerformed

    private void jButton_Obrisi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Obrisi_ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza", "root", "");

            pst = con.prepareStatement("delete from maticna_knjiga where id="+txtid.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Obrisali ste ");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.hide();
         Dodavanje_maticne_knjige d_m_k = new Dodavanje_maticne_knjige();
        d_m_k.setVisible(true);
    }//GEN-LAST:event_jButton_Obrisi_ActionPerformed

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
            java.util.logging.Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodavanje_maticne_knjige().setVisible(true);
            }
        });
    }
// TABLICA
public void maticna_knjiga()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root",""); 
             
              pst = con.prepareStatement("select * from maticna_knjiga");
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
                   v2.add(Rs.getString("broj_maticne")); 
                       
               }
               df.addRow(v2);
            } 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_maticne_knjige.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Dodaj_;
    private javax.swing.JButton jButton_Obrisi_;
    private javax.swing.JButton jButton_Odustani_;
    private javax.swing.JLabel jLabel_dodaj_novu_maticnu;
    private javax.swing.JLabel jLabel_obrisi_maticnu_knjigu;
    private javax.swing.JLabel jLabel_upis_maticne;
    private javax.swing.JPanel jPanel_formular;
    private javax.swing.JPanel jPanel_pozadina;
    private javax.swing.JPanel jPanel_zaglavlje;
    private javax.swing.JScrollPane jScrollPane_tablica;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_tablica;
    private javax.swing.JTextField txtMaticna_knjiga;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
