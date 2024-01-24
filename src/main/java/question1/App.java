package question1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String userInput = reader.readLine();
			System.out.println(userInput + "bc");
		} catch (Exception e) {
		}
	}
}
