package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//test case not passed
public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        HashMap<String, Integer> hm = new HashMap<>();
        String dest = "";
        for(int i=0;i< paths.size();i++){
            for(int j=0;j<paths.get(i).size();j++) {
                String key = paths.get(i).get(j);
                if (!hm.containsKey(key) && j==1) dest = key;
                else
                {
                  hm.put(key,j);
                }
            }
        }
        return dest;
    }

    public static void main(String[] args) {

    }
}
