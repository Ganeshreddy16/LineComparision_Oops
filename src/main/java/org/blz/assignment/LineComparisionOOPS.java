package org.blz.assignment;
import java.util.Scanner;
public class LineComparisionOOPS
{
    public static String input()
    {int x1, x2, y1, y2;
        Scanner input = new Scanner(System.in);

        String Length;
        System.out.println("Enter Coordinates of 1st line x1,y1,x2,y2");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        Length =String.valueOf(Math.sqrt(Math.pow( (x2-x1) ,2 ) + Math.pow( (y2-y1) , 2) ));
        return Length;
    }
    public static void equalsCheck(String Length1,String Length2)
    {
        System.out.println("The result of equality of two lines is " + Length1.equals(Length2));
    }
    public static void compareTo(String Length1,String Length2)
    {
        System.out.println("The result of CompareTo of two lines is " + Length1.compareTo(Length2));
        if (Length1.compareTo(Length2)<0)
            System.out.println("Line1 is smaller than line2");
        else if ( Length1.compareTo(Length2)>0)
            System.out.println("Line1 is greater than line2");
        else
                    System.out.println("Both lines are equal");
    }
    public static void main( String[] args )
    {
        String length1,length2;
        length1=input();
        length2=input();
        System.out.println(length1+ "\n" +length2);
        equalsCheck(length1,length2);
        compareTo(length1,length2);

    }

}
