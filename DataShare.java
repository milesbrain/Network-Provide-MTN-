package MTN;

import java.util.Scanner;

public class DataShare {
    void Datashare() {
        System.out.println("Welcome to Airtime and Data Transfer/Gift\n " +
                "service.Please select the service to transfer/ \n              gift");
        System.out.println("1.Airtime Share");
        System.out.println("  2.Gift Data   ");
        System.out.println("3.SME Data Share");
        shareAirtime();

    }

    void shareAirtime() {
        Scanner scanner = new Scanner(System.in);
        int Option;
        Option = scanner.nextInt();
        switch (Option) {
            case 1:

                System.out.println("MTN Share n Sell");

                System.out.println("1.Transfer Airtime");
                System.out.println(" 2.Change PIN");
                System.out.println("  3.Forgot PIN");
                System.out.println("   4.Create PIN");
                System.out.println("      5.Help  ");
                System.out.println("system error,error code = 4313");
                break;
            case 2:
                System.out.println("1.Transfer from Data Balance");
                System.out.println("   2.Buy for a Friend");
                System.out.println("3.Request from a Friend");
                System.out.println("4.View Pending Request");
                System.out.println("    0.Back");
                System.out.println("system error,error code = 4313");
                break;
            case 3:
                System.out.println("1.Buy SME DataShare");
                System.out.println("2.Pin Retrieval & Reset");
                System.out.println("   3.Check balance");
                System.out.println("4.share Data to Others");
            default:
                System.out.println("Oops,looks like the code you used was \nincorrect" +
                        " Please check and try again");


        }

    }
}
