public class ExceptionTest03{
	//Field
	private int sum;
	private int avg;

	//Consturctor
	public ExceptionTest03(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1. ==> sum 시작");
		sum = x+y;
		System.out.println("1. ==> 합 : "+sum);
		System.out.println("1. ==> sum 끝 ");
	}

	//인자값으로 0이 들어오면 문제 발생
	public void avg(int z)throws ArithmeticException{
		System.out.println("2. ==> avg 시작");
		//z = 0 인경우 불능
		avg = sum/z;
		System.out.println("2. ==> 평균 : "+ avg);
		System.out.println("2. ==> avg 끝");
	}

	public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest03 et = new ExceptionTest03();
		et.sum(i,j);
				
		// 어떤 Exception이 발생하는지 확인하자.
		et.avg(k);
		
		System.out.println("main Method End ...");
	}
}