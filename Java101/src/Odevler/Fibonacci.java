package Odevler;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        int n,i,sum=0;
        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Elemanlı Fibonacci Serisi:");
        n = input.nextInt();
        int s1=0;
        int s2=1;
        //fibonacci değerlerinin bulunabilinmesi için  gerekli koşullar belirlenir.
        for(i=1;i<=n;i++){
            System.out.print(s1 + " ");
            sum = s1+s2;
            s1=s2;
            s2=sum;
        }
    }
}
