package lab2.exercise1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write count elements in array");
        int n = scanner.nextInt();
        double arithmetic_mean = 0;
        int[] array = new int[n];
        System.out.println("Write elements");
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            arithmetic_mean += array[i];
        }
        arithmetic_mean = arithmetic_mean/n;
        System.out.println("Arithmetic mean = " + arithmetic_mean);

    }

}
