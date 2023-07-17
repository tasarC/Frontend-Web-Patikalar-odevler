package Pratikler;

public class Polidrom_Sayi {
    static String isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        // Sayının her basamağını ters çevirerek palindrom olup olmadığını kontrol ediyoruz.
        while (temp != 0) {
            lastNumber = temp % 10;  // Son basamağı alıyoruz
            reverseNumber = (reverseNumber * 10) + lastNumber;  // Tersine çevrilen sayıya son basamağı ekliyoruz
            temp /= 10;  // Sayıyı bir basamak sağa kaydırıyoruz
        }

        // Kontrol sonucuna göre sonuç döndürülüyor
        if (number == reverseNumber) {
            return number + " palindrom bir sayıdır.";
        } else {
            return number + " palindrom bir sayı değildir.";
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(1001));  // 1001 sayısı için palindrom kontrolü yapılıyor
    }

}
