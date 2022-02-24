package Contests.MockVita;

import java.util.*;

public class BusTravel {
    public static List<String> allocateTickets(List<List<Integer>> tickets, HashMap<String, List<Integer>> map, List<String> passengers){
        List<String> validity = new ArrayList<>();
        for(int i=0;i<passengers.size();i++){
            List<Integer> stops = map.get(passengers.get(i));
            HashMap<Integer,List<Integer>> curr = new HashMap<>();
            
        }
        return validity;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stops = Integer.parseInt(sc.nextLine().trim());

        HashMap<String, List<Integer>> map = new HashMap<>();
        HashSet<String> passen = new HashSet<>();
        for(int i=0;i<stops;i++){
            String stop = sc.nextLine();
            String ups="",downs="";
            for(int j=0;j<stop.length();j++){
                if (stop.charAt(j)=='|') {
                    ups = stop.substring(0,j);
                    downs = stop.substring(j+1);
                }
            }
            int prev = 0;
            if(ups.equals("- ")) ups="";
            for(int j=0;j<ups.length();j++){
                if(ups.charAt(j)==' '){
                    String curr = ups.substring(prev,j);
                    passen.add(curr);
                    List<Integer> loc = new ArrayList<>();
                    loc.add(i+1);
                    map.put(curr,loc);
                    prev = j+1;
                }
            }
            prev = 1;
            if(downs.equals(" -")) continue;
            downs += " ";
            for(int j=1;j<downs.length();j++){
                if(downs.charAt(j)==' ') {
                    String curr = downs.substring(prev, j).trim();
                    List<Integer> loc = map.get(curr);
                    loc.add(i + 1);
                    prev = j + 1;
                    map.put(curr, loc);
                }
            }
        }
        System.out.println(map);
        int ticketNo = Integer.parseInt(sc.nextLine());
        List<List<Integer>> tickets = new ArrayList<>();
        for(int i=0;i<ticketNo;i++){
            String curr = sc.nextLine();
            List<Integer> ticket = new ArrayList<>();
            for(int j = 0;j<curr.length();j++){
                if(curr.charAt(j)==' ') {
                    ticket.add(Integer.parseInt(curr.substring(0,j)));
                    ticket.add(Integer.parseInt(curr.substring(j+1)));
                    break;
                }
            }
            tickets.add(ticket);
        }
        List<String> passengers = new ArrayList<>(passen);
        Collections.sort(passengers);
        System.out.println(passengers);
    }
}
