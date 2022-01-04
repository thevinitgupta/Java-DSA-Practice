package BitManipulation;

public class ComplementOfBase10Integer {

    public int bitwiseComplement(int n) {
        if(n==0) return 1;

        int i = 0;

        while(i<n){
            i = i<<1 | 1;
        }

        return i-n;
    }

    //string approach - brute force
    public int bitwiseComplement2(int n) {
        if(n==0) return 1;
        StringBuilder comp = new StringBuilder();
        while(n>1){
            int d = n%2;
            d = d^1;
            comp.insert(0,d);
            n = n/2;
        }
        comp.insert(0,n^1);
        return Integer.parseInt(comp.toString(),2);
    }
}
