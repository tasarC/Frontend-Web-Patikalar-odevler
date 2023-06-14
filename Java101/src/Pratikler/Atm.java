package Pratikler;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        //gerekli parametreler tanımlanır.
        String username,password;

        // Kullanıcıdan girdi alabilmek için gerekli sınıf çağrılır.
        Scanner input = new Scanner(System.in);
        int right=3,select,price;
        double balance = 1498.76;


        while(right>0){
            System.out.print("Kullanıcı Adınız: ");
            username = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!\n");
                do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.print("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            right = 0;
                            break;
                        default:
                            System.out.print("Tekrar Görüşmek Üzere");
                    }
                }while(select!=4);
            }
            else{
                right--;
                if(right == 0){
                    System.out.print("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz!");
                }
                else{
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.!");
                    System.out.println("Kalan Hakkınız: " + right +"\n");
                }

            }
        }

    }
}
