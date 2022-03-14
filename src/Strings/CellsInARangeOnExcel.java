package Strings;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnExcel {
    public List<String> cellsInRange(String s) {
        List<String> cells = new ArrayList<>();
        char c1 = s.charAt(0), c2 = s.charAt(3);
        int r1 = Integer.parseInt(s.charAt(1)+""), r2 = Integer.parseInt(s.charAt(4)+"");
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int cl = c1-'A', ch = c2-'A';
        for(int i=cl;i<=ch;i++){
            for(int j = r1;j<=r2;j++){
                String curr = alpha.charAt(i)+ ""+ j;
                cells.add(curr);
            }
        }
        return cells;
    }
}
