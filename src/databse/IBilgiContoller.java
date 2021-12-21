package databse;

import databse.transactions.HesapBilgileri;

public interface IBilgiContoller {

    public boolean bilgilerGecerliMi();

    public HesapBilgileri getHesapBilgileri();
}
