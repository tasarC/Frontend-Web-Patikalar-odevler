package Pratikler;

import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args){
        int num1, num2, select;

        Scanner inp = new Scanner(System.in);

        // 1. sayıyı kullanıcıdan alma
        System.out.print("Lütfen 1. sayıyı giriniz:");
        num1 = inp.nextInt();

        // 2. sayıyı kullanıcıdan alma
        System.out.print("Lütfen 2. sayıyı giriniz:");
        num2 = inp.nextInt();

        System.out.println("Uygulanabilir işlemler:");
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");

        // Yapılacak işlemi seçme
        System.out.print("Yapacağınız işlemi belirleyiniz: ");
        select = inp.nextInt();

        switch (select){
            case 1:
                // İki sayının toplama işlemi
                System.out.println("İki sayının toplama sonucu="+ (num1+num2));
                break;
            case 2:
                // İki sayının çıkarma işlemi
                System.out.println("İki sayının çıkarma sonucu: " + (num1 - num2));
                break;
            case 3:
                // İki sayının çarpma işlemi
                System.out.println("İki sayının çarpım sonucu: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    // Eğer ikinci sayı 0 ise bölme işlemi geçersizdir.
                    System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                }
                // İki sayının bölme işlemi
                System.out.println("İki sayının bölüm sonucu: " + (num1 / num2));
                break;
            default:
                // Yanlış seçim yapıldığında
                System.out.println("Yanlış seçim yaptınız!");
        }
    }

}
