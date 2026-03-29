import java.util.Scanner;

public class area_of_circle_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();
        double a = 3.141592*r*r;
        System.out.println("The area is : " +a);
    }
}
