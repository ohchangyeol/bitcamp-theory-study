class TopSecret04{
    // field 
    //final modifier - ��ӺҰ�
    private final int secretNo = 7777;

    //Constructor
    private TopSecret04() {
    }
    //Method
    //getter method
    public int getSecretNo (int pwd) {
        if (pwd == 0){
            return secretNo;
        }else{
            return 0;
        }
    }
    public static TopSecret04 getInstance(int managerNo){
        if(managerNo == 1234){
            return new TopSecret04();
        }else{
            return null;
        }
    }
}// end class

public class ModifierTest04{
    public static void main(String[] args) {
        // TopSecret topSecret = new TopSecret();

        TopSecret04 topSecret = TopSecret04.getInstance(1234);
        System.out.println(topSecret.getSecretNo(0));
    }//end main
} //end class