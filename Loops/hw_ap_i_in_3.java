import java.util.Scanner;

public class hw_ap_i_in_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 4 ; i<=3*n+1 ; i+=3){
            System.out.print(i+ " ");
        }
    }
}
