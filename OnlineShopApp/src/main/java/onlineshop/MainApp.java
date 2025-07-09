package onlineshop;

import onlineshop.Electronics;
import onlineshop.Clothing;
import java.util.InputMismatchException; // Import untuk menangani input non-angka
import java.util.Scanner;

public class MainApp {
    private static int nextProductId = 1; // Untuk menghasilkan ID produk yang unik

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        ProductManager productManager = new ProductManager(); // Menggunakan ProductManager
        boolean lanjut = true;

        // Inisialisasi produk dalam ProductManager
        productManager.addProduct(new Electronics(1, "Laptop ASUS", 15000000, 1.5, "Asus", "Brand: ASUS, Berat: 1,5 kg"));
        productManager.addProduct(new Electronics(2, "HP Samsung", 6000000, 0.2, "Samsung", "Brand: Samsung, Berat: 0,2 kg"));
        productManager.addProduct(new Electronics(3, "TV LG", 1500000, 2.0, "LG", "Brand: LG, Berat: 7 kg"));
        productManager.addProduct(new Electronics(4, "Kipas Angin", 250000, 2.0, "Maspion", "Brand: Maspion, Berat: 2 kg"));
        productManager.addProduct(new Clothing(5, "Baju Polos", 120000, Size.M, "Katun", "Putih", "Bahan: Katun, Warna: Putih"));
        productManager.addProduct(new Clothing(6, "Knit Sweater", 180000, Size.L, "Wol", "Merah", "Bahan: Wol, Warna: Merah"));
        productManager.addProduct(new Clothing(7, "Gamis", 250000, Size.XL, "Sutra", "Hitam", "Bahan: Sutra, Warna: Hitam"));
        productManager.addProduct(new Clothing(8, "Celana Jeans", 200000, Size.S, "Denim", "Biru", "Bahan: Denim, Warna: Biru"));
        productManager.addProduct(new Clothing(9, "Rok Span", 150000, Size.M, "Polyester", "Abu-abu", "Bahan: Polyester, Warna: Abu-abu"));


        System.out.println("=================================");
        System.out.println("  SELAMAT DATANG DI ONLINE SHOP!");
        System.out.println("=================================");

        while (lanjut) {
            System.out.println("\n--- DAFTAR PRODUK TERSEDIA ---");
            productManager.displayAllProducts(); // Menampilkan produk dari ProductManager

            int pilihanId = -1;
            int jumlah = -1;

            try {
                System.out.print("Masukkan ID produk yang ingin dibeli: ");
                pilihanId = scanner.nextInt();

                System.out.print("Masukkan jumlah yang ingin dibeli: ");
                jumlah = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline

                Product selectedProduct = productManager.findProductById(pilihanId); // Mencari produk berdasarkan ID
                cart.addItem(selectedProduct, jumlah); // Menambahkan ke keranjang
                System.out.println("Produk '" + selectedProduct.getName() + "' berhasil ditambahkan ke keranjang.");

            } catch (InputMismatchException e) { // Menangani input yang bukan angka
                System.out.println("Input tidak valid. Harap masukkan angka untuk ID produk dan jumlah.");
                scanner.nextLine(); // Membersihkan input yang tidak valid dari scanner
            } catch (ProductNotFoundException e) { // Menangani produk tidak ditemukan
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) { // Menangani kesalahan lain, misal Enum.valueOf (jika ada input ukuran salah)
                System.out.println("Error: " + e.getMessage());
            }


            System.out.print("\nIngin belanja lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            lanjut = jawaban.equalsIgnoreCase("y");
        }

        // Tampilkan keranjang dengan diskon 10%
        cart.printCart(10);

        System.out.println("\nTerima kasih sudah berbelanja!");
        scanner.close();
    }
}