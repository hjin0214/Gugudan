import java.util.Scanner;

public class Gugudan {
	public static void main(String args[]) {
		
//		  // 2단 
//		 System.out.println("2단"); 
//		 System.out.println(2*1);
//		 System.out.println(2*2); 
//		 System.out.println(2*3); 
//		 System.out.println(2*4);
//		 System.out.println(2*5); 
//		 System.out.println(2*6); 
//		 System.out.println(2*7);
//		 System.out.println(2*8); 
//		 System.out.println(2*9);
//		  
//		 // 3단 
//		 System.out.println("3단"); 
//		 System.out.println(2*9);
//		 System.out.println(2*9); 
//		 System.out.println(2*9); 
//		 System.out.println(2*9);
//		 System.out.println(2*9); 
//		 System.out.println(2*9); 
//		 System.out.println(2*9);
//		 System.out.println(2*9); 
//		 System.out.println(2*9);
//		
//		 // 4단 
//		 System.out.println("4단"); 
//		 int result = 4*1; 
//		 System.out.println(result);
//		 result = 4 *2; 
//		 System.out.println(result); 
//		 result = 4 *3;
//		 System.out.println(result); 
//		 result = 4 *4; 
//		 System.out.println(result); 
//		 result = 4 *5; 
//		 System.out.println(result); 
//		 result = 4 *6;
//		 System.out.println(result); 
//		 result = 4 *7; 
//		 System.out.println(result); 
//		 result = 4 *8; 
//		 System.out.println(result); 
//		 result = 4 *9;
//		 System.out.println(result);
//		 
//		 // 5단 System.out.println("구구단 중 출력할 단은? :"); 
//		 Scanner scanner = new Scanner(System.in); 
//		 int number = scanner.nextInt(); 
//		 System.out.println(number *1); 
//		 System.out.println(number * 2); 
//		 System.out.println(number * 3);
//		 System.out.println(number * 4); 
//		 System.out.println(number * 5);
//		 System.out.println(number * 6); 
//		 System.out.println(number * 7);
//		 System.out.println(number * 8); 
//		 System.out.println(number * 9);
		 
//		// 6단
//		int i = 1;
//		while(i<10) {
//			System.out.println(6*i);
//			i = i+1;
//		}
//		
//		// 7단
//		for(int j=1; j<10; j++) {
//			System.out.println(7*j);
//		}
		
		//8, 9단
		System.out.println("구구단 단입력 플리즈 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		
		if(number <2) {
			System.out.println("2보다 작은 값은 입력할 수 없습니다.");
		} else if(number >9) {
			System.out.println("9보다 큰 값은 입력할 수 없습니다.");
		} else {
			for(int i=1; i<10; i++) {
				System.out.println(number * i);
			}
		}
	}
}
