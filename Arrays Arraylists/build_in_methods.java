import java.util.Arrays;

public class build_in_methods {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 36, 74, 96, 35};
        // for each loop
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        Arrays.sort(arr); // Corrected line
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }// Print the sorted array
    }
}
