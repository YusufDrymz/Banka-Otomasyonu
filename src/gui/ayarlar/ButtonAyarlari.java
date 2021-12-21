package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButtonAyarlari {

    /*
    Arka Plan ve Yazı Rengi Ayarları için Kullandım
    */
    private static Color originalBgColor, originalFgColor;

    public static void setBgFg(JButton button, Color bgColor, Color fgColor) {
        originalBgColor = button.getBackground();
        originalFgColor =button.getForeground();
        button.setForeground(fgColor);
        button.setBackground(bgColor);
    }
    
    public static void setOriginalBgFg(JButton button){
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
    }
}
