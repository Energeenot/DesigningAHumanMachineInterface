package lab3;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Write the issue number");
            String letter = scanner.nextLine();
            System.out.println("Write the string");
            String str  = scanner.nextLine();
            String[] str1 = str.split(" ");
            switch (letter){
                case ("1"):
                    System.out.println("Enter a substring");
                    String substring = scanner.nextLine();
                    for (int i = 0; i < str1.length; i ++){
                        if (str1[i].contains(substring)){
                            System.out.println(str1[i]);
                        }
                    }
                    break;
                case ("2"):
                    String str3 = "";
                    System.out.println("Enter a symbol");
                    String symbol = scanner.nextLine();
//                    String[] str1 = str.split(" ");
                    for (int i = 0; i < str1.length; i++) {
                        if (str1[i].endsWith(symbol)) {
                            str1[i] = "";
                        }
                    }
                    str = "";
                    for (int i = 0; i < str1.length; i ++){
                        str3 = str3 + " " + str.concat(str1[i]);
                    }
                    System.out.println(str3);
                    break;
            }
        }while (true);
    }
}
