package gui.ayarlar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconAyarlari {

    /*
    Hesap Ekranındaki iconların buldunduğu butonlara,
    mouse ile üzerlerine gelince farklı bir icon olarak gösterdeim.
    */
    private static Icon originalIcon;

    public static void changeIcon(String fileName, JLabel label) {
        originalIcon = label.getIcon();
        label.setIcon(
                new ImageIcon(Package.getPackages().getClass().getResource("/gui/iconlar/" + fileName + ".png")));
    }
    
    public static void setOriginalIcon(JLabel label){
        label.setIcon(originalIcon);
    }

}
