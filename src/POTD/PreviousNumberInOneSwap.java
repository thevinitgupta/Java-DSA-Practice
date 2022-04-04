package POTD;

public class PreviousNumberInOneSwap {
    static String previousNumber(String S){
        // code here
        String p="";
        char a[]=S.toCharArray();
        boolean flag=false;
        int i=S.length()-1,j=i-1;
        char max=' ';
        int maxIndex=0;

        while(j>=0){
            if(a[j]>a[i]){
                flag=true;
                for(int k=j+1;k<a.length;k++){
                    if(a[k]>max && a[k]<a[j]){
                        max=a[k];
                        maxIndex=k;
                    }
                }

                char temp=a[j];
                a[j]=max;
                a[maxIndex]=temp;
                break;
            }
            else{
                i--;
                j--;
            }

        }
        if(flag==true && a[0]=='0') return "-1";
        if(flag==true) return new String(a);


        return "-1";
    }
}
