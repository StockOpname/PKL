/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import javax.swing.JOptionPane;

/**
 *
 * @author Abyan
 */
public class MenuAwal extends javax.swing.JFrame {

    /**
     * Creates new form MenuAwal
     */
    public MenuAwal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Masuk = new javax.swing.JButton();
        Btn_History = new javax.swing.JButton();
        Btn_Laporan = new javax.swing.JButton();
        Btn_TmbBaru = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuQuit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn_Keluar.setText("Barang Keluar");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });

        Btn_Masuk.setText("Barang Masuk");
        Btn_Masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MasukActionPerformed(evt);
            }
        });

        Btn_History.setText("History Barang");
        Btn_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HistoryActionPerformed(evt);
            }
        });

        Btn_Laporan.setText("Laporan Hari ini");
        Btn_Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LaporanActionPerformed(evt);
            }
        });

        Btn_TmbBaru.setText("Tambah Barang Baru");
        Btn_TmbBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TmbBaruActionPerformed(evt);
            }
        });

        jMenu1.setText("Quit");

        MenuQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuQuit.setText("Quit");
        MenuQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuQuitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuQuit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_History, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Masuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(Btn_TmbBaru)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Btn_TmbBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_History, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_TmbBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TmbBaruActionPerformed
        // TODO add your handling code here:
        new TambahBaru().setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_TmbBaruActionPerformed

    private void Btn_MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MasukActionPerformed
        // TODO add your handling code here:
        new BarangMasuk().setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_MasukActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        // TODO add your handling code here:
        new BarangKeluar().setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HistoryActionPerformed
        // TODO add your handling code here:
        new HistoryBarang().setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_HistoryActionPerformed

    private void Btn_LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LaporanActionPerformed
        // TODO add your handling code here:
        new LaporanAkhir().setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_LaporanActionPerformed

    private void MenuQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuQuitActionPerformed
        // TODO add your handling code here:
        Object options[] = {"Ya", "Tidak"};
        int result = JOptionPane.showOptionDialog(this, "Apakah anda ingin keluar?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, options, options[1]);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuQuitActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_History;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Laporan;
    private javax.swing.JButton Btn_Masuk;
    private javax.swing.JButton Btn_TmbBaru;
    private javax.swing.JMenuItem MenuQuit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
