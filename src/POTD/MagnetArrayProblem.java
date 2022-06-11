package POTD;

public class MagnetArrayProblem {
    public void nullPoints(int n, double magnets[], double getAnswer[])
    {
        for(int i=0;i<n-1;i++){
            getAnswer[i] = solve(magnets[i],magnets[i+1],magnets,n);
        }
    }
    double solve(double l, double h, double magnets[],int n){
        double mid = 0.0d;
        while(l<h){
            mid = (l+h)/2;
            double force = 0;
            for(int i=0;i<n; i++){
                force+= 1/(mid-magnets[i]);
            }
            if(Math.abs(force)<0.0000001) return mid;
            else if(force<0){
                h = mid;
            }
            else{
                l = mid;
            }
        }
        return mid;
    }
}
