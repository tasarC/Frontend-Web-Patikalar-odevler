package Pratikler;

import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fiz,turkce,kimya,tarih,musik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fiz = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        musik = inp.nextInt();

        int toplam = (mat+fiz+turkce+kimya+tarih+musik);
        double sonuc = toplam/6;

        System.out.println("Not ortalamanız:" + sonuc);
        System.out.print(sonuc>60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");



    }
}
