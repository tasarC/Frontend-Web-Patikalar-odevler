public class Main {
    public static void main(String[] args) {
        //dizi tanımlama 
        double[] list = {1, 2, 3, 4, 5};
        //dizinin elemanlarının toplamının tutulacağı bir parametre
        double sum = 0;

        //hormonik ortalamanın bulunması için gereken işlemler
        for (int i = 0; i < list.length; i++) {
            sum += 1 / list[i];
        }
        
        System.out.println("Dizinin Harmonik Ortalama Sonucu: " + list.length / sum);
    }
}
