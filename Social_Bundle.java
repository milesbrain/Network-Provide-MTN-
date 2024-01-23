package MTN;

import java.util.Scanner;
import java.util.Set;

public class Social_Bundle {
    void showDetail() {
        System.out.println("1.WhatsApp");
        System.out.println("2.Facebook");
        System.out.println("3.Instagram");
        System.out.println("   4.TikTok");
        System.out.println("   5.Ayoba");
        System.out.println("6.All Social Bundles");
        System.out.println("7.YouTube,Instagram,and TikTok");
        System.out.println("8.Opera Mini & News");
        System.out.println("9.Social Mega bundle");
        getDetail();

    }

    void getDetail() {
        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                int Question;


                System.out.println("        WhatsApp       ");
                System.out.println("1.Daily @ N25 for 25MB");
                System.out.println("2.Weekly @ N50 for 50MB ");
                System.out.println("3.Monthly @ N150 for 150MB");
                System.out.println("     0.Back");
                Question = scanner.nextInt();
                if (Question == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (Question == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (Question == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;


                }


            case 2:
                int lookman;
                System.out.println(" 2.Facebook ");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                lookman = scanner.nextInt();
                if (lookman == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                } else if (lookman == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                } else if (lookman == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();

                }
            case 3:
                int usman;
                System.out.println(" 3.Instagram ");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                usman = scanner.nextInt();
                if (usman == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (usman == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (usman == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;
                }
            case 4:
                int lookmans;
                System.out.println(" 4.TikTok");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                lookmans = scanner.nextInt();
                if (lookmans == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (lookmans == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (lookmans == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;
                }
            case 5:
                int ltookmans;
                System.out.println(" 5.Ayoba ");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                ltookmans = scanner.nextInt();
                if (ltookmans == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (ltookmans == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (ltookmans == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;
                }
            case 6:
                int elookmans;
                System.out.println(" 6.All social Bundles");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                elookmans = scanner.nextInt();
                if (elookmans == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (elookmans == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (elookmans == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;

                }
            case 7:
                int slookmans;
                System.out.println(" 7.YouTube,Instagram,and TikTok");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                slookmans = scanner.nextInt();
                if (slookmans == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (slookmans == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (slookmans == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;
                }
            case 8:
                int susmans;
                System.out.println(" 8.Opera Mini & News");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                susmans = scanner.nextInt();
                if (susmans == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (susmans == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (susmans == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;
                }
            case 9:
                int sylookmans;
                System.out.println(" 8.Social Mega bundle");
                System.out.println("1.Daily @N25 for 25MB");
                System.out.println("2.Weekly @N50 for 50MB");
                System.out.println("3.Monthly @N150 for 150MB");
                System.out.println("       0.Back");
                slookmans = scanner.nextInt();
                if (slookmans == 1) {

                    System.out.println("Your Daily Social_Bundle plan is successful ");
                    break;
                } else if (slookmans == 2) {
                    System.out.println("Your Weekly Social_Bundle plan is successful ");
                    break;
                } else if (slookmans == 3) {

                    System.out.println("Your Monthly Social_Bundle plan is successful");
                    break;
                } else {
                    Social_Bundle Sb = new Social_Bundle();
                    Sb.showDetail();
                    break;
                }


        }
        System.exit(0);
    }
}