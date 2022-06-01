package POJOARRAYLIST;
import java.util.*;
import java.lang.*;
class main
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employees :");
    int number = sc.nextInt();
    ArrayList <Employee> e = new ArrayList <Employee>();

    for(int i=0;i<number;i++)
    {
        Employee f = new Employee();
        f.setMobilenumber(sc.nextLong());
        f.setID(sc.nextLong());
        f.setName(sc.next());
        f.setGender(sc.next().charAt(0));
        f.setAge(sc.nextInt());
         e.add(f);
    }
    //printing all employee details
     for(int i=0;i<number;i++)
     {
         System.out.println("Age : "+e.get(i).getAge());
         System.out.println("Mobilenumber : "+e.get(i).getMobilenumber());
         System.out.println("ID : "+e.get(i).getID());
         System.out.println("Name : "+e.get(i).getName());
         System.out.println("Gender : "+e.get(i).getGender());
         System.out.println("\n");
     }
     //printing  name and mobilenumber details based on ID of employee
        System.out.println("Enter the number of queries to perform:");
         int queries=sc.nextInt();
        for(int i=0;i<queries;i++)
         {
            System.out.println("Enter the ID to print the employee details:");
            long IDS = sc.nextLong();
            for(int j=0;j<number;j++)
            {
                if ((e.get(j).getID()) == IDS) {
                    System.out.println("Name : " + e.get(j).getName());
                    System.out.println("Mobilenumber : " + e.get(j).getMobilenumber());
                    System.out.println("\n");
                    break;
                }
            }
        }
}
}
