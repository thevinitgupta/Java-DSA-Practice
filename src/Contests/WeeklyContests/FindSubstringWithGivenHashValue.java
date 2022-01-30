package Contests.WeeklyContests;

public class FindSubstringWithGivenHashValue {
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        int i=0,j=0,n=s.length(),c = 0;
        long hash = 0l;
        StringBuilder curr = new StringBuilder();
        while(j<n){
            curr.append(s.charAt(j));
            //System.out.println(curr);
            if((j-i)>=k-1){
                int l=0;
                hash = 0l;
                while(l<curr.length()){
                    hash += (((int)curr.charAt(l)-96))*(Math.pow(power,l)%modulo);
                    hash = hash%modulo;
                    l++;
                }
                if(hash==hashValue) return curr.toString();
                curr.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return "";
    }
}
