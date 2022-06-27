package InterviewBit.Mathematics;

import java.util.ArrayList;

public class RearrangeArray {
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for(int i=0;i<n;i++){
            int original = a.get(i)%n;
            int add = (a.get(original)%n)*n;
            a.set(i,original+add);
        }
        for(int i=0;i<n;i++){
            a.set(i,a.get(i)/n);
        }
    }
}
