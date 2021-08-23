public class StaticTestBean{
	
	///Field
	int i;
	static int j;
	
	///Static Block
	static{
		System.out.println("A> : j = "+j);
		j = 1;
		System.out.println("B> : j = "+j);
	}
	
	///constructor
	public StaticTestBean(){
		System.out.println("ObjectTest default Constructor :: C> : i = "+i );
	}
	
	///mehtod(instance method)
	public void printInstanceInt(){
		System.out.println("D> : i = " +i);
	}
	///static method ( OR class method )
	public static void printClassInt(){
		System.out.println("E> : j = "+j);

		//System.out.println("E> : i = "+i);
		//instance변수는 사용할수 없다.
	}
	
}//end of class