package Pratikler;

import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        String userName ="patika", truePassword ="java1234", password ="";


        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String inputUsername = inp.nextLine();

        System.out.print("Şifre: ");
        String inputPassword = inp.nextLine();

        // Kullanıcı adı ve şifrenin doğru girilip girilmediğini kontrol ediyoruz
        if (inputUsername.equals(userName) && inputPassword.equals(truePassword)) {
            System.out.println("Giriş başarılı!");
        }
        // Kullanıcı adı doğru ancak şifre yanlışsa
        else if (inputUsername.equals(userName)) {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (Y/N): ");
            String resetPassword = inp.nextLine();

            // Şifre sıfırlama isteğini kontrol ediyoruz
            if (resetPassword.equalsIgnoreCase("Y")) {
                System.out.print("Yeni Şifre: ");
                String newPassword = inp.nextLine();

                // Yeni şifrenin eski şifre veya mevcut şifreyle aynı olup olmadığını kontrol ediyoruz
                if (newPassword.equals(inputPassword) || newPassword.equals(truePassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen eski şifreden farklı başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}
