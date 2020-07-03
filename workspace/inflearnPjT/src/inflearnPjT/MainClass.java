package inflearnPjT;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
//		
//		if(num1>num2) {
//			System.out.println("num1은 num2보다 작다");
//		} else {
//			System.out.println("num1은 num2보다 크지 않다.");
//		}
//		
//		if(num1 > num2) {
//			System.out.println("num1은 num2 보다 크다");
//		} else if(num1 == num2) {
//			System.out.println("num1은 num2와 같다");
//		} else {
//			System.out.println("num1은 num2보다 작다.");
//		}
//		
//		if(true) {
//			System.out.println("***************");
//		}
//		
		System.out.println("점수를 입력하세요 : ");
		Scanner inputNum = new Scanner(System.in); //input 해주기 위한 조치(위에 java.util.Scanner import)
		int score = inputNum.nextInt(); //숫자를 입력받는 것
		
//		switch (score) {
//		case 90: {			
//			System.out.println("score is 90");
//		break;
//		}
//		case 80: {		
//			System.out.println("score is 80");
//		break;
//			}
//		case 70: {			
//			System.out.println("score is 70");
//		break;
//		}
//		case 60: {		
//			System.out.println("score is 60");
//		break;
//		}
//		case 50: {			
//			System.out.println("score is 50");
//		break;
//		}
//		default:
//			System.out.println("what??");
//		break;
//		}
//		
		for(int i=0; i<10; i++) {
			System.out.println(score * i);
		}
		inputNum.close(); // 한번만 받는 건데도 여기서 close를 해줘야 하나보다.
		
	}

}
