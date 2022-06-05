package Contests.WeeklyContests.Contest296;

public class TextEditor {
    int curs;
    StringBuilder text;
    public TextEditor() {
        this.curs = -1;
        this.text = new StringBuilder("");
    }

    public void addText(String text) {
        if(curs<0) this.text.insert(0,text);
        else if(curs==this.text.length()-1) this.text.append(text);
        else this.text.insert(curs+1, text);
        this.curs += text.length();
    }

    public int deleteText(int k) {
        if(this.text.length()==0) return 0;
        int start = Math.max((curs+1)-k,0);
        int del = 0;
        this.text.delete(start,curs+1);
        if(start==0) del = curs+1;
        else del = k;
        curs -= k;
        if(curs<-1) curs = -1;
        return del;
    }

    public String cursorLeft(int k) {
        curs -= k;
        if(curs<-1) {
            curs = -1;
            return "";
        }

        int left = Math.min(10, curs+1);
        String ret = this.text.substring((curs+1)-left,curs+1);
        return ret;
    }

    public String cursorRight(int k) {
        curs += k;
        if(curs>=this.text.length()) curs = this.text.length()-1;

        int left = Math.min(10, curs+1);
        String ret = this.text.substring((curs+1)-left,curs+1);
        return ret;
    }
}
