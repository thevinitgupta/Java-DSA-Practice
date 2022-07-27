package InterviewBit.Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class ColorfulNumber {
    public int colorful(int A) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> digits = new ArrayList<>();
        while(A>0){
            int rem = A%10;
            if(map.containsKey(rem)) return 0;
            digits.add(rem);
            map.put(rem,true);
            A /=10;
        }
        for(int i=0;i<digits.size();i++){
            int prod = digits.get(i);
            for(int j=i+1;j<digits.size();j++){
                prod *= digits.get(j);
                if(map.containsKey(prod)) return 0;
                map.put(prod,true);
            }
        }
        // System.out.println(digits);
        return 1;

    }
}
