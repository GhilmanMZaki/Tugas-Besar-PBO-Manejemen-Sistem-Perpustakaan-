
package View;

import Model.Buku;
import Model.Member;
import Model.Transaksi;
import controller.bukuCont;
import controller.memberCont;
import controller.transaksiCont;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class CetakBuku extends javax.swing.JFrame {

    /**
     * Creates new form KembalikanBuku
     */
    public CetakBuku() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisTransaksi = new javax.swing.ButtonGroup();
        bukuSchTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        judulTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        penulisTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jmlTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cetakBtn = new javax.swing.JButton();
        tglTxt = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        isbnTxt = new javax.swing.JTextField();
        bukuSchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jenisTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        memberSchTxt = new javax.swing.JTextField();
        memberSchBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        namaTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        umurTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jabatanTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        peminjaman = new javax.swing.JRadioButton();
        pengembalian = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Judul Buku");

        jLabel2.setText("Jenis Buku");

        jLabel4.setText("Jumlah Halaman");

        jLabel5.setText("Tanggal");

        cetakBtn.setText("CETAK");
        cetakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("ISBN");

        bukuSchBtn.setText("Cari Buku");
        bukuSchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuSchBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Penulis");

        memberSchBtn.setText("Cari Member");
        memberSchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSchBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("ID_Member");

        jLabel8.setText("Nama Member");

        jLabel9.setText("Gender");

        jLabel10.setText("Umur");

        jLabel11.setText("Jabatan");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("JENIS TRANSAKSI");

        jenisTransaksi.add(peminjaman);
        peminjaman.setText("Peminjaman");

        jenisTransaksi.add(pengembalian);
        pengembalian.setText("Pengembalian");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("CETAK TRANSAKSI");

        backBtn.setText("Kembali");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(memberSchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberSchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaTxt)
                                    .addComponent(genderTxt)
                                    .addComponent(jabatanTxt)
                                    .addComponent(idTxt)
                                    .addComponent(umurTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(judulTxt)
                                    .addComponent(penulisTxt)
                                    .addComponent(jmlTxt)
                                    .addComponent(isbnTxt)
                                    .addComponent(jenisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bukuSchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bukuSchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(tglTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peminjaman)
                            .addComponent(pengembalian))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cetakBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bukuSchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bukuSchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(judulTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(penulisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jmlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memberSchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memberSchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(umurTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jabatanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(19, 19, 19)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cetakBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peminjaman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pengembalian)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cetakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakBtnActionPerformed
        if (isbnTxt.getText().equals("")||judulTxt.getText().equals("")||penulisTxt.getText().equals("")||jenisTxt.getText().equals("")||
                  jmlTxt.getText().equals("")||idTxt.getText().equals("")||namaTxt.getText().equals("")|| genderTxt.getText().equals("")||umurTxt.getText().equals("")||
                  jabatanTxt.getText().equals("")||(peminjaman.isSelected() == false && pengembalian.isSelected() == false)||tglTxt.getDate().equals(null)){
            JOptionPane.showMessageDialog(null, "Data tidak lengkap, Silahkan isi kembali data dengan lengkap");
        }else if (peminjaman.isSelected()) {
            transaksiCont transCont = new transaksiCont();
            bukuCont bukucont = new bukuCont();
            memberCont membercont = new memberCont();
            Buku buku = new Buku();
            Member member = new Member();
            if (bukuSchTxt.getText().equals("")|| memberSchTxt.getText().equals("")) {     
                buku = bukucont.get(isbnTxt.getText());
                member = membercont.get(idTxt.getText());
            } else {    
                buku = bukucont.get(bukuSchTxt.getText());
                member = membercont.get(memberSchTxt.getText());
            }
            Transaksi trans = new Transaksi(buku, member);
            if (buku.getStock() > 0) {
                trans = new Transaksi(buku, member);
                SimpleDateFormat sdf =  new SimpleDateFormat("d MMM, yyyy");
                String tgl = sdf.format(tglTxt.getDate());
                trans.setpinjam(tgl);
                trans.setkembali("");
                trans.setStatus("On Going");
                transCont.save(trans);
                buku.setStock(buku.getStock()-1);
                bukucont.addStock(buku);
            } else if (buku.getStock() == 0){
                JOptionPane.showMessageDialog(null, "Stok buku habis atau Data tidak ditemukan. Silahakan Silahakan isi kembali data dengan benar!","Cetak Transaksi", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan. Silahakan isi kembali data dengan benar!","Cetak Transaksi", JOptionPane.ERROR_MESSAGE);
            }
            
            isbnTxt.setText("");
            judulTxt.setText("");
            penulisTxt.setText("");
            jenisTxt.setText("");
            jmlTxt.setText("");
            idTxt.setText("");
            namaTxt.setText("");
            genderTxt.setText("");
            umurTxt.setText("");
            jabatanTxt.setText("");
            jenisTransaksi.clearSelection();
            tglTxt.setDate(null);
            bukuSchTxt.setText("");
            memberSchTxt.setText("");
        } else if (pengembalian.isSelected()){
            transaksiCont transCont = new transaksiCont();
            bukuCont bukucont = new bukuCont();
            memberCont membercont = new memberCont();
            Buku buku = new Buku();
            Member member = new Member();
            if (bukuSchTxt.getText().equals("") || memberSchTxt.getText().equals("")) {     
                buku = bukucont.get(isbnTxt.getText());
                member = membercont.get(idTxt.getText());
            } else {    
                buku = bukucont.get(bukuSchTxt.getText());
                member = membercont.get(memberSchTxt.getText());
            }
            Transaksi trans = transCont.get(isbnTxt.getText(), idTxt.getText());
            if (trans.getisbn().equals(isbnTxt.getText()) && trans.getID_member().equals(idTxt.getText())) {
                trans.setStatus("Finish");
                SimpleDateFormat sdf =  new SimpleDateFormat("d MMM, yyyy");
                String tgl = sdf.format(tglTxt.getDate());
                trans.setkembali(tgl);
                transCont.Update(trans);
                buku.setStock(buku.getStock()+1);
                bukucont.addStock(buku);
                
            } else {
                JOptionPane.showMessageDialog(null, "Transaksi tidak ditemukan");
            }
            isbnTxt.setText("");
            judulTxt.setText("");
            penulisTxt.setText("");
            jenisTxt.setText("");
            jmlTxt.setText("");
            idTxt.setText("");
            namaTxt.setText("");
            genderTxt.setText("");
            umurTxt.setText("");
            jabatanTxt.setText("");
            jenisTransaksi.clearSelection();
            tglTxt.setDate(null);
            bukuSchTxt.setText("");
            memberSchTxt.setText("");
        } 
    }//GEN-LAST:event_cetakBtnActionPerformed

    private void bukuSchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuSchBtnActionPerformed
        bukuCont bukucont = new bukuCont();    
        Buku buku = bukucont.get(bukuSchTxt.getText());   
        isbnTxt.setText(buku.getISBN());
        judulTxt.setText(buku.getJudul());
        penulisTxt.setText(buku.getPenulis());
        jenisTxt.setText(buku.getJenisBuku());
        jmlTxt.setText(Integer.toString(buku.getJumlahHalaman()));
    }//GEN-LAST:event_bukuSchBtnActionPerformed

    private void memberSchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSchBtnActionPerformed
        memberCont membercont = new memberCont();
        Member member = membercont.get(memberSchTxt.getText());
        idTxt.setText(member.getId());
        namaTxt.setText(member.getNama());
        genderTxt.setText(member.getGender());
        umurTxt.setText(Integer.toString(member.getUmur()));
        jabatanTxt.setText(member.getJabatan());
    }//GEN-LAST:event_memberSchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new Transaksi_View().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CetakBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CetakBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CetakBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CetakBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CetakBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bukuSchBtn;
    private javax.swing.JTextField bukuSchTxt;
    private javax.swing.JButton cetakBtn;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JTextField isbnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jabatanTxt;
    private javax.swing.ButtonGroup jenisTransaksi;
    private javax.swing.JTextField jenisTxt;
    private javax.swing.JTextField jmlTxt;
    private javax.swing.JTextField judulTxt;
    private javax.swing.JButton memberSchBtn;
    private javax.swing.JTextField memberSchTxt;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JRadioButton peminjaman;
    private javax.swing.JRadioButton pengembalian;
    private javax.swing.JTextField penulisTxt;
    private com.toedter.calendar.JDateChooser tglTxt;
    private javax.swing.JTextField umurTxt;
    // End of variables declaration//GEN-END:variables
}
