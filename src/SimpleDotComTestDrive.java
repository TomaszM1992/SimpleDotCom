import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SimpleDotComTestDrive {

	@Test
	public void test() {
		DotCom dot = new DotCom();
		Integer intran = new Integer(2);
		Integer intran2 = new Integer(2+1);
		Integer intran3 = new Integer(2+2);
		ArrayList <String> locations = new ArrayList<>();
		locations.add(intran.toString());
		locations.add(intran2.toString());
		locations.add(intran3.toString());
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);

		assertEquals("hit", result);
	}

}
