public class Request {
    private long num1;
    private long num2;

    public Request() {
    }

    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }

    public long getNum2() {
        return num2;
    }

    public void setNum2(long num2) {
        this.num2 = num2;
    }

    @Override public String toString() {
        return "Request{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
}
