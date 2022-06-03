package Misc;

public class ToggleCharacters {
    public static String toggleTheString(String input1, int input2){
        if(input2==0){
            return toggleChars(input1,0,2);
        }
        else if(input2==1){
            return toggleChars(input1, 1, 2);
        }
        else {
            return toggleChars(reverse(input1),0,1);
        }
    }
    public static String reverse(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static String toggleChars(String str, int start, int skip){
        String res= "";
        for(int i=start;i<str.length();i+=skip){
            char ch = str.charAt(i);
            int cn = (int) ch;
            if(ch>=65 && ch<=90){
                cn = cn+32;
            }
            else {
                cn = cn-32;
            }
            res+= (char)cn;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toggleTheString("Wipro",0));
        System.out.println(toggleTheString("TechnolOgY",1));
        System.out.println(toggleTheString("CHEnnAi",2));
    }
}
