package program.with.multi_catch.block;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			String s = null;
		    System.out.println(s.length());
		}
		catch(ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}

	}

}
