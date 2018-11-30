/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifanny.transaksi;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Arifanny Ramadhan Sukma | arifannyrs@gmail.com
 */
public class TabelBeli extends DefaultTableModel {
    //KOLOM ARRAY UNTUK MENYIMPAN NAMA KOLOM
    private String [] kolom;
    
    //CONSTRUCTOR
    public TabelBeli(){
        this.kolom = new String[]{
            "Nama", "Harga" , "Jumlah"
        };
    }
    
    //GETTER 
    public String [] getKolomNama(){
        return this.kolom;
    }
}
