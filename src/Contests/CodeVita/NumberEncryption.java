package Contests.CodeVita;

import java.util.Scanner;

public class NumberEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="", c = "";
        s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        c = sc.nextLine();
        char [] ca = c.toCharArray();
        int index = 0;
        for (int i = 0; i < (int)c.length(); i++)
        {
            switch (ca[i])
            {
                case 'R':
                    if (index + 1 < str.length())
                        index++;
                    break;
                case 'L':
                    if (index > 0)
                        index--;
                    break;
                case 'T':
                    if (str.charAt(index) != '9'){
                        String inc = "" + (Integer.parseInt(str.charAt(index)+"")+1);
                        str.setCharAt(index, inc.charAt(0));
                    }
                    break;
                case 'D':
                    if (s.charAt(index) != '0'){
                        String dec = "" + (Integer.parseInt(str.charAt(index)+"")-1);
                        str.setCharAt(index, dec.charAt(0));
                    }
                    break;
                case 'S':
                    i++;
                    String num= ca[i]+"";

                    int ind = Integer.parseInt(num);
                    char ch = str.charAt(index);
                    str.setCharAt(index, str.charAt(ind-1));
                    str.setCharAt(ind-1, ch);
                    break;
            }
        }
        System.out.println(str.toString());
    }
}
