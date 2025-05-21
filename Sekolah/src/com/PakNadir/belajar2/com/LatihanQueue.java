package com.PakNadir.belajar2.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LatihanQueue {
    String str;
    int num;
    public static void main(String[] args) {
        LatihanQueue q = new LatihanQueue();
    }
    public LatihanQueue () {
        try {
            LinkedList <Integer> list = new LinkedList<Integer>();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("jumlah data : ");
            str = bf.readLine();
            if ((num = Integer.parseInt(str))== 1){
                System.out.println("anda menekan angka 1");
                System.exit(0);
            }
            else{
                for (int i = 1; i <= num; i ++){
                    System.out.println("masukkan elemen" + i + ":");
                    str = bf.readLine();
                    int n = Integer.parseInt(str);
                    list.add(n);
                }
            }
            System.out.println("isi queue : " + list);
            System.out.println("elemen Pertama: " + list.removeFirst());
            System.out.println("Elemen Terakhir: " + list.removeLast());
            System.out.print("Elemen Tengah : ");
            while (!list.isEmpty()) {
               System.out.print(list.remove() + " "); 
            }
            System.out.println(" ");    
        } catch (Exception e) {
            System.out.println(e.getMessage()+ "adalah String");
            System.exit(num);
        }
    }
}