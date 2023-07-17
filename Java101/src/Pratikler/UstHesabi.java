package Odevler;
import java.util.Scanner;

public class Recursive_UstAlma {
    // İki sayının üssünü hesaplayan metot
    static int pow(int a, int b) {
        // Eğer üs (b) sıfırsa, tabanın (a) 1 olduğunu döndür
        if(b == 0) {
            return 1;
        }
        else {
            // Tabanı (a) b kez çarpan ve sonucu döndüren metot
            return a * pow(a, b-1);
        }
    }

    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için bir Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Taban Değeri:");  // Taban değerini kullanıcıdan al
            int a = input.nextInt();
            System.out.print("Üs:");  // Üs değerini kullanıcıdan al
            int b = input.nextInt();
            System.out.println("Cevap: " + pow(a, b));  // Sonucu ekrana yazdır
        }
    }
}
