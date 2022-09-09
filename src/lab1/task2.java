package lab1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a and b that a < b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (b >= a){
            System.out.println(Math.pow(b, 2));
            b--;
        }

    }
}
