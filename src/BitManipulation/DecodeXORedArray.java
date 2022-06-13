package BitManipulation;

public class DecodeXORedArray {
    // logic :
    //The reverse of any xor operation is itself, so the reverse of bitxor is bitxor. This is a fundamental property of xor, applying it twice gets you back where you started.
    public int[] decode(int[] encoded, int first) {
        int [] og = new int[encoded.length+1];
        og[0] = first;
        for(int i=0;i<encoded.length;i++){
            og[i+1] = og[i]^encoded[i];
        }
        // System.out.println(1^2);
        // System.out.println(1^3);
        // System.out.println(3^2);
        return og;
    }
}
