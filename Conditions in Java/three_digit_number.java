import java.util.Scanner;

public class three_digit_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n>99 && n<1000) System.out.println("3 digit number");
        else System.out.println("Not 3 digit number");
    }
   
}
