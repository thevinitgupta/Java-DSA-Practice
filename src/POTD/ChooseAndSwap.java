package POTD;

public class ChooseAndSwap {
    String chooseandswap(String S){
        // Code Here
        int n=S.length();
        int[] arr=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(arr[S.charAt(i)-'a']==-1){
                arr[S.charAt(i)-'a']=i;
            }
        }
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
            boolean flag=false;
            for(j=0;j<S.charAt(i)-'a';j++){
                if(arr[j]>arr[S.charAt(i)-'a']){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        if(i<n){
            char ch1=S.charAt(i);
            char ch2=(char)(j+'a');
            for(i=0;i<n;i++){
                if(S.charAt(i)==ch1) {
                    // System.out.println(ch1+" "+ch2);
                    sb.append(ch2);
                }
                else if(S.charAt(i)==ch2) {
                    sb.append(ch1);
                }
                else{
                    sb.append(S.charAt(i));
                }

            }
            // System.out.println(sb);
        }
        String ret=sb.toString();
        return ret.length()==0?S:ret;
    }
}
