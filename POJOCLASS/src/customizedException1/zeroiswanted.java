package customizedException1;
import java.util.*;
public class zeroiswanted
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number to check if it is zero :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==0)
        {
            System.out.println("Number is Zero");
        }
        else if (number%2==0)
        {
           throw new notOdd("Number is not zero and Even");
        }
        else if (number%2 != 0)
        {
            throw new notEven("Number is not zero and Odd");
        }
    }
}
