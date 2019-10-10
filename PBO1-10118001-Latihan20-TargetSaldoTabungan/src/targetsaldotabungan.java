/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Memnbuat program target saldo tabungan
 */
public class targetsaldotabungan {
  
    public static void main(String[] args) {
          int saldo = 3500000;
          double saldotarget = 6000000;
          double saldosekarang = saldo;
          double bunga = 0.08;
          int bulan = 1;
          do{
              saldosekarang += saldosekarang * bunga;
              //menggunakan format
              System.out.printf("Saldo di bulan ke-%d Rp. %.0f\n", bulan, saldosekarang); 
              bulan++;
          } 
          while (saldosekarang < saldotarget);
    }
}
