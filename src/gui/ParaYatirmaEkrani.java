package gui;

import databse.IBilgiContoller;
import databse.transactions.HesapBilgileri;
import databse.transactions.ParaYatirma;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlar;
import javax.swing.JOptionPane;

public class ParaYatirmaEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {
    
    private ParaYatirma paraYatirmaObject = null;
    
    private int yatirilacakMiktar = 0;
    
    public ParaYatirmaEkrani() {
        initComponents();
        getEdits();
    }
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        paraYatirmaEkraniPanel.setFocusable(true);
        TextAyarlar.setOnlyNumber(m_yatirilacakMiktarText);
        TextAyarlar.setMaxLimit(m_yatirilacakMiktarText, 5);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + this.getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(this.getHesapBilgileri().getBakiye()));
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.m_yatirilacakMiktarText.getText().equals(""));
    }
    
    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    public ParaYatirma getParaYatirmaObject() {
        if (this.paraYatirmaObject == null) {
            paraYatirmaObject = new ParaYatirma();
        }
        return paraYatirmaObject;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraYatirmaEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        kullaniciUyariLAbel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        yatiracaginizMiktarLabel = new javax.swing.JLabel();
        m_yatirilacakMiktarText = new javax.swing.JTextField();
        m_paraYatirButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paraYatirmaEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));
        paraYatirmaEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 102, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayin[KULLANICI ADI SOYADI]");
        paraYatirmaEkraniPanel.add(kullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 53, 535, 50));

        kullaniciUyariLAbel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kullaniciUyariLAbel.setText("Tek Seferde ₺40.000 ve Atını Yatırabilirsiniz");
        paraYatirmaEkraniPanel.add(kullaniciUyariLAbel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 50));

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz :");
        paraYatirmaEkraniPanel.add(toplamBakiyenizLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 220, -1, 50));

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeLabel.setText("[BAKİYE]");
        paraYatirmaEkraniPanel.add(bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 220, 150, 50));

        yatiracaginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yatiracaginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracaginizMiktarLabel.setText("Yatıracağınız Miktar :");
        paraYatirmaEkraniPanel.add(yatiracaginizMiktarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 50));

        m_yatirilacakMiktarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_yatirilacakMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                m_yatirilacakMiktarTextKeyReleased(evt);
            }
        });
        paraYatirmaEkraniPanel.add(m_yatirilacakMiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 311, 150, 50));

        m_paraYatirButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_paraYatirButton.setText("Para Yatır");
        m_paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_paraYatirButtonActionPerformed(evt);
            }
        });
        paraYatirmaEkraniPanel.add(m_paraYatirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 397, 114, 46));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });
        paraYatirmaEkraniPanel.add(geriIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_yatirilacakMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_yatirilacakMiktarTextKeyReleased
        this.yatirilacakMiktar = TextAyarlar.checkTheTextKeyReleased(m_yatirilacakMiktarText, 40000);
    }//GEN-LAST:event_m_yatirilacakMiktarTextKeyReleased

    private void m_paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_paraYatirButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.paraYatir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_m_paraYatirButtonActionPerformed
    
    private void paraYatir() {
         this.getParaYatirmaObject().setYatirilacakMiktar(this.yatirilacakMiktar);
        
        if(getParaYatirmaObject().paraYatirildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para başarıyla hesabınıza tanımlanmıştır.\n"
                    + "Yatırılan miktar:" + this.yatirilacakMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Bilgilerinizi kontrol edin! --- '0 TL girildi'");
        }
    }

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked
    
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
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel kullaniciUyariLAbel;
    private javax.swing.JButton m_paraYatirButton;
    private javax.swing.JTextField m_yatirilacakMiktarText;
    private javax.swing.JPanel paraYatirmaEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    private javax.swing.JLabel yatiracaginizMiktarLabel;
    // End of variables declaration//GEN-END:variables
}
