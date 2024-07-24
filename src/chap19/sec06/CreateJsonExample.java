package chap19.sec06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;




public class CreateJsonExample {

	public static void main (String[] args) throws IOException{
		
		JSONObject root = new JSONObject(); // JSON 객체 생성
		
		root.put("id","winter");
		root.put("name","한겨울");
		root.put("age",25);
		root.put("student",true);
		
		JSONObject tel = new JSONObject(); // JSON 객체 생성
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		
		root.put("tel", tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill",skill);
		
		//JSON 얻기
		String json = root.toString();
		System.out.println(json); // 콘솔에 출력
		
		//파일로 저장
		Writer writer = new FileWriter("C:/Temp/member.json",Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();
	}

}
