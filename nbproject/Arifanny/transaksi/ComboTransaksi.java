/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifanny.transaksi;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Arifanny Ramadhan Sukma | arifannyrs@gmail.com
 */
public class ComboTransaksi {
    private HashMap <String, Float> itemadd = new HashMap<>();
    
    //CONSTRUCTOR
    public ComboTransaksi() {
        this.itemadd.put("Gula", new Float(15000));
        this.itemadd.put("Kopi", new Float(25000));
        this.itemadd.put("Susu", new Float(40000));
        
    }
   
    //METHOD ARRAYLIST UNTUK MENAMBAH ITEM BERDASAR NAMA
    public ArrayList <String> getNama(){
        ArrayList<String> string = new ArrayList<>();
        for(String item : this.itemadd.keySet()){
            string.add(item);
        }
        return string;
    }
    
    //METHOD ARRAYLIST UNTUK MENAMBAHKAN HARGA PADA ITEM
    public ArrayList<Float> getHarga(){
        ArrayList<Float> flo = new ArrayList<>();
        for(float item : this.itemadd.values()){
            flo.add(item);
        }
        return flo;
    }
    
    //METHOD ADDITEM YANG BERISI NAMA DAN HARGA DARI ITEM
    public void addItem(String nama, float harga){
        this.itemadd.put(nama, harga);
    }
    
}
