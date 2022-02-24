package Strings;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
        if(b.length()==0) return 0;
        int count = 1,first=0,k = b.length()/a.length()+1;
        String str = a;
        while(k>=0){
            for(int i=0;i<=str.length()-b.length();i++){
                if(str.substring(i,i+b.length()).equals(b)) return count;
            }
            str += a;
            count++;
            k--;
        }
        return -1;
    }
    public int repeatedStringMatchFast(String a, String b) {
        int[] countMap = new int[26];
        for(char c : a.toCharArray()){
            countMap[c - 'a']++;
        }

        for(char c : b.toCharArray()){
            if(countMap[c-'a'] < 1){
                return -1;
            }
        }

        if(a.length() >= b.length()){
            if(a.contains(b)){
                return 1;
            }
            String repeated = a + a;
            if(repeated.contains(b)){
                return 2;
            }

            return -1;
        }

        String repeated = a;
        int count = 1;
        while(repeated.length() <= b.length() * 2){
            repeated = repeated + a;
            count++;
            if(repeated.length() >= b.length() && repeated.contains(b)){
                return count;
            }
        }

        return -1;
    }
}
