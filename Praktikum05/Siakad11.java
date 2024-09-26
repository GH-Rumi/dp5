package Praktikum05;
import java.util.Scanner;
public class Siakad11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) 
        {
            System.out.println("Nilai huruf A");
            System.out.println("Kualifikasi sangat baik");
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) 
        {
            System.out.println("Nilai huruf B+");
            System.out.println("Kualifikasi lebih dari baik");    
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) 
        {
            System.out.println("Nilai huruf B");
            System.out.println("Kualifikasi baik");    
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) 
        {
            System.out.println("Nilai huruf C+");
            System.out.println("Kualifikasi lebih dari cukup");    
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) 
        {
            System.out.println("Nilai huruf C");
            System.out.println("Kualifikasi cukup");    
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) 
        {
            System.out.println("Nilai huruf D");
            System.out.println("Kualifikasi kurang");    
        }
        else if (nilaiAkhir >= 39) 
        {
            System.out.println("Nilai huruf E");
            System.out.println("Kualifikasi Gagal");    
        }
    }
}