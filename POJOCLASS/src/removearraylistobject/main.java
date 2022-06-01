package removearraylistobject;
//how duplicate elements respond in arraylist if particular element is removed
import java.util.*;

class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,1,1,2,2,3));
        System.out.println(list);
        list.remove(4);
        list.remove(Integer.valueOf(1)); //converting int to Integer Object to remove the object //every time first occurence of that object is removed from list
        list.remove(Integer.valueOf(1));
        System.out.println(list);
    }
}
