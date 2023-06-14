package Odevler;

import java.util.Scanner;
public class Vucutkitle_İndeksi {

    public static void main(String[] args){
        //gerekli parametreler tanımlanır.
       double index ,boy,kilo;

        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boy uzunluğunuzu(metre cinsinden) giriniz:");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu(kg) giriniz:");
        kilo = inp.nextDouble();

        //index hesabı için gerkli işlem.
        index = kilo/(boy*boy);
        System.out.print("Vücüt Kitle İndexsiniz:" + index);




    }
}
