package Pratikler;

import java.util.Scanner;
public class Ciftsayi_Bulma {
    public static void main(String[] args){
        int uppNumber, i, total=0, commonNumber=0, avarege;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        uppNumber=inp.nextInt();

        for(i=1;i<=uppNumber;i++){
            if(i%3==0 && i%4==0){
                commonNumber++;
                total+=i;

                System.out.println(i);
            }
        }
        avarege=total/commonNumber;
        System.out.println("Girdiğiniz sayıya kadar, 3 ile 4'e bölünen sayilarin totalı: "+total);
        System.out.println("irdiğiniz sayıya kadar, 3 ile 4'e bölünen sayilarin ortalaması: "+avarege);
    }
}
