package InfyTQPrep;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class itemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b){
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);

        if(r1 < r2) return 1;
        else if(r2 < r1) return -1;
        return 0;

    }
}

public class FractionalKnapsack {
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        Arrays.sort( arr, new itemComparator()  );

        int curWeight = 0;
        double finalValue = 0.0;

        for( int i = 0; i < arr.length; i++){

            if( curWeight + arr[i].weight < W ){
                curWeight += arr[i].weight;
                finalValue += arr[i].value;
            }
            else{
                int remain = W - curWeight;
                finalValue += ( (double) arr[i].value / (double)arr[i].weight ) * (double)remain;

                break;
            }
        }

        return finalValue;
    }
}
