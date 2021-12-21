package databse.transactions;

import databse.DbVeriMerkezi;
import databse.IBilgiContoller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HesapBilgileri extends DbVeriMerkezi implements IBilgiContoller {

    /*
    Singelton
     */
    private static HesapBilgileri hesapBilgileri = null;

    public static HesapBilgileri getInstance() {
        if (hesapBilgileri == null) {
            hesapBilgileri = new HesapBilgileri();
        }
        return hesapBilgileri;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(super.kullaniciId == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public void girisYap(String musteriKimlik) {
        this.kullaniciyiAl(musteriKimlik);
        this.bakiyeAl();
        this.faturalariAl();
    }

    public void cikisYap() {
        super.kullaniciId = 0;
        super.adSoyad = null;
        super.tcNo = null;
        super.telNo = null;
        super.musteriNo = null;
        super.bakiye = 0;
        super.elektrikFaturasi = 0;
        super.suFaturasi = 0;
        super.dogalgazFaturasi = 0;
        super.internetFaturasi = 0;
    }

    /*
    *Kullanıcı Hesap Bilgilerini Alma İşlemleri SQL kodum.
     */
    private void kullaniciyiAl(String musteriKimlik) {
        String query = "SELECT * FROM kullanicilar WHERE "
                + "tc_no = '" + musteriKimlik + "'"
                + " OR "
                + "musteri_no = '" + musteriKimlik + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                super.kullaniciId = rs.getInt("kullanici_id");
                super.adSoyad = rs.getNString("ad_soyad");
                super.tcNo = rs.getNString("tc_no");
                super.telNo = rs.getNString("tel_no");
                super.musteriNo = rs.getNString("musteri_no");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    Kullanıcı Bakiye Bilgilerini aldığım SQL kodlarım.
    */
    private void bakiyeAl() {
        if (this.bilgilerGecerliMi()) {
            String query = "SELECT * FROM kullanici_bakiye"
                    + " WHERE "
                    + "kullanici_id= '" + super.getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    super.bakiye = rs.getDouble("bakiye");
                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*
    Kullanıcı fatura bilgilerini aldığım SQL koldarım.
    */
    private void faturalariAl() {
        if (this.bilgilerGecerliMi()) {
            String query = "SELECT * FROM kullanici_faturalar"
                    + " WHERE "
                    + "kullanici_id= '" + super.getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    super.elektrikFaturasi = rs.getDouble("elektrik");
                    super.suFaturasi = rs.getDouble("su");
                    super.dogalgazFaturasi = rs.getDouble("dogalgaz");
                    super.internetFaturasi = rs.getDouble("internet");
                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /*
    *
     */
}
