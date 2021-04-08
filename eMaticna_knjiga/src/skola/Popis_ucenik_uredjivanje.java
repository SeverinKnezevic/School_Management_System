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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Severin
 */
public class Popis_ucenik_uredjivanje extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;

    /**
     * Creates new form List_student
     */
    public Popis_ucenik_uredjivanje() {
        initComponents();
        table_student();    
    }
    
    public void table_student()
    {
               
        try {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root",""); 
            pst = con.prepareStatement("SELECT id,iducenik,maticna_knjiga,maticni_broj,ime,prezime,jmbg,spol,roditelj,datum_rodjenja,mjesto_rodjenja,opcina_rodjenja,drzava_rodjenja,drzavljanstvo,nacionalnost,godina_prvog_razreda FROM ucenik");
            ResultSet rs = pst.executeQuery();
            jTable_tablica.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(Level.SEVERE, null, ex);
       }
       
            
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
        jScrollPane_tablica = new javax.swing.JScrollPane();
        jTable_tablica = new javax.swing.JTable();
        jPanel_zaglavlje = new javax.swing.JPanel();
        jLabel_popis_ucenika = new javax.swing.JLabel();
        jButton_Zatvori_ = new javax.swing.JButton();
        jPanel_pretrazivac = new javax.swing.JPanel();
        jLabel_pretrazi_tablicu = new javax.swing.JLabel();
        txtPretrazivac = new javax.swing.JTextField();
        jLabel_obrisi_ucenika = new javax.swing.JLabel();
        txtrd = new javax.swing.JTextField();
        jButton_Obrisi_ = new javax.swing.JButton();
        jButton_Uredi_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_pozadina.setBackground(new java.awt.Color(204, 204, 204));

        jTable_tablica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Studenta", "Matična knjiga", "Matični broj", "Ime", "Prezime", "JMBG", "Spol", "Roditelji", "Datum rođenja", "Mjesto rođenja", "Općina rođenja", "Država rođenja", "Državljanstvo", "Narodnost", "Datum početka školovanja"
            }
        ));
        jTable_tablica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tablicaMouseClicked(evt);
            }
        });
        jScrollPane_tablica.setViewportView(jTable_tablica);
        if (jTable_tablica.getColumnModel().getColumnCount() > 0) {
            jTable_tablica.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable_tablica.getColumnModel().getColumn(1).setHeaderValue("ID Studenta");
            jTable_tablica.getColumnModel().getColumn(2).setHeaderValue("Matična knjiga");
            jTable_tablica.getColumnModel().getColumn(3).setHeaderValue("Matični broj");
            jTable_tablica.getColumnModel().getColumn(4).setHeaderValue("Ime");
            jTable_tablica.getColumnModel().getColumn(5).setHeaderValue("Prezime");
            jTable_tablica.getColumnModel().getColumn(6).setHeaderValue("JMBG");
            jTable_tablica.getColumnModel().getColumn(7).setHeaderValue("Spol");
            jTable_tablica.getColumnModel().getColumn(8).setHeaderValue("Roditelji");
            jTable_tablica.getColumnModel().getColumn(9).setHeaderValue("Datum rođenja");
            jTable_tablica.getColumnModel().getColumn(10).setHeaderValue("Mjesto rođenja");
            jTable_tablica.getColumnModel().getColumn(11).setHeaderValue("Općina rođenja");
            jTable_tablica.getColumnModel().getColumn(12).setHeaderValue("Država rođenja");
            jTable_tablica.getColumnModel().getColumn(13).setHeaderValue("Državljanstvo");
            jTable_tablica.getColumnModel().getColumn(14).setHeaderValue("Narodnost");
            jTable_tablica.getColumnModel().getColumn(15).setHeaderValue("Datum početka školovanja");
        }

        jPanel_zaglavlje.setBackground(new java.awt.Color(0, 153, 255));
        jPanel_zaglavlje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_popis_ucenika.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel_popis_ucenika.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_popis_ucenika.setText("Popis učenika");

        jButton_Zatvori_.setText("Zatvori");
        jButton_Zatvori_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Zatvori_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_zaglavljeLayout = new javax.swing.GroupLayout(jPanel_zaglavlje);
        jPanel_zaglavlje.setLayout(jPanel_zaglavljeLayout);
        jPanel_zaglavljeLayout.setHorizontalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaglavljeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel_popis_ucenika)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 773, Short.MAX_VALUE)
                .addComponent(jButton_Zatvori_)
                .addContainerGap())
        );
        jPanel_zaglavljeLayout.setVerticalGroup(
            jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaglavljeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel_zaglavljeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Zatvori_)
                    .addComponent(jLabel_popis_ucenika))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel_pretrazivac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_pretrazi_tablicu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_pretrazi_tablicu.setText("Pretraži  tablicu");

        txtPretrazivac.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtPretrazivac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPretrazivacKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel_pretrazivacLayout = new javax.swing.GroupLayout(jPanel_pretrazivac);
        jPanel_pretrazivac.setLayout(jPanel_pretrazivacLayout);
        jPanel_pretrazivacLayout.setHorizontalGroup(
            jPanel_pretrazivacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_pretrazivacLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel_pretrazi_tablicu)
                .addGap(18, 18, 18)
                .addComponent(txtPretrazivac, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
        );
        jPanel_pretrazivacLayout.setVerticalGroup(
            jPanel_pretrazivacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_pretrazivacLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_pretrazivacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pretrazi_tablicu)
                    .addComponent(txtPretrazivac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel_obrisi_ucenika.setText("ID učenika:");

        jButton_Obrisi_.setText("Obriši");
        jButton_Obrisi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Obrisi_ActionPerformed(evt);
            }
        });

        jButton_Uredi_.setText("Uredi");
        jButton_Uredi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Uredi_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_pozadinaLayout = new javax.swing.GroupLayout(jPanel_pozadina);
        jPanel_pozadina.setLayout(jPanel_pozadinaLayout);
        jPanel_pozadinaLayout.setHorizontalGroup(
            jPanel_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_zaglavlje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_pretrazivac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane_tablica, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel_pozadinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_obrisi_ucenika)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Obrisi_)
                .addGap(104, 104, 104)
                .addComponent(jButton_Uredi_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_pozadinaLayout.setVerticalGroup(
            jPanel_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_pozadinaLayout.createSequentialGroup()
                .addComponent(jPanel_zaglavlje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_pretrazivac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_tablica, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_pozadinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_obrisi_ucenika)
                    .addComponent(txtrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Obrisi_)
                    .addComponent(jButton_Uredi_))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_pozadina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Zatvori_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Zatvori_ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton_Zatvori_ActionPerformed

    private void txtPretrazivacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPretrazivacKeyReleased
    try {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza","root",""); 
            pst = con.prepareStatement("SELECT id,iducenik,maticna_knjiga,maticni_broj,ime,prezime,jmbg,spol,roditelj,datum_rodjenja,mjesto_rodjenja,opcina_rodjenja,drzava_rodjenja,drzavljanstvo,nacionalnost,godina_prvog_razreda FROM ucenik WHERE  ime LIKE  '%"+txtPretrazivac.getText()+"%' OR prezime LIKE  '%"+txtPretrazivac.getText()+"%' OR jmbg LIKE  '%"+txtPretrazivac.getText()+"%' OR datum_rodjenja LIKE  '%"+txtPretrazivac.getText()+"%' OR godina_prvog_razreda LIKE  '%"+txtPretrazivac.getText()+"%' OR roditelj LIKE  '%"+txtPretrazivac.getText()+"%'");
            ResultSet rs = pst.executeQuery();
            jTable_tablica.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_txtPretrazivacKeyReleased

    private void jTable_tablicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tablicaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel)jTable_tablica.getModel();
        int selectedIndex = jTable_tablica.getSelectedRow();
        
        txtrd.setText(df.getValueAt(selectedIndex, 0).toString());
        
        
    }//GEN-LAST:event_jTable_tablicaMouseClicked

    private void jButton_Obrisi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Obrisi_ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ematicna_baza", "root", "");

            pst = con.prepareStatement("delete from ucenik where id="+txtrd.getText());

            pst.executeUpdate();
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.hide();
        Popis_ucenik_uredjivanje l2 = new Popis_ucenik_uredjivanje();
        l2.setVisible(true);

    }//GEN-LAST:event_jButton_Obrisi_ActionPerformed

    private void jButton_Uredi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Uredi_ActionPerformed
        // TODO add your handling code here:
         this.hide();
        Ucenik_uredjivanje u_r = new Ucenik_uredjivanje();
        u_r.setVisible(true);
    }//GEN-LAST:event_jButton_Uredi_ActionPerformed

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
            java.util.logging.Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Popis_ucenik_uredjivanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Popis_ucenik_uredjivanje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Obrisi_;
    private javax.swing.JButton jButton_Uredi_;
    private javax.swing.JButton jButton_Zatvori_;
    private javax.swing.JLabel jLabel_obrisi_ucenika;
    private javax.swing.JLabel jLabel_popis_ucenika;
    private javax.swing.JLabel jLabel_pretrazi_tablicu;
    private javax.swing.JPanel jPanel_pozadina;
    private javax.swing.JPanel jPanel_pretrazivac;
    private javax.swing.JPanel jPanel_zaglavlje;
    private javax.swing.JScrollPane jScrollPane_tablica;
    private javax.swing.JTable jTable_tablica;
    private javax.swing.JTextField txtPretrazivac;
    private javax.swing.JTextField txtrd;
    // End of variables declaration//GEN-END:variables
}