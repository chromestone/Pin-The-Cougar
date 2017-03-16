import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Derek Zhang
 *
 */
public final class CSVReader {

	private CSVReader() {}

	public static ArrayList<Assassin> read(String filePath) throws FileNotFoundException {
				
		File file = new File(filePath);
		
		Scanner scanner = new Scanner(file);
		
		ArrayList<Assassin> aList = new ArrayList<Assassin>();
		
		if (!scanner.hasNextLine()) {
			
			scanner.close();
			return aList;
		}
		
		//ignore first line
		scanner.nextLine();
		
		while (scanner.hasNextLine()) {
			
			String aString = scanner.nextLine();
			String[] values = aString.split(",");
			aList.add(new Assassin(Integer.parseInt(values[3]), values[1], values[2], values[5], null));
		}
		
		scanner.close();
		
		return aList;
	}
}
