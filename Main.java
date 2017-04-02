import java.io.*;
import java.util.*;

/**
 * 
 * Derek was here.
 *
 */
public class Main {
	
	static final String SAVE_FILE_PATH = "save.txt";
	static final String INPUT_FILE_PATH = "input.csv";//first time input from CSV
	
	private static TLSMailSender sender = null;
	
	@SuppressWarnings({ "unchecked", "resource" })
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
		}
		
		initSender();
		
		//print emails
		Scanner in= new Scanner(System.in);
		ArrayList<String> template = getTemplate();
		//before, reading a file again and again for over 300 times was a crazy idea
		//computers have a lot of RAM now days, use it lol - Derek Zhang
		for(Assassin a: shTheyAreJustCougars)
		{
			createEmail(template, a);
			for (int i = 0; i < 100; i++) {
				
				System.out.print("-");
			}
			System.out.println();
			in.nextLine();
		}
		
			
		
		//example
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		//run code and stuff
		
		//save to file
		ObjectIO.writeObject(SAVE_FILE_PATH, shTheyAreJustCougars);
		
		destroySender();
	}
	
	static ArrayList<String> getTemplate() {
		
		ArrayList<String> template = new ArrayList<String>();
		Scanner find = null;
		try
		{
			find = new Scanner(new File("emailTemplate.txt"));
		}
		catch(Exception e)
		{
			System.out.println("file not found");
			return template;
		}
		
		while(find.hasNext())
		{
			
			String temp = find.nextLine();
			template.add(temp);
		}
		
		find.close();
		
		return template;
	}
	
	//added method for creating emails to send 
	public static void createEmail(ArrayList<String> template, Assassin a)
	{
		Iterator<String> find = template.iterator();
		
		int spaceLoc = 0;
		while(find.hasNext())
		{
			
			String temp = find.next();
			if(temp.contains("_"))
			{
				if(spaceLoc %2 == 0)
				{
					temp = "Hello " + a.getName() + ",";
				}
				else
				{
					temp = "Your mission, if you choose to accept it, is to pin " + a.getTarget().getName() + ".";
				}
				spaceLoc++;
			}
				
			System.out.println(temp);
		}
		System.out.println();
			
	}
	
	//added method for checking if an id belongs to a senior
	
	
	
	private static void initSender() {
		
		//sender = new TLSMailSender("", "");
	}
	
	/**
	 * Don't call this in any static field declaration - initialization
	 */
	public static TLSMailSender getSender() {
		
		return sender;
	}
	
	private static void destroySender() {
		
		//sender.terminateSession();
		sender = null;
	}
}