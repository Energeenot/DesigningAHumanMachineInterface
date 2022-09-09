package lab1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case("a"):
                String a = "5 ";
                for(int i = 0; i <= 4; i++){
                    System.out.println(a.repeat(i) + "\n");
                }
                break;
            case("b"):
                int b =1;
                int x;
                System.out.println(b);
                b++;
                for (int i = 0; i < 4; i++){
                    System.out.print(b);
                    x = b - 1;
                    while (x >= 1){
                        System.out.print(" " + x);
                        x--;
                    }
                    b++;
                    System.out.println();
                }
        }
    }
}
