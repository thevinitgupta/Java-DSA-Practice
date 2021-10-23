package Design;

import java.util.ArrayList;
import java.util.List;

public class HashMap {
    List<Integer> keys;
    List<Integer> values;
    public HashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    int presentAt(int key){
        int n = this.keys.size()-1;
        for(int i=0;i<=n;i++){
            if(this.keys.get(i)==key) return i;
        }
        return -1;
    }
    public void put(int key, int value) {
        int location = presentAt(key);
        if(location>=0) {
            this.values.set(location,value);
            return;
        }
        this.keys.add(key);
        this.values.add(value);
    }

    public int get(int key) {
        int location = presentAt(key);
        if(location==-1) return -1;
        return this.values.get(location);
    }

    public void remove(int key) {
        int location = presentAt(key);
        if(location!=-1) {
            this.keys.remove(location);
            this.values.remove(location);
        }
    }

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,3);
        hm.put(3,5);
        hm.put(2,10);
        System.out.println(hm.get(1));
        hm.remove(3);
        System.out.println(hm.get(3));
    }
}
