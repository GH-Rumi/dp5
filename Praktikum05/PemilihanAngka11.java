package Praktikum05;

import java.util.Scanner;

public class PemilihanAngka11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil;
        hasil = (angka % 2) == 0 ? " bilangan genap" : " bilangan ganjil";
        System.out.println(angka + " adalah" + hasil);

    }
}