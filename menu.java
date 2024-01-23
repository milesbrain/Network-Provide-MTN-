package MTN;

import java.util.Scanner;

public class menu {
    void showDetail() {
        System.out.println("1.Data Plans");
        System.out.println("2.Social Bundles");
        System.out.println("3.Business Plans");
        System.out.println(" 4.XtraValue ");
        System.out.println("5.Roaming/int'l");
        System.out.println("6.Borrow Credit/Recharge");
        System.out.println("7.Gift Data");
        System.out.println("8.Video Packs");

        getDetails();


    }

    void getDetails() {
        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        ;
        switch (Option) {
            case 1:
                Dailyplan Dp = new Dailyplan();
                Dp.Dailyplay();
            case 2:
                Social_Bundle SB = new Social_Bundle();
                SB.showDetail();
            case 3:
                Business_Plan Bp = new Business_Plan();
                Bp.showDetail();
            case 4:
                Xtravalue Xv = new Xtravalue();
                Xv.showDetail();
            case 5:
                Roaming RM = new Roaming();
                RM.showDetail();
            case 6:
                Borrow BF = new Borrow();
                BF.showDetails();
            case 7:
                DataTransfer Dt = new DataTransfer();
                Dt.showDetails();
            case 8:
                Videopack Vp = new Videopack();
                Vp.showDetails();
            default:
                System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                System.exit(0);

        }
    }
}