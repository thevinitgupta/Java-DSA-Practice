package Array;
import java.util.Arrays;

/*
* LeetCode Q-832 Flipping An Image
* Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
* */

public class FlippingImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int [] arr = reverseRow(image[i]);
            image[i] = arr;
        }
        return image;
    }
    public static int [] reverseRow(int []arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j] == 0 ? 1 : 0;
            arr[j] = temp == 0 ? 1 : 0;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        arr = flipAndInvertImage(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
