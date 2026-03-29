import java.util.Scanner;

public class output_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        //input -> loop
        for(int i=0 ; i<=x-1 ; i++){
            arr[i] = sc.nextInt();
        }

        //output -> loop
        System.out.println();
        for(int i=0 ; i<=x-1 ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
