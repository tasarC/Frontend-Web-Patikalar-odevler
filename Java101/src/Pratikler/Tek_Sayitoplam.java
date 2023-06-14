package Pratikler;
import java.util.Scanner;
public class Tek_Sayitoplam {
    public static void main(String[] args){
        int number,counter=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir Sayı Giriniz: ");
            number = input.nextInt();

            if (number % 4 == 0){
                counter += number;
            }

        } while (number % 2 == 0);
        System.out.println("Sonuc: " + counter);
    }
}
