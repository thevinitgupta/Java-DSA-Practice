package Trees;

import java.util.HashMap;

public class MostFrequentSubtreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {

        HashMap<Integer,Integer> Map=new HashMap<>();

        Maximum max=new Maximum(0);

        findsum(root,Map,max);



        int count=0;

        for (int key : Map.keySet()) {
            if(Map.get(key)==max.num)count++;
        }

        int arr[]=new int[count];

        count--;
        for (int key : Map.keySet()) {
            if(Map.get(key)==max.num){arr[count--]=key;}
        }

        return arr;

    }
    public static int findsum(TreeNode root,HashMap<Integer,Integer> Map,Maximum max){

        if(root==null)return 0;

        int sum=root.val+findsum(root.right,Map,max)+findsum(root.left,Map,max);

        int val=0;
        if(Map.containsKey(sum))
            val=Map.get(sum);

        val++;

        max.num=max.num>val?max.num:val;

        Map.put(sum,val);

        return sum;

    }
}
class Maximum{
    int num;
    Maximum(int num){
        this.num=num;
    }
}
