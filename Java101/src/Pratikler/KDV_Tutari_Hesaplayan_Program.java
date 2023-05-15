package Pratikler;

import java.util.Scanner;

public class KDV_Tutari_Hesaplayan_Program {
    public static void main(String[] args){
        double tutar, kdvOran ,kdvTutar ,kdvliTutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz:");
        tutar = inp.nextDouble();
        kdvOran = (tutar>0) && (tutar<1000) ? 0.18 : 0.08;
        kdvTutar = tutar + kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutarınız:" + tutar);
        System.out.println("KDV(%18) Dahil tutarınız:" + kdvliTutar);
        System.out.println("KDV tutarınız:" + kdvTutar);

    }
}
