package handling.checked.exception.with_throws.for_parent.handling;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		doStuff();

	}

	private static void doStuff() throws InterruptedException {
		doMoreStuff();
		
	}

	private static void doMoreStuff() throws InterruptedException {
		Thread.sleep(500);
		
	}

}
