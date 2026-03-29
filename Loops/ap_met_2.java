import java.util.Scanner;

public class ap_met_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 4 ;
        for(int i=1 ; i<=n ; i++){
            System.out.print(a+ " ");
            a+=3;
        }
    }
}
