package InterviewBit.Arrays;

import java.util.ArrayList;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> anti = new ArrayList<>();
        int n = A.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int ind = i+j;
                if(ind<anti.size()){
                    ArrayList<Integer> curr = anti.get(ind);
                    curr.add(A.get(i).get(j));
                    anti.set(ind,curr);
                }
                else {
                    ArrayList<Integer> diag = new ArrayList<>();
                    diag.add(A.get(i).get(j));
                    anti.add(diag);
                }
            }
        }
        return anti;
    }
}
