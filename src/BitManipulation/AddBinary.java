package BitManipulation;

public class AddBinary {
    public String addBinary(String a, String b) {
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
