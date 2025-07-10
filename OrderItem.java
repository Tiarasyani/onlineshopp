package onlineshop;

import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TIARA
 */
public class OrderItem {
    private String namaProduk;
    private double harga;
    private int jumlah;
    private LocalDateTime waktuPemesanan;

    public OrderItem(String namaProduk, double harga, int jumlah, LocalDateTime waktuPemesanan) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.waktuPemesanan = waktuPemesanan;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public LocalDateTime getWaktuPemesanan() {
        return waktuPemesanan;
    }

    public double getTotalHarga() {
        return harga * jumlah;
    }
}
