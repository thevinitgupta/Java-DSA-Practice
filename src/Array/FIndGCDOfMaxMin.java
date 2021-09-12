package Array;

public class FIndGCDOfMaxMin {
    public static int largestAltitude(int[] gain) {
        int sum = 0,max  = Integer.MIN_VALUE, min = Integer.MAX_VALUE,hcf = 0;
        for(int i =0;i<gain.length;i++){
            if(gain[i]<min) min = gain[i];
            if(gain[i]>max) max = gain[i];
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        hcf = hcf(max,min);
        System.out.println("HCF : "+hcf);
        return hcf;
    }
    public static  int hcf(int a,int b){
        if(a==1 || b==1) return 1;
        else if(a==0) return b;
        else if(b==0) return a;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        return hcf(min,max%min);
    }

    public static void main(String[] args) {
        int [] arr = {450,300,120,240,60,100};
        int hcf = largestAltitude(arr);
    }
}
