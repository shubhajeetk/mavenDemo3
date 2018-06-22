package mavendemo3;

import java.util.Scanner;
class FloydTriangleExample
{
    public static void main(String args[])
    {
       int rows, number = 1, counter, j,input=5;
       System.out.println("Floyd's triangle");
       System.out.println("****************");
       for ( counter = 1 ; counter <= input; counter++ )
       {
           for ( j = 1 ; j <= counter ; j++ )
           {
                System.out.print(number+" ");
                //Incrementing the number value
                number++;
           }
           //For new line
           System.out.println();
       }
   }
}