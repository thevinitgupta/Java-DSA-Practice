package Contests.CodeVita;

import java.util.Scanner;

public class SimpleGame {
    static int win[][] = {{0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}};

    static boolean isCharWin(char[] board, char c) {
        for (int i = 0; i < 8; i++) {
            if (board[win[i][0]] == c
                    && board[win[i][1]] == c
                    && board[win[i][2]] == c) {
                return true;
            }
        }
        return false;
    }

    static boolean isValidPosition(char board[]) {

        int xCount = 0, oCount = 0;
        for (int i = 0; i < 9; i++) {
            if (board[i] == 'X') {
                xCount++;
            }
            if (board[i] == 'O') {
                oCount++;
            }
        }

        if (xCount == oCount || xCount == oCount + 1) {
            // Check if 'O' is winner
            if (isCharWin(board, 'O')) {

                if (isCharWin(board, 'X')) {
                    return false;
                }

                return (xCount == oCount);
            }

            if (isCharWin(board, 'X') && xCount != oCount + 1) {
                return false;
            }

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] board = new char[9];
        int k = 0;
        for(int i=0;i<3;i++){
            String curr = sc.nextLine();
            String [] c = curr.split("");
            for(int j=0;j<3;j++){
                board[k] = c[j].charAt(0);
                k++;
            }
        }
        String answer = "YES";
        if(isValidPosition(board)==false) answer = "NO";
        System.out.print(answer.trim());
    }
}
