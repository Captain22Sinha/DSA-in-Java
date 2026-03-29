public class two_sum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 6, 7, 2, 9};
        int x = 10;
        // solution
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
    }
}