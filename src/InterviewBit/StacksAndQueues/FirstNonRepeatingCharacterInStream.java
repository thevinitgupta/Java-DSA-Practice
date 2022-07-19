package InterviewBit.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacterInStream {
    public String solve(String A) {
        int [] hash = new int[26];
        Queue<Character> pq = new LinkedList<>();
        String str = ""+A.charAt(0);
        pq.add(A.charAt(0));
        int i = 1;
        while(i<A.length()){
            char ch = A.charAt(i);
            int ind = ch-'a';
            hash[ind]++;
            char front = pq.peek();

            if(hash[front-'a']==1) {
                str+= ch;
                i++;
            }
            else {
                hash[pq.poll()]--;
                if(pq.isEmpty()) {
                    str+= '#';
                    i++;
                }
            }
            pq.add(ch);
        }
        return str;
    }
}
