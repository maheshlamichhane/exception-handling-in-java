package throwing.custom.exception.manually;

public class Test {

	public static void main(String[] args)  {
		
		try {
		throw new myException("custom exception");
		}
		catch(myException e) {
			System.out.println(e.getMessage());
		}
	}

}
