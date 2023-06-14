package Pratikler;

import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayı : ");
        a = input.nextInt(); // İlk sayıyı kullanıcıdan al

        System.out.print("İkinci Sayı : ");
        b = input.nextInt(); // İkinci sayıyı kullanıcıdan al

        System.out.print("Üçüncü Sayı : ");
        c = input.nextInt(); // Üçüncü sayıyı kullanıcıdan al

        if ((a < b) && (a < c)) { // a, b ve c'den daha küçükse
            if (b < c) { // b, c'den daha küçükse
                System.out.println("a < b < c"); // a < b < c yazdır
            } else {
                System.out.println("a < c < b"); // a < c < b yazdır
            }
        } else if ((b < a) && (b < c)) { // b, a ve c'den daha küçükse
            if (a < c) { // a, c'den daha küçükse
                System.out.println("b < a < c"); // b < a < c yazdır
            } else {
                System.out.println("b < c < a"); // b < c < a yazdır
            }
        } else {
            if ((c < a) && (c < b)) { // c, a ve b'den daha küçükse
                System.out.println("c < a < b"); // c < a < b yazdır
            } else {
                System.out.println("c < b < a"); // c < b < a yazdır
            }
        }
    }

}
