package gui;

import databse.IBilgiContoller;
import databse.transactions.HesapBilgileri;
import databse.transactions.SifreYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlar;
import java.awt.Color;
import javax.swing.JPasswordField;

public class SifreYenilemeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiContoller {

    private SifreYenileme sifreYenilemeObject = null;

    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        sifreYenilemePanel.setFocusable(true);
        TextAyarlar.setMaxLimit(m_tcNoText, 11);
        TextAyarlar.setOnlyNumber(m_tcNoText);
        TextAyarlar.setMaxLimit(m_telefonNoText, 11);
        if (getHesapBilgileri().getKullaniciId()==0) {
            this.m_eskiSifreText.setEnabled(false);
        }
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public JPasswordField getEskiSifreText() {
        return m_eskiSifreText;
    }

    private boolean isEnabledEskiSifreText() {
        return this.getEskiSifreText().isEnabled();
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlar.textAlanlariDolumu(this.sifreYenilemePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreYenilemeObject() {
        if (this.sifreYenilemeObject == null) {
            sifreYenilemeObject = new SifreYenileme();
        }
        return sifreYenilemeObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        geriIcon2 = new javax.swing.JLabel();
        sifreYenilemeLabel = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        m_tcNoText = new javax.swing.JTextField();
        m_telefonNoText = new javax.swing.JTextField();
        telefonNoLabel = new javax.swing.JLabel();
        m_guvenlikCevapText = new javax.swing.JTextField();
        guvenlikCevabiLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        eskiSifreLabel = new javax.swing.JLabel();
        m_eskiSifreText = new javax.swing.JPasswordField();
        m_sifreTekrarText = new javax.swing.JPasswordField();
        m_yeniSifreText = new javax.swing.JPasswordField();
        m_sifreyiYenileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sifreYenilemePanel.setBackground(new java.awt.Color(51, 255, 204));

        geriIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIcon2MouseClicked(evt);
            }
        });

        sifreYenilemeLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        sifreYenilemeLabel.setForeground(new java.awt.Color(255, 51, 51));
        sifreYenilemeLabel.setText("Şifre Yenileme");

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("T.C. No :");

        telefonNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("Telefon No :");

        guvenlikCevabiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevabiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevabiLabel.setText("Güvenlik Sorusu Cevap :");

        sifreTekrarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreTekrarLabel.setText("Yeni Şifre Tekrar :");

        yeniSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("Yeni Şifre :");

        eskiSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("Eski Şifre :");

        m_sifreyiYenileButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        m_sifreyiYenileButton.setText("Şifre Yenile");

        javax.swing.GroupLayout sifreYenilemePanelLayout = new javax.swing.GroupLayout(sifreYenilemePanel);
        sifreYenilemePanel.setLayout(sifreYenilemePanelLayout);
        sifreYenilemePanelLayout.setHorizontalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(geriIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m_telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(sifreYenilemeLabel))
                        .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(m_tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guvenlikCevabiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m_guvenlikCevapText)
                            .addComponent(m_eskiSifreText)
                            .addComponent(m_sifreTekrarText)
                            .addComponent(m_yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m_sifreyiYenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        sifreYenilemePanelLayout.setVerticalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guvenlikCevabiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(m_sifreyiYenileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIcon2MouseClicked
        if (isEnabledEskiSifreText()) {
            ActionAyarlari.setVisible(this, new AyarlarEkrani());
        } else {
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }

    }//GEN-LAST:event_geriIcon2MouseClicked

    private void sifreyiYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseEntered
        ButtonAyarlari.setBgFg(m_sifreyiYenileButton, Color.CYAN, Color.red);
    }//GEN-LAST:event_sifreyiYenileButtonMouseEntered

    private void sifreyiYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(m_sifreyiYenileButton);
    }//GEN-LAST:event_sifreyiYenileButtonMouseExited

    private void sifreyiYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.sifreyiYenile();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_sifreyiYenileButtonActionPerformed

    private void sifreyiYenile() {
        String yeniSifre = String.valueOf(this.m_yeniSifreText.getPassword());
        String yeniSifreTekrar = String.valueOf(this.m_sifreTekrarText.getPassword());

        if (yeniSifre.equals(yeniSifreTekrar)) {
            this.sifreyiOnayla();
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreler Uyuşmuyor!");
        }
    }

    private void sifreyiOnayla() {
        this.getSifreYenilemeObject().setTcNo(this.m_tcNoText.getText());
        this.getSifreYenilemeObject().setTelNo(this.m_telefonNoText.getText());
        this.getSifreYenilemeObject().setGuvenlikCevap(this.m_guvenlikCevapText.getText());
        
        if (this.isEnabledEskiSifreText()) {
            this.getSifreYenilemeObject().setEskiSifre(String.valueOf(this.m_eskiSifreText.getPassword()));
        }
        this.getSifreYenilemeObject().setYeniSifre(String.valueOf(this.m_yeniSifreText.getPassword()));
        
        if (this.getSifreYenilemeObject().sifreYenilendiMi()) {
            Dialogs.ozelMesajGoster(this, "Şifreniz Başarıyla Yanilenmiştr..");
            if (this.isEnabledEskiSifreText()) {
                ActionAyarlari.setVisible(this, new HesapEkrani());
            }else{
                ActionAyarlari.setVisible(this, new GirisEkrani());
            }
        }else{
            Dialogs.ozelMesajGoster(this, "Şifreniz Yenilenemedi!\n"
                    + "Lütfen Bilgilerinizi Kontrol Ediniz..");
        }
    }

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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JLabel geriIcon2;
    private javax.swing.JLabel guvenlikCevabiLabel;
    private javax.swing.JPasswordField m_eskiSifreText;
    private javax.swing.JTextField m_guvenlikCevapText;
    private javax.swing.JPasswordField m_sifreTekrarText;
    private javax.swing.JButton m_sifreyiYenileButton;
    private javax.swing.JTextField m_tcNoText;
    private javax.swing.JTextField m_telefonNoText;
    private javax.swing.JPasswordField m_yeniSifreText;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JLabel sifreYenilemeLabel;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JLabel yeniSifreLabel;
    // End of variables declaration//GEN-END:variables
}
