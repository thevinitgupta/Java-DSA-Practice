package BitManipulation;

public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
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
