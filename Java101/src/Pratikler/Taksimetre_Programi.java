package Pratikler;

import java.util.Scanner;
public class Taksimetre_Programi {
    public static void main(String[] args){
        int km;
        double perkm =20,total,starttotal =10;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi(km) Giriniz:");
        km = inp.nextInt();

        total = km*perkm;
        total += starttotal;

        total = total<20?20:total;
        System.out.println("Toplam Tutar:"+ total);
    }
}
