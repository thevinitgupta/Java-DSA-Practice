package Contests.CodeVita;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PrimeVillaCodeVita {
    static int dow(int y, int m, int d)
    {
        int time[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if(m<3){
            d = d-1;
        }
        return (y + y/4 - y/100 + y/400 + time[m-1] + d) % 7;
    }
    static List<Integer> prime(int ub){
        List<Integer> primeList = new ArrayList<>();
        for (int i = 1; i <= ub; i++){
            if (isPrimeNumber(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    static boolean isPrimeNumber(int num)
    {
        if (num < 2)
            return false;

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String [] splits = inp.split(" ");
        String date = splits[0], weekDay = splits[1];
        int n = Integer.parseInt(splits[2]);
        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6);
        //String [] days = {"Mon","Tue","Wed", "Thu","Fri","Sat","Sun"};
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        //System.out.println(days[dow(year,month,day)-1]);
        List<Integer> primeNumbers = prime(365);
        int count = -1;
        String dString = year+"-"+month+"-"+day;
        LocalDate givenDate = LocalDate.parse(dString);
        HashMap<String, Boolean> primeMnths = new HashMap<>();
        primeMnths.put("FEBRUARY", true);
        primeMnths.put("MARCH", true);
        primeMnths.put("MAY", true);
        primeMnths.put("JULY", true);
        primeMnths.put("NOVEMBER", true);
        HashMap<String, String> dayList = new HashMap<>();
        //Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday
        dayList.put("MONDAY", "Mon");
        dayList.put("TUESDAY", "Tue");
        dayList.put("WEDNESDAY", "Wed");
        dayList.put("THURSDAY", "Thu");
        dayList.put("FRIDAY", "Fri");
        dayList.put("SATURDAY", "Sat");
        dayList.put("SUNDAY", "Sun");
        for(int key : primeNumbers){
            LocalDate nextDate = givenDate.plusDays(key);
            if(primeMnths.containsKey(nextDate.getMonth().toString())==true && dayList.get(nextDate.getDayOfWeek().toString()).equals(weekDay)){
                count = key;
                break;
            }
        }
        if(count==-1) {
            System.out.println("No "+0);
        }
        else if(count<=n){
            System.out.println("Yes "+count);
        }
        else {
            System.out.println("No "+count);
        }
    }
}
