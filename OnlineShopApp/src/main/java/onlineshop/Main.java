package onlineshop;

import onlineshop.FormBeranda;
import onlineshop.ShoppingCart;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        // Aktifkan Nimbus Look and Feel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // fallback ke default
        }

        // Jalankan GUI
        ShoppingCart cart = new ShoppingCart();
        javax.swing.SwingUtilities.invokeLater(() -> {
            new FormBeranda(cart).setVisible(true);
        });
    }
}
