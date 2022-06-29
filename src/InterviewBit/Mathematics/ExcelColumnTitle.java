package InterviewBit.Mathematics;

import java.util.ArrayList;

public class ExcelColumnTitle {
    public String convertToTitle(int A) {
        ArrayList<Integer> rems = new ArrayList<>();
        while(A>=26){
            int rem = A%26;
            if(rem==0) {
                rems.add(26);
                A--;
            }
            else rems.add(A%26);
            A /= 26;
        }
        if(A>0) rems.add(A);
        StringBuilder str = new StringBuilder();
        for(int i=rems.size()-1;i>=0;i--){
            str.append((char)(64+rems.get(i)));
        }
        return str.toString();
    }
}
