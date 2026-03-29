public class sum_of_array {
    public static void main(String[] args) {
        int[] arr = {2, 5, 66, 15, 85, 134, 48, 59};
        int sum = 0 ;
        for(int i=0 ; i< arr.length ; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}