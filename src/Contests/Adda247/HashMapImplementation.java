package Contests.Adda247;

import java.util.ArrayList;

public class HashMapImplementation {
    ArrayList<String> keys;
    ArrayList<Integer> values;
    public HashMapImplementation()
    {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void insert(String key, int value)
    {
        for(int i=0;i<this.keys.size();i++){
            if(this.keys.get(i).equals(key)){
                this.values.set(i,value);
                return;
            }
        }
        this.keys.add(key);
        this.values.add(value);
    }

    public int get(String key)
    {
        for(int i=0;i<this.keys.size();i++){
            if(this.keys.get(i).equals(key)){
                return this.values.get(i);
            }
        }
        return -1;
    }

    public void remove(String key)
    {
        for(int i=0;i<this.keys.size();i++){
            if(this.keys.get(i).equals(key)){
                this.keys.remove(i);
                this.values.remove(i);
            }
        }
    }

    public boolean search(String key)
    {
        for(int i=0;i<this.keys.size();i++){
            if(this.keys.get(i).equals(key)){
                return true;
            }
        }
        return false;
    }

    public int getSize()
    {
        return this.keys.size();
    }

    public boolean isEmpty()
    {
        return this.keys.size()==0;
    }
}
