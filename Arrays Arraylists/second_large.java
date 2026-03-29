public class second_large {
    public static void main(String[] args) {
        int[] arr = { 10, 54, 69, 75, 45, 25, 36, 41, 12 };
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx, arr[i]);
        }
        int smx = Integer.MIN_VALUE; 
        for(int i=0 ; i<n ; i++){
            if(arr[i] !=mx) smx = Math.max(smx, arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}