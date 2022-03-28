package Simulation;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double tot = 0;
        int time = customers[0][0], n = customers.length;
        for(int i=0;i<n;i++){
            time = Math.max(customers[i][0]+customers[i][1], time + customers[i][1]);
            tot += time - customers[i][0];
        }
        return tot/n;
    }
}
