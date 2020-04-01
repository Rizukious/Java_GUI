/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelatihan_hmti;

/**
 *
 * @author Rizky Wahyudi
 */
public class BelajarMethod {
    //Fungsi dengan mengembalikan nilai
    public Mahasiswa tampilkanNama(Mahasiswa mhs){
        this.tampilkanNama2();
        System.out.println(mhs.NIM);
        return mhs;
    }
    
    //fungsi tanpa mengembalikan nilai
    public void tampilkanNama2(){
        
    }
    
    //fungsi yang berdiri sendiri
    public static void test(){
        //kalau ingin memanggil class lain, buat methode terlebih dahulu
        BelajarMethod b = new BelajarMethod();
        b.tampilkanNama2();
        System.out.println("Ini static");
    }
}
