/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Parzival
 */
public class Main {
    public static void main(String[] args)throws IOException{
       
        Scanner terminal = new Scanner(System.in);
		String pilihanUser;
		boolean isLanjutkan = true;
	while (isLanjutkan) {
		cls();
		System.out.println("\nDatabase perpustakaan\n");
		System.out.println("1.\tLihat seluruh buku");
		System.out.println("2.\tCari data buku");
		System.out.println("3.\tTambah data buku");
		System.out.println("4.\tUbah data buku");
		System.out.println("5.\tHapus data buku");

		System.out.print("\n\nPilihan anda : ");
		pilihanUser = terminal.next();
		System.out.println("");
	
		
		switch (pilihanUser) {
			case "1" :
                        System.out.println("==================");    
			System.out.println("LIST SELURUH BUKU");
			System.out.println("==================");
			tampilkanData();
			break;
			case "2" :
                        System.out.println("==========="); 
			System.out.println("CARI BUKU");
                        System.out.println("==========="); 
			cariData();
			break;
			case "3" :
                        System.out.println("================="); 
			System.out.println("TAMBAH DATA BUKU");
                        System.out.println("================="); 
			tambahData();
			break;
			case "4" :
                        System.out.println("================="); 
			System.out.println("UBAH DATA BUKU");
                        System.out.println("================="); 
                        updateData();
			break;
			case "5" :
                        System.out.println("=================="); 
			System.out.println("HAPUS DATA BUKU");
                        System.out.println("==================");
                        hapusData();
			break;
			default:
			System.err.println("\ninput salah\nSilahkan pilih dengan benar!");
		}
		
		isLanjutkan = getYesorNo("Kembali ke Menu ");

		

	}




	}
    
private static void tambahData() throws IOException{
        FileWriter fileOutput = new FileWriter("C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\database.txt",true);
        BufferedWriter bufferOutput =  new BufferedWriter(fileOutput);
        
        Scanner terminal = new Scanner(System.in);
        String penulis,judul,penerbit,tahun;
        boolean cekTahun = false;
        
        System.out.print("Nama penulis : ");
        penulis = terminal.nextLine();
        System.out.print("Judul Buku   : ");
        judul = terminal.nextLine();
        System.out.print("Penerbit     : ");
        penerbit = terminal.nextLine();
        System.out.print("Tahun terbit : ");
        tahun = ambilTahun();
        
        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        
        
        boolean isExist = cekBukuDiDatabase(keywords,false);

        // menulis buku di databse
        if (!isExist){
//   fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
        System.out.println(entryPertahun(penulis,tahun));
        long nomorEntry = entryPertahun(penulis,tahun) + 1;
           

        String punulisTanpaSpasi = penulis.replaceAll("\\s+","");
        String primaryKey = punulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
        System.out.println("\nData yang akan anda masukan adalah");
        System.out.println("----------------------------------------");
        System.out.println("primary key  : " + primaryKey);
        System.out.println("tahun terbit : " + tahun);
        System.out.println("penulis      : " + penulis);
        System.out.println("judul        : " + judul);
        System.out.println("penerbit     : " + penerbit);

            boolean isTambah = getYesorNo("Apakah akan ingin menambah data tersebut? ");

            if(isTambah){
                bufferOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+ ","+judul);
                bufferOutput.newLine();
                bufferOutput.flush();
                
                System.out.println("\nData berhasil ditambahkan!!!");
               
            }

        } else {
            System.out.println("\nBuku yang anda akan masukan sudah tersedia di database dengan data berikut :");
            cekBukuDiDatabase(keywords,true);
        }
        
        bufferOutput.close();
      
        
        
    }

private static void cariData() throws IOException{

        // membaca database ada atau tidak
        
        try {
            String database = "C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\database.txt";
            File file = new File(database);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            tambahData();
            return;
        }

        // kita ambil keyword dari user

        Scanner terminal = new Scanner(System.in);
        System.out.print("\nMasukan kata kunci untuk mencari buku: ");
        String cariString = terminal.nextLine();
        String[] keywords = cariString.split("\\s+");

        // kita cek keyword di database
        cekBukuDiDatabase(keywords,true);

    }   
    
private static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
            System.out.print("----------------------------------------------------------------------------------------------------------");
            System.out.println("\n| No |\tTahun  |\tPenulis          |\tPenerbit     |\tJudul Buku");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

        while(data != null){

            // cek keywords didalam baris
            isExist = true;

            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keywordsnya cocok maka tampilkan

            if(isExist){
                if(isDisplay) {
                    tampil(data, keywords, nomorData++);
                } else {
                    break;
                }
            }

            data = bufferInput.readLine();
        }

        if (isDisplay){
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

       return isExist;
    }

