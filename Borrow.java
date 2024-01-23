package MTN;

import java.util.Scanner;

public class Borrow extends broadband {
    void showDetails() {
        System.out.println("1,Borrow Airtime");
        System.out.println(" 2.Borrow Data");
        System.out.println("  3.Recharge");
        System.out.println("      0.Back");
        getDetail();

    }

    void getDetail() {
        Scanner scanner = new Scanner(System.in);
        int Option;
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                System.out.println("You are not eligible to borrow yet");
                break;
            case 2:
                System.out.println("You are not eligible,not have after 2 months");
                break;
            case 3:
                menu main = new menu();
                main.showDetail();
                break;
            case 4:
                Borrow borrow = new Borrow();
                borrow.showDetails();
                break;
            default:

                System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                System.exit(0);
        }


    }

}
