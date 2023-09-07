package Pratikler;

import java.util.Arrays;

public class tekraredenCiftsayi {
    public static void main(String[] args) {
        int[] numbers = {21, 31, 43, 24, 34, 22, 24, 54, 76, -54, 56, 34, 0, 234};
        System.out.println("Dizi : " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sıralı : " + Arrays.toString(numbers));

        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    counter++;
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Kurala uygun çift sayı yok.");
        }
    }
}