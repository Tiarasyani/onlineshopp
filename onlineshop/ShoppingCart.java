package onlineshop;

import onlineshop.Clothing;
import onlineshop.Electronics;
import onlineshop.OrderItem;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat; //
import java.time.LocalDateTime;

public class ShoppingCart {
    public static class CartItem {
        private Product product;
        private int quantity;
        
        public CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
        
        public Product getProduct() {
            return product;
        }
        public int getQuantity() {
            return quantity;
        }
        
    }
    
    public int getTotalPrice() {
        int total = 0;
        for (CartItem item : items) {
            total += item.getProduct().calculateFinalPrice() * item.getQuantity();
        }
        return total;
    }
    
    private List<OrderItem> riwayatItem = new ArrayList<>();
    private List<Order> riwayatOrder = new ArrayList<>();

    public void tambahPesanan(String nama, double harga, int jumlah) {
        riwayatItem.add(new OrderItem(nama, harga, jumlah, LocalDateTime.now()));
    }

    public List<OrderItem> getRiwayatItem() {
        return riwayatItem;
    }

    public void addOrder(Order order) {
        riwayatOrder.add(order);
        orderHistory.add(order);
    }

    public List<Order> getRiwayatOrder() {
        return riwayatOrder;
    }
    public void clear() {
        items.clear();
    }




    private List<CartItem> items = new ArrayList<>();
    private List<Order> orderHistory = new ArrayList<>();

    public List<Order> getOrderHistory() {
        return orderHistory;
}

    private static final DecimalFormat df = new DecimalFormat("#,##0.00"); // Mengubah format DecimalFormat

    public void addItem(Product item, int quantity) {
        // Cek jika produk sudah ada di keranjang, tambahkan kuantitasnya
        for (CartItem cartItem : items) {
            if (cartItem.product.getId() == item.getId()) {
                cartItem.quantity += quantity;
                System.out.println("Kuantitas produk '" + item.getName() + "' ditambahkan menjadi " + cartItem.quantity);
                return;
            }
        }
        // Jika belum ada, tambahkan sebagai item baru
        items.add(new CartItem(item, quantity));
    }
    
    public List<CartItem> getItems() {
        return items;
    }


    public void printCart(double discountPercentage) {
        System.out.println("\n=================================");
        System.out.println("     DETAIL ISI KERANJANG");
        System.out.println("=================================");
        double totalKeseluruhan = 0;
        int itemNumber = 1;

        if (items.isEmpty()) {
            System.out.println("Keranjang belanja kosong.");
            System.out.println("=================================");
            return;
        }

        for (CartItem cartItem : items) {
            Product item = cartItem.product;
            int qty = cartItem.quantity;
            double itemPriceAfterDiscountOrTax;
            double subtotal;

            System.out.println("\n--- Item " + itemNumber + " ---"); //
            System.out.println("ID Produk        : " + item.getId()); //
            System.out.println("Nama Produk      : " + item.getName()); //
            System.out.println("Kategori         : " + item.getCategory()); //

            if (item instanceof Clothing) {
                Clothing clothing = (Clothing) item;
                System.out.println("Ukuran           : " + clothing.getSize()); //
                System.out.println("Bahan            : " + clothing.getMaterial()); //
                System.out.println("Warna            : " + clothing.getColor()); //
            } else if (item instanceof Electronics) {
                Electronics electronics = (Electronics) item;
                // Menggunakan getBrand() dan getWeight() dari Specification secara terpisah untuk tampilan rapi
                System.out.println("Brand            : " + electronics.getSpecification().getBrand()); //
                System.out.println("Berat            : " + df.format(electronics.getSpecification().getWeight()) + " kg"); //
            }

            System.out.println("Harga Satuan     : " + Product.formatRupiah(item.getPrice())); // Menggunakan formatRupiah
            System.out.println("Jumlah           : " + qty); //
            System.out.println("Tanggal Dibuat   : " + item.getCreatedDate()); //
            System.out.println("Waktu Dibuat     : " + item.getCreatedTime().withNano(0)); //

            // Calculate item price considering discounts and final price calculation
            if (item instanceof Discountable) {
                itemPriceAfterDiscountOrTax = ((Discountable) item).getDiscountedPrice(discountPercentage);
                System.out.println("Harga Setelah Diskon (per item) : " + Product.formatRupiah(itemPriceAfterDiscountOrTax)); // Menggunakan formatRupiah
            } else {
                itemPriceAfterDiscountOrTax = item.calculateFinalPrice(); // Price might include tax
                System.out.println("Harga Final (per item)  : " + Product.formatRupiah(itemPriceAfterDiscountOrTax)); // Menggunakan formatRupiah
            }

            subtotal = itemPriceAfterDiscountOrTax * qty;
            totalKeseluruhan += subtotal;
            System.out.println("Subtotal Item    : " + Product.formatRupiah(subtotal)); // Menggunakan formatRupiah
            itemNumber++;
        }
        System.out.println("=================================");
        System.out.println("TOTAL HARGA KESELURUHAN : " + Product.formatRupiah(totalKeseluruhan)); // Menggunakan formatRupiah
        System.out.println("=================================");
    }
    
    // Tambahan untuk integrasi ke GUI
    public void addProduct(Product p) {
        addItem(p, 1); // Default quantity = 1
    }

}