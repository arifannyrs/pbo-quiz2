/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifanny.transaksi;

/**
 *
 * @author Arifanny Ramadhan Sukma | arifannyrs@gmail.com
 */
public class Item {
    private String nama;
    private float harga;
    private int jumlah;

    //CONSTRUCTOR DEFAULT
    public Item() {
    }

    //CONSTRUCTOR BERPARAMETER NAMA, HARGA, JUMLAH
    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    //GETTER SETTER
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //METHOD UNTUK MENGHITUNG HASIL DARI ITEM DIKAI JUMLAH
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    
    //METHOD OUTPUT
    public String toString(){
        return this.nama;
    }
    
}
