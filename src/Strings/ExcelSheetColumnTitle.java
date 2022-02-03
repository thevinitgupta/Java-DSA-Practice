package Strings;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String alpha = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";
        while(n>0){
            int mod = n%26;
            res = alpha.charAt(mod) + res;
            n = n/26;
            if(mod==0) n--;
        }
        return res;
    }
}
