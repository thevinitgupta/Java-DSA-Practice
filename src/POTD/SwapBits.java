package POTD;

public class SwapBits {
    int swapBits(int x, int p1, int p2, int n)
    {
        for(int i=0; i<n; i++)
        {
            //Store the bits to be swapped in two variables.
            int temp1 = (x>>p1)&1;
            int temp2 = (x>>p2)&1;

            //Make both bits 0.
            x = x&(~(1<<p1));
            x = x&(~(1<<p2));

            //Insert the bits in the opposite locations.
            x = x | (temp1<<p2);
            x = x | (temp2<<p1);

            //Increment p1 and p2.
            p1++;
            p2++;

        }

        return x;
    }
}
