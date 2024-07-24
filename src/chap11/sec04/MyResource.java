package chap11.sec04;

public class MyResource implements AutoCloseable{
	/*try-with-resource 블록을 사용하기 위한 조건
	 *리소스는 java.lang.AutoCloseable 인터페이스를 구현해서
	 *AutoCloseable 인터페이스의 close()메서드를 재정의 해야함
	 */
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource("+name+") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource("+name+") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "abc";
	}
	
	@Override
	public void close() throws Exception{
		System.out.println("[MyResource(" + name + ") 닫기]");
	}
	
}
