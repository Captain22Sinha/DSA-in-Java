import java.util.Scanner;

public class input_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String str = sc.nextLine();
        System.out.print("Hi"+" " + str);
    }
}
