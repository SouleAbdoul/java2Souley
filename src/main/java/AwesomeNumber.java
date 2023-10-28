public class AwesomeNumber {
    private int num;
    public AwesomeNumber(int b){
       this.num = b;
    }

    public static AwesomeNumber add(AwesomeNumber a, AwesomeNumber b){
        int c = a.num + b.num;
        return new AwesomeNumber( c);
    }
    public static AwesomeNumber subtract(AwesomeNumber a, AwesomeNumber b){
        int c = a.num - b.num;
        return new AwesomeNumber(c);
    }

    public int getNum() {
        return num;
    }
}

