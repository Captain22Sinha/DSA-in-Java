import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element : ");
        int x = sc.nextInt();
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // solution
        boolean flag = false; // false means not found
        for(int i=0 ; i<n ; i++){
            if(arr[i]==x){
                flag = true;
                break;
            } 
        }
        if(flag==true) System.out.print("Element Found");
        else System.out.print("Element not found");
    }
}
