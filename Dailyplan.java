package MTN;

import java.util.Scanner;

public class Dailyplan {
    void Dailyplay() {
        int Option;
        int Question;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Buy Data Plans");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("4.2-3Month");
        System.out.println("5.Always ON");
        System.out.println("6.Broadband");
        System.out.println("7.Family Packs");
        System.out.println("8.Hot Deals");
        System.out.println("9.5G Plans");
        System.out.println("0.Back");
        Option = scanner.nextInt();

        switch (Option) {
            case 1:

                Dataplan2 Day = new Dataplan2();
                Day.showDetailse();
                break;
            case 2:
                weekly nw = new weekly();
                nw.showDetail();
                break;
            case 3:
                Monthly monthly = new Monthly();
                monthly.showDetail();
                break;
            case 4:
                System.out.println("Oops,looks like the code you used was \n" +
                        "incorrect.Please check and try again");
                break;
            case 5:
                System.out.println("Y'ello you are not eligible for this plan");
                break;
            case 6:
                broadband bb = new broadband();
                bb.showDetail();
                break;
            case 7:
                System.out.println("Dont have any family pack");
                break;
            case 8:
                HotPlan Hp = new HotPlan();
                Hp.showDetails();
                break;
            case 9:
                YOUTUBE YT = new YOUTUBE();
                YT.showDetail();
                break;
            case 0:
                menu menu = new menu();
                menu.showDetail();


        }
        System.exit(0);

    }

}