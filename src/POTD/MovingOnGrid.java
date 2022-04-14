package POTD;

public class MovingOnGrid {
    public String movOnGrid(int r, int c)
    {
        r=(r-1)%7;
        c=(c-1)%4;
        if (r!=c)return "JON";
        return "ARYA";
    }
}
