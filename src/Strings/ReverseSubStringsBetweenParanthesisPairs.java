package Strings;

import java.util.Stack;

public class ReverseSubStringsBetweenParanthesisPairs {
    public static String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        int i=0,n=s.length();
        while(i<str.length()){
            System.out.println(str);
            System.out.println(i);
            if(str.charAt(i)=='(') {
                st.push(i);
                i++;
            }
            else if(str.charAt(i)==')'){
                String rev = revEditString(str.substring(st.peek(),i));
                System.out.println("rev -> "+rev);
                System.out.println("stack top -> "+st.peek());
                str.replace(st.pop(),i+1,rev);
                if(i<str.length()-1 && str.charAt(i-1)==')') i--;
            }
            else {
                i++;
            }
        }
        i=0;
        while(str.charAt(i)=='('){
            str.deleteCharAt(i);
            i++;
        }
        return str.toString();
       // return editString(s);
    }
// failing - > "((eqk((h))))"
    //"((eqk((h))))"
    public static String revEditString(String s){
        String str = "";
        System.out.println("TO reverse : "+s);
        int j=s.length()-1,n=s.length();
        while(s.charAt(j)==')'){
            n--;
            j--;
        }
        int i=1;
        while(i<n){
            str = s.charAt(i)+str;
            i++;
        }
        return str;
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
        String reversed = reverseParentheses("((eqk((h))))");
        System.out.println(reversed);
    }
}
