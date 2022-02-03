package POTD;

public class ExcelSheet1 {
    public String excelColumn(int n){
        String alphabets = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";
        if(n<=26) return ""+alphabets.charAt(n);
        while(n>0){
            int mod = n%26;
            if(mod==0) {
                res = 'Z'+res;
                n = n/26 - 1;
            }
            else {
                res = alphabets.charAt(mod)+res;
                n = n/26;
            }
        }

        return res;
    }
}
