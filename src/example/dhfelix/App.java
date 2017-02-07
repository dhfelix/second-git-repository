package example.dhfelix;

public class App {

	private App() {
		// no code
	}

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld);

		helloWorld = new HelloWorld("Hello world from constructor");
		System.out.println(helloWorld);

	}

}
