package Pratikler;

import java.util.Scanner;

public class KDV_Tutari_Hesaplayan_Program {
    public static void main(String[] args){
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz:"); // Kullanıcıdan ücret tutarını girmesini iste
        tutar = inp.nextDouble(); // Girilen ücret tutarını oku

        kdvOran = (tutar > 0) && (tutar < 1000) ? 0.18 : 0.08; // Ücrete göre KDV oranını belirle
        kdvTutar = tutar + kdvOran; // KDV tutarını hesapla
        kdvliTutar = tutar + kdvTutar; // KDV dahil tutarı hesapla

        System.out.println("KDV'siz tutarınız:" + tutar); // KDV'siz tutarı ekrana yazdır
        System.out.println("KDV(%18) Dahil tutarınız:" + kdvliTutar); // KDV dahil tutarı ekrana yazdır
        System.out.println("KDV tutarınız:" + kdvTutar); // KDV tutarını ekrana yazdır
    }

}
