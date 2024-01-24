package question1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Base64;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

	private final InputStream systemIn = System.in;
	private final PrintStream systemOut = System.out;
	private ByteArrayOutputStream testOut;

	@BeforeEach
	public void setUpOutput() {
		testOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(testOut));
	}

	private void provideInput(String data) {
		ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
		System.setIn(testIn);
	}

	private String getOutput() {
		return testOut.toString();
	}

	@AfterEach
	public void restoreSystemInputOutput() {
		System.setIn(systemIn);
		System.setOut(systemOut);
	}

	@Test
	public void testCase1() {
		String input = "ああああ";
		provideInput(input);

		App.main(new String[0]);

		String output = getOutput();

		
	    // デコードしたいBase64エンコードされた文字列（コンソールから取ってきた文字）
	    String encodedString = output.trim();

	    // Base64デコーダーを取得し、デコード
	    byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

	    // バイト配列を文字列に変換
	    String decodedString = new String(decodedBytes);

	    // 結果を比較
	    Assertions.assertThat(decodedString).isEqualTo(input);
		
	}

}
