package question1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;

public class App {
	
	private static String mode;

	public static void main(String[] args) {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String originalString = reader.readLine();
			
	        // 文字列をバイト配列に変換
	        byte[] bytesToEncode = originalString.getBytes();

	        // Base64エンコーダーを取得し、エンコード
	        String encodedString = Base64.getEncoder().encodeToString(bytesToEncode);

	        // 結果を出力
	        System.out.println(encodedString);
			
		} catch (Exception e) {
		}
	}
	
	
}
