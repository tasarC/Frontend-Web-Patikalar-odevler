package Odevler;
import java.util.Scanner;

public class Recursive_Desen {

    static int pattern(int value, int temp, boolean stop) {
        System.out.print(value + " "); // x'i ekrana yazdır

        // value negatifse, sıfırsa veya durma koşulu sağlanmıyorsa
        if (value < 0 || value == 0 || !stop) {
            stop = false; // durma koşulunu devre dışı bırak
            // value, temp'ten farklı ise rekürsif olarak pattern metodunu çağır ve x'i 5 artır
            if (value != temp) {
                return pattern(value + 5, temp, stop);
            } else
                return 0;
        } else {
            // x'i 5 azaltarak rekürsif olarak pattern metodunu çağır
            return pattern(value - 5, temp, stop);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int value, temp;
        System.out.print("Bir Sayı Giriniz: ");
        value = inp.nextInt();
        pattern(value, temp = value, true);
    }
}
