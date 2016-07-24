import java.util.Scanner;

/**
 * Created by csonal on 7/25/16.
 */
public class PrimeFactor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generate(n);
        }

    private static void generate(int prime) {

        int n;

        for (int i = 2; i <= prime; i++) {
            n = 0;
            while (prime % i == 0) {
                prime /= i;
                n++;

            }

            if (n != 0) {
                for (int j = n; j > 0; j--) {
                    System.out.println(i);


                }
            }
        }
    }
    }


