import java.io.*;
import java.util.*;

public class GameHelper {
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int [] grid = new int [gridSize];
	private int comCount = 0;
	
	
	public ArrayList<String> placeDotCom(int size){
		ArrayList<String> locs = new ArrayList<>(size);
		return locs;
	}
	
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.println(prompt + " ");
		
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length()==0) return null;
		}catch (IOException e){
				System.out.println("IOException: " + e);
			}
			return inputLine.toLowerCase();
		}

	public void checkUserGuess() {
		// TODO Auto-generated method stub
		
	}
}
