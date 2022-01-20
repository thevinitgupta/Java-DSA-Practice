package POTD;

public class BinaryNumberToDecimalNumber {
    public int binary_to_decimal(String str)
    {
        int dec = 0,p = 0;
        for(int i=str.length()-1;i>=0;i--){
            dec += Integer.parseInt(str.charAt(i)+"")* Math.pow(2,p);
            p++;
        }
        return dec;
    }
}
