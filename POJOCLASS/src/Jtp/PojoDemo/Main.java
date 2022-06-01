package Jtp.PojoDemo;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int number = sc.nextInt();
        Student[] p = new Student[100];

        for(int i=0;i<number;i++)
        {
            p[i] = new Student();
            p[i].setName(sc.next());
            p[i].setAge(sc.nextInt());
            p[i].setEmail(sc.next());
            p[i].setGender(sc.next().charAt(0));
            p[i].setMobnumber(sc.nextLong());
            p[i].setRegistrationID(sc.nextLong());
        }
        for(int i=0;i<number;i++)
        {
            System.out.println( p[i].getName());
            System.out.println( p[i].getAge());
            System.out.println( p[i].getEmail());
            System.out.println( p[i].getGender());
            System.out.println( p[i].getMobnumber());
            System.out.println( p[i].getRegistrationID());
        }


    }
}

