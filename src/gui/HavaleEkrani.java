package gui;

import databse.IBilgiContoller;
import databse.transactions.Havale;
import databse.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlar;
import javax.swing.JOptionPane;

public class HavaleEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {

    private Havale havaleObject = null;

    private final String MUSTERI_NO_TEXT_ORIGINAL = "Müşteri No";
    private int gonderilecekMiktar = 0;

    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        havaleEkraniPanel.setFocusable(true);
        TextAyarlar.setOnlyNumber(m_gondereceginizMiktarText);
        TextAyarlar.setMaxLimit(m_gondereceginizMiktarText, 5);
        TextAyarlar.setOnlyNumber(m_musteriNoText);
        m_musteriNoText.setText(MUSTERI_NO_TEXT_ORIGINAL);
        this.kullaniciAdiSoyadiLabel.setText("Sayın "+ getHesapBilgileri().getAdSoyad());
        this.m_bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.m_gondereceginizMiktarText.getText().equals("")
                || this.m_musteriNoText.getText().equals(this.MUSTERI_NO_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public Havale getHavaleObject() {
        if (this.havaleObject == null) {
            havaleObject = new Havale();
        }
        return havaleObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        havaleEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        kullaniciUyariLAbel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        m_bakiyeLabel = new javax.swing.JLabel();
        gondereceginizMiktarLabel = new javax.swing.JLabel();
        m_gondereceginizMiktarText = new javax.swing.JTextField();
        m_havaleButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();
        havaleAlacakKisiLabel = new javax.swing.JLabel();
        m_musteriNoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IZU Bank Havale Ekranı");

        havaleEkraniPanel.setBackground(new java.awt.Color(255, 204, 255));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 102, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayin[KULLANICI ADI SOYADI]");

        kullaniciUyariLAbel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kullaniciUyariLAbel.setText("Tek Seferde ₺20.000 ve Atına Gönderebilirsiniz.");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz :");

        m_bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_bakiyeLabel.setText("[BAKİYE]");

        gondereceginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gondereceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gondereceginizMiktarLabel.setText("Göndereceğiniz Miktar :");

        m_gondereceginizMiktarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_gondereceginizMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                m_gondereceginizMiktarTextKeyReleased(evt);
            }
        });

        m_havaleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_havaleButton.setText("Havale Yap");
        m_havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_havaleButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        havaleAlacakKisiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        havaleAlacakKisiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havaleAlacakKisiLabel.setText("Havale Alacak Kişi :");

        m_musteriNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_musteriNoText.setForeground(new java.awt.Color(102, 102, 102));
        m_musteriNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_musteriNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_musteriNoTextFocusLost(evt);
            }
        });

        javax.swing.GroupLayout havaleEkraniPanelLayout = new javax.swing.GroupLayout(havaleEkraniPanel);
        havaleEkraniPanel.setLayout(havaleEkraniPanelLayout);
        havaleEkraniPanelLayout.setHorizontalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(toplamBakiyenizLabel))
                            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gondereceginizMiktarLabel)
                                    .addComponent(havaleAlacakKisiLabel))))
                        .addGap(64, 64, 64)
                        .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(m_havaleButton)
                            .addComponent(m_musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_gondereceginizMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(m_bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(kullaniciUyariLAbel)))
                .addGap(32, 32, 32))
        );
        havaleEkraniPanelLayout.setVerticalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(kullaniciUyariLAbel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_gondereceginizMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gondereceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(havaleAlacakKisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(m_havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_gondereceginizMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_gondereceginizMiktarTextKeyReleased
        this.gonderilecekMiktar = TextAyarlar.checkTheTextKeyReleased(m_gondereceginizMiktarText, 20000);
    }//GEN-LAST:event_m_gondereceginizMiktarTextKeyReleased

    private void m_havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_havaleButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.havaleYap();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_m_havaleButtonActionPerformed

    private void havaleYap() {
        getHavaleObject().setGonderilecekMiktar(this.gonderilecekMiktar);
        getHavaleObject().setHavaleAlacakKisi(this.m_musteriNoText.getText());

        if (getHavaleObject().havaleYapildiMi()) {
            Dialogs.ozelMesajGoster(this, "Havale İşlemi Başarıyla Gerçekleşmiştir..\n"
                    + "Gönderilen Müşteri Numarası: " + this.m_musteriNoText.getText()
                    + "\nGönderilen Miktar: " + this.gonderilecekMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Havale İşlemi Gerçekleştirilemedi..\n"
                    + "Lütfen Bilgilerinizi Kontrol Edin!!");
        }

    }

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void m_musteriNoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_musteriNoTextFocusGained
        TextAyarlar.checkTheTextFocusGained(m_musteriNoText, MUSTERI_NO_TEXT_ORIGINAL);
    }//GEN-LAST:event_m_musteriNoTextFocusGained

    private void m_musteriNoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_musteriNoTextFocusLost
        TextAyarlar.checkTheTextFocusLost(m_musteriNoText);
    }//GEN-LAST:event_m_musteriNoTextFocusLost

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
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel gondereceginizMiktarLabel;
    private javax.swing.JLabel havaleAlacakKisiLabel;
    private javax.swing.JPanel havaleEkraniPanel;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel kullaniciUyariLAbel;
    private javax.swing.JLabel m_bakiyeLabel;
    private javax.swing.JTextField m_gondereceginizMiktarText;
    private javax.swing.JButton m_havaleButton;
    private javax.swing.JTextField m_musteriNoText;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
