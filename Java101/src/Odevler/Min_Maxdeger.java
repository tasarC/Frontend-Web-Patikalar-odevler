package Odevler;

import java.util.Scanner;
public class Min_Maxdeger {
    public static void main(String[] args){
        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner inp=new Scanner(System.in);

        int count;//sayaç
        int number;// girilendeğerimiz

        //max min değeri hesaplamak için kullanılan yöntem.
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        count=inp.nextInt();

        //max min değeri bulmak için gerekli koşullar sağlanır.
        for(int i=1;i<=count;i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = inp.nextInt();
            if(number>max) max=number;
            else if(number<min) min=number;
        }
        System.out.println("en büyük sayı: "+max);
        System.out.println("en küçük sayı: "+min);
    }
}
