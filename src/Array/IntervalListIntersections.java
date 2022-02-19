package Array;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
        ArrayList<ArrayList<Integer>> inter = new ArrayList<>();
        int i=0,j=0, m = fl.length, n = sl.length;
        while(i<m && j<n){
            if(fl[i][1]<=sl[j][1]){
                int lb = Math.max(fl[i][0],sl[j][0]);
                if(lb<=fl[i][1]){
                    ArrayList<Integer> curr = new ArrayList<>();
                    curr.add(lb);
                    curr.add(fl[i][1]);
                    inter.add(curr);
                }
                i++;
            }
            else if(sl[j][1]<=fl[i][1]){
                int lb = Math.max(fl[i][0],sl[j][0]);
                if(lb<=sl[j][1]){
                    ArrayList<Integer> curr = new ArrayList<>();
                    curr.add(lb);
                    curr.add(sl[j][1]);
                    inter.add(curr);
                }
                j++;
            }
            else if(fl[i][0]==sl[j][1]){
                ArrayList<Integer> curr = new ArrayList<>();
                curr.add(fl[i][0]);
                curr.add(fl[i][0]);
                inter.add(curr);
                j++;
            }
            else if(fl[i][1]==sl[j][0]){
                ArrayList<Integer> curr = new ArrayList<>();
                curr.add(fl[j][0]);
                curr.add(fl[j][0]);
                inter.add(curr);
                i++;
            }
            else {
                i++;
                j++;
            }
        }
        int [][] intersec = new int[inter.size()][2];
        for(i=0;i<intersec.length;i++){
            intersec[i][0] = inter.get(i).get(0);
            intersec[i][1] = inter.get(i).get(1);
        }
        return intersec;
    }
}
