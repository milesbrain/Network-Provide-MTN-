package MTN;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int Option;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Our code have changed.For\n");
        System.out.println(" 1.Data Plans 312");
        System.out.println(" 2.Recharge 311");
        System.out.println(" 3.Borrow Airtime 303");
        System.out.println(" 4.Data Bal 323");
        System.out.println(" 5.Acct Bal 310");
        System.out.println(" 6.MTN share 321");
        System.out.println(" 7.VAS 305");
        System.out.println(" 8.NIN 996\n");
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                Dataplans Dp = new Dataplans();
                Dp.showDetail();

                break;
            case 2:
                System.out.println("Y'ello, kindly dial *311*rechage pin# to " +
                        "recharge\n your account.Thank you.");
                break;
            case 3:
                System.out.println("Y'ello,You are not eligible for this plan\n Thank you");
                break;
            case 4:
                System.out.println("Dear Customer,you don't have any active data\n" +
                        " bundle.Please dial *312*1# to buy another\n    data bundle");
                break;
            case 5:
                System.out.println("Kindly dial *310# to check your account \n balance,thank you.");
                break;
            case 6:
                DataShare dataShare = new DataShare();
                dataShare.Datashare();
                break;
            case 7:
                int option;


                System.out.println("Welcome to the MTN Lifestyle & Rich Media\n" +
                        "           Services Menu");
                System.out.println(" Reply with a number to manage your: ");
                System.out.println("     1.Active services");
                System.out.println("     2.New Services ");

                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("You've been a registered service user ");
                        break;
                    case 2:
                        System.out.println("Y'ello Kindly contact the customer's care ");

                        break;
                    default:
                        System.out.println("Oops,looks like the code you used was\nincorrect and try again");


                }
                break;
            case 8:
                System.out.println("Dear Customer,Kindly dial *996# to link NIN,\n " +
                        "               Thank you");
                break;
            default:
                System.out.println("Oops,looks like the code you used was\nincorrect and try again  ");

        }


    }

}
