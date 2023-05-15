package Pratikler;

import java.util.Scanner;
public class Daireninalani_Cevresi {
    public static void main(String[] args){
        int r;
        double p = 3.14 ;

        Scanner inp = new  Scanner(System.in);
        System.out.print("Dairenin yarıçap uzunluğunu giriniz:");
        r = inp.nextInt();

        double alan = p * r* r;
        double cevre = 2 * p * r;
        System.out.println("Dairenin Alanı:" +alan);
        System.out.println("Dairenin Çevresi:" +cevre);

    }
}
