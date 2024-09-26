package Praktikum05;

import java.util.Scanner;

public class KalahRateOff11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int usia;
    System.out.println("Masukkan usia: ");
    usia = sc.nextInt();
    if (usia <= 12 && usia >= 0) 
    {
        System.out.println("Adalah usia Anak");
    }
    else if (usia <= 19 && usia >= 13) 
    {
        System.out.println("Adalah usia Remaja");    
    }
    else if (usia <= 64 && usia >= 20) 
    {
        System.out.println("Adalah usia Dewasa");    
    }
    else if (usia > 64) 
    {
        System.out.println("Adalah usia Lansia");
    }   
    else
    {
        System.out.println("usia tidak dapat dibaca");
    }
}
}