package Pratikler;

import java.util.Arrays;
import java.util.Scanner;

public class diziMinMax {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int min = number;
        int max = number;
        // Dizimizi küçükten büyüğe sıralıyoruz
        Arrays.sort(list);
        System.out.println("Sıralı : " + Arrays.toString(list));

       // En yakın büyük ve küçük sayıları bulma
        for (int tmp : list) {
            if (tmp > number) {
                max = tmp;
                break;
            } else if (tmp < number) {
                min = tmp;
            }
        }

        System.out.println("En Yakın Büyük Sayı: " + max);
        System.out.println("En Yakın Küçük Sayı: " + min);

    }

}
