package gui;

import databse.DbConnection;
import databse.IBilgiContoller;
import databse.transactions.HesapBilgileri;
import databse.transactions.KullaniciGiris;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlar;
import java.awt.Color;

public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {

    private KullaniciGiris kullaniciGirisObject = null;

    private final String KIMLIK_TEXT_ORIGINAL = "T.C / Müşteri No";
    private final String SIFRE_TEXT_ORIGINAL = "************";

    public GirisEkrani() {
        initComponents();
        getEdits();

    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        girisEkraniPanel.setFocusable(true);
        m_kimlikField.setText(KIMLIK_TEXT_ORIGINAL);
        m_sifreText.setText(SIFRE_TEXT_ORIGINAL);
        TextAyarlar.setOnlyNumber(m_kimlikField);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.m_kimlikField.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.m_sifreText.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public KullaniciGiris getKullaniciGirisObject() {
        if (this.kullaniciGirisObject == null) {
            kullaniciGirisObject = new KullaniciGiris();
        }
        return kullaniciGirisObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        hosgeldinizLabel = new javax.swing.JLabel();
        m_kimlikField = new javax.swing.JTextField();
        m_sifreText = new javax.swing.JPasswordField();
        m_girisButton = new javax.swing.JButton();
        soruLabel = new javax.swing.JLabel();
        m_basvuruButton = new javax.swing.JButton();
        sifremiUnuttumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IZU Bankası Giriş Ekranı");
        setResizable(false);

        girisEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));
        girisEkraniPanel.setToolTipText("");

        hosgeldinizLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        hosgeldinizLabel.setForeground(new java.awt.Color(255, 102, 102));
        hosgeldinizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizLabel.setText("IZU BANKASINA HOŞGELDİNİZ");

        m_kimlikField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_kimlikField.setForeground(new java.awt.Color(153, 153, 153));
        m_kimlikField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_kimlikFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_kimlikFieldFocusLost(evt);
            }
        });

        m_sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_sifreText.setForeground(new java.awt.Color(153, 153, 153));
        m_sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_sifreTextFocusLost(evt);
            }
        });

        m_girisButton.setBackground(new java.awt.Color(255, 204, 204));
        m_girisButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        m_girisButton.setForeground(new java.awt.Color(102, 102, 102));
        m_girisButton.setText("Giriş");
        m_girisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_girisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_girisButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_girisButtonMouseExited(evt);
            }
        });
        m_girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_girisButtonActionPerformed(evt);
            }
        });

        soruLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        soruLabel.setForeground(new java.awt.Color(102, 102, 102));
        soruLabel.setText("Müşteri Olmak İster Misiniz? ");

        m_basvuruButton.setBackground(new java.awt.Color(102, 255, 255));
        m_basvuruButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m_basvuruButton.setForeground(new java.awt.Color(102, 102, 102));
        m_basvuruButton.setText("Başvur");
        m_basvuruButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_basvuruButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_basvuruButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_basvuruButtonMouseExited(evt);
            }
        });
        m_basvuruButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_basvuruButtonActionPerformed(evt);
            }
        });

        sifremiUnuttumLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sifremiUnuttumLabel.setForeground(new java.awt.Color(102, 102, 255));
        sifremiUnuttumLabel.setText("Şifreni mi unuttun?");
        sifremiUnuttumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnuttumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnuttumLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_kimlikField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addComponent(soruLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_basvuruButton))
                    .addComponent(sifremiUnuttumLabel))
                .addGap(146, 146, 146))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {m_kimlikField, m_sifreText});

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {m_basvuruButton, m_girisButton});

        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(m_kimlikField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(m_sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sifremiUnuttumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soruLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_basvuruButton))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {m_basvuruButton, m_girisButton, soruLabel});

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {m_kimlikField, m_sifreText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Buton Renklendirmleri ve Ayarları
     */

    private void m_girisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_girisButtonMouseEntered
        ButtonAyarlari.setBgFg(m_girisButton, Color.cyan, Color.WHITE);
    }//GEN-LAST:event_m_girisButtonMouseEntered

    private void m_girisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_girisButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(m_girisButton);
    }//GEN-LAST:event_m_girisButtonMouseExited

    private void m_basvuruButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_basvuruButtonMouseEntered
        ButtonAyarlari.setBgFg(m_basvuruButton, Color.pink, Color.WHITE);
    }//GEN-LAST:event_m_basvuruButtonMouseEntered

    private void m_basvuruButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_basvuruButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(m_basvuruButton);
    }//GEN-LAST:event_m_basvuruButtonMouseExited

    /*
    Text Odaklamaları
     */
    private void m_kimlikFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_kimlikFieldFocusGained
        TextAyarlar.checkTheTextFocusGained(m_kimlikField, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_m_kimlikFieldFocusGained

    private void m_kimlikFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_kimlikFieldFocusLost
        TextAyarlar.checkTheTextFocusLost(m_kimlikField);
    }//GEN-LAST:event_m_kimlikFieldFocusLost

    private void m_sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_sifreTextFocusGained
        TextAyarlar.checkTheTextFocusGained(m_sifreText, SIFRE_TEXT_ORIGINAL);

    }//GEN-LAST:event_m_sifreTextFocusGained

    private void m_sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_sifreTextFocusLost
        TextAyarlar.checkTheTextFocusLost(m_sifreText);

    }//GEN-LAST:event_m_sifreTextFocusLost

    /*
    Button Actions
     */

    private void m_girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_girisButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            String musteriKimlik = this.m_kimlikField.getText().trim();
            String sifre = String.valueOf(this.m_sifreText.getPassword());
            this.girisYap(musteriKimlik, sifre);
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_m_girisButtonActionPerformed

    private void girisYap(String musteriKimlik, String sifre) {
        this.getKullaniciGirisObject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisObject().setSifre(sifre);

        if (getKullaniciGirisObject().girisBilgileriDogruMu()) {
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Giriş Bilgileri Doğru Değildir!\n"
                    + "Lütfen Bilgilerinizi Kontrol Ediniz..");
        }
    }

    private void m_basvuruButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_basvuruButtonActionPerformed
        ActionAyarlari.setVisible(this, new BasvuruEkranı());
    }//GEN-LAST:event_m_basvuruButtonActionPerformed

    private void sifremiUnuttumLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifremiUnuttumLabelMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifremiUnuttumLabelMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinizLabel;
    private javax.swing.JButton m_basvuruButton;
    private javax.swing.JButton m_girisButton;
    private javax.swing.JTextField m_kimlikField;
    private javax.swing.JPasswordField m_sifreText;
    private javax.swing.JLabel sifremiUnuttumLabel;
    private javax.swing.JLabel soruLabel;
    // End of variables declaration//GEN-END:variables
}
