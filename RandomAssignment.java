import java.util.ArrayList;
public class RandomAssignment 
{
	public static void main(String[] args)
	{
		ArrayList<Assassin> x = new ArrayList<>();
	}
	public static void randomize(ArrayList<Assassin> a)
	{
		for(int x = 0; x < a.size(); x++)
		{
			ArrayList <Integer> holder = new ArrayList<>();
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