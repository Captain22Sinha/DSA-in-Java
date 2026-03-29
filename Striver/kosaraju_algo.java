
import java.util.ArrayList;

public class kosaraju_algo{
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(4);

        Main obj = new Main();
        obj.kosaRaju(adj, n);

    }
}