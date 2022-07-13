package InterviewBit.Strings;

public class ConvertTheAmountInNumberToWords {
    static String[] a0={"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
            a1={"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"},
            b={"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    static String getWords(String s) {
        int d=s.length();
        if(d==1) return a0[s.charAt(0)-'0'];
        else if(d==2) {
            String st;
            switch(s.charAt(0)-'0') {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    st=a1[s.charAt(0)-'0'];
                    if(s.charAt(1)!='0') {
                        st=st+'-'+getWords(s.substring(1));
                    }
                    return st;
                case 0:
                    if(s.charAt(1)!='0') {
                        return a0[s.charAt(1)-'0'];
                    }
                    else return "";
                case 1:
                    return b[s.charAt(1)-'0'];
            }
        }
        else if(d==3) {
            String st="", st1;
            if(s.charAt(0)!='0') st=a0[s.charAt(0)-'0']+"-hundred";
            st1=getWords(s.substring(1));
            if(st1!="") {
                st=st+"-and-"+st1;
            }
            return st;
        }
        else if(d<6) {
            String st1, st2;
            st2=getWords(s.substring(d-3));
            st1=getWords(s.substring(0, d-3));
            if(st1.equals("")) return st2;
            st1=st1+"-thousand";
            if(st2.equals("")) return st1;
            if(st2.charAt(0)=='-') return st1+st2;
            else return st1+"-"+st2;
        }
        else if(d<8) {
            String st1, st2;
            st2=getWords(s.substring(d-5));
            st1=getWords(s.substring(0, d-5));
            if(st1.equals("")) return st2;
            st1=st1+"-lakh";
            if(st2.equals("")) return st1;
            if(st2.charAt(0)=='-') return st1+st2;
            else return st1+"-"+st2;
        }
        else {
            String st1, st2;
            st2=getWords(s.substring(d-7));
            st1=getWords(s.substring(0, d-7));
            if(st1.equals("")) return st2;
            st1=st1+"-crore";
            if(st2.equals("")) return st1;
            if(st2.charAt(0)=='-') return st1+st2;
            else return st1+"-"+st2;
        }
        return "";
    }

    public int solve(String A, String B) {
        return getWords(A).equals(B)==true ? 1 : 0;
    }
}
