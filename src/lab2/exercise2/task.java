package lab2.exercise2;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write the issue number");
            String letter = scanner.nextLine();
            System.out.println("Write the string");
            String str  = scanner.nextLine();
            switch (letter) {
                case ("1"):
//                    int i = str.charAt("x");   concat
                    String[] input = {""};
                    String subs;
                    String subsF;
                    input = str.split("(?!^)");
                    for (int i = 0; i < input.length; i++){
                        if (input[i].equals("y")){
//                            substring
                            subsF = str.substring(0, i+1) + "x";
                            subs = str.substring(i+1);
                            str = subsF + subs;

                        }
                    }
                    System.out.println(str);
                    break;
                case ("2"):
                    System.out.println("Length = " + str.length());
                    break;
                case ("3"):
//                    charAT
                    System.out.println("Enter a substring");
                    String substring = scanner.nextLine();
                    System.out.println(str.replace(substring, ""));
                    break;
                case ("4"):
                    System.out.println("First index of x = " + (str.indexOf("x") + 1) + ", last index of x = " + (str.lastIndexOf("x") + 1));
                    break;
            }
        } while (true);
    }
}
