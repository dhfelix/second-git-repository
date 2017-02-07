package example.dhfelix;

public class HelloWorld {

	private String message;

	public HelloWorld() {
		message = "hello world";
	}

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.getMessage());
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
