package MTN;

import java.util.Scanner;

public class DataTransfer {
    void showDetails() {
        System.out.println("    1.Transfer from Data Balance");
        System.out.println("      2.Buy for a friend     ");
        System.out.println("3.Request from a friend");
        System.out.println("4.view Pending Request");
        System.out.println("   0.Back");
        getDetail();

    }

    void getDetail() {
        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                int Amountshare;

                System.out.println("enter recipient's number");
                String Question = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Select amount of data you want to transfer.\nMaximum daily" +
                        "transfer is 3GB\n");
                System.out.println("           1.50MB ");
                System.out.println("           2.100MB ");
                System.out.println("           3.200MB ");
                System.out.println("           4.5000mB ");
                System.out.println("           0.Back  ");
                Amountshare = scanner.nextInt();
                switch (Amountshare) {
                    case 1:
                        System.out.println("You've shared 50MB ");
                        break;
                    case 2:
                        System.out.println("You've shared 100MB ");
                        break;
                    case 3:
                        System.out.println("You've shared 200MB ");
                        break;
                    case 4:
                        System.out.println("You've shared 500MB ");
                        break;
                    case 0:
                        DataTransfer DT = new DataTransfer();
                        DT.showDetails();
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                }
                break;

            case 2:
                int Options;
                System.out.println("Welcome to MTN Data Gifting.select data plan \n" +
                        "                to gift:");
                System.out.println("1.    Data Plans");
                System.out.println(" 2.Social Bundles");
                System.out.println("3.Videopack");
                Options = scanner.nextInt();
                switch (Options) {
                    case 1:
                        System.out.println("You are not eligible for this plan yet");
                        break;
                    case 2:
                        System.out.println("You are not eligible for this plan yet");
                        break;
                    case 3:
                        System.out.println("You are not eligible for this plan yet");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");

                }
                break;
            case 3:
                System.out.println("To Request Data from a friend enter phone\n number " +
                        "(e.g 08xxxxxxxxxxx)");
                String Request;
                Request = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Y'ello! Your request for data to phone number\n" +
                        Request + "has been delivered");
                break;
            case 4:
                System.out.println("Y'ello! You have no pending request.Thank you ");
                break;
            case 0: {
                menu menu = new menu();
                menu.showDetail();
            }


        }
        System.exit(0);
    }

}
