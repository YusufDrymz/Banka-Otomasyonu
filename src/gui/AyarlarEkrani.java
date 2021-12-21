package gui;

import databse.IBilgiContoller;
import databse.transactions.HesapBilgileri;
import databse.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import gui.ayarlar.TextAyarlar;

public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {

    private TelNoYenileme telNoYenilemeObject = null;

    private String eskiTelNo = null;

    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ayarlarEkraniPanel.setFocusable(true);
        TextAyarlar.setOnlyNumber(m_telNoText);
        TextAyarlar.setMaxLimit(m_telNoText, 11);
        this.m_telNoText.setText(getHesapBilgileri().getTelNo());
        this.eskiTelNo = m_telNoText.getText();
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.m_telNoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelNoYenilemeObject() {
        if (telNoYenilemeObject == null) {
            telNoYenilemeObject = new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        mesajTelNoLabel = new javax.swing.JLabel();
        m_telNoText = new javax.swing.JTextField();
        telNoDegistirIcon = new javax.swing.JLabel();
        sifreDegistirIcon = new javax.swing.JLabel();
        mesajSifreLabel = new javax.swing.JLabel();
        m_sifreText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IZU Bank Ayarlar");

        ayarlarEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));
        ayarlarEkraniPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ayarlarEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });
        ayarlarEkraniPanel.add(geriIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 40, 40));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 102, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayin[KULLANICI ADI SOYADI]");
        ayarlarEkraniPanel.add(kullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 54, 535, 50));

        mesajTelNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel.setText("Telefon Numaranız :");
        ayarlarEkraniPanel.add(mesajTelNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 164, 201, 50));

        m_telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_telNoText.setEnabled(false);
        ayarlarEkraniPanel.add(m_telNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 164, 196, 50));

        telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        telNoDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telNoDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telNoDegistirIconMouseClicked(evt);
            }
        });
        ayarlarEkraniPanel.add(telNoDegistirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 164, -1, -1));

        sifreDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        sifreDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirIconMouseClicked(evt);
            }
        });
        ayarlarEkraniPanel.add(sifreDegistirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 274, -1, -1));

        mesajSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSifreLabel.setText("Şifreniz :");
        ayarlarEkraniPanel.add(mesajSifreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 274, 201, 50));

        m_sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_sifreText.setText("*************");
        m_sifreText.setEnabled(false);
        ayarlarEkraniPanel.add(m_sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 274, 196, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private int clickCounter = 0;

    private void telNoDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telNoDegistirIconMouseClicked
        if (this.clickCounter == 0) {
            m_telNoText.setEnabled(true);
            IconAyarlari.changeIcon("updateTelIcon2", telNoDegistirIcon);
            clickCounter++;
        } else { //Daha Önce Tıklanmışsa
            m_telNoText.setEnabled(false);
            this.telNoYenile();
            IconAyarlari.setOriginalIcon(telNoDegistirIcon);
            clickCounter = 0;
        }
    }//GEN-LAST:event_telNoDegistirIconMouseClicked

    private void telNoYenile() {
        if (this.bilgilerGecerliMi()) {
            String yeniTelNo = this.m_telNoText.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);            
            if (getTelNoYenilemeObject().telNoYenilendiMi()) {
                Dialogs.ozelMesajGoster(this, "Telefon Numarası: "+ yeniTelNo+" Olarak Güncellenmiştir..");
            }else{
                Dialogs.ozelMesajGoster(this, "Başarısız... Bilgileri Kontrol Edin..");
                this.m_telNoText.setText(this.eskiTelNo);
            }
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
            this.m_telNoText.setText(this.eskiTelNo);
        }
    }

    private void sifreDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifreDegistirIconMouseClicked

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
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JTextField m_sifreText;
    private javax.swing.JTextField m_telNoText;
    private javax.swing.JLabel mesajSifreLabel;
    private javax.swing.JLabel mesajTelNoLabel;
    private javax.swing.JLabel sifreDegistirIcon;
    private javax.swing.JLabel telNoDegistirIcon;
    // End of variables declaration//GEN-END:variables
}
