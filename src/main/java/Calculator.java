import java.util.ArrayList;

public class Calculator implements Calcultable{

    private  ArrayList<String> op = new ArrayList<String>();
    @Override
    public Integer add(Integer number1, Integer number2) {
        int c  = number1 + number2;
        this.op.add((number1 + " " + "+" + " "  + number2 + " " + "=" + " " +c + ", "));
        return c;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int c  = number1 - number2;
        this.op.add((number1 + " " + "-" + " " + number2 + " " + "=" + " " +c + ", "));
        return c;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        int c  = number1 * number2;
        this.op.add((number1 + " " + "*" + " " + number2 + " " + "=" + " " +c + ", "));
        return c;

    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        if(number2 != 0){
            int c  = number1 / number2;
            this.op.add((number1 + " " + " /" + " " + " " + number2 + " " + "=" + " " +c + ", "));
            return c;
        }
        System.out.println("The number 2 is null");
        return 0;
    }

    @Override
    public String getHistory() {
        StringBuilder sb = new StringBuilder();
       for(String s:op){
          sb.append(s);
       }
       return (String) sb.toString();
    }
}
