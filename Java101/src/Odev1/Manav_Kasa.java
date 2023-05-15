package Odev1;
import java.util.Scanner;
public class Manav_Kasa {
    public static void main(String[] args) {

        double armut ,elma ,domates ,muz,patlican,total;

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

        total = (armut*2.24 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5);

        System.out.println("Toplam Tutarınız:" + total);
    }
}
