package Pratikler;

import java.util.Scanner;

public class Sinif_Gecme {
    public static void main(String[] args) {
        int mat, fiz, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        if(mat >= 0 && mat <=100){}else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            mat=0;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fiz = inp.nextInt();
        if(fiz >= 0 && fiz <=100){}else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            fiz=0;
        }

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();
        if(turkce >= 0 && turkce <=100){}else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            turkce=0;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        if(kimya >= 0 && kimya <=100){}else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            kimya=0;
        }

        System.out.print("Müzik notunuzu giriniz:");
        muzik = inp.nextInt();
        if(muzik >= 0 && muzik <=100){}else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir." );
            muzik=0;
        }

        double avarage = (mat + fiz + turkce + kimya + muzik) / 5;

        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız! ");
        } else {
            System.out.println("Tebrikler Sınıfı geçtiniz! ");

        }
        System.out.println("Ortalamanız " + avarage);
        System.out.println("**************************");
        System.out.println("DipNot:\n55 puan ve altı ortalamalar başarısız sayılmaktadır.");

    }
    }
