public class Prob01 {

	//��ȯ
	public int[] outArrInt (int[] output, String[] input){
		for (int i = 0 ;i < output.length ;i++ ){
			output[i]= Integer.parseInt(input[i]);
		}
		return output;
	}
	public static void main(String[] args){
		int largest = 0;
		int smallest = 10000;
		int sum = 0;
		double average = 0.0;	

		int[] array = new int[args.length];
		int arrL = array.length;
		
		Prob01 p = new Prob01();
		array = p.outArrInt(array,args);
		
		for(int i = 0 ; i < arrL ; i++){
			if(largest < array[i]){
				largest=array[i];
			}
			if (smallest > array[i]){
				smallest = array[i];
			 }
		sum += array[i];	
		}
		System.out.println("\n=======================");

		average = (double)sum/ arrL;
		
		System.out.println("the largest value = " + largest);
		System.out.println("the smallest value = " + smallest);
		System.out.println("the total value = " + sum);
		System.out.println("the average value = " + average);
	}
}