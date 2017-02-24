import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleDotComTestDrive {

	@Test
	public void test() {
		DotCom dot = new DotCom();
		int [] locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);

		assertEquals("hit", result);
	}

}
