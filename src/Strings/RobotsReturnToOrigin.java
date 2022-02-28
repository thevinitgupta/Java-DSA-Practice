package Strings;

public class RobotsReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int [] loc = new int[2];
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') loc[0]--;
            else if(moves.charAt(i)=='D') loc[0]++;
            else if(moves.charAt(i)=='L') loc[1]--;
            else loc[1]++;
            // System.out.println(moves.charAt(i)+" => "+Arrays.toString(loc));
        }
        return loc[0]==0 && loc[1]==0;
    }
}
