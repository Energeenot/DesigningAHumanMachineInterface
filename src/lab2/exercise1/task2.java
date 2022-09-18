package lab2.exercise1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write count elements in array");
        int n = scanner.nextInt();
        int max_n = -999999999;
        int[] array = new int[n];
        int place;
        int placeForMAxN = 0;
        System.out.println("Write elements");
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (array[i] > max_n){
                max_n = array[i];
                placeForMAxN = i;
            }
        }
        place = array[0];
        array[placeForMAxN] = place;
        array[0] = max_n;
        for (int i = 0; i < n; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

}
