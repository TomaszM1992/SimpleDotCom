import java.util.ArrayList;

public class DotComBust {

	int numOfGuesses = 0;		
	GameHelper helper = new GameHelper();
	ArrayList<DotCom> dotComList = new ArrayList<>();
	
	void setUpGame (){
		DotCom dotCom1 = new DotCom();
		dotCom1.setName("dot1.com");
		DotCom dotCom2 = new DotCom();
		dotCom2.setName("dot2.com");
		DotCom dotCom3 = new DotCom();
		dotCom3.setName("dot3.com");
		
		dotComList.add(dotCom1);
		dotComList.add(dotCom2);
		dotComList.add(dotCom3);
		
		for (DotCom dotCom : dotComList) {
			dotCom.setLocationCells(helper.placeDotCom());
		}
	}
	
	void startPlaying (){
		while (!dotComList.isEmpty()) {
			helper.getUserInput("Enter target");
			helper.checkUserGuess();
		}
	}
	
	String checkUserGeuss(){
		return "miss";
	}
	
	int finishGame(){
		return numOfGuesses;
	}
	
	/*
	public static void main(String[] args) {
		int numOfGuesses = 0;		
		GameHelper helper = new GameHelper();
		ArrayList<DotCom> dotComList = new ArrayList<>();
		
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
			System.out.println(result);
			numOfGuesses++;
			
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
	*/
}
