package InterviewBit.Mathematics;

public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int num = 0;
        for(int i=0;i<A.length();i++){
            num = (26*num)+(A.charAt(i)-64);
        }
        return num;
    }
}
