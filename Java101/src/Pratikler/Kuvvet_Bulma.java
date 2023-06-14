package Pratikler;
import java.util.Scanner;
public class Kuvvet_Bulma {
    public static void main(String[] args){
        int number, i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:"); // Kullanıcıdan bir sayı istenir.
        number = inp.nextInt(); // Girilen sayıyı 'number' değişkenine atar.

        System.out.println("4 ve 5'in katları:");
        for(i = 0; i <= number; i++){
            if(i % 4 == 0 && i % 5 == 0){ // 'i' sayısı hem 4'e hem de 5'e tam bölünüyorsa,
                System.out.print(i + "-"); // 'i' sayısını ekrana yazdırır.
            }
        }
    }

}
