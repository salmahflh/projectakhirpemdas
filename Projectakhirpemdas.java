package com.mycompany.projectakhirpemdas;
import java.util.Scanner;
public class Projectakhirpemdas {

public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang di Pemesanan Tiket Kursi Theater!");
        System.out.println("Tersedia 25 kursi, 5 baris kebelakang (A,B,C,D,E) dan 5 baris kesamping (1,2,3,4,5)");
        System.out.println("Berapa Jumlah Kursi yang Anda Inginkan = ");
        int jumlahkursi = input.nextInt();input.nextLine();
        System.out.println("Silahkan pilih kursi yang anda ingin kan dengan kombinasi angka dan huruf. (ex: A1)");
        String kursi = input.nextLine();
        String[] namakursi = kursi.split(" ");

        String kolom [][] = new String[5][5];
        for (int e = 0; e < 5; e++) {
            for (int a = 0; a < 5; a++){
                kolom[e][a] = "o";
            
            }
        }
        for (int e = 0; e < jumlahkursi; e++) {
            char barishuruf = namakursi[e].charAt(0);
            String barisangka = namakursi[e].substring(1,2);
            int barisangka2 = Integer.valueOf(barisangka);
            switch (barishuruf) {
                case 'A':
                case 'a':
                    kolom[0][barisangka2-1] = "x";
                    break;
                case 'B':
                case 'b':
                    kolom[1][barisangka2-1] = "x";
                    break;
                case 'C':
                case 'c':
                    kolom[2][barisangka2-1] = "x";
                    break;
                case 'D':
                case 'd':
                    kolom[3][barisangka2-1] = "x";
                    break;
                case 'E':
                case 'e':
                    kolom[4][barisangka2-1] = "x";
                    break;
            }
        }
        System.out.printf("  1 2 3 4 5\nA %s %s %s %s %s\nB %s %s %s %s %s\nC %s %s %s %s %s\nD %s %s %s %s %s\nE %s %s %s %s %s\n  L-A-Y-A-R", kolom[0][0], kolom[0][1], kolom[0][2], kolom[0][3], kolom[0][4], kolom[1][0], kolom[1][1], kolom[1][2], kolom[1][3], kolom[1][4], kolom[2][0], kolom[2][1], kolom[2][2], kolom[2][3], kolom[2][4], kolom[3][0], kolom[3][1], kolom[3][2], kolom[3][3], kolom[3][4], kolom[4][0], kolom[4][1], kolom[4][2], kolom[4][3], kolom[4][4]);
    }
}