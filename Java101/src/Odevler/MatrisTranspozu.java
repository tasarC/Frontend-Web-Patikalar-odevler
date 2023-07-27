package Odevler;

import java.util.Arrays;

public class MarisTranspozu {
  
  //matrisin transpozunun görüntüleyecek fonksiyon
    static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };

      //transpozunun satır ve sütün sayılarını belirtildi.
        int[][] transpoze = new int[matrix[0].length][matrix.length];

      //transpoz değerlerini bulma
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris :");
        print(matrix);

        System.out.println("Transpoze :");
        print(transpoze);

    }
}
