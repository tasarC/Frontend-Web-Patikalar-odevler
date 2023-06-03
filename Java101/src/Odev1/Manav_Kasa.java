package Odev1;
//Scanner modülü import edildi.
import java.util.Scanner;
public class Manav_Kasa {
    public static void main(String[] args) {
        
        // Değişkenler tanımlandı.
        double armut ,elma ,domates ,muz,patlican,total;
        
        //Scannner sınıfı tanımlandı.
        Scanner inp = new Scanner(System.in);
        
        //Kullanıcıdan her bir değer için  veri isteği alınır.
        System.out.print("Armut Kaç Kilo ?:");
        armut = inp.nextInt();
        
        System.out.print("Elma Kaç Kilo ?:");
        elma = inp.nextInt();
        
        System.out.print("Domates Kaç Kilo ?:");
        domates = inp.nextInt();
        
        System.out.print("muz Kaç Kilo ?:");
        muz = inp.nextInt();
        
        System.out.print("Patlıcan Kaç Kilo ?:");
        patlican = inp.nextInt();

        // Ürün adeti ve ürün fiyatlarını çarparak toplam tutar elde edilir.
        total = (armut*2.24 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5);

        System.out.println("Toplam Tutarınız:" + total);
    }
}
