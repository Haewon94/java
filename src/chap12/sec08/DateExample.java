package chap12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		//SimpleDateFormat은 날짜를 형식화된 문자열로 변화하는 기능을 제공함
		//format 메서드로 날짜를 제공하면 패턴과 동일한 문자열을 얻음
	}

}
