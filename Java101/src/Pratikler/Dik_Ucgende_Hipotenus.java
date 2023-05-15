package Pratikler;

import java.util.Scanner;

public class Dik_Ucgende_Hipotenus {
    public static void  main(String[] args){
        int a,b;
        double c;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz:");
        a = inp.nextInt();
        System.out.print("2. Kenarı giriniz:");
        b = inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs =" + c);
    }
}
