package Pratikler;
import java.util.Scanner;
public class HarmonicSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, i;
        double sum = 0;

        System.out.print("Harmonik serisinin hangi sayısını bulmak istersiniz?: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++){
            sum = sum + 1.0 / i;  // Her döngü adımında 1/i ifadesini toplama ekliyoruz.
        }

        System.out.println("Sum: " + sum);  // Toplam sonucunu ekrana yazdırıyoruz.
    }

}
