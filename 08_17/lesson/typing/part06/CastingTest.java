class Super{	
    ///method
    public void a (){
        System.out.println("Super = a()");
    }
}

class Sub01 extends Super{
    ///Overriding
    public void a (){System.out.println("overriding 된 Sub = a()");}
	///Method
    public void b (){System.out.println("Sub = a()");}
}
class Sub02 extends Super{
	String name = "될까?";
	///Method
    public void b (){System.out.println("Sub = a()");}
}
public class CastingTest{
    //Main
    public static void main(String[] args) {
		Super test1 = new Super();
		Super test2 = new Sub01();
		Super test3 = new Sub02();
		test1.a();
		System.out.println("============================");
		//test2.b(); / b()라는것을 찾을수 없음.

		//System.out.println(test3.name);
		Sub02 test4 = (Sub02)test3;
		System.out.println(test4.name);
	}
}