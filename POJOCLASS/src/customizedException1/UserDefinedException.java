package customizedException1;

public class UserDefinedException
{
    public static void main(String[] args) {
        try
        {
            throw new customisedexception("Catch custom Exception");
        }
        catch(Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
        }
    }
}