private static long entryPertahun(String penulis,String tahun)throws IOException{
    FileReader fileInput = new FileReader("C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\database.txt");
    BufferedReader bufferInput = new BufferedReader(fileInput);
    
    long entry = 0;
    String data = bufferInput.readLine();
    Scanner dataScan;
    String primaryKey;
    
    while (data != null) {        
        dataScan = new Scanner(data);
        dataScan.useDelimiter(",");
        primaryKey = dataScan.next();
        dataScan = new Scanner(primaryKey);
        dataScan.useDelimiter("_");
        
        
        penulis = penulis.replaceAll("\\+s","");
        
        if (penulis.equalsIgnoreCase(dataScan.next()) && tahun.equalsIgnoreCase(dataScan.next()) ){
            entry++;
        }
        
        data= bufferInput.readLine();
    }
    
    
    
    
    return entry;
}

private static void updateData() throws IOException {
    String tempDatabase = "C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\tempDB.txt";
    String pathDB = "C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\database.txt";
    //membaca file
    File database = new File(pathDB);
    FileReader fileInput = new FileReader(database);
    BufferedReader bufferInput = new BufferedReader(fileInput);
    //menulis ke DB temporary
    File tempDB = new File(tempDatabase);
    FileWriter fileOutput = new FileWriter(tempDB);
    BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
    
    //list buku yang ada
    System.out.println("List buku : ");
    tampilkanData();
    //mengambil input user 
    Scanner terminal = new Scanner(System.in);
    System.out.print("Masukan no Data yang ingin di Update : ");
    int deleteNum = terminal.nextInt();
    
//menghitung data
    int dataCount = 0;
    String data = bufferInput.readLine();
   //mengambil data menggunakan delimiter
   
   StringTokenizer st = new StringTokenizer(data,",");
  
    
    while (data != null) {        
        dataCount++;
        st = new StringTokenizer(data,",");
        
        if (deleteNum == dataCount) {
            System.out.println("\nData :");
            System.out.println("-------------------------------------");
            System.out.println("Refrensi : "+st.nextToken());
            System.out.println("Tahun    : "+st.nextToken());
            System.out.println("Penulis  : "+st.nextToken());
            System.out.println("Penerbit : "+st.nextToken());
            System.out.println("Judul    : "+st.nextToken());
            
            //update data per field
            String[] fieldData = {"tahun","penulis","penerbit","judul"}; 
            String[] dataSementara = new String[4];
            st = new StringTokenizer(data,",");
            String dataAsli = st.nextToken();
            
            for (int i = 0; i < fieldData.length; i++) {
                boolean isUpdate = getYesorNo("Apakah ingin mengupdate " + fieldData[i]+" ");
                dataAsli = st.nextToken();
                if (isUpdate) {
                    //mengambil  data dari user
                    if (fieldData[i].equalsIgnoreCase("tahun")) {
                        System.out.print("Tahun penerbit : ");
                        dataSementara[i] = ambilTahun();
                    }else{
                    terminal = new Scanner(System.in);
                    System.out.print("Masukan "+fieldData[i]+" baru : ");
                    dataSementara[i] = terminal.nextLine();
                    }
                      
                }else{
                   dataSementara[i] = dataAsli;
                }
            }
            //tampilkan ke user
            st = new StringTokenizer(data,",");
            st.nextToken();
            System.out.println("\nData baru yang akan di update :");
            System.out.println("-----------------------------------------------");
            System.out.println("Tahun    : "+st.nextToken()+" --> "+dataSementara[0]);
            System.out.println("Penulis  : "+st.nextToken()+" --> "+dataSementara[1]);
            System.out.println("Penerbit : "+st.nextToken()+" --> "+dataSementara[2]);
            System.out.println("Judul    : "+st.nextToken()+" --> "+dataSementara[3]);
            
           boolean isUpdate = getYesorNo("Apakah yakin ingin mengupdate data tersebut ");
           
            if (isUpdate) {
                
                //cek buku pada database
                boolean isExist = cekBukuDiDatabase(dataSementara, false);
                if (isExist) {
                    System.err.println("Data sudah tersedia di Database\nSilahkah hapus data terlebih dahulu");
                    bufferOutput.write(data);
                }else{
                    //format baru
                    String tahun = dataSementara[0];
                    String penulis = dataSementara[1];
                    String penerbit = dataSementara[2];
                    String judul = dataSementara[3];
                    
                    //membuat primary key
                    long nomorEntry = entryPertahun(penulis,tahun) + 1;
           
                    String punulisTanpaSpasi = penulis.replaceAll("\\s+","");
                    String primaryKey = punulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
                    
                    //menulis ke database
                    bufferOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+ ","+judul);
                    
                
                System.out.println("\nData berhasil diupdate !!!");
                }
                
            
                
                
            }else{
               //menulis kembali data yang di skip
               bufferOutput.write(data);
            }
            
            
            
            
        }else{
          bufferOutput.write(data);
        }
        
        
        bufferOutput.newLine();
        
        data = bufferInput.readLine();
    }
    
    bufferOutput.flush();
    
    bufferOutput.close();
    fileOutput.close();
    bufferInput.close();
    fileInput.close();
     
    System.gc();
     
    database.delete();
     
    tempDB.renameTo(database);
    
}

