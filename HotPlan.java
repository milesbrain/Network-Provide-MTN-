package MTN;

import java.util.Scanner;

public class HotPlan {
    void showDetails() {
        System.out.println("New Xtravalue Plans");
        System.out.println(" 1.N500- 750MB+N500 Talktime.Val /14days ");
        System.out.println(" 2.N1000-1.5GB+N1000 Talktime.Valid 30days");
        System.out.println("3.N2000-4.5GB +N2000 Talktime.val/30days");
        System.out.println(" 0.Back");

        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int boi = scanner.nextInt();
                switch (boi) {
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
            case 2:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int bov = scanner.nextInt();
                switch (bov) {
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
            case 3:
                System.out.println("Are You Want To Confirmed This Plan ");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int bot = scanner.nextInt();
                switch (bot) {
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
            case 4:
                Dailyplan Dp = new Dailyplan();
                Dp.Dailyplay();
        }
        System.exit(0);
    }

}
