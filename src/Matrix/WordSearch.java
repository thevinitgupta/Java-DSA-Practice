package Matrix;

import java.util.ArrayList;
import java.util.List;
class Pair{
    public int x,y;
    Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Pair add(Pair p){
        return new Pair(this.x+p.x, this.y+p.y);
    }
}
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        List<Pair> start = new ArrayList<>();
        int m = board.length, n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)) start.add(new Pair(i,j));
            }
        }
        List<Pair> adds = new ArrayList<>();
        adds.add(new Pair(0,1));
        adds.add(new Pair(0,-1));
        adds.add(new Pair(1,0));
        adds.add(new Pair(-1,0));
        boolean [][] visited = new boolean[m][n];
        for(int i=0;i<start.size();i++){
            Pair curr = start.get(i);
            for(int j=0;j<adds.size();j++){
                Pair p = curr.add(adds.get(j));
                visited[curr.x][curr.y] = true;
                if(check(board, word, 1, visited, p, adds)) return true;
                visited[curr.x][curr.y] = false;
            }
        }
        return false;
    }
    public static boolean check(char [][] board, String word, int index, boolean [][] visited, Pair pos, List<Pair> adds){
        if(index>=word.length()) return true;
        int m = board.length, n = board[0].length, i = pos.x, j = pos.y;
        char ch = word.charAt(index);
        if(i>=m || j>=n || i<0 || j<0) return false;

        if(!visited[i][j] && board[i][j]==ch){
            for(int k=0;k<adds.size();k++){
                Pair p = pos.add(adds.get(k));
                visited[i][j] = true;
                if(check(board, word, index+1, visited, p, adds)) return true;
                visited[i][j] = false;
            }
        }
        return false;

    }
}
