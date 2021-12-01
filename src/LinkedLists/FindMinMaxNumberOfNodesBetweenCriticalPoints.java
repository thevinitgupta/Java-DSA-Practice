package LinkedLists;
import java.util.*;

public class FindMinMaxNumberOfNodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head,curr = head.next;
        ArrayList<Integer> points = new ArrayList<>();
        int [] arr = new int[2];
        Arrays.fill(arr,-1);
        int k = 1;
        while(curr.next!=null){
            if(curr.val>prev.val && curr.val>curr.next.val){
                points.add(k);
            }
            else if(curr.val<prev.val && curr.val<curr.next.val) {
                points.add(k);
            }
            prev = curr;
            curr = curr.next;
            k++;
        }
        if(points.size()<=1) return arr;

        arr[1] = points.get(points.size()-1) - points.get(0);
        arr[0]= Integer.MAX_VALUE;
        for(int i=1;i<points.size();i++){
            int diff = points.get(i)-points.get(i-1);
            if(diff < arr[0]) arr[0] = diff;
        }
        return arr;
    }
}
