package MTN;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your MTN ussd code");
        String input = scanner.nextLine();
        String i = "*131#";
        String code = "*312#";
        if (input == i) {
            Display display = new Display();
            display.showDetail();

        } else if (input == code) {
            Display display = new Display();
            display.showDetail();

        } else {
            System.out.println("Oops,looks like the code you used was\n" +
                    "incorrect and try again");
        }


    }


}
