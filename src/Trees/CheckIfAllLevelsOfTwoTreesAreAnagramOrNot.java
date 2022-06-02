package Trees;
import java.util.*;

public class CheckIfAllLevelsOfTwoTreesAreAnagramOrNot {
    public static boolean areAnagrams(Node node1, Node node2) {
        Queue<Node> q = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int c=0;
        q.add(node1);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                level.add(q.remove().data);
            }
            map.put(c,level);
            c++;
        }
        c=0;
        q.add(node2);
        while(!q.isEmpty()){
            // System.out.println("q ->"+c);
            int n = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                level.add(q.remove().data);
            }
            List<Integer> prev = map.containsKey(c) ? map.get(c) : level;
            if(prev.size()!=level.size()) return false;
            Collections.sort(level);
            Collections.sort(prev);
            // System.out.println(level);
            // System.out.println(prev);
            for(int i=0;i<level.size();i++){
                // System.out.println(level.get(i)!=prev.get(i));
                if(!level.get(i).equals(prev.get(i))) return false;
            }
            c++;
        }
        return true;
    }
}
