import java.util.Scanner;

public class hw_rectengle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int x = sc.nextInt();
        System.out.print("Enter the width : ");
        int y = sc.nextInt();
        int a = x*y;
        int p = 2*(x+y);
        if(a>p) System.out.println("Area is greater then perimeter");
        if(p>a) System.out.println("Perimeter is greater than area");
        if(p==a) System.out.println("Both are equal");
    }
    
}
