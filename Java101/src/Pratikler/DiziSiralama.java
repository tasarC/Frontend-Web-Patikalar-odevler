package Pratikler;
import java.util.Scanner;
import java.util.Arrays;
public class DiziSiralama {
    public static void main(String[] args) throws Exception {
      // kullanıcıdan değer almak için kullanılan fonksiyon 
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = inp.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Eleman: ");
            list[i] = sc.nextInt();
        }
      //dizinin sıralı şeklini almak için kullanılan fonksiyon
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
