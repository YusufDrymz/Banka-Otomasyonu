package gui;

import databse.IBilgiContoller;
import databse.transactions.FaturaOdemeleri;
import databse.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OdemelerEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {

    private FaturaOdemeleri faturaOdemeleriObject = null;

    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemelerEkraniPanel.setFocusable(true);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.elektrikBorcu.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.suBorcu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.dogalGazBorc.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorc.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if (this.faturaOdemeleriObject == null) {
            faturaOdemeleriObject = new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        geriIcon = new javax.swing.JLabel();
        mesajElektrikLabel = new javax.swing.JLabel();
        elektrikBorcu = new javax.swing.JLabel();
        m_elektrikOdeButton = new javax.swing.JButton();
        m_suOdeButton = new javax.swing.JButton();
        suBorcu = new javax.swing.JLabel();
        messageSuLabel = new javax.swing.JLabel();
        dogalGazBorc = new javax.swing.JLabel();
        m_dogalGazOdeButton = new javax.swing.JButton();
        messageDogalGazLabel = new javax.swing.JLabel();
        m_internetOdeButton = new javax.swing.JButton();
        messageInternetLabel = new javax.swing.JLabel();
        internetBorc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IZU Bank Ödemeler Ekranı");

        odemelerEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 102, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayin[KULLANICI ADI SOYADI]");

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        mesajElektrikLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajElektrikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajElektrikLabel.setText("Toplam Elektrik Faturası Borcunuz :");

        elektrikBorcu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikBorcu.setForeground(new java.awt.Color(51, 102, 255));
        elektrikBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcu.setText("[ELEKT BORC]");

        m_elektrikOdeButton.setBackground(new java.awt.Color(255, 204, 204));
        m_elektrikOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_elektrikOdeButton.setText("ÖDE");
        m_elektrikOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_elektrikOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_elektrikOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_elektrikOdeButtonMouseExited(evt);
            }
        });
        m_elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_elektrikOdeButtonActionPerformed(evt);
            }
        });

        m_suOdeButton.setBackground(new java.awt.Color(255, 255, 204));
        m_suOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_suOdeButton.setText("ÖDE");
        m_suOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_suOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_suOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_suOdeButtonMouseExited(evt);
            }
        });
        m_suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_suOdeButtonActionPerformed(evt);
            }
        });

        suBorcu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suBorcu.setForeground(new java.awt.Color(51, 102, 255));
        suBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcu.setText("[SU BORC]");

        messageSuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messageSuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        messageSuLabel.setText("Toplam Su Faturası Borcunuz :");

        dogalGazBorc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dogalGazBorc.setForeground(new java.awt.Color(51, 102, 255));
        dogalGazBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogalGazBorc.setText("[DGLGZ BORC]");

        m_dogalGazOdeButton.setBackground(new java.awt.Color(102, 255, 255));
        m_dogalGazOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_dogalGazOdeButton.setText("ÖDE");
        m_dogalGazOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_dogalGazOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_dogalGazOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_dogalGazOdeButtonMouseExited(evt);
            }
        });
        m_dogalGazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_dogalGazOdeButtonActionPerformed(evt);
            }
        });

        messageDogalGazLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messageDogalGazLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        messageDogalGazLabel.setText("Toplam Doğal Gaz Faturası Borcunuz :");

        m_internetOdeButton.setBackground(new java.awt.Color(204, 204, 255));
        m_internetOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_internetOdeButton.setText("ÖDE");
        m_internetOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_internetOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_internetOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_internetOdeButtonMouseExited(evt);
            }
        });
        m_internetOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_internetOdeButtonActionPerformed(evt);
            }
        });

        messageInternetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messageInternetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        messageInternetLabel.setText("Toplam İnternet Faturası Borcunuz :");

        internetBorc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        internetBorc.setForeground(new java.awt.Color(51, 102, 255));
        internetBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetBorc.setText("[INTRNT BORC]");

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(messageSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(messageDogalGazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(messageInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(elektrikBorcu)
                            .addComponent(suBorcu)
                            .addComponent(dogalGazBorc)
                            .addComponent(internetBorc))
                        .addGap(32, 32, 32)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_dogalGazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_internetOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elektrikBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageDogalGazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dogalGazBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_dogalGazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(internetBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_internetOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    /*
    Button Renklendirmeleri
     */
    private void setBgFg(Component c) {
        ButtonAyarlari.setBgFg((JButton) c, Color.black, Color.white);
    }

    private void m_elektrikOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_elektrikOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_m_elektrikOdeButtonMouseEntered

    private void m_elektrikOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_elektrikOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_m_elektrikOdeButtonMouseExited

    private void m_suOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_suOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_m_suOdeButtonMouseEntered

    private void m_suOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_suOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_m_suOdeButtonMouseExited

    private void m_dogalGazOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_dogalGazOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_m_dogalGazOdeButtonMouseEntered

    private void m_dogalGazOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_dogalGazOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_m_dogalGazOdeButtonMouseExited

    private void m_internetOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_internetOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_m_internetOdeButtonMouseExited

    private void m_internetOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_internetOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_m_internetOdeButtonMouseEntered

    /*
    Actions 
     */

    private void m_elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_elektrikOdeButtonActionPerformed
        double elektrikTutar = Double.valueOf(this.elektrikBorcu.getText());
        if (this.faturaOncedenOdenmisMi(elektrikTutar)) {
            Dialogs.ozelMesajGoster(this, "Elektrik Faturası Daha Önceden Ödenmiştir!");
        } else {
            this.faturayiOde("elektrik", elektrikTutar);
        }
    }//GEN-LAST:event_m_elektrikOdeButtonActionPerformed

    private void m_suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_suOdeButtonActionPerformed
        double suTutar = Double.valueOf(this.suBorcu.getText());
        if (this.faturaOncedenOdenmisMi(suTutar)) {
            Dialogs.ozelMesajGoster(this, "Su Faturası Daha Önceden Ödenmiştir!");
        } else {
            this.faturayiOde("su", suTutar);
        }
    }//GEN-LAST:event_m_suOdeButtonActionPerformed

    private void m_dogalGazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_dogalGazOdeButtonActionPerformed
        double dogalGazTutar = Double.valueOf(this.dogalGazBorc.getText());
        if (this.faturaOncedenOdenmisMi(dogalGazTutar)) {
            Dialogs.ozelMesajGoster(this, "Doğal Gaz Faturası Daha Önceden Ödenmiştir!");
        } else {
            this.faturayiOde("dogalgaz", dogalGazTutar);
        }
    }//GEN-LAST:event_m_dogalGazOdeButtonActionPerformed

    private void m_internetOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_internetOdeButtonActionPerformed
        double internetTutar = Double.valueOf(this.internetBorc.getText());
        if (this.faturaOncedenOdenmisMi(internetTutar)) {
            Dialogs.ozelMesajGoster(this, "İnternet Faturası Daha Önceden Ödenmiştir!");
        } else {
            this.faturayiOde("internet", internetTutar);
        }
    }//GEN-LAST:event_m_internetOdeButtonActionPerformed

    private boolean faturaOncedenOdenmisMi(double odenecekTutar) {
        return odenecekTutar == 0.0;
    }

    private void faturayiOde(String faruraIsmi, double faturaTutari) {
        this.getFaturaOdemeleriObject().setFaturaIsmi(faruraIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);

        if (getFaturaOdemeleriObject().faturaOdendiMi()) {
            Dialogs.ozelMesajGoster(this, "Faturanız Başarıyla Ödenmiştir..");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Ödeme İşlemi Gerçekleştirilemedi!..");
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogalGazBorc;
    private javax.swing.JLabel elektrikBorcu;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel internetBorc;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JButton m_dogalGazOdeButton;
    private javax.swing.JButton m_elektrikOdeButton;
    private javax.swing.JButton m_internetOdeButton;
    private javax.swing.JButton m_suOdeButton;
    private javax.swing.JLabel mesajElektrikLabel;
    private javax.swing.JLabel messageDogalGazLabel;
    private javax.swing.JLabel messageInternetLabel;
    private javax.swing.JLabel messageSuLabel;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel suBorcu;
    // End of variables declaration//GEN-END:variables
}
