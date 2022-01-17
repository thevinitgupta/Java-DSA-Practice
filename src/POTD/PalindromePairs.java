package POTD;

public class PalindromePairs {
    static int palindromepair(int N, String arr[]) {
        // code here
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(isPalindrome(arr[i]+arr[j])) return 1;
                else if(isPalindrome(arr[j]+arr[i])) return 1;
            }
        }
        return 0;
    }
    static boolean isPalindrome(String s){
        //System.out.println(s);
        int n = s.length();
        int i=0,j=n-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
