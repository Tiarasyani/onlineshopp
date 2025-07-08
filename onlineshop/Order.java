package onlineshop;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String nama;
    private String alamat;
    private double total;
    private double bayar;
    private double kembalian;
    private LocalDateTime tanggalWaktu;
    private List<ShoppingCart.CartItem> items;

    public Order(String nama, String alamat, double total, double bayar, double kembalian, List<ShoppingCart.CartItem> items) {
        this.nama = nama;
        this.alamat = alamat;
        this.total = total;
        this.bayar = bayar;
        this.kembalian = kembalian;
        this.items = items;
        this.tanggalWaktu = LocalDateTime.now();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getTotal() {
        return total;
    }

    public double getBayar() {
        return bayar;
    }

    public double getKembalian() {
        return kembalian;
    }

    public LocalDateTime getTanggalWaktu() {
        return tanggalWaktu;
    }

    public List<ShoppingCart.CartItem> getItems() {
        return items;
    }
}
