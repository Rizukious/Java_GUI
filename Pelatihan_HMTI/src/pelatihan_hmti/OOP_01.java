
package pelatihan_hmti;

public class OOP_01 {
    
    public static void main(String[] args) {
        //Constructor bawaan
        //ConstructorParameter m = new ConstructorParameter(Mahasiswa data);
        
        //Constructor dengan parameter
        //ConstructorParameter m = new ConstructorParameter("Ini Constructor dengan Parameter");
        
        //Constructor ke mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        mhs.NIM = "220399";
        mhs.Nama = "rizki";
        mhs.Jurusan = "TI";
        
        //constructor manggil isi data mhs
        //ConstructorParameter data_mhs = new ConstructorParameter(mhs);
        
        //mengirim data tanpa constructor
        //ConstructorParameter test = new ConstructorParameter();
        //test.data_mhs = mhs;
        //test.tampilkanNim();
        
        //Constructor extends
        //Rizki test = new Rizki();
        
        //Fungsi mengembalikan nilai
        BelajarMethod b = new BelajarMethod();
        Mahasiswa m = new Mahasiswa();
        m.NIM = "220399";
        b.tampilkanNama(m);
        
        //Fungsi static
        //BelajarMethod.test();
                
    }
}
