package gui;

import databse.IBilgiContoller;
import databse.transactions.HesapBilgileri;
import databse.transactions.ParaCekme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlar;

public class ParaCekmeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {
    
    private ParaCekme paraCekmeObject=null;

    private int cekilecekMiktar = 0;

    public ParaCekmeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        paraCekmeEkraniPanel.setFocusable(true);
        TextAyarlar.setOnlyNumber(m_cekilecekMiktarText);
        TextAyarlar.setMaxLimit(m_cekilecekMiktarText, 4);
        this.kullaniciAdiSoyadiLabel.setText("Sayın "+this.getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(this.getHesapBilgileri().getBakiye()));
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.m_cekilecekMiktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaCekme getParaCekmeObject() {
        if (this.paraCekmeObject==null) {
            paraCekmeObject=new ParaCekme();
        }
        return paraCekmeObject;
    }
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmeEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        kullaniciUyariLAbel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        cekeceginizMiktarLabel = new javax.swing.JLabel();
        m_cekilecekMiktarText = new javax.swing.JTextField();
        m_paraCekButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IZU Bank Para Çekme Ekranı");

        paraCekmeEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));
        paraCekmeEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 102, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayin[KULLANICI ADI SOYADI]");
        paraCekmeEkraniPanel.add(kullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 53, 535, 50));

        kullaniciUyariLAbel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kullaniciUyariLAbel.setText("Tek Seferde ₺5000 ve Atını Çekebilirsiniz.");
        paraCekmeEkraniPanel.add(kullaniciUyariLAbel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 129, -1, 50));

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz :");
        paraCekmeEkraniPanel.add(toplamBakiyenizLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 220, -1, 50));

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeLabel.setText("[BAKİYE]");
        paraCekmeEkraniPanel.add(bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 220, 150, 50));

        cekeceginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cekeceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cekeceginizMiktarLabel.setText("Çekeceğiniz Miktar :");
        paraCekmeEkraniPanel.add(cekeceginizMiktarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 311, -1, 50));

        m_cekilecekMiktarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_cekilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                m_cekilecekMiktarTextKeyReleased(evt);
            }
        });
        paraCekmeEkraniPanel.add(m_cekilecekMiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 311, 150, 50));

        m_paraCekButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m_paraCekButton.setText("Para Çek");
        m_paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_paraCekButtonActionPerformed(evt);
            }
        });
        paraCekmeEkraniPanel.add(m_paraCekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 397, 114, 46));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });
        paraCekmeEkraniPanel.add(geriIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_cekilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_cekilecekMiktarTextKeyReleased
        this.cekilecekMiktar = TextAyarlar.checkTheTextKeyReleased(m_cekilecekMiktarText, 5000);
    }//GEN-LAST:event_m_cekilecekMiktarTextKeyReleased

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void m_paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_paraCekButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.paraCek();
        }else{
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_m_paraCekButtonActionPerformed

    private void paraCek(){
        this.getParaCekmeObject().setCekilecekMiktar(cekilecekMiktar);
        if (getParaCekmeObject().paraCekildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para Çekme İşlemi Tamamlandı\n"
                    + "Çekilen Miktar: "+ this.cekilecekMiktar +" TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }else{
            Dialogs.ozelMesajGoster(this, "Bakiyeniz Yeterli Değil..");
        }
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel cekeceginizMiktarLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel kullaniciUyariLAbel;
    private javax.swing.JTextField m_cekilecekMiktarText;
    private javax.swing.JButton m_paraCekButton;
    private javax.swing.JPanel paraCekmeEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
