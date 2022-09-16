package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("**** Mini Calculator V1 ****");
		System.out.print("계산 모드를 입력해주세요! > 1 계산 모드 2) 끝내기 ");

		Scanner sc = new Scanner(System.in);
		int mode = 0;
		mode = sc.nextInt();
		String operator = null;

		if (mode == 2) {
			System.out.println("**** Bye! Mini Calculator ****");
			sc.close();
		} else {
			while (true) {
				System.out.print("연산자를 입력해주세요! (+, -, *, /) ");
				operator = sc.next();

				if (!operator.equals("exit")) {
					System.out.print("피연산자 2개를 입력해주세요. (구분자: 공백) ");
					int x = sc.nextInt();
					int y = sc.nextInt();

					switch (operator) {
					case "+":
						System.out.println(x + y);
						break;

					case "-":
						System.out.println(x - y);
						break;

					case "*":
						System.out.println(x * y);
						break;
						
					case "/":
						if (x == 0 || y == 0) {
							System.out.println("피연산자는 0이 아닌 숫자여야합니다.");
						} else {
							double z = Math.round(((double)x / y) * 1000) / 1000.0;
							// Math.round((double)(x/y) * 100) / 100.0; 
							System.out.println(z);
						}
					}
				} else if (operator.equals("exit")) {
					System.out.println("**** Bye! Mini Calculator ****");
					break;
				}
			}
		}
	}
}