class TopSecret01{
    // field 
    int secretNo = 7777;

    //Constructor
    public TopSecret01() {
    }
    //Method
    //getter method
    public int getSecretNo () {
        return secretNo;
    }
}// end class

public class ModifierTest01{
    public static void main(String[] args) {
        TopSecret01 topSecret = new TopSecret01();
        System.out.println(topSecret.secretNo);

        //secretNo를 변경하면?
        topSecret.secretNo = 1234;
        System.out.println(topSecret.secretNo);

    }
}