import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the value of k from user input
        System.out.print("Enter rotation value (k): ");
        int k = sc.nextInt();

        // Calculate effective rotation value
        k %= x;

        // Perform array rotation
        reverse(arr, 0, x - 1);
        reverse(arr, 0, x - k - 1);
        reverse(arr, x - k, x - 1);

        // Print the rotated array
        System.out.println("Rotated array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
