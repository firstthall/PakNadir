package com.PakNadir.belajar2.com;

public class Array2d_2 {
    public static void main(String[] args) {
        String[][] negara = new String[5][2];
        negara[0][0] = "Indonesia";
        negara[0][1] = "Jakarta";
        negara[1][0] = "Jepang";
        negara[1][1] = "Tokyo";
        negara[2][0] = "Kanada";
        negara[2][1] = "Ottawa";
        negara[3][0] = "Austria";
        negara[3][1] = "wina";
        negara[4][0] = "Iran";
        negara[4][1] = "Teheran";
        String namaNegara;
        for (int baris=0; baris< negara.length;baris++){
            namaNegara = negara[baris][0];
            if (namaNegara.charAt(0)== 'I')
            System.out.println(negara[baris][0]+ " - " + negara[baris][1]);
        }
    }
}
