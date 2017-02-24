import java.util.ArrayList;

public class SimpleDotComGame {

	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		DotCom theDotCom = new DotCom();
		int randomNum = (int) (Math.random()*5);
		Integer intran = new Integer(randomNum);
		Integer intran2 = new Integer(randomNum+1);
		Integer intran3 = new Integer(randomNum+2);
		ArrayList <String> locations = new ArrayList<>();
		locations.add(intran.toString());
		locations.add(intran2.toString());
		locations.add(intran3.toString());
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while (isAlive) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}

}
