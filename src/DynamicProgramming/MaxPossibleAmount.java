package DynamicProgramming;

public class MaxPossibleAmount {

    //Incomplete solution
    int maxAmount(int arr[] , int n)
    {
        return getMax(arr,0,n-1,true);
    }

    public static int getMax(int [] arr, int l, int r, boolean geekTurn){
        if(l>r) return 0;
        if(l==r) return geekTurn ? arr[l] : 0;

        int currL = geekTurn ? arr[l] : 0;
        int currR = geekTurn ? arr[r] : 0;

        currL += getMax(arr,l+1,r,!geekTurn);
        currR += getMax(arr,l,r-1,!geekTurn);

        return Math.max(currL, currR);
    }
}
