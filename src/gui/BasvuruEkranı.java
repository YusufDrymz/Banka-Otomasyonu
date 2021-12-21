package gui;

import databse.IBilgiContoller;
import databse.transactions.HesapBilgileri;
import databse.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlar;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JOptionPane;

public class BasvuruEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {

    private KullaniciBasvuru kullaniciBasvuruObject = null;

    public BasvuruEkranı() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        basvuruEkraniPanel.setFocusable(true);
        TextAyarlar.setOnlyAlphabetic(m_adSoyadText);
        TextAyarlar.setOnlyNumber(m_telNoText);
        TextAyarlar.setOnlyNumber(m_tcNoText);
        TextAyarlar.setMaxLimit(m_tcNoText, 11);
        TextAyarlar.setMaxLimit(m_telNoText, 11);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if (this.kullaniciBasvuruObject == null) {
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlar.textAlanlariDolumu(basvuruEkraniPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        guvenlikBilgileriLabel = new javax.swing.JLabel();
        adSoyadLabel = new javax.swing.JLabel();
        m_adSoyadText = new javax.swing.JTextField();
        tcBoLabel = new javax.swing.JLabel();
        m_tcNoText = new javax.swing.JTextField();
        telNoLabel = new javax.swing.JLabel();
        m_telNoText = new javax.swing.JTextField();
        kisiselBilgileLabel = new javax.swing.JLabel();
        guvenlikCevapLabel = new javax.swing.JLabel();
        m_guvenlikSorusu = new javax.swing.JComboBox<>();
        m_guvenlikCevapText = new javax.swing.JTextField();
        guvenlikSorusuLabel = new javax.swing.JLabel();
        m_basvurButton = new javax.swing.JButton();
        geriIcon3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IZU Bankası Başvuru Ekranı");

        basvuruEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));
        basvuruEkraniPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        basvuruEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guvenlikBilgileriLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        guvenlikBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guvenlikBilgileriLabel.setText("Güvenlik Bilgileri");
        basvuruEkraniPanel.add(guvenlikBilgileriLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 40));

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Ad Soyad:");
        basvuruEkraniPanel.add(adSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 173, 40));

        m_adSoyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPanel.add(m_adSoyadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 300, 40));

        tcBoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcBoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcBoLabel.setText("T.C. No:");
        basvuruEkraniPanel.add(tcBoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 173, 40));

        m_tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPanel.add(m_tcNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 300, 40));

        telNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon No:");
        basvuruEkraniPanel.add(telNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 173, 40));

        m_telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPanel.add(m_telNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 300, 40));

        kisiselBilgileLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgileLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgileLabel.setText("Kişisel Bilgiler");
        basvuruEkraniPanel.add(kisiselBilgileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 173, 40));

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Cevap :");
        basvuruEkraniPanel.add(guvenlikCevapLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 173, 40));

        m_guvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil Hayvanınızın Adı Nedir?", "En Sevdiğiniz Nesne Nedir?", "İlk Öğretmeninizin Adı Nedir?", "Yaşamak İstediğiniz Şehir Neresidir?", "Ya da Rastgele Cümle Girin(Önerilir)" }));
        m_guvenlikSorusu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        basvuruEkraniPanel.add(m_guvenlikSorusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 290, 40));

        m_guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPanel.add(m_guvenlikCevapText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 290, 40));

        guvenlikSorusuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikSorusuLabel.setText("Güvenlik Sorusu :");
        basvuruEkraniPanel.add(guvenlikSorusuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 173, 40));

        m_basvurButton.setBackground(new java.awt.Color(204, 204, 255));
        m_basvurButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_basvurButton.setText("Başvuru");
        m_basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_basvurButtonMouseExited(evt);
            }
        });
        m_basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_basvurButtonActionPerformed(evt);
            }
        });
        basvuruEkraniPanel.add(m_basvurButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 125, 40));

        geriIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIcon3MouseClicked(evt);
            }
        });
        basvuruEkraniPanel.add(geriIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(m_basvurButton, Color.white, Color.black);
    }//GEN-LAST:event_m_basvurButtonMouseEntered

    private void m_basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(m_basvurButton);
    }//GEN-LAST:event_m_basvurButtonMouseExited

    private void m_basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_basvurButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.basvuruyuGercekelestir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_m_basvurButtonActionPerformed

    private void basvuruyuGercekelestir() {
        //Kişisel Bilgiler
        this.getKullaniciBasvuruObject().setAdSoyad(this.m_adSoyadText.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(m_tcNoText.getText());
        this.getKullaniciBasvuruObject().setTelNO(m_telNoText.getText());

        //Güvenlik Bilgileri
        this.getKullaniciBasvuruObject().setGuvenlikSorusu(String.valueOf(this.m_guvenlikSorusu.getSelectedItem()));
        this.getKullaniciBasvuruObject().setGuvenlikCevap(this.m_guvenlikCevapText.getText().trim());

        //Sistem Tarafından Veirlecek Bilgiler
        this.getKullaniciBasvuruObject().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciBasvuruObject().setSifre(this.randomSifreAL());

        if (this.getKullaniciBasvuruObject().basvuruOnaylandiMi()) {
            Dialogs.ozelMesajGoster(this, "Başvurunuz Kabul Edilmiştir..\n"
                    + "Müşteri Numaranız: " + this.getKullaniciBasvuruObject().getMusteriNo()
                    + "\nŞifreniz: " + this.getKullaniciBasvuruObject().getSifre());
            ActionAyarlari.setVisible(this, new GirisEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Başvurunuz Kabulo Edilmemiştir!\n"
                    + "Lütfen Bilgilerinizi Kontrol Edin..");
        }

    }

    private String randomMusteriNoAl() {
        String musteriNo;
        do {
            musteriNo = String.valueOf(10000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());        
        return musteriNo;
    }

    private String randomSifreAL() {
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }

    private void geriIcon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIcon3MouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIcon3MouseClicked

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
            java.util.logging.Logger.getLogger(BasvuruEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel geriIcon3;
    private javax.swing.JLabel guvenlikBilgileriLabel;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JLabel guvenlikSorusuLabel;
    private javax.swing.JLabel kisiselBilgileLabel;
    private javax.swing.JTextField m_adSoyadText;
    private javax.swing.JButton m_basvurButton;
    private javax.swing.JTextField m_guvenlikCevapText;
    private javax.swing.JComboBox<String> m_guvenlikSorusu;
    private javax.swing.JTextField m_tcNoText;
    private javax.swing.JTextField m_telNoText;
    private javax.swing.JLabel tcBoLabel;
    private javax.swing.JLabel telNoLabel;
    // End of variables declaration//GEN-END:variables
}
