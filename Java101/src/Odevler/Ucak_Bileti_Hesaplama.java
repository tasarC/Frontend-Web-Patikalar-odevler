package Odevler;
import java.util.Scanner;

public class Ucak_Bileti_Hesaplama {
    public static void main(String[] args){
        //gerekli parametreler tanımlanır.
        double distance, price;
        short flyType, age;

        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz (km): ");
        distance = input.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        flyType = input.nextShort();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextShort();

        //uçak bileti hesabı için gerekli işlem ve koşullar yazılır.
        if (distance > 0 && age > 0 && (flyType == 1 || flyType == 2)) {
            price = 0.10 * distance;
            if (age < 12) {
                price *= 0.5;
            } else if (age < 25) {
                price *= 0.9;
            } else if (age > 65) {
                price *= 0.7;
            }
            if(flyType == 2){
                price *= 0.8;
                price *= 2;
            }
            System.out.println("Toplam Tutar: " + price + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}
