package test;

public class Display {

	private String name;

	public Display(String name) {
		this.name = name;
	}

	public void displayName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Display display = new Display("My name is shailesh");
		display.displayName();
		System.out.println("This is a demo");
	}

}
