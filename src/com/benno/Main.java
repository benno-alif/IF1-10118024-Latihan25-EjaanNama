package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Mengeja Nama
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.nextLine();
        String[] namaArr = nama.split("");

        System.out.println();
        System.out.println("Ejaan untuk \"" + nama + "\" adalah : ");
        for (String i : namaArr){
            System.out.println("Huruf ke-" + (num++) + " : "  + i);
        }
    }
}
