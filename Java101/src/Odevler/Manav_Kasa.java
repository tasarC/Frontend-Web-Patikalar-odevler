package Odevler;
import java.util.Scanner;
public class Manav_Kasa {
    public static void main(String[] args) {

        //gerekli parametreler tanımlanır.
        double armut ,elma ,domates ,muz,patlican,total;

        //tanımlanan parametreler için  kullanıcıdan değer alınır.
        Scanner inp = new Scanner(System.in);
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

        //kullanıcıdan alınan değerler sonucu toplam tutar hesaplanır.
        total = (armut*2.24 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5);

        System.out.println("Toplam Tutarınız:" + total);
    }
}
