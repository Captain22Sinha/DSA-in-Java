import java.util.Scanner;

public class initializr_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30 , 40, 50, 60, -56, 5495 };
        int n = arr.length;
        System.out.println(n);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
