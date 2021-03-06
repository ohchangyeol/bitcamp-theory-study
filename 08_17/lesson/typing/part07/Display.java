abstract class BusCharge{
    //Field
    String section;
    
    //Constructor
    public BusCharge() {
    }
    public BusCharge(String section) {
        this.section = section ;
    }
    //method
    public void information() {
        System.out.println("버스 요금 안내");
    }
}// end of class
interface Fee{
    public void charge();
}

class Student extends BusCharge implements Fee{
    public Student() {
        super("학생");
    }
   public void charge() {
       System.out.println(" :: 300원 \n");
   }
}// end of class

class Adult extends BusCharge implements Fee{
    public Adult() {
        super("일반인");
    }
    public void charge() {
        System.out.println(" :: 500원 \n");
    }
}// end of class

class Old extends BusCharge implements Fee{
    public Old() {
        super("일반인");
    }
    public void charge() {
        System.out.println(" :: 공짜\n");
    }
}// end of class
public class Display{
    //main
    public static void main(String[] args) {
        Student bc1 = new Student ();
        Adult bc2 = new Adult ();
        Old bc3 = new Old ();

        // bc1.information(); // BusCharge class 안에 information 호출. 
        // System.out.print(bc1.section); 
        // bc1.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Student Student안에 있는 charge를 실행

        // bc2.information();
        // System.out.print(bc2.section);
        // bc2.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Adult Adult안에 있는 charge를 실행
        
        // bc3.information();
        // System.out.print(bc3.section);
        // bc3.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Old Old안에 있는 charge를 실행

        // ==================================================
        // 컴파일시 오류
		
        Fee[] fee = new Fee[3];
        fee[0] = new Student ();
        fee[1] = new Adult ();
        fee[2] = new Old ();

        for(int i = 0 ; i < fee.length ; i++){
            ((BusCharge)fee[i]).information();
            System.out.print(((BusCharge)fee[i]).section);
            fee[i].charge();
        }
		
    }
}