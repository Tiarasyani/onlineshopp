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

Tentu, saya akan membuat struktur berkas dan penjelasannya sesuai dengan format gambar yang Anda berikan, dengan asumsi ini adalah untuk file README.md Anda. Saya akan menggabungkan semua file Java yang telah kita bahas sebelumnya dan menempatkannya dalam struktur yang relevan.

Berikut adalah strukturnya:

Markdown

## 📁 Struktur Berkas Proyek

Proyek ini terorganisir dalam struktur direktori dan berkas sebagai berikut:

.
├── src/                          # Berkas sumber (source code) aplikasi
│   └── onlineshop/               # Paket utama aplikasi yang berisi semua kelas Java
│       ├── FormBeranda.java      # Halaman utama/dashboard aplikasi.
│       ├── FormCheckout.java     # Form untuk proses pembayaran dan penyelesaian pesanan.
│       ├── FormKeranjang.java    # Form untuk melihat dan mengelola item-item di keranjang belanja.
│       ├── FormMenu.java         # Form untuk menampilkan daftar produk yang tersedia.
│       ├── FormPesanan.java      # Form untuk melihat riwayat atau status pesanan yang telah ditempatkan.
│       ├── Product.java          # Kelas induk abstrak untuk semua jenis produk.
│       ├── Electronics.java      # Subclass dari Product untuk produk elektronik, mencakup Specification sebagai inner class dan mengimplementasikan Discountable.
│       ├── Clothing.java         # Subclass dari Product untuk produk pakaian, menggunakan Size (enum) dan mengimplementasikan Discountable.
│       ├── Size.java             # Definisi enum untuk ukuran pakaian (XS, S, M, L, XL).
│       ├── Discountable.java     # Antarmuka yang mendefinisikan kontrak untuk produk yang dapat diberi diskon.
│       ├── ShoppingCart.java     # Kelas yang mengelola daftar item yang dibeli oleh pelanggan.
│       ├── ProductManager.java   # Kelas untuk mengelola daftar produk yang tersedia.
│       ├── TransactionManager.java # Kelas untuk mencatat dan menampilkan riwayat pembelian pelanggan.
│       ├── ProductNotFoundException.java # Custom exception untuk menangani kasus produk tidak ditemukan.
│       ├── MainApp.java          # Kelas utama yang menjalankan aplikasi, menginisialisasi produk, menangani input pengguna, dan menampilkan output.
│       ├── Order.java            # Model data untuk objek pesanan.
│       └── OrderItem.java        # Model data untuk item dalam sebuah pesanan.
├── build/                        # Direktori untuk hasil kompilasi dan artefak pembangunan proyek
│   └── classes/                  # Berkas kelas (bytecode) yang terkompilasi dari sumber Java
│       └── onlineshop/
│           ├── FormBeranda.class
│           ├── FormCheckout.class
│           ├── FormKeranjang.class
│           ├── FormMenu.class
│           ├── FormPesanan.class
│           ├── Product.class
│           ├── Electronics.class
│           ├── Clothing.class
│           ├── Size.class
│           ├── Discountable.class
│           ├── ShoppingCart.class
│           ├── ProductManager.class
│           ├── TransactionManager.class
│           ├── ProductNotFoundException.class
│           ├── MainApp.class
│           ├── Order.class
│           └── OrderItem.class
├── nbproject/                    # Berkas konfigurasi dan metadata proyek NetBeans IDE
│   ├── build-impl.xml            # Skrip pembangunan Ant yang digunakan oleh NetBeans
│   ├── genfiles.properties       # Berkas properti yang dihasilkan
│   ├── private/                  # Pengaturan proyek pribadi atau spesifik pengguna
│   │   └── private.xml
│   ├── project.properties        # Properti konfigurasi proyek
│   └── project.xml               # Berkas definisi proyek
├── .gitattributes                # Konfigurasi Git untuk atribut berkas (misal: penanganan line ending)
├── .gitignore                    # Berkas yang menentukan berkas/direktori yang harus diabaikan oleh Git
├── manifest.mf                   # Berkas manifest untuk arsip JAR, berisi informasi tentang aplikasi
└── README.md                     # Berkas dokumentasi utama proyek ini

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









