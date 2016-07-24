import java.util.Scanner;

/**
 * Created by sonal on 02-07-2016.
 */
public class forth {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter valve of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
