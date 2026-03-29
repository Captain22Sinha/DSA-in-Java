import java.util.Scanner;

public class length_with_out_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s.length());
    }
}
