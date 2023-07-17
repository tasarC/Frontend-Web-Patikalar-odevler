package Pratikler;

import java.util.Scanner;

public class Geklismis_Hesap_Makinesi {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: "); // Kullanıcıdan sayı alınır
            number = scan.nextInt();
            if (number == 0) { // Eğer girilen sayı 0 ise döngüden çıkılır
                break;
            }
            result += number; // Girilen sayılar toplanır
        }
        System.out.println("Sonuç: " + result); // Toplam sonucu ekrana yazdırılır
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: "); // Kullanıcıdan kaç adet sayı gireceği istenir
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: "); // Kullanıcıdan sayı alınır
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number; // İlk sayı hariç diğer sayılar çıkartılır
        }

        System.out.println("Sonuç: " + result); // Sonucu ekrana yazdırılır
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: "); // Kullanıcıdan sayı alınır
            number = scan.nextInt();

            if (number == 1) // Eğer girilen sayı 1 ise döngüden çıkılır
                break;

            if (number == 0) { // Eğer girilen sayı 0 ise sonuç 0 olur ve döngüden çıkılır
                result = 0;
                break;
            }
            result *= number; // Girilen sayılar çarpılır
        }

        System.out.println("Sonuç: " + result); // Çarpım sonucu ekrana yazdırılır
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: "); // Kullanıcıdan kaç adet sayı gireceği istenir
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: "); // Kullanıcıdan sayı alınır
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number; // İlk sayı hariç diğer sayılarla bölme işlemi yapılır
        }

        System.out.println("Sonuç: " + result); // Sonucu ekrana yazdırılır
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: "); // Kullanıcıdan taban değeri istenir
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: "); // Kullanıcıdan üs değeri istenir
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base; // Taban, üs kadar çarpılır
        }

        System.out.println("Sonuç: " + result); // Sonucu ekrana yazdırılır
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: "); // Kullanıcıdan sayı istenir
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i; // Sayının faktöriyeli hesaplanır
        }

        System.out.println("Sonuç: " + result); // Sonucu ekrana yazdırılır
    }

    static void mod() {
        int result, number1, number2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Modunu almak istediğiniz sayıyı giriniz: ");
        number1 = inp.nextInt();
        System.out.print("Hangi sayıya göre modunu almak istiyorsunuz: ");
        number2 = inp.nextInt();
        result = number1 % number2; // İki sayının modu hesaplanır
        System.out.println(number1 +" sayısının " +number2 +" sayısına göre modu: " + result); // Sonucu ekrana yazdırılır
    }

    static void calc() {
        int min, max, area, env;
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        max = inp.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        min = inp.nextInt();
        area = max * min; // Dikdörtgenin alanı hesaplanır
        env = 2 * (min + max); // Dikdörtgenin çevresi hesaplanır
        System.out.println("Dikdörtgenin alanı: " + area); // Alan ekrana yazdırılır
        System.out.println("Dikdörtgenin çevresi: " + env); // Çevre ekrana yazdırılır
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
