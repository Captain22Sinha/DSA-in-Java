import java.util.Scanner;
public class quadrant_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x point : ");
        int x = sc.nextInt();
        System.out.print("Enter y point : ");
        int y = sc.nextInt();

        if(x==0 && y==0) System.out.println("Point at origin");
        else if(x==0 && y>0) System.out.println("Point on y-axis");
        else if(x>0 && y==0) System.out.println("Point on x-axis");
        else if(x>0 && y>0) System.out.println("1st Quadrant");
        else if(x<0 && y>0) System.out.println("2nd Quadrant");
        else if(x<0 && y<0) System.out.println("3rd Quadrant");
        else System.out.println("4th Quadrant");
    }
}