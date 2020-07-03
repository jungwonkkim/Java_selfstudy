package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		// 원래 클래스에서 쓰는 방법
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//xml 파일을 가지고 오는 컨테이너 생성 
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);//id 입력
		transportationWalk.move();
		ctx.close();//자바에서 뭔가ㄹㄹ 호출하면 닫아줘야함 
		
	}
}
