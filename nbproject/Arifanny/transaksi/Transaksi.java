/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifanny.transaksi;

import java.util.*;
/**
 *
 * @author Arifanny Ramadhan Sukma | arifannyrs@gmail.com
 */
public class Transaksi {
    
    //VARIABEL
    private final String kode;//TRANSAKSI KODE
    private ArrayList<Item> itemadd = new ArrayList<>();//MENYIMPAN LIST ITEM
    private float total;//MENYIMPAN TOTAL
    
    //CONSTRUCTOR 
    public Transaksi(String kode, ArrayList<Item> itemadd) {
        this.kode = kode;
        this.itemadd = itemadd;
    }
    
    //SETTER
    public void setTotal(){
        float totalharga = 0;
        for(Item item : this.itemadd){
            totalharga += item.getTotal();
        }
        this.total = totalharga;
    }
    
    //OUTPUT
    public String CetakHasil() {
        setTotal();
        String string = "";
        string += "Kode: "+ this.kode+"\n";
        string += "Daftar Semua Barang: \n";
        for(Item item : this.itemadd){
            string += "\t" + item.getNama() + " ( x" + item.getJumlah() + " ) = Rp." + item.getTotal() + "\n" ;
        }
        string += "Total Harga: Rp." + this.total;
        return string;
        
    }    
}
