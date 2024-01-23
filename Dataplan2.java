package MTN;

import java.util.Scanner;

public class Dataplan2 {
    void showDetailse() {
        int Option;
        System.out.println("1.N50 for 40MB");
        System.out.println("2.N100 for 100MB");
        System.out.println("3.N200 for 200MB");
        System.out.println("4.N300 for 1GB");
        System.out.println("5.N700 for 3GB");
        System.out.println("6.N500 for 3GB");
        System.out.println("7.N500 for 2GB");
        System.out.println("8.N500 for 2.5GB");
        System.out.println("0.Back");
        getDetails();


    }


    void getDetails() {
        Scanner scanner = new Scanner(System.in);
        int Option;
        Option = scanner.nextInt();
        switch (Option) {

            case 1, 2, 3, 4, 5, 6, 7, 8 -> {
                DataConfirm Dc = new DataConfirm();
                Dc.showConfirm();
                break;
            }


            case 0 -> {
                Dailyplan Ds = new Dailyplan();
                Ds.Dailyplay();
                System.exit(0);
            }

            default -> {
                System.out.println("system error,error code = 4313       ");
            }

        }


    }
}
