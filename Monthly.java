package MTN;

import java.util.Scanner;

public class Monthly {
    void showDetail() {
        System.out.println("1.N1000 for 1.5GB");
        System.out.println("2.N1200 for 2GB");
        System.out.println("3.N1500 for 3GB");
        System.out.println("4.N2000 for 4.5GB");
        System.out.println("5.N1500 for 5GB");
        System.out.println("6.N2500 for 6GB");
        System.out.println("7.N3500 for 12GB");
        System.out.println("8.N3500 for 15GB");
        System.out.println("0.Back");
        getDetail();
    }

    void getDetail() {
        Scanner scanner = new Scanner(System.in);
        int Option;
        Option = scanner.nextByte();
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
            case 8:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int ciboi = scanner.nextInt();
                switch (ciboi) {
                    case 1:
                        System.out.println("Your Data Plan is Successful");
                        break;
                    case 2:
                        System.out.println("Your Data Plan is not Successful");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                }
            case 0:
                Dailyplan Dp = new Dailyplan();
                Dp.Dailyplay();
                System.exit(0);


        }

    }
}