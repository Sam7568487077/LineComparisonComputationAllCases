import java.util.Scanner;
import java.lang.Math;
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
        double lengthOfLine = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("\n");
        System.out.println("The length of line is: " + lengthOfLine);
    }
}
