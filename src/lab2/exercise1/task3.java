package lab2.exercise1;

import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write count lines in matrix");
        int n = scanner.nextInt();scanner.nextLine();
        System.out.println("Write count columns in matrix");
        int z = scanner.nextInt();scanner.nextLine();
        int[][] matrix = new int[n][z];
//        System.out.println("Write elements");
        Random random = new Random();
        for (int i = 0; i < n; i++){
            for(int j = 0; j < z; j++){
                matrix[i][j] = random.nextInt(10);;
//                matrix[i][j] = scanner.nextInt();
            }

        }
        System.out.println("First matrix");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < z; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
//                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();

        }
//        for (int[] line : matrix){

//        }
        if(n % 2 == 0) {
            int k = 0;
            int l = 1;
            int temp;
            System.out.println("Another matrix");
            while (l != n+1){
                for (int i = 0; i < matrix[0].length; i++) {

                    // Swap two numbers
                    temp = matrix[k][i];
                    matrix[k][i] = matrix[l][i];
                    matrix[l][i] = temp;
                }
                k += 2;
                l += 2;
            }

            for (int i = 0; i < n; i++){
                for (int j = 0; j < z; j++){
                    System.out.print(matrix[i][j]);
                    System.out.print(" ");;
                }
                System.out.println();
            }
        }

    }
}
