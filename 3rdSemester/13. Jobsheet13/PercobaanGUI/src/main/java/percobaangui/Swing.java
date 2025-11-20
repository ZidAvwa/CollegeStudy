package percobaangui;

import javax.swing.JOptionPane;


public class Swing extends javax.swing.JFrame {
    private String nama, nim, jeniskelamin, info, jurusan, matakuliah, semester, alamat;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Swing.class.getName());
    public Swing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        NamaF = new javax.swing.JTextField();
        NIMF = new javax.swing.JTextField();
        Nama = new javax.swing.JLabel();
        NIM = new javax.swing.JLabel();
        JK = new javax.swing.JLabel();
        LLRB = new javax.swing.JRadioButton();
        PerempuanRB = new javax.swing.JRadioButton();
        MK = new javax.swing.JLabel();
        BasdatCB = new javax.swing.JCheckBox();
        PBOCB = new javax.swing.JCheckBox();
        Jurusan = new javax.swing.JLabel();
        SemesterCMB = new javax.swing.JComboBox<>();
        Semester = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JurusanL = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Alamat = new javax.swing.JLabel();
        AlamatF = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setText("Data Mahasiswa");

        NamaF.addActionListener(this::NamaFActionPerformed);

        Nama.setText("Nama");

        NIM.setText("NIM");

        JK.setText("Jenis Kelamin");

        LLRB.setText("Laki - laki");
        LLRB.addActionListener(this::LLRBActionPerformed);

        PerempuanRB.setText("Perempuan");

        MK.setText("Mata Kuliah");

        BasdatCB.setText("Basis Data");

        PBOCB.setText("PBO");

        Jurusan.setText("Jurusan");

        SemesterCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8" }));
        SemesterCMB.addActionListener(this::SemesterCMBActionPerformed);

        Semester.setText("Semester");

        JurusanL.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "DIV Teknik Informatika", "DIV Sistem Informasi Bisnis", "DII lupa" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JurusanL);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane3.setViewportView(hasil);

        jButton3.setText("Clear");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Tampil");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        Alamat.setText("Alamat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nama)
                    .addComponent(NIM)
                    .addComponent(JK)
                    .addComponent(MK)
                    .addComponent(Jurusan)
                    .addComponent(Semester)
                    .addComponent(Alamat))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BasdatCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PBOCB))
                    .addComponent(SemesterCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LLRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PerempuanRB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(NamaF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NIMF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(AlamatF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nama)
                            .addComponent(NamaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NIM)
                            .addComponent(NIMF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LLRB)
                            .addComponent(PerempuanRB)
                            .addComponent(JK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MK)
                            .addComponent(BasdatCB)
                            .addComponent(PBOCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jurusan)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SemesterCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Semester))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Alamat)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(AlamatF, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaFActionPerformed

    private void LLRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LLRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LLRBActionPerformed

    private void SemesterCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemesterCMBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NamaF.setText("");
        NIMF.setText("");
        AlamatF.setText("");
        BasdatCB.setSelected(false);
        PBOCB.setSelected(false);
        hasil.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        nama = NamaF.getText();
        nim = NIMF.getText();
        alamat = AlamatF.getText();
        
        if ("".equals(alamat)){
            alamat = "ISI ALAMAT MU!!";
            JOptionPane.showMessageDialog(null, alamat);
        }
        
        if (BasdatCB.isSelected()){
            matakuliah = "Basis Data";
        } if (PBOCB.isSelected()){
            matakuliah += "PBO";
        } if (LLRB.isSelected()){
            jeniskelamin = "Laki-Laki";
        } if (PerempuanRB.isSelected()){
            jeniskelamin = "Perempuan";
        }
        
        jurusan = JurusanL.getSelectedValue().toString();
        semester = SemesterCMB.getSelectedItem().toString();
        
        info = "Nama\t: "+nama+"\n";
        info += "NIM\t: "+nim+"\n";
        info += "Jenis Kelamin\t: "+jeniskelamin+"\n";
        info += "Jurusan\t: "+jurusan+"\n";
        info += "Semester\t: "+semester+"\n";
        info += "Mata Kuliah\t: "+matakuliah;
        info += "Alamat\t: "+alamat;
        hasil.setText(info);
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_jButton4ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Swing().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JTextField AlamatF;
    private javax.swing.JCheckBox BasdatCB;
    private javax.swing.JLabel JK;
    private javax.swing.JLabel Jurusan;
    private javax.swing.JList<String> JurusanL;
    private javax.swing.JRadioButton LLRB;
    private javax.swing.JLabel MK;
    private javax.swing.JLabel NIM;
    private javax.swing.JTextField NIMF;
    private javax.swing.JLabel Nama;
    private javax.swing.JTextField NamaF;
    private javax.swing.JCheckBox PBOCB;
    private javax.swing.JRadioButton PerempuanRB;
    private javax.swing.JLabel Semester;
    private javax.swing.JComboBox<String> SemesterCMB;
    private javax.swing.JLabel Title;
    private javax.swing.JTextArea hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
