package Odevler;

import java.util.Scanner;
public class Mukemmmel_Sayi {
    public static void main(String[] args){
        int number,i,count=0;
        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        //mükemmmel sayı bulmak için gerekli koşullar belirlenir.
        for(i=1; i<number; i++){
            if(number%i == 0){
                count+=i;
            }
        }
        if(count == number){
            System.out.print(number + " Mükemmel sayıdır.");
        }
        else{
            System.out.print(number +" Mükemmel sayı değildir.");
        }
    }
}
