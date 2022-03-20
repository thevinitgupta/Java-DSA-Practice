package Contests.Kickstart;
import java.util.*;
public class SpeedTyping {
    public static String check(String a, String b){
        int count = 0, m = a.length(), n = b.length();
        if(m==n && !a.equals(b)) return "IMPOSSIBLE";
        int [] hash = new int[256];
        for(int i = 0;i<m;i++){
            hash[(int)a.charAt(i)]++;
        }
        for(int i = 0;i<n;i++){
            hash[(int)b.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(hash[i]>0) return "IMPOSSIBLE";
            if(hash[i]<0) count++;
        }
        return count+"";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int T = sc.nextInt();
//        for(int i=0;i<T;i++){
//            String I = sc.nextLine();
//            String P = sc.nextLine();
//            System.out.println(check(I,P));
//        }
        System.out.println(check("Ilovecoding","IIllovecoding"));
    }
}
