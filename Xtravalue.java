package MTN;

import java.util.Scanner;

public class Xtravalue {
    void showDetail() {
        System.out.println("This Plan gives U airtime for Natl & Int'l calls plus\n data after " +
                "subscribing to bundle plan");
        System.out.println("  1.XtraTalk");
        System.out.println("   2.XtraData");
        System.out.println("3.Eligible Int'l Destinations");
        System.out.println("        00.MainMenu");
        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                System.out.println("Oops,looks like the code you used was\n" +
                        "incorrect and try again");
                break;
            case 2:
                System.out.println("You can't access XtraData ");
                break;
            case 3:
                System.out.println("Kindly contact the customer care");
                break;
            case 00:
                menu menu = new menu();
                menu.showDetail();
                System.exit(0);
        }
    }
}
