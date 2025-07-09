package onlineshop;

import onlineshop.FormBeranda; // ← tambahkan ini
import onlineshop.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        javax.swing.SwingUtilities.invokeLater(() -> {
            new FormBeranda(cart).setVisible(true); // ini tidak boleh merah lagi
        });
    }
}
