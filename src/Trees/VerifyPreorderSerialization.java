package Trees;

public class VerifyPreorderSerialization {
    public boolean isValidSerialization(String preorder) {
        int vac = 1;
        String [] pre = preorder.split(",");
        int n = pre.length;
        for(int i=0;i<n;i++){
            vac--;
            if(vac<0) return false;
            if(!pre[i].equals("#")) vac+= 2;
        }
        return vac==0;
    }
}
