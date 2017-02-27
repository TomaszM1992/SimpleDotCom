import java.util.ArrayList;

public class DotComBust {

	private int numOfGuesses = 0;		
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	
	
	private void setUpGame (){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your goal is to sink three dot coms. ");
		System.out.println("Pets.com, eToys.com and Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
				
		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying (){
		while (!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter target");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	void checkUserGuess(String uGuess){
		numOfGuesses++;
		String result = "miss";
		
		for (DotCom dotComToTest : dotComList) {
			result = dotComToTest.checkYourself(uGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	void finishGame(){
		System.out.println("All Dot Coms are dead! Your stock is now worthless. ");
		if (numOfGuesses<=18) {
			System.out.println("Congrats!");
		} else {
			System.out.println("Took you long enough you weak creature");
		}
	}
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}	
}
