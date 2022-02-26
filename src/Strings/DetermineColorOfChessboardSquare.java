package Strings;

public class DetermineColorOfChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int val = coordinates.charAt(0)-'a' + coordinates.charAt(1)-0;
        return val%2==0;
    }
}
