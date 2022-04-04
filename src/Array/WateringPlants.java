package Array;

public class WateringPlants {
    public int wateringPlants(int[] plants, int capacity) {
        int water = capacity;
        int pos = 0,steps = 0;
        while(pos<plants.length){
            steps++;
            if(plants[pos]>water){
                if(pos==0) return -1;
                // System.out.println(pos+", "+steps);
                steps += pos;
                steps += pos;
                water = capacity;
                // System.out.println("refilled : "+steps);
            }
            water = water - plants[pos];
            pos++;
        }
        return steps;
    }
}
