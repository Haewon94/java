package practice_clazz;

public class ClassCreateMain {

	public static void main(String[] args) throws Exception {
		Class helloClass = Hello.class;
		//Class helloClass = Class.forName("lang.clazz.Hello");
		Hello hello =(Hello) helloClass.getDeclaredConstructor().newInstance();
	}

}
