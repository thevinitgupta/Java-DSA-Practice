package POTD;

import java.util.Arrays;

public class SmallestRangeInKLists {
    static class Node {
        int ele;

        int i;

        int j;

        Node(int a, int b, int c)
        {
            this.ele = a;
            this.i = b;
            this.j = c;
        }
    }
    static class MinHeap {
        Node[] harr;
        int size;

        MinHeap(Node[] arr, int size)
        {
            this.harr = arr;
            this.size = size;
            int i = (size - 1) / 2;
            while (i >= 0) {
                MinHeapify(i);
                i--;
            }
        }

        int left(int i)
        {
            return 2 * i + 1;
        }

        int right(int i)
        {
            return 2 * i + 2;
        }

        void MinHeapify(int i)
        {
            int l = left(i);
            int r = right(i);
            int small = i;
            if (l < size && harr[l].ele < harr[i].ele)
                small = l;
            if (r < size && harr[r].ele < harr[small].ele)
                small = r;
            if (small != i) {
                swap(small, i);
                MinHeapify(small);
            }
        }

        void swap(int i, int j)
        {
            Node temp = harr[i];
            harr[i] = harr[j];
            harr[j] = temp;
        }
        Node getMin()
        {
            return harr[0];
        }

        void replaceMin(Node x)
        {
            harr[0] = x;
            MinHeapify(0);
        }
    }
    static int[] findSmallestRange(int[][] KSortedArray,int n,int k)
    {
        //add your code here
        int range = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int start = -1, end = -1;

        Node[] arr1 = new Node[k];
        for (int i = 0; i < k; i++) {
            Node node = new Node(KSortedArray[i][0], i, 1);
            arr1[i] = node;
            max = Math.max(max, node.ele);
        }

        MinHeap mh = new MinHeap(arr1, k);

        while (true) {

            Node root = mh.getMin();

            min = root.ele;
            if (range > max - min + 1) {
                range = max - min + 1;
                start = min;
                end = max;
            }

            if (root.j < n) {
                root.ele = KSortedArray[root.i][root.j];
                root.j++;

                // update max element
                if (root.ele > max)
                    max = root.ele;
            }

            else
                break;
            mh.replaceMin(root);
        }
        return new int[]{start,end};
    }

    public static void main(String[] args) {
        int [] [] arr = {{1, 3, 5, 7, 9},
                {0, 2, 4, 6, 8},
                {2, 3, 5, 7, 11}};
        int [] smallestRange = findSmallestRange(arr,5,3);
        System.out.println(Arrays.toString(smallestRange));
    }
}
