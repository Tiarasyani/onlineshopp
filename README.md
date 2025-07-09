# Aplikasi Online Shopp Sederhana Menggunakan Netbeans 

Aplikasi ini adalah contoh sederhana sistem pemesanan produk yang dikembangkan menggunakan Java Swing. Aplikasi ini dirancang untuk menunjukkan fungsionalitas dasar seperti menampilkan produk, manajemen keranjang belanja, proses checkout, dan pengelolaan pesanan, serta penerapan konsep OOP seperti interface dan inheritance.

## Fitur Utama

-   **FormBeranda.java**: Tampilan utama aplikasi setelah login atau sebagai halaman pembuka, menyediakan navigasi ke berbagai fitur.
-   **FormMenu.java**: Menampilkan daftar produk yang tersedia untuk dibeli. Pengguna dapat melihat detail produk dan menambahkannya ke keranjang.
-   **FormKeranjang.java**: Mengelola item-item yang telah ditambahkan ke keranjang belanja. Pengguna dapat mengubah kuantitas atau menghapus item.
-   **FormCheckout.java**: Proses finalisasi pembelian. Menampilkan ringkasan total pesanan dan mungkin input untuk informasi pengiriman/pembayaran.
-   **FormPesanan.java**: Menampilkan riwayat atau status pesanan yang telah ditempatkan oleh pengguna.

# Aplikasi E-commerce Sederhana

Aplikasi ini adalah contoh sederhana sistem e-commerce/pemesanan produk yang dikembangkan menggunakan Java Swing. Aplikasi ini dirancang untuk menunjukkan fungsionalitas dasar seperti menampilkan produk, manajemen keranjang belanja, proses checkout, dan pengelolaan pesanan, serta penerapan konsep OOP seperti interface dan inheritance.

## Fitur Utama

-   **FormBeranda.java**: Tampilan utama aplikasi setelah login atau sebagai halaman pembuka, menyediakan navigasi ke berbagai fitur.
-   **FormMenu.java**: Menampilkan daftar produk/item yang tersedia untuk dibeli. Pengguna dapat melihat detail produk dan menambahkannya ke keranjang.
-   **FormKeranjang.java**: Mengelola item-item yang telah ditambahkan ke keranjang belanja. Pengguna dapat mengubah kuantitas atau menghapus item.
-   **FormCheckout.java**: Proses finalisasi pembelian. Menampilkan ringkasan total pesanan dan mungkin input untuk informasi pengiriman/pembayaran.
-   **FormPesanan.java**: Menampilkan riwayat atau status pesanan yang telah ditempatkan oleh pengguna.

## Struktur Kode

Proyek ini terorganisir dengan baik, memisahkan logika antarmuka pengguna (GUI) dari logika bisnis (model data).

├── src/
│   └── onlineshop/           # Asumsi nama paket adalah 'onlineshop'
│       ├── FormBeranda.java
│       ├── FormCheckout.java
│       ├── FormKeranjang.java
│       ├── FormMenu.java
│       ├── FormPesanan.java
│       ├── Discountable.java
│       ├── Electronics.java
│       ├── MainApp.java
│       ├── Order.java
│       └── OrderItem.java
└── README.md

### Kelas Penting:

-   **`MainApp.java`**: Ini adalah kelas utama yang akan dijalankan untuk memulai aplikasi.
-   **`Discountable.java`**: Sebuah antarmuka yang mendefinisikan perilaku diskon. Ini memungkinkan berbagai jenis produk untuk memiliki logika diskon mereka sendiri.
-   **`Electronics.java`**: Contoh implementasi produk, mungkin mengimplementasikan `Discountable` jika produk elektronik memiliki diskon khusus. Ini menunjukkan konsep *inheritance* atau *polymorphism*.
-   **`Order.java`**: Kelas model yang merepresentasikan sebuah pesanan, berisi informasi seperti ID pesanan, tanggal, total harga, dan daftar item pesanan.
-   **`OrderItem.java`**: Kelas model yang merepresentasikan satu baris item dalam sebuah pesanan, termasuk produk, kuantitas, dan harga per item.

## Teknologi yang Digunakan

-   **Bahasa Pemrograman**: Java
-   **GUI Framework**: Java Swing
-   **IDE**: NetBeans

## 📊 Hasil Output
![image](https://github.com/user-attachments/assets/675850b7-7e8b-439e-82f6-1f7f9071ade1)
![image](https://github.com/user-attachments/assets/24103efb-2314-41ef-9735-5df44108d227)
![image](https://github.com/user-attachments/assets/46e18f41-06b9-4087-b103-a9da39d08bf5)
![image](https://github.com/user-attachments/assets/6ee76f01-59ad-4562-bb98-54f56f51f630)
![image](https://github.com/user-attachments/assets/7fa8d4c6-cc14-462c-a350-d10f7c52da88)

## 👥 Anggota Kelompok

* **Tiarasyani Junia Bahri** (51424335)
* **Naisya Putri Abdullah** (51424000)
* **Freya Inezra Pardosi** (50424474)
* **Aulia Tifani** (50424209)









