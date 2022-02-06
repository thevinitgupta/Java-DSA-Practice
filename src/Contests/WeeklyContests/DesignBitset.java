package Contests.WeeklyContests;

public class DesignBitset {
    int[] bitset;
    public DesignBitset(int size) {
        bitset = new int[size];
    }

    public void fix(int idx) {
        this.bitset[idx] = 1;
    }

    public void unfix(int idx) {
        this.bitset[idx] = 0;
    }

    public void flip() {
        for(int i=0;i<bitset.length;i++){
            if(bitset[i]==0) bitset[i] = 1;
            else bitset[i] = 0;
        }
    }

    public boolean all() {
        for(int i=0;i<bitset.length;i++){
            if(bitset[i]==0) return false;
        }
        return true;
    }

    public boolean one() {
        for(int i=0;i<bitset.length;i++){
            if(bitset[i]==1) return true;
        }
        return false;
    }

    public int count() {
        int count = 0;
        for(int i=0;i<bitset.length;i++){
            if(bitset[i]==1) count++;
        }
        return count;
    }

    public String toString() {
        String str = "";
        for(int i=0;i<bitset.length;i++){
            str += bitset[i];
        }
        return str;
    }
}
