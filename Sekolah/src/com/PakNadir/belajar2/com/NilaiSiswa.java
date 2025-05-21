package com.PakNadir.belajar2.com;

public class NilaiSiswa {
    public static void main(String[] args) {
        // Array 2 dimensi: 3 siswa x 4 mata pelajaran
        int[][] nilai = {
            {80, 90, 85, 88}, // Nilai Siswa 1
            {78, 85, 82, 90}, // Nilai Siswa 2
            {92, 88, 95, 91}  // Nilai Siswa 3
        };

        String[] mataPelajaran = {"Matematika", "Fisika", "Kimia", "Biologi"};

        // Menampilkan header tabel dengan lebar kolom yang sama
        System.out.printf("%-12s", "Siswa");
        for (String mapel : mataPelajaran) {
            System.out.printf("%-15s", mapel);
        }
        System.out.println();

        // Menampilkan nilai-nilai siswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("%-12s", "Siswa " + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("%-15d", nilai[i][j]);
            }
            System.out.println();
        }
    }
}
