public class sort0s_1s_2s {
    public static void swap(int[] arr, int mid, int lo) {
        int temp = arr[mid];
        arr[mid] = arr[lo];
        arr[lo] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 0, 2, 2};
        int n = arr.length;
        // method 1 : two pass solution
        int noOfZeros = 0, noOfOnes = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==0) noOfZeros++;
            if(arr[i]==1) noOfOnes++;
        }
        for(int i=0 ; i<n ; i++){
            if(i<noOfZeros) arr[i]=0;
            else if(i<noOfZeros+noOfOnes) arr[i]=1;
            else arr[i]=2;
        } 
           
        // method 2 : dutch flag algorithm //
        int mid = 0, hi = n-1 , lo=0;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr, mid, lo);
                lo++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else{ //arr[mid]==2
                swap(arr, mid, hi);
                hi--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}