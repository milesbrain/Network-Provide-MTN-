package MTN;

import java.util.Scanner;

public class broadband {
    void showDetail() {
        System.out.println("Link Device");
        System.out.println("2.Recharge Device");
        System.out.println("Buy Data Bundle on Device");
        System.out.println("4.Check Device Balance");
        System.out.println("5.view & Unlink Device");
        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                System.out.println("Link Device");
                break;
            case 2:
                System.out.println("No Mifi Consumer attached");
                break;
            case 3:
                System.out.println("You are not eligible for this");
                break;
            case 4:
                System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                break;
            case 5:
                System.out.println("Unlink Device");
                System.out.println("View Device");
                System.exit(0);

        }

    }
}
