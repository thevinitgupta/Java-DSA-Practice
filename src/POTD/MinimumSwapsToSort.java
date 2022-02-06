package POTD;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwapsToSort {
        class Pair{
            int num;
            int ind;
            Pair(int num, int ind){
                this.num=num;
                this.ind=ind;
            }
        }

        class Compare implements Comparator<Pair> {
            public int compare(Pair p1, Pair p2){
                return p1.num-p2.num;
            }
        }

        public int minSwaps(int nums[])
        {
            int n = nums.length, ans=0;
            Pair arr[] = new Pair[n];
            for(int i=0; i<n; i++)
                arr[i] = new Pair(nums[i], i);

            Arrays.sort(arr, new Compare());
            int visited[] = new int[n];
            for(int i=0; i<n; i++){
                if(visited[i]==1 || arr[i].ind==i)continue;

                int len=0, j=i;
                while(visited[j]==0){
                    visited[j]=1;
                    len++;
                    j=arr[j].ind;
                }
                ans+=(len-1);
            }
            return ans;
        }
}
