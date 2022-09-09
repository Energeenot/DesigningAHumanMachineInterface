package lab1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter) {
            case("a"):
                System.out.println("Write x, y");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                String result = getResult(x, y);
                System.out.println(result);
                break;
            case("b"):
                System.out.println("Write x, y");
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                String result1 = getResult1(x1, y1);
                System.out.println(result1);
                break;

        }
    }

    public static String getResult(int x, int y){
        if((x > 0 && x < 9) && (y > -9 && y < 9) && (x*x + y*y < 81)){
            return "Yes";
        }else if ((x < 0 && x > 9) && (y < -9 && y > 9) && (x*x + y*y > 81)) {
            return "No";
        }
        else{
            return "On the border";
        }
    }

    public static String getResult1(int x1, int y1){
        if((y1 >= 0) &((x1*x1 + y1 * y1 == 100) | (x1*x1 + y1*y1 == 25))){
            return "On the board";
        }else if ((y1 >= 0) & ((x1 * x1 + y1 * y1 == 100) & (x1 * x1 + y1 * y1 == 25))) {
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
