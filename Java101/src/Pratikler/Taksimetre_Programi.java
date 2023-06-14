package Pratikler;

import java.util.Scanner;
public class Taksimetre_Programi {
    public static void main(String[] args){
        int km; // Toplam kilometreyi tutmak için bir değişken tanımlanır.
        double perkm = 20, total, starttotal = 10; // Kilometre başına ücret, toplam ücret ve başlangıç ücreti tanımlanır.

        Scanner inp = new Scanner(System.in); // Kullanıcıdan giriş almak için bir Scanner nesnesi oluşturulur.
        System.out.print("Mesafeyi(km) Giriniz:");
        km = inp.nextInt(); // Kullanıcının girdiği kilometre bilgisi km değişkenine atanır.

        total = km * perkm; // Toplam ücret hesaplanır: kilometre başına ücret ile toplam kilometre çarpılır.
        total += starttotal; // Başlangıç ücreti toplam ücrete eklenir.

        total = total < 20 ? 20 : total; // Eğer toplam ücret 20'den küçükse, toplam ücret 20 olarak ayarlanır.

        System.out.println("Toplam Tutar:" + total);
    }

}
