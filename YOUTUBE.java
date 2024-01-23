package MTN;

import java.util.Scanner;

public class YOUTUBE {
    void showDetail() {
        System.out.println("1.N5000 for 20GB");
        System.out.println("2.N6000 for 25GB");
        System.out.println("3.N10000 for 40GB");
        System.out.println(" 4.N15000 for 75GB");
        System.out.println(" 5.N20000 for 120GB");
        System.out.println("6 .N30000 for 200GB");
        System.out.println("7.N20000 for 100GB");
        System.out.println(" 0.Back");
        Scanner scanner = new Scanner(System.in);
        int Option;
        Option = scanner.nextByte();
        switch (Option) {
            case 1:
                System.out.println("Are You Want To Confirm This Plan ");
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
                System.out.println("Are You Want To Confirm This Plan ");
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
                System.out.println("Are You Want To Confirm This Plan ");
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
                System.out.println("Are You Want To Confirm This Plan ");
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
                System.out.println("Are You Want To Confirm This Plan ");
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
                System.out.println("Are You Want To Confirm This Plan ");
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
                System.out.println("Are You Want To Confirm This Plan ");
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

            case 0:
                Dailyplan Dp = new Dailyplan();
                Dp.Dailyplay();

        }
        System.exit(0);
    }
}
