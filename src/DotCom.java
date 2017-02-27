import java.util.*;

public class DotCom {
	private String name;
	private ArrayList<String> locationCells;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}
				
	public String checkYourself (String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index>=0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			}else {
				result = "hit";
			}
		}	
		return result;
	}	
}