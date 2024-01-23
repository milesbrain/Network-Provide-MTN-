package MTN;

import java.util.Scanner;

public class DataConfirm {
    void showConfirm() {
        int Option;
        System.out.println("Are You Sure You Want to Comfirm This Data Plan");
        System.out.println("1.Confirm");
        System.out.println("2.Not Confirmed");
        Scanner scanner = new Scanner(System.in);
        Option = scanner.nextInt();
        switch (Option) {
            case 1:
                System.out.println("Your Data Plan is successful");
                break;
            case 2:
                System.out.println("Your Data Plan is not successful");
                break;
        }
    }
}
