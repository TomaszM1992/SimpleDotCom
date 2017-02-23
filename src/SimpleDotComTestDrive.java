import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleDotComTestDrive {

	@Test
	public void test() {
		SimpleDotCom dot = new SimpleDotCom();
		int [] locations = {2,3,4};
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult);
		assertEquals("passed", testResult);
	}

}
