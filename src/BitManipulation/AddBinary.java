package BitManipulation;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i=a.length()-1,j=b.length()-1, carry = 0;

        while(i>=0 || j>=0){
            int d1 = i>=0 ? a.charAt(i) - '0' : 0, d2 = j>=0 ? b.charAt(j) - '0' : 0;
            int curr = d1 ^ d2 ^ carry;
            s.append(curr);
            carry = d1&d2 | d1&carry | d2&carry;;
            i--;j--;
        }
        if(carry!=0) s.append(carry);
        return s.reverse().toString();
    }
    public String addBinaryString(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i=a.length()-1, j = b.length()-1,carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum+= a.charAt(i)-'0';
            if(j>=0) sum+= b.charAt(j) - '0';

            str.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        if(carry!=0) str.append(carry);
        return str.reverse().toString();
    }
}
