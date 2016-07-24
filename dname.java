import java.util.Scanner;

/**
 * Created by sonal on 03-07-2016.
 */
public class dname {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter valve of n ");
        int n = sc.nextInt();
        String str=" ";
        str=sc.next();
        int s=n-1;
        for(int i=0;i<n;i=i+2)
        {
            for(int k=s;k>0;k--)
                System.out.print(" ");
            s--;
            for(int j=0;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }
        int e = 1;
        System.out.println(str);
        for (int i = n; i > 0; i = i - 2) {
            for (int k = 1; k <= e; k++)
                System.out.print(" ");
            e++;
            for (int j = 0; j < i; j++)

                System.out.print("*");

            System.out.println();
        }
    }
}
