package Odev1;

import java.util.Scanner;
public class Vucutkitle_İndeksi {
    public static void main(String[] args){
        double index ,boy,kilo;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boy uzunluğunuzu(metre cinsinden) giriniz:");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu(kg) giriniz:");
        kilo = inp.nextDouble();

        index = kilo/(boy*boy);
        System.out.print("Vücüt Kitle İndexsiniz:" + index);
    }
}
