package Odevler;
import java.util.Scanner;

public class Recursive_Asalsayi {
    
    // "prime" fonksiyonu, verilen sayının asal olup olmadığını kontrol eder.
    // Fonksiyon, num ve i parametrelerini alır.
    static int prime(int num, int i) {
        // İndeks 1 olduğunda, bu durumda i sayısı num sayısına eşittir.
        // Bu durumda num sayısının kendisiyle kontrol edilmesi gerektiği anlaşılır.
        // Bu nedenle, 1 değeri döndürülür.
        if (i == 1) {
            return 1;
        } else {
            // num sayısı, i'ye bölündüğünde tam bölünüyorsa (kalan = 0),
            // sayı asal değildir. 0 değeri döndürülür.
            if (num % i == 0) {
                return 0;
            } else {
                // Eğer sayı tam bölünmüyorsa, fonksiyon kendini çağırır
                // ve i değerini bir azaltarak işlemi tekrarlar.
                return prime(num, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        int num, prime;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz: ");
        num = scanner.nextInt();

        // prime değişkeni, prime fonksiyonuna gönderilen parametrelerle doldurulur.
        prime = prime(num, num / 2);

        // prime değişkeni 1 ise, sayı asaldır.
        if (prime == 1) {
            System.out.println(num + " sayısı asaldır.");
        } else {
            // prime değişkeni 1 değilse, sayı asal değildir.
            System.out.println(num + " sayısı asal değildir.");
        }
    }
}
