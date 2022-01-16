package Contests.WeeklyContests;

public class DivideAStringIntoGroupsOfK {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length(),i=0,c=0;
        while(n%k!=0){
            s += fill;
            n++;
            //System.out.println(n);
        }
        //System.out.println(s);
        String[] res = new String[n/k];
        while(i<n){
            res[c] = s.substring(i,i+k);
            i = i+k;
            c++;
        }
        return res;
    }
}
