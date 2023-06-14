package Odevler;

import java.util.Scanner;
public class Ters_Ucgen {
    public static void main(String[] args){

        int number,i,j;
        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        number = input.nextInt();

        //ters üçgen yapımında gerekli işlemler.
        for(i=1;i<=number;i++){
            for(j=number; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
