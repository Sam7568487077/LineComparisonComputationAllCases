import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;


 class Point {

    double x;
    double y;
}

 class Line extends Point{
    double lengthOfLine;
    //double p1;
  //  double p2;


   Point p1 = new Point();
    Point p2 = new Point();





    double getLength()
    {
        lengthOfLine =Math.sqrt( Math.pow(p1.x - p2.x ,2) + Math.pow(p1.y - p2.y,2));
        return lengthOfLine;

    }





}
public class LineComparisonComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Line l1 =new Line();
        Line l2 = new Line();

        System.out.println("========= WELCOME TO LINE COMPARISON COMPUTATION =========");
        System.out.println("\n");
        System.out.print("Enter the x coordinate of Line 1 :");
        l1.p1.x = sc.nextDouble();
        System.out.print("Enter the x coordinate of Line 1 :");
        l1.p2.x = sc.nextDouble();
        System.out.print("Enter the y coordinate of Line 1 :");
        l1.p1.y = sc.nextDouble();
        System.out.print("Enter the y coordinate of Line 1 :");
        l1.p2.y = sc.nextDouble();
        System.out.println("\n");

        System.out.print("Enter the x coordinate of Line 2 :");
        l2.p1.x = sc.nextDouble();
        System.out.print("Enter the x coordinate of Line 2:");
        l2.p2.x = sc.nextDouble();
        System.out.print("Enter the y coordinate of Line 2 :");
        l2.p1.y = sc.nextDouble();
        System.out.print("Enter the y coordinate of Line 2 :");
        l2.p2.y = sc.nextDouble();


     /*  if( lengthOfLine1 == lengthOfLine2 )
        {
            System.out.println("Therefore the length of the two lines are equal");
        }
       else if ( lengthOfLine1 > lengthOfLine2) {
           System.out.println("The length of line XY  is greater then line PQ");


       } else  {
            System.out.println("The length of line PQ is  greater then line XY");
        }

      */
        // System.out.println(Double.compare(lengthOfLine1 , lengthOfLine2));
        System.out.println("\n");

        System.out.println( "The length od line 1 is: " + l1.getLength());
        System.out.println("The length of line 2 is : " + l2.getLength());
        System.out.println("\n");
        if(l1.getLength() == l2.getLength())
        {
            System.out.println("Length of Line 1 is equal to length of  line 2");
        }
        else if (l1.getLength() >= l2.getLength())
        {
            System.out.println("Length of Line 1 is greater than length of  line 2");
        }
        else
        {
            System.out.println("Length of Line 1 is lesser than length of  line 2");
        }


    }
}
