public interface PayOut{
    // interface Field ==> public static final 특성을 갖는다.
    public static final String payOut = "출금";

    // interface method ==> public abstract 특성을 갖는다.
    public abstract void payOut(int money);
}