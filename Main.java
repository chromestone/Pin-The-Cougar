import java.io.*;
import java.util.*;


public class Main {
	
	static final String SAVE_FILE_PATH = "save.txt";
	static final String INPUT_FILE_PATH = "input.csv";//first time input from CSV
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		ArrayList<Assassin> lol = new ArrayList<Assassin>();
		lol.add(new Assassin(0, "lol", "derek", "nah", null));
		ObjectIO.writeObject("lol.txt", lol);
		@SuppressWarnings("unchecked")
		ArrayList<Assassin> lolz = (ArrayList<Assassin>) ObjectIO.readObject("lol.txt", ArrayList.class);
		System.out.println(lolz);
		*/
		//read from file
		ArrayList<Assassin> shTheyAreJustCougars;
		File file = new File(SAVE_FILE_PATH);
		//checks if file exists which implies if the code is not first time run
		if (!file.exists()) {
			
			file = new File(INPUT_FILE_PATH);
			if (!file.exists()) {
				
				System.err.println("INPUT_FILE does not exist!");
				return;
			}
			
			shTheyAreJustCougars = CSVReader.read(INPUT_FILE_PATH);
			RandomAssignment.derekWazHere(shTheyAreJustCougars);//randomize
		}
		else {
			
			shTheyAreJustCougars = (ArrayList<Assassin>) ObjectIO.readObject(SAVE_FILE_PATH, ArrayList.class);
			//System.out.println(shTheyAreJustCougars);
			RandomAssignment.doYourThingDoYourThing(shTheyAreJustCougars);
			System.out.println(shTheyAreJustCougars);
		}

		//setting targets
		for(int x = 0; x < shTheyAreJustCougars.size(); x++)
		{
			Assassin temp = shTheyAreJustCougars.get(x);
			if(x == shTheyAreJustCougars.size() - 1)
				temp.setTarget(shTheyAreJustCougars.get(0));
			else
				temp.setTarget(shTheyAreJustCougars.get(x + 1));
		}
		System.out.println(shTheyAreJustCougars.get(0));
//		for (Assassin a : shTheyAreJustCougars) {
//			
//			System.out.println(a);
//		}
		
		//example
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//run code and stuff
		
		//save to file
		ObjectIO.writeObject(SAVE_FILE_PATH, shTheyAreJustCougars);
	}
	
	
}