package MTN;

import java.util.Scanner;

public class Videopack {
    void showDetails() {
        System.out.println("     Video Streaming Packs   ");
        System.out.println("1.Youtube video Packs");
        System.out.println("2.1GB(Youtube Only) + 500MB(Data access)");
        System.out.println("      3.Showmax Mobile");
        getDetails();
    }

    void getDetails() {
        int Option;
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                int Hour;
                System.out.println("1.1hours @N50 for 400MB");
                System.out.println("2.3hours @N130 for 1.2GB");
                System.out.println("3.500MB @ N50 (12am- 5am)");
                System.out.println("4.2GB Weekly @ N200 (11pm-6am) ");
                System.out.println("5.Check Balance");
                Hour = scanner.nextInt();
                switch (Hour) {
                    case 1:
                        System.out.println("Your N50 for 400MB 1 Hour streaming \n" +
                                "on youtube is sucessful");
                        break;
                    case 2:
                        System.out.println("Your N130 for 1.2GB 3 Hour streaming on youtube is sucessful");
                        break;
                    case 3:
                        System.out.println("Your N130 for 1.2GB 5 Hours streaming on youtube is sucessful");
                        break;
                    case 4:
                        System.out.println("Your N200 for 2GB 5 Hours streaming on youtube is sucessful");
                        break;
                    case 5:
                        System.out.println("Y'ello! , you do not have any data plans");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                        break;
                }
            case 2:
                int Balance;
                System.out.println("      Buy youtube Plus to enjoy 1GB for streaming on \n Youtube" +
                        "and 500MB to browse the internet.");
                System.out.println("1. N500 for Youtube Plus(2-Week Plan ");
                System.out.println("2.Check Balance");
                Balance = scanner.nextInt();
                switch (Balance) {
                    case 1:
                        System.out.println("Your N500 for the purchase of Youtube Plus 2-Week\n" +
                                "        is successful");
                        break;
                    case 2:
                        System.out.println("You don't have a data plan yet");
                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");
                        break;
                }
                break;
            case 3:
                System.out.println("Select a plan for content + access on Showmax\n");
                System.out.println("        1.Showmax(Movies,Series & Kids)");
                System.out.println("2.Showmax Pro(Live Football,movies,Series & \n" +
                        "Kids");
                System.out.println("               3.Check Balance");
                int Data = scanner.nextInt();
                switch (Data) {
                    case 1:
                        System.out.println("Select a Showmax monthly bundle option");
                        System.out.println("       1.Access only @N1200");
                        System.out.println("   2.Access + 2.5GB @ N1700");
                        System.out.println("   3.Access + 5.5GB @ N2200");
                        int access = scanner.nextInt();
                        switch (access) {
                            case 1:
                                System.out.println("Y'ello Your showmax monthly bundle is not successful");
                                break;
                            case 2:
                                System.out.println("Y'ello Your showmax monthly bundle is successful");
                                break;
                            case 3:
                                System.out.println("Y'ello Your showmax monthly bundle is successful");
                                break;
                        }
                    case 2:
                        System.out.println("You can't access this bundle");
                        break;
                    case 3:
                        System.out.println("Sorry,You do not have any showmax monthly bundle");
                        break;
                }

        }

    }
}

