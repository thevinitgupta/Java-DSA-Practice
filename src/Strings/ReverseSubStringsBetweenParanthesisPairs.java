package Strings;

public class ReverseSubStringsBetweenParanthesisPairs {
    public static String reverseParentheses(String s) {
        return editString(s);
    }
    public static String editString(String s){
        int j=0;
        StringBuilder str = new StringBuilder(s);
        while(j<str.length()){
            char ch = str.charAt(j);
            if(ch==')'){
                int k = j;
                System.out.println(j+" -> str = "+str.charAt(j));
                StringBuilder rev = new StringBuilder();
                j--;
                while(str.charAt(j)!='('){
                    System.out.println(rev);
                    rev.append(str.charAt(j));
                    j--;
                }
                str.deleteCharAt(k);
                System.out.println("str before replaced -> "+str);
                str.replace(j,k,rev.toString());
                System.out.println("str replaced -> "+str);
                j = j+(k-j);
                if(j<=str.length() && str.charAt(j-1)==')') j--;
            }
            else {
                j++;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String reversed = reverseParentheses("a(bcdefghijkl(mno)p)q");
        System.out.println(reversed);
    }
}
