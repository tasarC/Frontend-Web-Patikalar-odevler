package Pratikler;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args){
        int n, r, i, a, nf = 1, rf = 1, af = 1, c;
        Scanner input = new Scanner(System.in);
        
        // Kümenin eleman sayısını kullanıcıdan al
        System.out.print("Küme kaç elemanlı olsun: ");
        n = input.nextInt();
        
        // Farklı grupların eleman sayısını kullanıcıdan al
        System.out.print("Kaç elemanlı farklı grupları olsun: ");
        r = input.nextInt();

        // n faktöryelini hesapla
        for(i = n; i > 0; i--){
            nf = nf * i;
        }

        // r faktöryelini hesapla
        for(i = r; i > 0; i--){
            rf = rf * i;
        }

        // a değerini hesapla (n - r)
        a = n - r;

        // a faktöryelini hesapla
        for(i = a; i > 0; i--){
            af = af * i;
        }

        // Kombinasyon formülüne göre hesapla: c = n! / (r! * (n-r)!)
        c = nf / (rf * af);
        
        // Sonucu ekrana yazdır
        System.out.print(c);
    }
}

