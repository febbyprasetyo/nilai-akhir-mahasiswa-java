package matakuliah.java;

import java.util.Scanner;
public class Matakuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, uts, uas, angka;
        String matkul;
        
        System.out.println("===== PROGRAM DAFTAR NILAI MAHASISWA =====");
        System.out.println("Masukkan Nama Matakuliah");
        matkul = input.nextLine();
        System.out.println("Masukkan Nilai Tugas");
        tugas = input.nextDouble();
        System.out.println("Masukkan Nilai UTS");
        uts = input.nextDouble();
        System.out.println("Masukkan Nilai UAS");
        uas = input.nextDouble();
       
        System.out.println("---------------------------------");
        System.out.println("===== NILAI AKHIR MAHASISWA =====");
        System.out.println("---------------------------------");
        angka = (tugas * 30) / 100 + (uts * 30) / 100 + (uas * 40) / 100;
        System.out.println("Matakuliah   : "+matkul);
        System.out.println("Nilai Tugas  : "+tugas);
        System.out.println("Nilai UTS    : "+uts);
        System.out.println("Nilai UAS    : "+uas);
        System.out.println("Nilai Angka  : "+angka);
        if (angka > 80) {
            System.out.println("Nilai Huruf  : A");
        } else {
            if (angka > 60) {
                System.out.println("Nilai Huruf  : B");
            } else {
                if (angka > 40) {
                    System.out.println("Nilai Huruf  : C");
                } else {
                    if (angka > 20) {
                        System.out.println("Nilai Huruf  : D");
                    } else {
                        System.out.println("Nilai Huruf  : E");
                    }
                }
            }
        }
    }
}
