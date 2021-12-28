package BitManipulation;

public class NumberComplement {
    //better approach -> Bit Manipulation
    public int findComplement(int num) {
        String comp = getBinaryComplement(num);
        int bin = 0,c=0;
        for(int i=comp.length()-1;i>=0;i--){
            int d = Integer.parseInt(comp.charAt(i)+"");
            //System.out.println(bin+" -> "+d);
            bin += Math.pow(2,c)*d;
            c++;
        }
        return bin;
    }
    private static String getBinaryComplement(int n){
        String bin = "";
        while(n>1){
            int d = n%2;
            if(d==0) d=1;
            else d = 0;
            bin = d + bin;
            n = n/2;
        }
        if(n==0) n = 1;
        else n = 0;
        bin = n + bin;
        //System.out.println(bin);
        return bin;
    }
}
