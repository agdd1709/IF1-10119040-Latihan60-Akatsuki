/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menempilkan anggota akatsuki yang terdapat di anime naruto
 * dengan metode pendekatan berbasis objek
 */
public class IF110119040Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public String nama;
    public static void main(String[] args) {
        Akatsuki akatsuki = new AnggotaAkatsuki();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama anggota akatsuki yang ingin anda cari : ");
        akatsuki.setNama(input.next());
        System.out.println();
        akatsuki.tampil();
    }
    
}
