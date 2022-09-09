package lab1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Write two different numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(f(x));
        System.out.println(f(y));
    }

    public static int f(int x){
        if (x % 2 == 0){
            return (x / 2);
        } else {
            return (0);
        }
    }
}
