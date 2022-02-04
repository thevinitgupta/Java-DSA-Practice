package POTD;

public class ShortestUniquePrefixForEveryWord {
    static String[] findPrefixes(String[] arr, int N) {
        int curr = 0;
        int length = 1;
        String[] str = new String[N];
        while (curr != N) {
            boolean check = false;
            String ans = arr[curr].substring(0 , length);
            for(int i = 0; i < N; i++) {
                if (ans.length() <= arr[i].length() && i != curr && ans.equals(arr[i].substring(0 , ans.length() ))) {
                    length++;
                    check = true;
                    break;
                }
            }
            if (!check) {
                str[curr] = ans;
                length = 1;
                curr++;
            }
        }
        return str;
    }
}
