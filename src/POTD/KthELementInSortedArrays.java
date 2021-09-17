package POTD;

public class KthELementInSortedArrays {
    public static long kthElement( int [] arr1, int [] arr2 , int n, int m, int k) {
        int i=0,j=0,c=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(c==k-1) return arr1[i];
                else {
                    i++;
                    c++;
                }
            }
            else {
                if(c==k-1) return arr2[j];
                else {
                    j++;
                    c++;
                }
            }
        }
        while(i<n){
            if(c==k-1) return arr1[i];
            else {
                i++;c++;
            }
        }
        while(j<m){
            if(c==k-1) return arr2[j];
            else {
                j++;c++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] a = {1,3,6,8,9};
        int [] b = {4,5,7,20};
        long k = kthElement(a,b,5,4,7);
        System.out.println("7th element is :"+k);
    }
}
