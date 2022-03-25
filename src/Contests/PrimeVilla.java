package Contests;

import java.util.Scanner;

public class PrimeVilla {
    static int dow(int y, int m, int d)
    {
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        d = m < 3? d-1 : d;
        return (y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] splits = input.split(" ");
        String date = splits[0], dow = splits[1];
        int n = Integer.parseInt(splits[2]);
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(4,6));
        int day = Integer.parseInt(date.substring(6));
        String [] days = {"Mon","Tue","Wed", "Thu","Fri","Sat","Sun"};
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(days[dow(year,month,day)-1]);

    }
}
