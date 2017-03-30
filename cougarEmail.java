import java.io.File;
import java.io.IOException;
import java.util.*;

public class cougarEmail 
{
	static final String SAVE_FILE_PATH = "save.txt";
	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		Scanner in = null;
		Scanner asses = null;
		try
		{
			in = new Scanner(new File("emailTemplate.txt"));
			asses = new Scanner(new File("save.txt"));
		}
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		String cougar = in.nextLine();
		String target = in.nextLine();
		ArrayList<Assassin> shTheyAreJustCougars;
//		System.out.println(cougar);
		in = new Scanner(System.in);
		
	}

}
