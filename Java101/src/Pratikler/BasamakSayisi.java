package Pratikler;

import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String[] args) {
        int i, h, t, o, sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        i = input.nextInt(); // Kullanıcıdan bir sayı girişi alınıyor.

        h = i / 100; // Sayının yüzler basamağı hesaplanıyor.
        t = (i / 10) % 10; // Sayının onlar basamağı hesaplanıyor.
        o = i % 10; // Sayının birler basamağı hesaplanıyor.

        sum = h + t + o; // Basamakların toplamı hesaplanıyor.

        System.out.println("Yüzler basamağı: " + h);
        System.out.println("Onlar basamağı: " + t);
        System.out.println("Birler basamağı: " + o);
        System.out.println("Total: " + sum); //
    }
}

