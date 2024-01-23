package MTN;

import java.util.Scanner;

public class Roaming {
    void showDetail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.TravelPass Plans");
        System.out.println("  2.Data Hybrid");
        System.out.println("3.Inflight Roaming Data");
        System.out.println("4.Free incoming roaming call");
        System.out.println(" 5.Int'l Calling Bundle");
        System.out.println("6.Roaming Balance Check");
        getDetail();

    }

    void getDetail() {
        Scanner scanner = new Scanner(System.in);

        int Option;
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                System.out.println("1.7days(Voice) 90mins/250SMS @N5000");
                System.out.println("2.14days(Voice+Data) 110mins/300SMS +\n 1GB @ N10,000");
                System.out.println("    3.7days 1GB Data @ N5000");
                System.out.println("4.Eligible Destination");
                int Question;
                Question = scanner.nextInt();
                switch (Question) {
                    case 1:
                        System.out.println("Enjoy up to 90mins OR 250SMS with 7days\n Tr" +
                                "avelPass plan @ N5000,Successful");
                        break;
                    case 2:
                        System.out.println("Oops,looks like the code you used was \n incorrect and try again");
                        break;
                    case 3:
                        System.out.println("Enjoy up to 7days 1GB Data with 7days\n  @ N5000,Successful");
                        break;
                    case 4:
                        System.out.println("You are not eligible for this plan");
                        break;
                    case 5:

                        System.out.println("Oops,looks like the code you used was\n incorrect and try again");

                }
                break;
            case 2:
                System.out.println("Use your local data bundle while roaming at no\n addditional cost");
                System.out.println("1..Eligible Bundles");
                System.out.println("2.Eligible Designation");
                System.out.println("99.MainMenu");
                int play;
                play = scanner.nextInt();
                switch (play) {
                    case 1:
                        System.out.println("Your Eligible Bundle is successful");
                        break;
                    case 2:
                        System.out.println("Haven't be qualified yet for this");
                        break;
                    case 99:
                        menu menu = new menu();
                        menu.showDetail();

                }
                break;
            case 3:
                System.out.println("1.50MB @N2,000");
                System.out.println("2.View Airlines");
                int ol;
                ol = scanner.nextInt();
                switch (ol) {
                    case 1:
                        System.out.println("Your data is successful");
                    case 2:
                        System.out.println("You are not eligible for this");
                }
                break;
            case 4:
                System.out.println("      1.Check Eligibity");
                System.out.println("     2.Eligible Destinations ");
                System.out.println("  3. Check free incoming minutes");

                System.out.println("   Oops,looks like the code you used was\nincorrect and try again ");
                break;
            case 5:
                System.out.println("1.Subscrbe to Int'I Calling Bundle");
                System.out.println("2.Eligible Countries (Bundle application to\n selected network in destinations" +
                        "listed)");
                int rice = scanner.nextInt();
                switch (rice) {
                    case 1:
                        System.out.println("Your Subscrbe to Int'I Calling Bundle is sucessful");
                        break;
                    case 2:
                        System.out.println("Cant access this plan");
                        break;
                }
            case 6:
                System.out.println("Dear customer,you don't have any active data\n bundle.please" +
                        "dial *312*1# to buy another \n data bundle");
                break;
            default:
                System.out.println("Oops,looks like the code you used was\nincorrect and try again");

        }
    }
}
