import java.util.Scanner;

/**
 * Created by sonal on 03-07-2016.
 */
public class fizzbizz {
    public static void main(String arg[])
    {

        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
            else if(i%3==0 )
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
