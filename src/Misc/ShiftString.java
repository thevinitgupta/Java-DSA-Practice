package Misc;

public class ShiftString {
    //shift each character of each word by the length of that word
    //rotate back if value exceeds
    public static String shift(String input1){
        String [] arr = input1.split(" ");
        input1="";
        for(int i=0;i<arr.length;i++){
            String curr = arr[i],shifted = "";
            int shift = curr.length();
            for(int j=0;j<curr.length();j++){
                char ch = curr.charAt(j);
                int shifting = ch+shift;
                if(ch>=65 && ch<=90){
                    if(shifting>90) shifting  = 65 + (shifting%90);
                }
                else {
                    if(shifting>122) shifting  = 97 + (shifting%122);
                }
                shifted += (char)shifting;
            }
            arr[i] = shifted;
            input1+=shifted + " ";
        }
        return input1.trim();
    }

    public static void main(String[] args) {
        System.out.println(shift("ABCDX"));
    }
}
