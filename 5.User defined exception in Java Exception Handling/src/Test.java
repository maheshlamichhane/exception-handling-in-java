import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age=");
		int age = sc.nextInt();
		
		try {
		if(age > 40) {
			throw new TooOldException("Age is too old");
		}
		else if(age < 15) {
			throw new TooYoungException("Age is too young");
		}
		else {
			System.out.println("You will get match detail soon1");
		}
		}
		catch(TooOldException e) {
			System.out.println(e.getMessage());
		}
		catch(TooYoungException e1) {
			e1.getMessage();
		}

	}

}
