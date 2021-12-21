package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/*
JOptionPane i class olarak çağırtıp her yerde tek bir şekilde çağıdrım.
*/
public class Dialogs {

    public static void bosOlamazMesajiGoster(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "Tüm Alanlar Dolu Olmalıdır!");
    }

    public static void ozelMesajGoster(JFrame frame, String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    public static int onayMesajiGoster(JFrame frame, String message) {
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, message, "UYARI", optionType);
        //System.out.println(selected);
        if (optionType==selected) {
            return 1;
        }
        return 0;
    }

}
