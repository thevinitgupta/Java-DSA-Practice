package LeetCodeVirtualContests.Contest261;
/*
* XXXOOO
*
* */
public class MinimumMovesToConvertString {
    public static int minimumMoves(String s) {
        int i=0,j=0;
        int moves = 0,currCount=0;
        while(i<s.length()&&s.charAt(i)!='X') {
            i++;
        }
        j=i;
        System.out.println(i+" "+j);
        while(i<s.length() && j<s.length()){
            if(s.charAt(j)=='X') currCount++;
            if((j+1)-i>=3){
                if(currCount>=1){
                    moves++;
                }
                currCount=0;
                j++;
                i=j;
            }
            else {
                j++;
            }
        }
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                moves++;
                break;
            }
            i++;
        }
        return moves;
    }

    public static void main(String[] args) {
        int moves = minimumMoves("XXXXXXXXXX");
        System.out.println("Moves = "+moves);
    }
}
