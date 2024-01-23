package MTN;

import java.util.Scanner;
import java.util.concurrent.Delayed;

public class Business_Plan {
    void showDetail() {
        System.out.println("1.BizPlus Bundles & VAS");
        System.out.println(" 2.ThryveBundles & VAS");
        System.out.println(" 3.Broadband Bundles");
        System.out.println("4.Enterprise Wifi Bundles");
        System.out.println("    5.Data Coupon");
        System.out.println("6.Check balance");
        System.out.println("7.Mifi\n");
        getDetails();
    }

    void getDetails() {
        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                int Quadri;


                System.out.println("1.Social Media Bundles");
                System.out.println("2.Special Data Bundles");
                System.out.println(" 3.Time-based bundles");
                System.out.println("     4.Voice Bundles");
                System.out.println("5.Update BizPlus VAS Elements");
                System.out.println("     0.Back\n");

                Quadri = scanner.nextInt();
                if (Quadri == 1) {
                    System.out.println("Sucessfully Data Plan");
                    break;
                } else if (Quadri == 2) {
                    System.out.println("Sucessfully Data Plan");
                    break;

                } else if (Quadri == 3) {
                    System.out.println("Successfully Data Plan");
                    break;
                } else if (Quadri == 4) {
                    System.out.println("Successfully Data Plan");
                    break;
                } else if (Quadri == 5) {
                    System.out.println(" Your Update Bizplus is Successful");
                    break;
                } else {
                    Business_Plan BP = new Business_Plan();
                    BP.showDetail();
                }
                break;
            case 2:

                int qw;
                System.out.println("1.BizPlus Basic 1GB @ N350 for 3days");
                System.out.println("2.BizPlus Standard 2GB @ N600 for 7days");
                System.out.println("3.BizPlus Basic 4GB @ N1000 for 14days");
                int Quadris;
                Quadris = scanner.nextInt();
                if (Quadris == 1) {
                    System.out.println("Sucessfully Data Plan");
                    break;
                } else if (Quadris == 2) {
                    System.out.println("Sucessfully Data Plan");
                    break;
                } else {
                    System.out.println("Oops,looks like the code you used was\n " +
                            "incorrect and try again");
                }
                break;
            case 3:
                System.out.println("1.Capped Plans");
                System.out.println("2.Unlimted Plans");
                System.out.println("3.Top-up Plans");
                System.out.println("4.Capped Plans + Voice");
                System.out.println("5.Capped Plans + Showmax");
                System.out.println("6.Broadband Points balance");

                int Options;
                Options = scanner.nextInt();
                switch (Options) {
                    case 1: {
                        System.out.println("1.Monthly Bundles");
                        System.out.println("2.2Months Bundle");
                        System.out.println("3.3Months Bundle");
                        System.out.println("4.6Months Bundle");


                        System.out.println("system error,error code = 4313 ");
                    }
                    break;
                    case 2:
                        int play;
                        System.out.println("1.Weekly Bundle");
                        System.out.println("2.Monthly Bundles");
                        play = scanner.nextInt();
                        if (play == 1) {
                            System.out.println("Sucessfully Data Plan");
                            break;
                        } else if (play == 2) {
                            System.out.println("Sucessfully Data Plan");
                            break;
                        } else {
                            System.out.println("system error,error code = 4313 ");

                        }
                        break;
                    case 3:
                        System.out.println("1.  N2,000 for 6GB");
                        System.out.println("2.  N4,000 for 12GB");
                        int lk;
                        lk = scanner.nextInt();
                        if (lk == 1) {
                            System.out.println("Sucessfully Data Plan");
                            break;
                        } else if (lk == 2) {
                            System.out.println("Sucessfully Data Plan");
                            break;
                        } else {
                            System.out.println("system error,error code = 4313 ");

                        }
                        break;
                    case 4:
                        int Basic;
                        System.out.println("             1.45GB FMB Plan + 100 mins @N11,000 fot 30\n" +
                                "days");
                        System.out.println(" 2.      200GB FMB Plan + 175 minus @N25,000 f0r 30\n days   ");
                        System.out.println("          00.MainMenu");
                        Basic = scanner.nextInt();
                        switch (Basic) {
                            case 1:
                                System.out.println("You are not qualified for this plan");
                                break;
                            case 2:
                                System.out.println("You are not qualified for this plan");
                                break;
                            case 00:
                                menu menu = new menu();
                                menu.showDetail();
                                break;
                            default:
                                System.out.println("system error,error code = 4313 ");
                        }
                        break;
                    case 5:
                        System.out.println("You are not eligible for this plan");
                        break;
                    case 6:
                        System.out.println("your data balance will be send to you shortly");
                        break;
                }
            case 4:
                int Basic;
                System.out.println("             1.Basic plan (Indoor)");
                System.out.println(" 2.      Advanced plan(Indoor_512 users)      ");
                System.out.println("3.    Advanced plan (Outdoor_256 users      ");
                System.out.println("          4.Top-up plan");
                Basic = scanner.nextInt();
                switch (Basic) {
                    case 1:
                        System.out.println("You are not qualified for this plan");
                        break;
                    case 2:
                        System.out.println("You are not qualified for this plan");
                        break;
                    case 3:
                        System.out.println("Kindly visit your nearest MTN store");
                        break;
                    case 4:
                        System.out.println("You are not eligible for this plan");
                        break;
                    default:
                        System.out.println("system error,error code = 4313 ");

                }
                break;
            case 5:
                System.out.println("1.Redeem Data Coupon");
                System.out.println(" 2.Data Coupon status");
                System.out.println("00.MainMenu");
                int love;
                love = scanner.nextInt();
                switch (love) {
                    case 1:
                        System.out.println("You are not eligible for this Data Coupon");
                        break;
                    case 2:
                        System.out.println("You are not eligile for this Data Coupon");
                        break;
                    case 00:
                        menu menu = new menu();
                        menu.showDetail();
                }
                break;
            case 6:
                System.out.println("You dont have any data plan");
            case 7:
                System.out.println("1.Capped Bundles");
                System.out.println("2.Unlimited Bundles");
                System.out.println("00.MainMenu");
                int num;
                num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("You can't access to this bundle");
                        break;
                    case 2:
                        System.out.println("You can't access to this bundle");
                        break;
                    case 00:
                        menu menu = new menu();
                        menu.showDetail();

                }
                System.exit(0);

        }
    }
}




