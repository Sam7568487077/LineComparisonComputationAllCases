import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;
public class LineComparisonComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========= WELCOME TO LINE COMPARISON COMPUTATION =========");
        System.out.println("\n");
        System.out.print("Enter the first coordinate of x :");
        double x1 = sc.nextDouble();
        System.out.print("Enter the second coordinate of x :");
        double x2 = sc.nextDouble();
        System.out.print("Enter the first coordinate of y :");
        double y1 = sc.nextDouble();
        System.out.print("Enter the second coordinate of y :");
        double y2 = sc.nextDouble();
        System.out.println("\n");
        System.out.print("Enter the first coordinate of p :");
        double p1 = sc.nextDouble();
        System.out.print("Enter the second coordinate of p :");
        double p2 = sc.nextDouble();
        System.out.print("Enter the first coordinate of q :");
        double q1 = sc.nextDouble();
        System.out.print("Enter the second coordinate of q :");
        double q2 = sc.nextDouble();
        double lengthOfLine1 = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        double lengthOfLine2 = Math.sqrt( Math.pow((p2 - p1),2) + Math.pow((q2 - q1),2));
        System.out.println("\n");
        System.out.println("The length of line XY is: " + lengthOfLine1);
        System.out.println("The length of line PQ is: " + lengthOfLine2);

       if( lengthOfLine1 == lengthOfLine2 )
        {
            System.out.println("Therefore the length of the two lines are equal");
        }
       else if ( lengthOfLine1 > lengthOfLine2) {
           System.out.println("The length of line XY  is greater then line PQ");


       } else  {
            System.out.println("The length of line PQ is  greater then line XY");
        }



       // System.out.println(Double.compare(lengthOfLine1 , lengthOfLine2));

    }
}
