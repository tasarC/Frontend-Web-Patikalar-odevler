package Pratikler;

import java.util.Scanner;
public class UsluSayı {
    public static void main(String[] args) {
        int d,u,c=1,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının üssünü almak istiyorsunuz: ");
        d = input.nextInt();
        System.out.print("Ne kadar üs almak istiyorsunuz: ");
        u = input.nextInt();

        for(k=u;k>0;k--){
            c = c * d;// Her döngü adımında çarpım gerçekleştirilerek üs hesaplanıyor.
        }

        System.out.print("Cevap: " + c);

    }
}
