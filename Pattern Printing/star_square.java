import java.util.Scanner;

public class star_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Number of row & col : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){ //rows
            for(int j=1 ; j<=n ; j++){ //cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
