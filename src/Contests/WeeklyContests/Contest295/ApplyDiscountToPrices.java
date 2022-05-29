package Contests.WeeklyContests.Contest295;

import java.text.DecimalFormat;

public class ApplyDiscountToPrices {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public String discountPrices(String sentence, int discount) {
        String [] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            int dc = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='$') dc++;
            }
            if(dc==1 && s.length()>1 && s.charAt(0)=='$'){
                try{
                    double price = Double.parseDouble(s.substring(1));
                    double disc = price - ((discount*price)/100.0d);
                    s = "$"+df.format(disc);
                    arr[i] = s;
                }
                catch(Exception e){
                    continue;
                }
            }
        }
        sentence = "";
        for(int i=0;i<arr.length;i++){
            sentence += arr[i]+" ";
        }
        return sentence.trim();
    }
}
