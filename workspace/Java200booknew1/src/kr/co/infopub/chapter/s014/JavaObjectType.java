package kr.co.infopub.chapter.s014;
import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {

	public static void main(String[] args) {
		//�⺻ Ÿ���� �迭�� ���� Ÿ��
		int [] m= {1,2,3};
		int [] n=new int[] {1,2,3};
		//���� Ÿ�� - ��ü Ÿ��
		String card="H8";
		Date d = new Date(); //����
		Calendar cal = Calendar.getInstance(); // ���p
		//�ڵ����� toString�� ����
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);

	}

}
