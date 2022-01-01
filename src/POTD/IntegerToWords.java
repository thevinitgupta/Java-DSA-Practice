package POTD;

public class IntegerToWords {
    String numbertoString(String s, int i) {
        if(s.charAt(i)=='0') {
            return "";
        }
        else if(s.charAt(i)=='1') {
            return "one";
        }
        else if(s.charAt(i)=='2') {
            return "two";
        }
        else if(s.charAt(i)=='3') {
            return "three";
        }
        else if(s.charAt(i)=='4') {
            return "four";
        }
        else if(s.charAt(i)=='5') {
            return "five";
        }
        else if(s.charAt(i)=='6') {
            return "six";
        }
        else if(s.charAt(i)=='7') {
            return "seven";
        }
        else if(s.charAt(i)=='8') {
            return "eight";
        }
        else {
            return "nine";
        }
    }
    String numberstoString(String s,int i, int j) {
        String s1="";
        if(s.charAt(i)=='0') {
            s1+=numbertoString(s, j);
        }
        else if(s.charAt(i)=='1') {
            if(s.charAt(j)=='0') {
                s1+="ten";
            }
            else if(s.charAt(j)=='1') {
                s1+="eleven";
            }
            else if(s.charAt(j)=='2') {
                s1+="twelve";
            }
            else if(s.charAt(j)=='3') {
                s1+="thirteen";
            }
            else if(s.charAt(j)=='4') {
                s1+="fourteen";
            }
            else if(s.charAt(j)=='5') {
                s1+="fifteen";
            }
            else if(s.charAt(j)=='6') {
                s1+="sixteen";
            }
            else if(s.charAt(j)=='7') {
                s1+="seventeen";
            }
            else if(s.charAt(j)=='8') {
                s1+="eighteen";
            }
            else if(s.charAt(j)=='9') {
                s1+="nineteen";
            }
        }
        else if(s.charAt(i)=='2') {
            s1+="twenty";
            s1+=" " +numbertoString(s, j);
        }
        else if(s.charAt(i)=='3') {
            s1+="thirty";
            s1+=" " +numbertoString(s, j);
        }
        else if(s.charAt(i)=='4') {
            s1+="forty";
            s1+=" " +numbertoString(s, j);
        }
        else if(s.charAt(i)=='5') {
            s1+="fifty";
            s1+=" " +numbertoString(s, j);
        }
        else if(s.charAt(i)=='6') {
            s1+="sixty";
            s1+=" " +numbertoString(s, j);
        }
        else if(s.charAt(i)=='7') {
            s1+="seventy";
            s1+=" " +numbertoString(s, j);
        }
        else if(s.charAt(i)=='8') {
            s1+="eighty";
            s1+=" " +numbertoString(s, j);
        }
        else if(s.charAt(i)=='9') {
            s1+="ninety";
            s1+=" " +numbertoString(s, j);
        }
        return s1;
    }
    String convertToWords(long n) {
        // code here
        String res="";
        String s=Long.toString(n);
        String hundreds="";
        String tens="";
        String thousands="";
        String lakhs="";
        String crores="";
        int i;
        i=s.length()-1;
        if(s.length()==1) {
            return numbertoString(s, i);
        }
        i=s.length()-2;
        if(s.length()>=2) {
            tens+=numberstoString(s, i, i+1);
        }
        i=s.length()-3;
        if(s.length()>=3) {
            if(s.charAt(i)!='0')
                hundreds+=numbertoString(s, i)+" hundred";
            if(s.charAt(i+1)!='0' || s.charAt(i+2)!='0')
                hundreds+=" and";
        }
        i=s.length()-4;
        if(s.length()>=4) {
            i=s.length()-5;
            if(s.length()>=5) {
                if(s.charAt(i)!='0')
                    thousands+=numberstoString(s, i, i+1)+" thousand";
                else {
                    i=s.length()-4;
                    if(s.charAt(i)!='0')
                        thousands+=numbertoString(s, i)+" thousand";
                }
            }
            else {
                i=s.length()-4;
                if(s.charAt(i)!='0')
                    thousands+=numbertoString(s, i)+" thousand";
            }

        }
        i=s.length()-6;
        if(s.length()>=6) {
            i=s.length()-7;
            if(s.length()>=7) {
                if(s.charAt(i)!='0')
                    lakhs+=numberstoString(s, i, i+1)+" lakh";
                else {
                    i=s.length()-6;
                    if(s.charAt(i)!='0')
                        lakhs+=numbertoString(s, i)+" lakh";
                }
            }
            else {
                i=s.length()-6;
                if(s.charAt(i)!='0')
                    lakhs+=numbertoString(s, i)+" lakh";
            }

        }
        i=s.length()-8;
        if(s.length()>=8) {
            i=s.length()-9;
            if(s.length()>=9) {
                if(s.charAt(i)!='0')
                    crores+=numberstoString(s, i, i+1)+" crore";
                else {
                    i=s.length()-8;
                    if(s.charAt(i)!='0')
                        crores+=numbertoString(s, i)+" crore";
                }
            }
            else {
                i=s.length()-8;
                if(s.charAt(i)!='0')
                    crores+=numbertoString(s, i)+" crore";
            }

        }

        String re=crores+" "+lakhs+" "+thousands+" "+hundreds+" "+tens;
        int flag=0;
        String s2="";
        for(int k=0;k<re.length();k++) {
            if(s2.length()==0 && re.charAt(k)==' ') {
                continue;
            }
            if(re.charAt(k)!=' ') {
                s2+=""+re.charAt(k);
                flag=0;
            }
            else if(re.charAt(k)==' ' && flag==0) {
                s2+=""+re.charAt(k);
                flag+=1;
            }

        }
        return s2;
    }
}
