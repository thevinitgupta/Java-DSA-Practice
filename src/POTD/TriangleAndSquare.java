package POTD;

public class TriangleAndSquare {
    int countSquare(int B){
        B-=2;
        B/=2;
        return (B*(B + 1))/2;
    }
}
