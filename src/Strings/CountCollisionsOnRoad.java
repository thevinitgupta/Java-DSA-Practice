package Strings;

import java.util.Stack;

public class CountCollisionsOnRoad {
    public int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        st.push(directions.charAt(0));
        for(int i=1;i<directions.length();i++){
            char curr = directions.charAt(i);
            if((st.peek()== 'R' && curr == 'L')  ){

                count+=2;
                st.pop();
                curr = 'S';
            }
            else if((st.peek() == 'S' && curr == 'L')){
                curr = 'S';
                count+=1;
            }

            while(!st.isEmpty() && ((st.peek() == 'R' && curr == 'S') )){
                count+=1;
                st.pop();
            }

            st.push(curr);
        }
        return count;
    }
}
