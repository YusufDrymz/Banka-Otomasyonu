package databse.transactions;

import databse.DbConnection;
import databse.IBilgiContoller;
import gui.ayarlar.TextAyarlar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KullaniciBasvuru extends DbConnection implements IBilgiContoller {

    //Başvuru Bilgileri
    private String adSoyad = null, tcNo = null, telNO = null;
    private String guvenlikSorusu = null, guvenlikCevap = null;

    //Sistem Tarafından Verilecek Bilgiler
    private String musteriNo = null;
    private String sifre = null;

    public boolean basvuruOnaylandiMi() {
        if (this.bilgilerGecerliMi()) {
            if (this.tcNoTablodaVarMi()) {
                return false;
            } else {
                this.basvuruyuOnayla();
                return true;
            }
        } else {
            return false;
        }
    }
    
    /*
    Tc no kayıtlı mı diye kontrol ettiğim SQL kodu.
    */
    private boolean tcNoTablodaVarMi() {
        String query = "SELECT tc_no FROM kullanicilar WHERE tc_no= '" + this.tcNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true; //Eğer Tabloda Veri Bulunmuşsa True Dönecek
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /*
    Başvuruda doldurulan bilgiler ile Databese de eşlenmesi için onay işlemleri yaptığım SQL kodlarım.
    */
    private void basvuruyuOnayla() {
        String query = "INSERT INTO kullanicilar(musteri_no,sifre,"
                + "ad_soyad, tc_no, tel_no, guvenlik_sorusu, guvenlik_cevap)"
                + " VALUES("
                + "'" + this.musteriNo + "',"
                + "'" + this.sifre + "',"
                + "'" + this.adSoyad + "',"
                + "'" + this.tcNo + "',"
                + "'" + this.telNO + "',"
                + "'" + this.guvenlikSorusu + "',"
                + "'" + this.guvenlikCevap + "'"
                + ")";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
    Müşteri No kayıtlı mı diye kontrol ettiğim SQL kodu.
    */
    public boolean musteriNoTablodaVarMi() {
        String query = "SELECT musteri_no FROM kullanicilar WHERE musteri_no= '" + this.musteriNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.adSoyad == null
                || this.tcNo == null
                || this.telNO == null
                || this.guvenlikSorusu == null
                || this.guvenlikCevap == null
                || this.musteriNo == null
                || this.sifre == null
                || TextAyarlar.uzunlukSundanKucukMu(11, this.tcNo)
                || TextAyarlar.uzunlukSundanKucukMu(11, this.telNO ));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNO() {
        return telNO;
    }

    public void setTelNO(String telNO) {
        this.telNO = telNO;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
