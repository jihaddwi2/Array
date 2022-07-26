/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilaiMax, jumlah, a, posisi = 1, array[];
        Scanner scan = new Scanner(System.in);

        System.out.println("masukan banyak nya angka: ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("masukkan " + jumlah + "angka");

        for (a = 0; a < jumlah; a++) {
            System.out.print("kata ke " + (a + 1) + ":");
            array[a] = scan.nextInt();
        }

        nilaiMax = array[0];
        for (a = 0; a < jumlah; a++) {
            if (array[a] > nilaiMax) {
                nilaiMax = array[a];
                posisi = a + 1;
            }
        }
        System.out.println("Nilai Maximum Adalah " + nilaiMax + " berada pada indeks ke - " + posisi);
        
    }
    
}
