package Contests.CodeVita;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
                * End 99 98 S(7) 96 95 94 93 92 91
81 82 L(99) 84 85 86 87 88 89 90
80 79 78 77 76 75 74 73 72 71
61 S(22) 63 64 65 66 67 68 69 70
60 59 58 S(14) 56 55 54 53 52 51
41 42 43 44 45 46 L(80) 48 49 50
40 39 38 37 36 35 34 33 32 31
21 22 23 L(63) 25 26 27 28 29 30
20 19 S(2) 17 16 15 14 13 12 11
Start 2 3 4 5 6 7 8 9 10
                * */

public class SnakesAndLadders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] board = new int[100];
        int k=99;
        HashMap<Integer, Boolean> sn = new HashMap<>();
        HashMap<Integer, Boolean> lad = new HashMap<>();
        for(int i=0;i<10;i++){
            String line = sc.nextLine();
            String [] splits = line.split(" ");
            if(i%2==0){
                for(int j=0;j<splits.length;j++){
                    String curr = splits[j];
                    //System.out.println(curr);
                    if(curr.equals("Start")) {
                        board[k] = 1;
                    }
                    else if(curr.equals("End")){
                        board[k] = k+1;
                    }
                    else if(curr.charAt(0)=='S' || curr.charAt(0)=='L'){
                        if(curr.charAt(0)=='S') sn.put(k,true);
                        else lad.put(k, true);
                        String sub = curr.substring(curr.indexOf('(')+1,curr.lastIndexOf(')'));
                        //sub = sub.substring(0,sub.lastIndexOf (')'));
                        if(sub.charAt(0)=='S') sub = "1";
                        else if(sub.charAt(0)=='E') sub = "100";
                        board[k] = Integer.parseInt(sub.trim())-1;
                        //System.out.println(k+" => "+board[k]);
                    }
                    else board[k] = Integer.parseInt(curr.trim());
                    //System.out.println(m);
                    k--;
                }
            }
            else {
                for(int j=splits.length-1;j>=0;j--){
                    String curr = splits[j];
                    //System.out.println(curr);
                    if(curr.equals("Start")) {
                        board[k] = 1;
                    }
                    else if(curr.equals("End")){
                        board[k] = k+1;
                    }
                    else if(curr.charAt(0)=='S' || curr.charAt(0)=='L'){
                        if(curr.charAt(0)=='S') sn.put(k,true);
                        else lad.put(k, true);
                        String sub = curr.substring(curr.indexOf('(')+1,curr.lastIndexOf(')'));
                        //sub = sub.substring(0,sub.lastIndexOf (')'));
                        if(sub.charAt(0)=='S') sub = "1";
                        else if(sub.charAt(0)=='E') sub = "100";
                        board[k] = Integer.parseInt(sub.trim())-1;
                    }
                    else board[k] = Integer.parseInt(curr.trim());
                    //System.out.println(m);
                    k--;
                }
            }
        }
        String d = sc.nextLine();
        String [] ds = d.split(" ");
        int [] dies = new int[ds.length];
        for(int i=0;i<ds.length;i++){
            dies[i] = Integer.parseInt(ds[i]);
        }
        //System.out.println(Arrays.toString(board));
        int pos=-1, snakes = 0, ladders = 0;
        boolean end = false;

        for(int i=0;i<dies.length;i++){
            pos += dies[i];
            while(sn.containsKey(pos) || lad.containsKey(pos)){
                if(sn.containsKey(pos)){
                    snakes++;
                    pos = board[pos];
                }
                else {
                    ladders++;
                    pos = board[pos];
                }
            }

            if(pos==99){
                end = true;
                break;
            }
        }




        if(end){
            System.out.print("Possible "+snakes+" "+ladders);
        }
        else {
            System.out.print("Not Possible "+snakes+" "+ladders+" "+(pos+1));
        }
    }
}
