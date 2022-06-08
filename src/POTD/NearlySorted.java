package POTD;
import java.util.*;

public class NearlySorted {

    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        ArrayList<Integer> result=new ArrayList<>();
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i: arr){
            q.add(i);
            if(q.size()>k) result.add(q.poll());
        }
        while(q.size()>0){
            result.add(q.poll());
        }
        return result;
    }

    //Giving wrong output for some test cases
    ArrayList <Integer> nearlySortedWrong(int arr[], int num, int k)
    {
        int [] kHeap = createHeap(arr,0,k+1);

        ArrayList<Integer> sorted = new ArrayList<>();
        int last = k+1,curr = k+1;
        while(curr<num){
            sorted.add(delete(kHeap,last));
            kHeap[last] = arr[curr];
            System.out.println(Arrays.toString(kHeap));
            curr++;
        }
        while(last>0){
            sorted.add(delete(kHeap,last));

            last--;
        }

        return sorted;
    }
    static int [] createHeap(int [] arr, int low, int high){
        int [] heap = new int[(high-low)+1];
        for(int i=low+1;i<=high;i++){
            heap = insert(heap,arr[i-1],i);
        }
        return heap;
    }
    static int[] insert(int [] heap, int el, int pos){
        heap[pos] = el;
        while(pos/2>=0 && heap[pos]<heap[pos/2]){
            int temp = heap[pos];
            heap[pos] = heap[pos/2];
            heap[pos/2] = temp;
            pos /=2;
        }
        return heap;
    }
    static int delete(int[] arr, int last){
        int del = arr[1], i=1;
        arr[1] = arr[last];
        while(i*2+1<last){
            int lc = i*2, rc = (i*2)+1;
            if(arr[lc]<arr[rc]){
                int temp = arr[lc];
                arr[lc] = arr[i];
                arr[i] = temp;
                i=lc;
            }
            else {
                int temp = arr[rc];
                arr[rc] = arr[i];
                arr[i] = temp;
                i=rc;
            }
        }

        return del;
    }
}
