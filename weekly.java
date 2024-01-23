package MTN;

import java.util.Scanner;

public class weekly {
    void showDetail() {
        System.out.println("     1.N300 for 350MB");
        System.out.println("2.N500 for 750M (14days)");
        System.out.println("3.N500 for 750MB + N500(14days)");
        System.out.println("4.N500 for 1GB");
        System.out.println("5.N1,000 for 2GB ");
        System.out.println("6.N1,800 for 7GB");
        System.out.println("7.N1,500 for 6GB");
        Scanner scanner = new Scanner(System.in);
        int Option = scanner.nextInt();
        switch (Option) {
            case 1:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int boi = scanner.nextInt();
                switch (boi) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                }
                break;
            case 2:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int bov = scanner.nextInt();
                switch (bov) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");

                }
                break;
            case 3:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int bot = scanner.nextInt();
                switch (bot) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                }
                break;
            case 4:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int boo = scanner.nextInt();
                switch (boo) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                        break;
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                        break;
                }
                break;
            case 5:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int bof = scanner.nextInt();
                switch (bof) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                        break;
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                        break;
                }
                break;
            case 6:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int boui = scanner.nextInt();
                switch (boui) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                        break;
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                        break;
                }
                break;
            case 7:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int cboi = scanner.nextInt();
                switch (cboi) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                        break;
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                }
                break;

            default:
                System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                System.exit(0);


        }

    }
}
