import java.util.ArrayList;
public class RandomAssignment 
{
	public static void main(String[] args)
	{
		//what is the point of this - Derek Zhang
		//ArrayList<Assassin> x = new ArrayList<>();
	}
	public static void randomize(ArrayList<Assassin> a)
	{
		
		ArrayList <Integer> holder = new ArrayList<>();
		for(int x = 0; x < a.size(); x++)
		{
			
			int randNum = (int)(Math.random()*a.size());
			while(holder.contains(randNum) == true)
			{
				randNum = (int)(Math.random()*a.size());
			}
			holder.add(randNum);
			
			Assassin temp = a.get(randNum);
			a.set(randNum, a.get(x));
			a.set(x, temp);
		}
	}//end randomize
}//end class