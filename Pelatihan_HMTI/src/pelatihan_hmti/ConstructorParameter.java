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
public class ConstructorParameter {
    String nama;
    String email;
    Mahasiswa data_mhs;
    
    //constructor bawaan
    public ConstructorParameter(){
        System.out.println("Ini Constructor Bawaan");
    }
    
    //constructor dengan parameter
    public ConstructorParameter(String nama){
        String data = nama;
        System.out.println(data);
    }  
    
    //constructor dari mahasiswa
    public ConstructorParameter(Mahasiswa data){
        System.out.println(data.NIM);
    }
    
    public void tampilkanNim(){
        System.out.println(data_mhs.NIM);
    }
}
