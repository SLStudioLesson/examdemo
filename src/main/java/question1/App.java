package question1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("何か入力してください: ");
        try {
            String userInput = reader.readLine();
            System.out.println("あなたが入力した内容: " + userInput);
        } catch (Exception e) {

        }		
	}
}
