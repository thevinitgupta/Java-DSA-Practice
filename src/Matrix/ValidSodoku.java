package Matrix;

import java.util.HashMap;

public class ValidSodoku {
    public boolean isValidSudoku(char[][] board) {
        /*
        b1  => i<3 && j<3
        b2  => i<3 && j>=3 && j<6
        b3  => i<3 && j>=6 && j<9
        */

        HashMap<Integer, HashMap<Character, Boolean>> rows = new HashMap<>();
        HashMap<Integer, HashMap<Character, Boolean>> cols = new HashMap<>();
        HashMap<String, HashMap<Character, Boolean>> blocks = new HashMap<>(); // "r/3c/3"

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                else {

                    //row
                    HashMap<Character, Boolean> row = new HashMap<>();
                    if(rows.containsKey(i)){
                        row = rows.get(i);
                    }
                    if(row.containsKey(board[i][j])) return false;
                    row.put(board[i][j], true);
                    rows.put(i,row);

                    //col
                    HashMap<Character, Boolean> col = new HashMap<>();
                    if(cols.containsKey(j)){
                        col = cols.get(j);
                    }
                    if(col.containsKey(board[i][j])) return false;
                    col.put(board[i][j], true);
                    cols.put(j,col);

                    //block
                    HashMap<Character, Boolean> block = new HashMap<>();
                    String b = i/3+""+j/3;
                    if(blocks.containsKey(b)){
                        block = blocks.get(b);
                    }
                    if(block.containsKey(board[i][j])) return false;
                    block.put(board[i][j], true);
                    blocks.put(b,block);

                }
            }
        }
        return true;
    }
}
