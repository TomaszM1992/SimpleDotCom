import java.io.*;
import java.util.ArrayList;
public class GameHelper {
	
	public ArrayList<String> placeDotCom(){
		ArrayList<String> locs = new ArrayList<>();
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
			return inputLine;
		}

	public void checkUserGuess() {
		// TODO Auto-generated method stub
		
	}
	}
