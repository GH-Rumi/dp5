package Praktikum05;

import java.util.Scanner;

public class PemilihanHariDenganIf11 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hasil;
        int dayNumber;
        System.out.println("Input day number: ");
        dayNumber = sc.nextInt();
        if (dayNumber <= 5)
        {
            System.out.println(dayNumber + " is a weekday");
        }
        else if (dayNumber <= 7) 
        {
            System.out.println(dayNumber + " is a weekend");
        }
        else;

    }
}
