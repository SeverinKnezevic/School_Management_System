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
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Severin
 */
public class Dodavanje_razred extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    /**
     * Creates new form dodavanje_razred
     */
    public Dodavanje_razred() {
        initComponents();
        razred_tablica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_formular = new javax.swing.JPanel();
        jLabel_razred = new javax.swing.JLabel();
        jLabel_razrednik = new javax.swing.JLabel();
        txtBroj_razreda = new javax.swing.JComboBox();
        txtOdjel = new javax.swing.JComboBox();
        txtUcitelj = new javax.swing.JTextField();
        jButton_Dodaj_ = new javax.swing.JButton();
        jButton_Odustani_ = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel_obrisirazred = new javax.swing.JLabel();
        jButton_Obrisi_ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane_tablica = new javax.swing.JScrollPane();
        jTable_tablica = new javax.swing.JTable();
        jPanel_zaglavlje = new javax.swing.JPanel();
        jLabel_dodaj_razred = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_formular.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_formular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_razred.setText("Razred");

        jLabel_razrednik.setText("Razrednik /ca");

        txtBroj_razreda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBroj_razreda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1.", "2.", "3.", "4.", "5.", "6.", "7.", "8.", "9.", " " }));

        txtOdjel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "a", "b", "c", " " }));

        jButton_Dodaj_.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton_Dodaj_.setText("Dodaj");
        jButton_Dodaj_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dodaj_ActionPerformed(evt);
            }
        });

        jButton_Odustani_.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton_Odustani_.setText("Odustani");
        jButton_Odustani_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Odustani_ActionPerformed(evt);
            }
        });

        jLabel_obrisirazred.setText("Obriši razred:  ID");

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
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel_formularLayout.createSequentialGroup()
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_formularLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel_obrisirazred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jButton_Obrisi_))
                    .addGroup(jPanel_formularLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_formularLayout.createSequentialGroup()
                                .addComponent(jButton_Dodaj_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Odustani_))
                            .addGroup(jPanel_formularLayout.createSequentialGroup()
                                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_razred)
                                    .addComponent(jLabel_razrednik))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUcitelj, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_formularLayout.createSequentialGroup()
                                        .addComponent(txtBroj_razreda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOdjel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel_formularLayout.setVerticalGroup(
            jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_formularLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_razred)
                    .addComponent(txtBroj_razreda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOdjel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUcitelj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_razrednik))
                .addGap(18, 18, 18)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Dodaj_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Odustani_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_formularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_obrisirazred)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Obrisi_)))
        );

        jTable_tablica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Razred", "Odjeljenje", "Ime razrednika"
            }
        ));
        jTable_tablica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tablicaMouseClicked(evt);
            }
        });
        jScrollPane_tablica.setViewportView(jTable_tablica);

        jPanel_zaglavlje.setBackground(new java.awt.Color(0, 153, 255));
        jPanel_zaglavlje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_dodaj_razred.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel_dodaj_razred.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_dodaj_razred.setText("Dodaj razred (odjeljenje)");

        javax.swing.GroupLayout jPanel_zaglavljeLayout = new javax.swing.GroupLayout(jPanel_zaglavlje);
        jPanel_zaglavlje.setLayout(jPanel_zaglavljeLayout);
        jPanel_zaglavljeLayout.setHorizontalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaglavljeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel_dodaj_razred)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel_zaglavljeLayout.setVerticalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaglavljeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel_dodaj_razred)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_formular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_tablica, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel_zaglavlje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton_Dodaj_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dodaj_ActionPerformed
        try {
            // TODO add your handling code here:

            String broj_razreda = txtBroj_razreda.getSelectedItem().toString();
            String tip_razreda = txtOdjel.getSelectedItem().toString();
            String ucitelj = txtUcitelj.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root","");
            Properties connectionProperties = new Properties();

            pst = con.prepareStatement("insert into razred(broj_razreda,tip_razreda,ucitelj)values(?,?,?)");
            pst.setString(1, broj_razreda);
            pst.setString(2, tip_razreda);
            pst.setString(3, ucitelj);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dodan je novi razred");
            
            txtBroj_razreda.setSelectedIndex(-1);
            txtOdjel.setSelectedIndex(-1);
            txtUcitelj.setText("");
            txtBroj_razreda.requestFocus();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_razred.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_razred.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.hide();
        Dodavanje_razred d_r = new Dodavanje_razred();
        d_r.setVisible(true);

    }//GEN-LAST:event_jButton_Dodaj_ActionPerformed

    private void jButton_Odustani_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Odustani_ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton_Odustani_ActionPerformed

    private void jTable_tablicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tablicaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel)jTable_tablica.getModel();
        int selectedIndex = jTable_tablica.getSelectedRow();

        txtid.setText(df.getValueAt(selectedIndex, 0).toString());
    }//GEN-LAST:event_jTable_tablicaMouseClicked

    private void jButton_Obrisi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Obrisi_ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza", "root", "");

            pst = con.prepareStatement("delete from razred where id="+txtid.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Obrisali ste ");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_razred.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_razred.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.hide();
        Dodavanje_razred d_r = new Dodavanje_razred();
        d_r.setVisible(true);

    }//GEN-LAST:event_jButton_Obrisi_ActionPerformed

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
            java.util.logging.Logger.getLogger(Dodavanje_razred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_razred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_razred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dodavanje_razred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodavanje_razred().setVisible(true);
            }
        });
    }

//  TABLICA    
 public void razred_tablica()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root",""); 
            Properties connectionProperties = new Properties();

             
            pst = con.prepareStatement("select * from razred");
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
                   v2.add(Rs.getString("broj_razreda")); 
                   v2.add(Rs.getString("tip_razreda")); 
                   v2.add(Rs.getString("ucitelj")); 
                       
               }
               df.addRow(v2);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dodavanje_razred.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dodavanje_razred.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Dodaj_;
    private javax.swing.JButton jButton_Obrisi_;
    private javax.swing.JButton jButton_Odustani_;
    private javax.swing.JLabel jLabel_dodaj_razred;
    private javax.swing.JLabel jLabel_obrisirazred;
    private javax.swing.JLabel jLabel_razred;
    private javax.swing.JLabel jLabel_razrednik;
    private javax.swing.JPanel jPanel_formular;
    private javax.swing.JPanel jPanel_zaglavlje;
    private javax.swing.JScrollPane jScrollPane_tablica;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_tablica;
    private javax.swing.JComboBox txtBroj_razreda;
    private javax.swing.JComboBox txtOdjel;
    private javax.swing.JTextField txtUcitelj;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
