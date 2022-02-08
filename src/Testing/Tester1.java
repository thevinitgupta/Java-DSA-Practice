package Testing;
class NumberGenerator {
    private static int counter;
    private int num1;
    static {
        counter = 101;
    }
    public NumberGenerator(int num1){
        this.num1 = NumberGenerator.counter - num1;
        NumberGenerator.counter -= num1;
    }
    public static int generateNumber(){
        return NumberGenerator.counter+10;
    }
    public void updateNumber(int val1,int val2){
        if(val1 >= val2){
            NumberGenerator.counter -= (this.num1+val1);
        }
        else {
            NumberGenerator.counter += (this.num1 - val2);
        }
    }
}
public class Tester1 {
    public static void main(String[] args) {
        NumberGenerator numGenObj1 = new NumberGenerator(2);
        numGenObj1.updateNumber(2,4);
        NumberGenerator numGenObj2 = new NumberGenerator(3);
        System.out.println(NumberGenerator.generateNumber());
    }
}
