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
    // ==> 사용되지 않고 하위클레스에 overRiding 을 강제로 추상하는 메서드 정의
    // public void charge() {
    //     System.out.println("학생 : 300, 일반인 : 500, 어르신 : 공짜");
    // }
    public abstract void charge();
}// end of class

class Student extends BusCharge{
    public Student() {
        super("학생");
    }
    public void charge() {
        System.out.println(" :: 300원 \n");
    }
}// end of class

class Adult extends BusCharge{
    public Adult() {
        super("일반인");
    }
    public void charge() {
        System.out.println(" :: 500원 \n");
    }
}// end of class

class Old extends BusCharge{
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
        Student b1 = new Student ();
        Adult b2 = new Adult ();
        Old b3 = new Old ();

        b1.information(); // BusCharge class 안에 information 호출. 
        System.out.print(b1.section); 
        b1.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Student Student안에 있는 charge를 실행

        b2.information();
        System.out.print(b2.section);
        b2.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Adult Adult안에 있는 charge를 실행
        
        b3.information();
        System.out.print(b3.section);
        b3.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Old Old안에 있는 charge를 실행
        
        // abstract class 는 객체생성 불가.
        // BusCharge bc1 = new BusCharge();
        //객체생성은 불가하나 , 변수의 선언 data Type은 가능.
        // BusCharge bc02;

    }
}