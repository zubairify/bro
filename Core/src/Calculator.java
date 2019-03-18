
public class Calculator {
	public static void sum(int...numbers) {
		int sum = 0;
		for (int num : numbers) 
			sum += num;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
//		int[] nums = {10, 20, 30, 40};
		Calculator.sum(10, 20, 30, 40);
		Calculator.sum(1,2,3,4,5,6,7);
		
	}
}
