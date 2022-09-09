package lab1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write x, y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = min((3 + x), (2 + y)) + min((x - y), (x + y));
        System.out.println(z);
    }

    public static int min(int x, int y){
        int c = x;
        if (c > y){
            c = y;
        }
        return c;
    }
}
