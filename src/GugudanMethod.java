
public class GugudanMethod {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
		System.out.println(result[i]);
		}
	}
	
	public static void main(String args[]) {
//		int[] result2 = calculate(2);
//		print(result2);
//		
//		System.out.println("==================");
//		
//		int[] result4 = calculate(4);
//		print(result4);
		
		for(int i=2; i<10; i++) {
			int[] result = calculate(i);
			print(result);
			System.out.println("===========");
		}
	}
}
