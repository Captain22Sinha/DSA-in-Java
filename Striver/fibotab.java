public class fibotab {
    public static void main(String[] args) {
        int n =8;
        int prev1 = 1;
        int prev2 = 0;

        for(int i=2 ; i<=n ; i++){
            int curr = prev1+prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(prev1);
    }
}
