package Contests.Wipro;
import java.util.*;
public class FindKey {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[4];
        int arr2[]=new int[4];
        int arr3[]=new int[4];
        int res[]=new int[4];
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int z=3;
        while(input1>0){
            int d=input1%10;
            arr1[z]=d;
            int e=input2%10;
            arr2[z]=e;
            int f=input3%10;
            arr3[z]=f;
            z--;
            input1=input1/10;
            input2=input2/10;
            input3=input3/10;
        }
        for(int i=0;i<4;i++){
           res[i]= Math.max(arr1[i],Math.max(arr2[i],arr3[i]));
        }
        int num = 0;
        for(int i=0;i<4;i++){
            num = num*10 + res[i];
        }
    }
}
