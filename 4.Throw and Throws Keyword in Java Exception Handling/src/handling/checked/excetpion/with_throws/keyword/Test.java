package handling.checked.excetpion.with_throws.keyword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("abc.txt");
		BufferedReader read = new BufferedReader(reader);
		System.out.println(read.readLine());

	}
	
	// filenotfound exception is sub class of IOException

}
