/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackirala;

import static arackirala.Baglan.dbState;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mert
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnAracKaydet = new javax.swing.JButton();
        txtAracAd = new javax.swing.JTextField();
        txtMarka = new javax.swing.JTextField();
        txtYil = new javax.swing.JTextField();
        txtYakit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFiyat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtAdSoyad = new javax.swing.JTextField();
        txtTc = new javax.swing.JTextField();
        txtDogum = new javax.swing.JTextField();
        btnMusteriKaydet = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmbAracListele = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbMusteriListele = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtBaslangic = new javax.swing.JTextField();
        bb = new javax.swing.JLabel();
        txtBitis = new javax.swing.JTextField();
        bb1 = new javax.swing.JLabel();
        btnKirala = new javax.swing.JButton();
        txtGun = new javax.swing.JTextField();
        bb2 = new javax.swing.JLabel();
        txtUcret = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnHesapla = new javax.swing.JButton();
        chckBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        radioOn = new javax.swing.JRadioButton();
        radioOff = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRaporla = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        cmbTeslim = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        btnTeslim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        btnAracKaydet.setText("Araç Kaydet");
        btnAracKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracKaydetActionPerformed(evt);
            }
        });

        jLabel1.setText("Araç Ad:");

        jLabel2.setText("Marka:");

        jLabel3.setText("Üretim Yılı:");

        jLabel4.setText("Yakıt Türü:");

        jLabel6.setText("Fiyat:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMarka)
                    .addComponent(txtAracAd)
                    .addComponent(txtYil)
                    .addComponent(txtYakit)
                    .addComponent(btnAracKaydet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiyat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAracAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnAracKaydet)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Araç Ekle", jPanel2);

        jLabel5.setText("Ad Soyad:");

        btnMusteriKaydet.setText("Müşteri Kaydet");
        btnMusteriKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriKaydetActionPerformed(evt);
            }
        });

        jLabel7.setText("Doğum Yılı:");

        jLabel8.setText("TC Kimlik:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTc)
                    .addComponent(txtAdSoyad)
                    .addComponent(txtDogum)
                    .addComponent(btnMusteriKaydet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDogum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnMusteriKaydet)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Müşteri Ekle", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Ekleme", jPanel1);

        jLabel9.setText("Araç Listesi:");

        jLabel10.setText("Müşteri Listesi:");

        bb.setText("Başlangıç:");

        bb1.setText("Bitiş:");

        btnKirala.setText("Kirala");
        btnKirala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiralaActionPerformed(evt);
            }
        });

        bb2.setText("Kaç Günlük:");

        jLabel11.setText("Ücret;");

        btnHesapla.setText("Hesapla");
        btnHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHesaplaActionPerformed(evt);
            }
        });

        chckBox.setText("Ödeme Alındı");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnKirala, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUcret, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(161, 161, 161)
                                    .addComponent(jLabel11)
                                    .addGap(100, 100, 100)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bb, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bb1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bb2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbMusteriListele, 0, 263, Short.MAX_VALUE)
                                    .addComponent(cmbAracListele, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBaslangic)
                                    .addComponent(txtBitis)
                                    .addComponent(txtGun))))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnHesapla)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(chckBox)
                        .addGap(157, 157, 157))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAracListele, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMusteriListele, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBaslangic, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBitis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGun, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHesapla)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUcret, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnKirala, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Kirala", jPanel4);

        radioOn.setText("Kiralanabilir Araçlar");
        radioOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOnActionPerformed(evt);
            }
        });

        radioOff.setText("Kiralanmış Araçlar");
        radioOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioOffMouseClicked(evt);
            }
        });

        tableRaporla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableRaporla);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(radioOn)
                        .addGap(28, 28, 28)
                        .addComponent(radioOff))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioOn)
                    .addComponent(radioOff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Durum", jPanel5);

        jLabel12.setText("Araç Listesi:");

        btnTeslim.setText("Teslim Et");
        btnTeslim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeslimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTeslim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTeslim, 0, 263, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTeslim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addComponent(btnTeslim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teslim Etme", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Baglan bag = new Baglan();
    private void btnAracKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracKaydetActionPerformed
        bag.AracEkle(txtAracAd.getText(), txtMarka.getText(), txtYil.getText(), txtYakit.getText(), Integer.parseInt(txtFiyat.getText()));
    }//GEN-LAST:event_btnAracKaydetActionPerformed

    private void btnMusteriKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriKaydetActionPerformed
        bag.MusteriEkle(txtAdSoyad.getText(), Integer.parseInt(txtTc.getText()), Integer.parseInt(txtDogum.getText()));
    }//GEN-LAST:event_btnMusteriKaydetActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public void Grupla() {
        ButtonGroup grup = new ButtonGroup();
        grup.add(radioOn);
        grup.add(radioOff);
    }
    private JPanel contentPane;
    private JTable table;
    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"Araba Adı"};
    Object[] satirlar = new Object[1];
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        try {
            cmbAracListele.removeAllItems();
            cmbMusteriListele.removeAllItems();
            cmbTeslim.removeAllItems();
            Grupla();
            String sorguArac = String.format("select ARACAD from tbl_arac");
            String sorguMusteri = String.format("select ADSOYAD from tbl_musteri");
            ResultSet aracRs = bag.dbState().executeQuery(sorguArac);
            ResultSet musteriRs = bag.dbState().executeQuery(sorguMusteri);
            while (aracRs.next()) {
                cmbAracListele.addItem(aracRs.getString("ARACAD"));
                cmbTeslim.addItem(aracRs.getString("ARACAD"));
            }
            while (musteriRs.next()) {
                cmbMusteriListele.addItem(musteriRs.getString("ADSOYAD"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked
    JFrame hataSayfa;
    private void btnKiralaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiralaActionPerformed
        int arac = cmbAracListele.getSelectedIndex();
        int musteri = cmbMusteriListele.getSelectedIndex();
        int control=0;
        if (chckBox.isSelected()==true) {
            control=1;
        }
        else
        {
            control=0;
        }
        int x = 0;
        try {
            String sorgu1 = String.format("select * from tbl_arac where id=" + (arac + 1));
            ResultSet ekleme1 = dbState().executeQuery(sorgu1);
            while (ekleme1.next()) {
                x = ekleme1.getInt("DURUM");
            }
            if (x == 0) {
                bag.AracKirala((cmbAracListele.getSelectedIndex() + 1), (cmbMusteriListele.getSelectedIndex() + 1), txtBaslangic.getText(), txtBitis.getText(), yansit, Integer.parseInt(txtGun.getText()),control);
                String sorgu = String.format("UPDATE tbl_arac SET DURUM=1 WHERE ID=" + (arac + 1));
                int ekleme = bag.dbState().executeUpdate(sorgu);
                System.out.println("Kayıt Eklendi");
            } else {
                JOptionPane.showMessageDialog(hataSayfa, "Seçtiğiniz Araç Stoklarımızda Mevcut Değildir. Lütfen Kiralanabilir Bir Araç Seçiniz.", "Warning", JOptionPane.WARNING_MESSAGE);;
            }
        } catch (Exception ex) {
            System.out.println("Durum Kontrolünde Problem Oluştu!" + ex);
        }
    }//GEN-LAST:event_btnKiralaActionPerformed
    int yansit = 0;
    private void btnHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHesaplaActionPerformed
        int arac = (cmbAracListele.getSelectedIndex() + 1);
        int gun = Integer.parseInt(txtGun.getText());
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_galeri", "sa", "as");
            Statement stmt = con.createStatement();
            int[] dizi = new int[1];
            int x = 0;
            String sorgu1 = String.format("select fiyat from tbl_arac where id=" + arac);
            ResultSet ekleme1 = stmt.executeQuery(sorgu1);
            while (ekleme1.next()) {
                x = (ekleme1.getInt("FIYAT"));
            }
            yansit = x * gun;
            txtUcret.setText("" + yansit + "TL");
        } catch (Exception ex) {
            System.out.println("Hesaplama Hatası!" + ex);
        }

    }//GEN-LAST:event_btnHesaplaActionPerformed

    private void radioOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOnActionPerformed
        Grupla();
        try {
            modelim.setRowCount(0);
            String sorgu = String.format("select ARACAD from tbl_arac where DURUM=0");
            ResultSet rs = Baglan.dbState().executeQuery(sorgu);
            tableRaporla.setModel(modelim);
            modelim.setColumnIdentifiers(kolonlar);
            while (rs.next()) {
                satirlar[0] = rs.getString("ARACAD");
                modelim.addRow(satirlar);
            }
        } catch (Exception e) {
            System.out.println("Tablo Eklemede Bir Hata Oluştu..." + e);
        }
    }//GEN-LAST:event_radioOnActionPerformed

    private void radioOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioOffMouseClicked
        Grupla();
        try {
            modelim.setRowCount(0);
            String sorgu = String.format("select ARACAD from tbl_arac where DURUM=1");
            ResultSet rs = Baglan.dbState().executeQuery(sorgu);
            tableRaporla.setModel(modelim);
            modelim.setColumnIdentifiers(kolonlar);
            while (rs.next()) {
                satirlar[0] = rs.getString("ARACAD");
                modelim.addRow(satirlar);
            }
        } catch (Exception e) {
            System.out.println("Tablo Eklemede Bir Hata Oluştu..." + e);
        }
    }//GEN-LAST:event_radioOffMouseClicked

    private void btnTeslimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeslimActionPerformed
        int arac = cmbTeslim.getSelectedIndex();
        int x=0;
        try {
            String sorgu1 = String.format("select DURUM from tbl_arac where id=" + (arac + 1));
            ResultSet ekleme1 = dbState().executeQuery(sorgu1);
            while (ekleme1.next()) {
                x = ekleme1.getInt("DURUM");
            }
            if (x == 1) {
                String sorgu = String.format("UPDATE tbl_arac SET DURUM=DURUM-1 WHERE ID=" + (arac + 1));
                int ekleme = bag.dbState().executeUpdate(sorgu);
                System.out.println("Kayıt Eklendi");
                JOptionPane.showMessageDialog(hataSayfa, "Kiralamış Olduğunuz Aracı Güvenli Bir Şekilde Teslim Ettik.", "Warning", JOptionPane.WARNING_MESSAGE);;
            } else {
                JOptionPane.showMessageDialog(hataSayfa, "Seçtiğiniz Araç Stoklarımızda Mevcuttur. Doğru Seçim Yaparak Tekrardan deneyiniz.", "Warning", JOptionPane.WARNING_MESSAGE);;
            }
        } catch (Exception ex) {
            System.out.println("Teslim etmede bir hata oluştu..." + ex);
        }

    }//GEN-LAST:event_btnTeslimActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bb;
    private javax.swing.JLabel bb1;
    private javax.swing.JLabel bb2;
    private javax.swing.JButton btnAracKaydet;
    private javax.swing.JButton btnHesapla;
    private javax.swing.JButton btnKirala;
    private javax.swing.JButton btnMusteriKaydet;
    private javax.swing.JButton btnTeslim;
    private javax.swing.JCheckBox chckBox;
    private javax.swing.JComboBox cmbAracListele;
    private javax.swing.JComboBox cmbMusteriListele;
    private javax.swing.JComboBox cmbTeslim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton radioOff;
    private javax.swing.JRadioButton radioOn;
    private javax.swing.JTable tableRaporla;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtAracAd;
    private javax.swing.JTextField txtBaslangic;
    private javax.swing.JTextField txtBitis;
    private javax.swing.JTextField txtDogum;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtGun;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtTc;
    private javax.swing.JTextField txtUcret;
    private javax.swing.JTextField txtYakit;
    private javax.swing.JTextField txtYil;
    // End of variables declaration//GEN-END:variables
}
