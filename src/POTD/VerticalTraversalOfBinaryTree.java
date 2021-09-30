package POTD;

public class VerticalTraversalOfBinaryTree {
    //Almost Working SOlution of POTD for 30 September,2021

//    static HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
//    static ArrayList <Integer> verticalOrder(Node root)
//    {
//        // add your code here
//        hm.clear();
//        count(root,0);
//        Integer [] keys = hm.keySet().toArray(new Integer[0]);
//        Arrays.sort(keys);
//        ArrayList<Integer> l = new ArrayList<>();
//        for(int key : keys){
//            List<Integer> nodes = hm.get(key);
//            for(int i=0;i<nodes.size();i++){
//                l.add(nodes.get(i));
//            }
//        }
//        return l;
//    }
//    public static void count(Node n, int col){
//        ArrayList<Integer> curr = new ArrayList<>();
//        if(!hm.containsKey(col)){
//            curr.add(n.data);
//            hm.put(col,curr);
//        }
//        else {
//            curr = hm.get(col);
//            curr.add(n.data);
//            hm.put(col,curr);
//        }
//        if(n.left!=null)
//            count(n.left,col-1);
//        if(n.right!=null)
//            count(n.right,col+1);
//        else return;
//    }

    public static void main(String[] args) {

    }
}
