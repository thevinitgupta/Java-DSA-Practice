package Contests.WeeklyContests;
import java.util.*;
public class Find3DigitEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> arr = new HashSet();
        int i=0,n = digits.length;
        while(i<n-2){
            int j=i+1;
            while(j<n-1){
                int k=j+1;
                while(k<n){
                    if(digits[k]%2==0) {
                        int num = digits[i]*100 + digits[j]*10 + digits[k];
                        if(num/100>0)
                            arr.add(num);
                        int num2 = digits[j]*100 + digits[i]*10 + digits[k];
                        if(num2/100>0)
                            arr.add(num2);
                    }
                    if(digits[i]%2==0){
                        int num = digits[k]*100 + digits[j]*10 + digits[i];
                        if(num/100>0)
                            arr.add(num);
                        int num2 = digits[j]*100 + digits[k]*10 + digits[i];
                        if(num2/100>0)
                            arr.add(num2);
                    }
                    if(digits[j]%2==0){
                        int num = digits[i]*100 + digits[k]*10 + digits[j];
                        if(num/100>0)
                            arr.add(num);
                        int num2 = digits[k]*100 + digits[i]*10 + digits[j];
                        if(num2/100>0)
                            arr.add(num2);
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        int [] res = new int[arr.size()];
        i=0;
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            res[i] = it.next();
            i++;
        }
        Arrays.sort(res);
        return res;
    }
}
