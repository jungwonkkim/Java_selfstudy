package inflearnPjT;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
//		
//		if(num1>num2) {
//			System.out.println("num1�� num2���� �۴�");
//		} else {
//			System.out.println("num1�� num2���� ũ�� �ʴ�.");
//		}
//		
//		if(num1 > num2) {
//			System.out.println("num1�� num2 ���� ũ��");
//		} else if(num1 == num2) {
//			System.out.println("num1�� num2�� ����");
//		} else {
//			System.out.println("num1�� num2���� �۴�.");
//		}
//		
//		if(true) {
//			System.out.println("***************");
//		}
//		
		System.out.println("������ �Է��ϼ��� : ");
		Scanner inputNum = new Scanner(System.in); //input ���ֱ� ���� ��ġ(���� java.util.Scanner import)
		int score = inputNum.nextInt(); //���ڸ� �Է¹޴� ��
		
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
		inputNum.close(); // �ѹ��� �޴� �ǵ��� ���⼭ close�� ����� �ϳ�����.
		
	}

}
