/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR_JAVA2;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizky Wahyudi
 */
public class OperasiDuaAngka extends javax.swing.JFrame {

    /**
     * Creates new form OperasiDuaAngka
     */
    public OperasiDuaAngka() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textAngkaKedua = new javax.swing.JTextField();
        textHasil = new javax.swing.JTextField();
        textAngkaPertama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelOperasi = new javax.swing.JLabel();
        buttonTmb = new javax.swing.JButton();
        buttonKrg = new javax.swing.JButton();
        buttonKl = new javax.swing.JButton();
        buttonBg = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        buttonTmb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operasi Dua Angka");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operasi Dua Angka"));
        jPanel1.setName(""); // NOI18N

        textAngkaKedua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAngkaKeduaActionPerformed(evt);
            }
        });
        textAngkaKedua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAngkaKeduaKeyTyped(evt);
            }
        });

        textHasil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textHasilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textHasilFocusLost(evt);
            }
        });
        textHasil.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                textHasilComponentHidden(evt);
            }
        });
        textHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHasilActionPerformed(evt);
            }
        });

        textAngkaPertama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textAngkaPertamaFocusGained(evt);
            }
        });
        textAngkaPertama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textAngkaPertamaMouseExited(evt);
            }
        });
        textAngkaPertama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAngkaPertamaActionPerformed(evt);
            }
        });
        textAngkaPertama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAngkaPertamaKeyTyped(evt);
            }
        });

        jLabel1.setText("=");

        buttonTmb.setText("Tambah");
        buttonTmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTmbActionPerformed(evt);
            }
        });

        buttonKrg.setText("Kurang");
        buttonKrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKrgActionPerformed(evt);
            }
        });

        buttonKl.setText("Kali");
        buttonKl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKlActionPerformed(evt);
            }
        });

        buttonBg.setText("Bagi");
        buttonBg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBgActionPerformed(evt);
            }
        });

        buttonKeluar.setText("Exit");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        buttonTmb1.setText("Clear");
        buttonTmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTmb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonTmb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(labelOperasi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonKrg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonKl, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(textAngkaPertama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonTmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAngkaPertama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOperasi)
                    .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTmb)
                    .addComponent(buttonKrg)
                    .addComponent(buttonKl)
                    .addComponent(buttonBg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKeluar)
                    .addComponent(buttonTmb1))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTmb1ActionPerformed
        prosesBersih();
    }//GEN-LAST:event_buttonTmb1ActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        prosesKeluar();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonBgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBgActionPerformed
        prosesBagi();
    }//GEN-LAST:event_buttonBgActionPerformed

    private void buttonKlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKlActionPerformed
        prosesKali();
    }//GEN-LAST:event_buttonKlActionPerformed

    private void buttonKrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKrgActionPerformed
        prosesKurang();
    }//GEN-LAST:event_buttonKrgActionPerformed

    private void buttonTmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTmbActionPerformed
        prosesTambah();
    }//GEN-LAST:event_buttonTmbActionPerformed

    private void textAngkaPertamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAngkaPertamaKeyTyped
        //Method kelas lain
        //Filter filtered = new Filter();
        //Filter.digitFilter(evt);

        //kelasnya sendiri
        char input = evt.getKeyChar();
        if (! ((Character.isDigit(input)) ||
            (input == KeyEvent.VK_BACK_SPACE) ||
            (input == KeyEvent.VK_DELETE))) {

        new JFrame().getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Tolong Masukkan hanya angka!!");

        evt.consume();
        }
        
    }//GEN-LAST:event_textAngkaPertamaKeyTyped

    private void textAngkaPertamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAngkaPertamaActionPerformed

    }//GEN-LAST:event_textAngkaPertamaActionPerformed

    private void textAngkaKeduaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAngkaKeduaKeyTyped
        //Filter filtered = new Filter();
        //Filter.digitFilter(evt);

        //kelasnya sendiri
        char input = evt.getKeyChar();
        if (! ((Character.isDigit(input)) ||
            (input == KeyEvent.VK_BACK_SPACE) ||
            (input == KeyEvent.VK_DELETE))) {

        new JFrame().getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Tolong Masukkan hanya angka!!");
        evt.consume();
        }
    }//GEN-LAST:event_textAngkaKeduaKeyTyped

    private void textAngkaKeduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAngkaKeduaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAngkaKeduaActionPerformed

    private void textAngkaPertamaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAngkaPertamaMouseExited
        textAngkaKedua.requestFocus();
    }//GEN-LAST:event_textAngkaPertamaMouseExited

    private void textAngkaPertamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAngkaPertamaFocusGained
      //
    }//GEN-LAST:event_textAngkaPertamaFocusGained

    private void textHasilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textHasilFocusLost
        textAngkaKedua.requestFocus();
    }//GEN-LAST:event_textHasilFocusLost

    private void textHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHasilActionPerformed
        
    }//GEN-LAST:event_textHasilActionPerformed

    private void textHasilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textHasilFocusGained
        textHasil.setEditable(false);
    }//GEN-LAST:event_textHasilFocusGained

    private void textHasilComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_textHasilComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_textHasilComponentHidden

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperasiDuaAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBg;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonKl;
    private javax.swing.JButton buttonKrg;
    private javax.swing.JButton buttonTmb;
    private javax.swing.JButton buttonTmb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelOperasi;
    private javax.swing.JTextField textAngkaKedua;
    private javax.swing.JTextField textAngkaPertama;
    private javax.swing.JTextField textHasil;
    // End of variables declaration//GEN-END:variables

    private void prosesTambah() {
        //Pemberian Validasi ke Text Field
        if (textAngkaPertama.getText().equals("") && textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 dan 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaPertama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }
        
        labelOperasi.setText("+");
        String strAngkaPertama = textAngkaPertama.getText();
        String strAngkaKedua = textAngkaKedua.getText();
        int AngkaPertama = Integer.parseInt(strAngkaPertama);
        int AngkaKedua = Integer.parseInt(strAngkaKedua);
        int hasil = AngkaPertama + AngkaKedua;
        textHasil.setText("" + hasil);
    }

    private void prosesKurang() {
         //Pemberian Validasi ke Text Field
        if (textAngkaPertama.getText().equals("") && textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 dan 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaPertama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }
        
        labelOperasi.setText("-");
        String strAngkaPertama = textAngkaPertama.getText();
        String strAngkaKedua = textAngkaKedua.getText();
        int AngkaPertama = Integer.parseInt(strAngkaPertama);
        int AngkaKedua = Integer.parseInt(strAngkaKedua);
        int hasil = AngkaPertama - AngkaKedua;
        textHasil.setText("" + hasil);
    }

    private void prosesKali() {
         //Pemberian Validasi ke Text Field
        if (textAngkaPertama.getText().equals("") && textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 dan 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaPertama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }
        
        labelOperasi.setText("x");
        String strAngkaPertama = textAngkaPertama.getText();
        String strAngkaKedua = textAngkaKedua.getText();
        int AngkaPertama = Integer.parseInt(strAngkaPertama);
        int AngkaKedua = Integer.parseInt(strAngkaKedua);
        int hasil = AngkaPertama * AngkaKedua;
        textHasil.setText("" + hasil);
    }

    private void prosesBagi() {
         //Pemberian Validasi ke Text Field
        if (textAngkaPertama.getText().equals("") && textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 dan 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaPertama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 1 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }else if (textAngkaKedua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kolom 2 Masih Kosong, Harap diisi Terlebih Dahulu!");
        }
        
        labelOperasi.setText("/");
        String strAngkaPertama = textAngkaPertama.getText();
        String strAngkaKedua = textAngkaKedua.getText();
        double AngkaPertama = Double.parseDouble(strAngkaPertama);
        double AngkaKedua = Double.parseDouble(strAngkaKedua);
        double hasil = AngkaPertama / AngkaKedua;
       
        
        if (AngkaKedua == 0) {
            textHasil.setText("error");
        }else {
            textHasil.setText("" + hasil);
        }
        
    }

    private void prosesKeluar() {
        boolean yakin = JOptionPane.showConfirmDialog(this, "Yakin mau Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ;
        if (yakin) {
            System.exit(0);
        }
    }

    private void prosesBersih() {
        textAngkaPertama.setText("");
        textAngkaKedua.setText("");
        textHasil.setText("");
        labelOperasi.setText("");
        textAngkaPertama.requestFocus();
    }
}
