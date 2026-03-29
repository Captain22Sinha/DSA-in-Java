public class roll_num {
    public static void main(String[] args) {
        int[] arr = {46, 22, 14, 65, 14, 36, 74, 86, 36, 41, 5};
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[i] < 35) System.out.print(i+ " ");
        }
    }
}
