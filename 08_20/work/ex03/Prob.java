public class Prob {
	public static void printGugudan(int n){
		if (0 > n || n > 9 ){
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다.");
			return;
		}else{
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(j + " * " + i + " = " + j*i + "\t");
				}
				System.out.print("\n");
			}
		}
	}
	//main Method
	public static void main(String[] args) {
		System.out.println("주어진 숫자까지의 구구단을 찍습니다");
		System.out.println("-------- Sample 1 --------");
		Prob.printGugudan(4);

		System.out.println("-------- Sample 2 --------");
		Prob.printGugudan(9);

		System.out.println("-------- Sample 3 --------");
		Prob.printGugudan(-1);

		System.out.println("-------- Sample 4 --------");
		Prob.printGugudan(10);
	}
}