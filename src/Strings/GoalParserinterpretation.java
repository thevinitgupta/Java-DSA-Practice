package Strings;

public class GoalParserinterpretation {
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<command.length()){
            if(command.charAt(i)=='G') {
                str.append('G');
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')') {
                str.append('o');
                i = i+2;
            }
            else {
                str.append("al");
                i = i+4;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String goal = interpret("G()()()(");
        System.out.println(goal);
    }
}
