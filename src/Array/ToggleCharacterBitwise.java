package Array;

public class ToggleCharacterBitwise {
    public static void toggleCharacter(char [] ch){
        String s = new String(ch);
        System.out.println(s);
        for(int i=0;i<ch.length;i++){
            ch[i] ^= 32;
        }
        s = new String(ch);
        System.out.println(s);
    }

    public static void main(String[] args) {
        char [] ch = {'v','I','n','i','T'};
        toggleCharacter(ch);
    }
}
