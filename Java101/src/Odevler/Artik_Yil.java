package Odevler;
import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args){
        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int years = scanner.nextInt();

        //artık yılı belirlemek için gerkli koşullar belirlenir.
        if(years % 4 == 0 || years % 100 == 0 && years % 400 == 0) {
            System.out.println(years + " bir artık yıldır");

        }else {
            System.out.println(years + " bir artık yıl değildir");
        }
    }
}
