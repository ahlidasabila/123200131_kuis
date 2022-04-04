/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kriteria;
import Penilaian.Perhitungan;
/**
 *
 * @author ahlida
 */
public class Programmer extends InputNilai implements Perhitungan {
   public Programmer (String nama, int nilaiSatu, int nilaiDua, int nilaiTiga){
        super(nama, nilaiSatu, nilaiDua, nilaiTiga);
    }
    
    public void inputNilaiSatu(int nilaiSatu) {
        this.nilaiSatu = nilaiSatu;
    }

     public void inputNilaiDua(int coding) {
        this.nilaiDua = nilaiDua;
    }

     public void inputNilaiTiga(int nilaiTiga) {
        this.nilaiTiga = nilaiTiga;
    }
     
    @Override
    public double NilaiTotal() {
         return (0.6 * super.nilaiSatu) + (0.15 * super.nilaiDua) + (0.25 * super.nilaiTiga);
    }
    
    @Override
    public String Keterangan() {
        if(this.NilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Programmer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Programmer\n";
    }
    
}