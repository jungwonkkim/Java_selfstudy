package kr.co.infopub.chapter.s014;

class JLocation{
	public double lat;
	public double lng;
}

public class JavaUserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� ���� �⺻ Ÿ��
		double latitude=37.123412341234;
		double longitude=127.123412341234;
		JLocation jloc=new JLocation();
		jloc.lat = latitude;
		jloc.lng = longitude;
		
		JLocation newLoc=jloc;
		System.out.println(newLoc.lat);

	}

}
