package Odevler;

public class Asal_Sayi {
    public static void main(String[] args){

        System.out.println("1 ile 100 Arası Asal Sayılar");
        //Asal sayıların bulunabilinmesi için  gerekli koşullar sağlanır.
        for (int i = 2; i <= 100; i++) {
            int n = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    n++;
                }
            }
            if (n<=2){

                System.out.print(i+"-");
            }
        }

    }
}
