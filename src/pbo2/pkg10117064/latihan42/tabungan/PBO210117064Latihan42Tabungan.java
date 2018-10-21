/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk mengetahui sisa saldo 
 * yang ada setelah di ambil.
 */
public class PBO210117064Latihan42Tabungan {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tbg = new Tabungan (sc.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int y = tbg.ambilUang(sc2.nextInt());
        System.out.println("Saldo anda sekarang : " + (tbg.getSaldo() - tbg.ambilUang(y)));
        
    }
    
}
