import java.io.IOException;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Assassin> lol = new ArrayList<Assassin>();
		lol.add(new Assassin(0, "lol", "derek", "nah", null));
		ObjectIO.writeObject("lol.txt", lol);
		@SuppressWarnings("unchecked")
		ArrayList<Assassin> lolz = (ArrayList<Assassin>) ObjectIO.readObject("lol.txt", ArrayList.class);
		System.out.println(lolz);
	}
}