private static void hapusData()throws IOException{
    //membaca data
    File database = new File("C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\database.txt");
    FileReader fileInput = new FileReader(database);
    BufferedReader bufferInput = new BufferedReader(fileInput);
    
    //Database temporary
    File tempDB = new File("C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\tempDB.txt");
    FileWriter fileOutput = new FileWriter(tempDB);
    BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
    
    
    //tampilkan data
    System.out.println("List buku yang tersedia : ");
    tampilkanData();
    
    //catch user input untuk menetukan buku
    
    Scanner terminal = new Scanner(System.in);
    System.out.print("\nNo buku yang akan dihapus : ");
    int deleteNum = terminal.nextInt();
    
    
    //membaca data
    String data = bufferInput.readLine();
    int dataCount = 0;
    boolean isFound = false;
   
    
    while (data != null) {  
        
    boolean isDelete = false;
    StringTokenizer st = new StringTokenizer(data,",");
    dataCount++;
        
        if (deleteNum == dataCount){
            System.out.println("List Data : ");
            System.out.println("--------------------------------------");
            System.out.println("Refrensi : "+st.nextToken());
            System.out.println("Tahun    : "+st.nextToken());
            System.out.println("Penulis  : "+st.nextToken());
            System.out.println("Penerbit : "+st.nextToken());
            System.out.println("Judul    : "+st.nextToken());
            isDelete = getYesorNo("Apakah ingin menghapus data tersebut ");
            isFound = true;
        }
        
        if (isDelete) {
            System.out.println("\nData berhasil dihapus");
        }else{
            bufferOutput.write(data);
            bufferOutput.newLine();
           
        }
        data = bufferInput.readLine();
        
     
    }
    
    if (!isFound) {
        System.err.println("Data tidak ditemukan!!");
    }
    
     bufferOutput.flush();
     
     bufferOutput.close();
     fileOutput.close();
     bufferInput.close();
     fileInput.close();
     
     System.gc();
     
     database.delete();
     
     tempDB.renameTo(database);
     
    
}

    


    private static String ambilTahun() throws IOException{
        boolean cekTahun = false;
        Scanner terminal = new Scanner(System.in);
        String tahun = terminal.nextLine();
        while(!cekTahun) {
            try {
                Year.parse(tahun);
                cekTahun = true;
            } catch (Exception e) {
                System.out.println("Format tahun yang anda masukan salah, format=(YYYY)");
                System.out.print("silahkan masukan tahun terbit lagi: ");
                tahun = terminal.nextLine();
                
            }
        }
        
        return tahun;
    }
    
    private static void tampilkanData() throws IOException{
         FileReader fileInput;
         BufferedReader bufferInput;
         String pathDB = "C:\\Users\\Parzival\\Documents\\NetBeansProjects\\Database\\src\\Database\\database.txt";
         
         try {
            fileInput = new FileReader(pathDB);
            bufferInput = new BufferedReader(fileInput);
           
            
        } catch (Exception e) {
             System.err.println("Database tidak ditemukan");
             System.err.println("Silahkan tambah data");
             System.err.println("Pesan Error : "+ e.getMessage());
             tambahData();
             return;
        }
         
        String data = bufferInput.readLine();
       
	int nomorData = 0;

	
        System.out.print("--------------------------------------------------------------------------------");
	System.out.println("\n| No |\tTahun  |\tPenulis          |\tPenerbit     |\tJudul Buku");
	System.out.println("--------------------------------------------------------------------------------");
	while (data != null){
				
		

	nomorData++;
	StringTokenizer stringToken = new StringTokenizer(data,",");

	stringToken.nextToken();
	System.out.printf("|%2d  ",nomorData);
	System.out.printf("|%6s   ",stringToken.nextToken());
	System.out.printf("| %-20s    ",stringToken.nextToken());
	System.out.printf("| %-14s    ",stringToken.nextToken());
	System.out.printf("| %s    ",stringToken.nextToken());
	System.out.println("");
	


        data = bufferInput.readLine();		
	}     
System.out.println("---------------------------------------------------------------------------------");
         
    }
    
    private static void tampil(String data, String[] keywords,int nomorData)throws IOException{

	
                    
        nomorData++;
	StringTokenizer stringToken = new StringTokenizer(data,",");

	stringToken.nextToken();
	System.out.printf("|%2d  ",nomorData);
	System.out.printf("|%6s   ",stringToken.nextToken());//tahun
	System.out.printf("| %-20s    ",stringToken.nextToken());//penulis
	System.out.printf("| %-14s    ",stringToken.nextToken());//penerbit
	System.out.printf("| %s    ",stringToken.nextToken());
	System.out.println("");
        
    }
    
    private static boolean getYesorNo(String pesan){
		Scanner terminal = new Scanner(System.in);
		String pilihanUser;
		System.out.println("");
		System.out.print(pesan+ "(y/n) ? ");
		pilihanUser = terminal.next();


		while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
			System.err.println("Pilihan anda bukan Y atau N");
			System.out.print("Silahkan pilih (y/n) ? ");
			pilihanUser = terminal.next();
		}

		return pilihanUser.equalsIgnoreCase("y");

	}
    
    private static void cls(){
		try{
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}else{System.out.print("\033\143");}
		}catch(Exception ex){
			System.err.println("tidak bisa clear screen");
		}
	}
    
}
