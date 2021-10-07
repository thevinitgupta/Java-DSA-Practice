package POTD;

public class ElixirOfLife {
    //O(N*N) Time solution
    static int maxFrequency(String s)
    {
        //code here.
        int count = 0;
        StringBuilder pre = new StringBuilder();
        StringBuilder suf = new StringBuilder();
        int i=0,j=s.length()-1;
        while(i<s.length() && j>=0){
            pre.append(s.charAt(i));
            suf.insert(0,s.charAt(j));
            if(pre.compareTo(suf)==0) break;
            i++;j--;
        }
        int win = pre.length();
        i=0; j = i+win;
        while(i<s.length() && j<=s.length()){
            String sub = s.substring(i,j);
            boolean matched = true;
            for(int k=0;k<win;k++){
               if(sub.charAt(k)!=pre.charAt(k)){
                   matched=false;
                   break;
               }
            }
            if(matched) count++;
            i++;
            j=i+win;
        }
        return count;
    }

    public static void main(String[] args) {
        int count = maxFrequency("abcdef");
        System.out.println(count);
    }
}
