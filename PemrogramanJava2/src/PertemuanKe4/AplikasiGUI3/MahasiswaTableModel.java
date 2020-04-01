/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKe4.AplikasiGUI3;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rizky Wahyudi
 */
public class MahasiswaTableModel extends AbstractTableModel{
    //pembuatan generic list
    private List<Mahasiswa> list;
     
    //pembuatan constructor tanpa parameter
    public MahasiswaTableModel() {
    }
    //pembuatan constructor dengan parameter
    public MahasiswaTableModel(List<Mahasiswa> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        //pembuatan size baris atau data pada list
        return list.size();
    }

    @Override
    public int getColumnCount() {
        //mengikuti entiti pada table
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //memanggil object pada baris dan kolom
        return list.get(rowIndex).getValue(columnIndex);
    }

    private String[] columns = {"NIM","Nama","Jurusan","Alamat","Email","Telepon"}; 
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
}
