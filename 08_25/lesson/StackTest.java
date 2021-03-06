//package jp01.part09;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		String value = new String("1 : 全辨悼");
		stack.push(value);
		stack.push(new String("2 : 捞鉴脚"));
		stack.push("3 : 林根");
		
		System.out.println("==> 历厘等 Data :" + stack);
		System.out.println("==> 历厘等 Data 肮荐" + stack.size());
		String str1 = stack.pop();
		System.out.println(str1);

		System.out.println("==> 历厘等 Data :" + stack);
		System.out.println("==> 历厘等 Data 肮荐" + stack.size());
		String str2 = stack.peek();
		System.out.println(str2 + "peek" );

		System.out.println("==> 历厘等 Data :" + stack);
		System.out.println("==> 历厘等 Data 肮荐" + stack.size());
		while (!stack.isEmpty()) {
			String str3 = (String)stack.pop();
			System.out.println(str3);
		}
	}
}
