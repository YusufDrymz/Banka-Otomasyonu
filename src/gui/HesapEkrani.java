package gui;

import databse.IBilgiContoller;
import databse.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;

public class HesapEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {

    public HesapEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        turkLirasiIcon = new javax.swing.JLabel();
        m_bakiyeLabel = new javax.swing.JLabel();
        paraCekIcon = new javax.swing.JLabel();
        m_paraCekButon = new javax.swing.JButton();
        paraYatirIcon = new javax.swing.JLabel();
        m_paraYatirButon = new javax.swing.JButton();
        havaleIcon = new javax.swing.JLabel();
        odemelerIcon = new javax.swing.JLabel();
        m_odemelerButon = new javax.swing.JButton();
        m_havaleButon = new javax.swing.JButton();
        m_settingsIcon = new javax.swing.JLabel();
        m_logOutIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IZU Bankası Hesap Ekranı");

        hesapEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hosgeldinLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hosgeldinLabel.setForeground(new java.awt.Color(0, 153, 153));
        hosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinLabel.setText("HOŞGELDİN");
        hesapEkraniPanel.add(hosgeldinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 35, 200, 30));

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        kullaniciAdSoyadLabel.setForeground(new java.awt.Color(0, 153, 153));
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdSoyadLabel.setText("[KULLANICI ADI SOYADI]");
        hesapEkraniPanel.add(kullaniciAdSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 76, 800, 50));

        turkLirasiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/turkishLiraIcon.png"))); // NOI18N
        hesapEkraniPanel.add(turkLirasiIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 164, -1, -1));

        m_bakiyeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        m_bakiyeLabel.setForeground(new java.awt.Color(102, 102, 102));
        m_bakiyeLabel.setText("[BAKIYE]");
        hesapEkraniPanel.add(m_bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 194, 400, 98));

        paraCekIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/withdrawIcon.png"))); // NOI18N
        hesapEkraniPanel.add(paraCekIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 115, 107));

        m_paraCekButon.setBackground(new java.awt.Color(255, 204, 102));
        m_paraCekButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_paraCekButon.setForeground(new java.awt.Color(51, 51, 51));
        m_paraCekButon.setText("Para Çek");
        m_paraCekButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_paraCekButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_paraCekButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_paraCekButonMouseExited(evt);
            }
        });
        m_paraCekButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_paraCekButonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(m_paraCekButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 115, 39));

        paraYatirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/depositIcon.png"))); // NOI18N
        hesapEkraniPanel.add(paraYatirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 107));

        m_paraYatirButon.setBackground(new java.awt.Color(204, 204, 255));
        m_paraYatirButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_paraYatirButon.setForeground(new java.awt.Color(51, 51, 51));
        m_paraYatirButon.setText("Para Yatır");
        m_paraYatirButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_paraYatirButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_paraYatirButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_paraYatirButonMouseExited(evt);
            }
        });
        m_paraYatirButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_paraYatirButonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(m_paraYatirButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 115, 39));

        havaleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/transferIcon.png"))); // NOI18N
        hesapEkraniPanel.add(havaleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, 119));

        odemelerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/paymentsIcon.png"))); // NOI18N
        hesapEkraniPanel.add(odemelerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, 107));

        m_odemelerButon.setBackground(new java.awt.Color(153, 204, 255));
        m_odemelerButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_odemelerButon.setForeground(new java.awt.Color(51, 51, 51));
        m_odemelerButon.setText("Ödemeler");
        m_odemelerButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_odemelerButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_odemelerButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_odemelerButonMouseExited(evt);
            }
        });
        m_odemelerButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_odemelerButonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(m_odemelerButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 115, 39));

        m_havaleButon.setBackground(new java.awt.Color(255, 200, 158));
        m_havaleButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_havaleButon.setForeground(new java.awt.Color(51, 51, 51));
        m_havaleButon.setText("Havale");
        m_havaleButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_havaleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_havaleButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_havaleButonMouseExited(evt);
            }
        });
        m_havaleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_havaleButonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(m_havaleButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 115, 39));

        m_settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/settingsIcon.png"))); // NOI18N
        m_settingsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_settingsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_settingsIconMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(m_settingsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 70, -1));

        m_logOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/logoutIcon.png"))); // NOI18N
        m_logOutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_logOutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_logOutIconMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(m_logOutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        hesapEkraniPanel.setFocusable(true);
        this.kullaniciAdSoyadLabel.setText(getHesapBilgileri().getAdSoyad());
        this.m_bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
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

    /*
    Button Renklendirmeleri ve İcon DEğişimleri
     */
    private void setBgFg(Component c) {
        ButtonAyarlari.setBgFg((JButton) c, Color.black, Color.white);
    }

    private void m_paraCekButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_paraCekButonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon("withdrawIcon2", paraCekIcon);
    }//GEN-LAST:event_m_paraCekButonMouseEntered

    private void m_paraCekButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_paraCekButonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(paraCekIcon);
    }//GEN-LAST:event_m_paraCekButonMouseExited

    private void m_paraYatirButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_paraYatirButonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon("depositIcon2", paraYatirIcon);
    }//GEN-LAST:event_m_paraYatirButonMouseEntered

    private void m_paraYatirButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_paraYatirButonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(paraYatirIcon);
    }//GEN-LAST:event_m_paraYatirButonMouseExited

    private void m_havaleButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_havaleButonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon("transferIcon2", havaleIcon);
    }//GEN-LAST:event_m_havaleButonMouseEntered

    private void m_havaleButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_havaleButonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(havaleIcon);
    }//GEN-LAST:event_m_havaleButonMouseExited

    private void m_odemelerButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_odemelerButonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon("paymentsIcon2", odemelerIcon);
    }//GEN-LAST:event_m_odemelerButonMouseEntered

    private void m_odemelerButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_odemelerButonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(odemelerIcon);
    }//GEN-LAST:event_m_odemelerButonMouseExited

    /*
    Actionlar
     */
    private void m_paraCekButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_paraCekButonActionPerformed
        ActionAyarlari.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_m_paraCekButonActionPerformed

    private void m_paraYatirButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_paraYatirButonActionPerformed
        ActionAyarlari.setVisible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_m_paraYatirButonActionPerformed

    private void m_havaleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_havaleButonActionPerformed
        ActionAyarlari.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_m_havaleButonActionPerformed

    private void m_odemelerButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_odemelerButonActionPerformed
        ActionAyarlari.setVisible(this, new OdemelerEkrani());
    }//GEN-LAST:event_m_odemelerButonActionPerformed

    private void m_logOutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_logOutIconMouseClicked
        String question = "Hesabınızdan Çıkış Yapılacaktır\n"
                + "Onaylıyor Musunuz?";
        if (Dialogs.onayMesajiGoster(this, question) == 1) {
            this.cikisYap();
        }
    }//GEN-LAST:event_m_logOutIconMouseClicked

    
    private void cikisYap() {
        getHesapBilgileri().cikisYap();
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }
    
    private void m_settingsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_settingsIconMouseClicked
        ActionAyarlari.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_m_settingsIconMouseClicked

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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel havaleIcon;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel m_bakiyeLabel;
    private javax.swing.JButton m_havaleButon;
    private javax.swing.JLabel m_logOutIcon;
    private javax.swing.JButton m_odemelerButon;
    private javax.swing.JButton m_paraCekButon;
    private javax.swing.JButton m_paraYatirButon;
    private javax.swing.JLabel m_settingsIcon;
    private javax.swing.JLabel odemelerIcon;
    private javax.swing.JLabel paraCekIcon;
    private javax.swing.JLabel paraYatirIcon;
    private javax.swing.JLabel turkLirasiIcon;
    // End of variables declaration//GEN-END:variables
}
