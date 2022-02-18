package Contests.LoveBabbarContest5;

import java.util.Stack;

/*
* You are given a stack 'S', of size 'N' consisting of integers only. You are also given an integer 'K'. You are supposed to reverse each group of size 'K' in the stack.
Start making the group of size 'K' from the top of the stack and then reverse this group. Repeat this process and if there are fewer than 'K' integers in the last group, leave the group as it is.
Print the stack after reversing each group of size 'K'.
Example :
'S' = {1, 2, 3, 4, 5, 6}, 'K' = 2.

The leftmost element (i.e. 1) is the bottommost element of the stack, and the rightmost element (i.e. 6) is the topmost element of the stack.

Group 1 : {5, 6}.
Group 2 : {3, 4}.
Group 3 : {1, 2}.

After reversing the groups :

Group 1 : {6, 5}.
Group 2 : {4, 3}.
Group 3 : {2, 1}.

So, the stack now looks like , 'S' : {2, 1, 4, 3, 6, 5}.
*
* */

public class ReverseTheGroups {
    static Stack< Integer > reverseTheGroups(Stack < Integer > s, int n, int k) {
        // Write your code here.
        Stack<Integer> q = new Stack<>();
        while(!s.isEmpty()){
            Stack<Integer> curr = new Stack<>();
            if(s.size()>=k){
                for(int i=0;i<k;i++){
                    curr.push(s.pop());
                }
                while(!curr.isEmpty()){
                    q.push(curr.pop());
                }
            }
            else {
                q.push(s.pop());
            }
        }
        while(!q.isEmpty()){
            s.push(q.pop());
        }
        return s;
    }
}
