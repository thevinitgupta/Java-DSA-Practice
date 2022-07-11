package InterviewBit.Strings;

public class CountAndSay {
    public String countAndSay(int A) {
        int i = 1;
        String seq = "1";
        if(A==1) return "1";
        while(i<A){
            String curr = "";
            int low = 0, high = 0;
            while(low<seq.length() && high<seq.length()){
                if(seq.charAt(high)!=seq.charAt(low)){
                    curr += (high-low)+""+seq.charAt(low);
                    // System.out.println(curr);
                    low = high;
                }
                else high++;
            }
            if(low<seq.length()) curr += (high-low)+""+seq.charAt(low);
            seq = curr;
            // System.out.println(seq);
            i++;
        }
        return seq;
    }
}
