import java.util.Arrays;

public class copy_of_array {
    public static void main(String[] args) {
        int[] arr = { 30, 10, 40, 36, 74, 96, 35 };
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // shallow copy
        int[] nums = arr; 
        nums[0] = 70;
        System.out.println(arr[0]);
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        } 

        System.out.println();
        // deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        for(int ele : brr){
            System.out.print(ele + " ");
        }

        System.out.println();
        int[] crr = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            crr[i] = arr[i];
        }
        crr[0] = 100;
        System.out.print(arr[0]);
    }
}
