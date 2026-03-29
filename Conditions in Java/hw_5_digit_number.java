import java.util.Scanner;

public class hw_5_digit_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n > 9999 && n < 100000)
            System.out.println("5 digit number");
        else
            System.out.println("Not 5 digit number");
    }
}