import java.util.Scanner;

public class GugudanExer {

	public static void main(String[] args) {
		// 사용자 입력 두개 받는 구구단
		System.out.println("원하는 숫자 두개를 입력 하세요 : ");
		Scanner scanner1 = new Scanner(System.in);
		String input = scanner1.nextLine();
		String[] splitInput = input.replace(" ", "").split(",");
		int front = Integer.parseInt(splitInput[0]);
		int end = Integer.parseInt(splitInput[1]);
		for(int i=2; i<front+1; i++) {
			System.out.println("==="+i+"단===");
			for(int j=1; j<end+1; j++) {
				System.out.println(i + "*" + j +"=" + i*j);
			}
		}
		
		// 사용자 입력 받는 구구단
		System.out.println("원하는 숫자를 입력하세요: ");
		Scanner scanner2 = new Scanner(System.in);
		int number = scanner2.nextInt();
		int[] result = new int[number];
		for(int i=2; i<number+1; i++) {
			System.out.println("==="+i+"단===");
			for(int j=1; j<10; j++) {
				System.out.println(i * j);
			}
		}

	}

}
