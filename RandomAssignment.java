import java.util.*;
public class RandomAssignment 
{
	public static void main(String[] args)
	{
		//ArrayList<Assassin> x = new ArrayList<>();
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
	
	/**
	 * A better randomizer and linker by Derek Zhang.
	 * <br>
	 * Uses collection's shuffle method and the calls doYourThingDoYourThing
	 * which "links" the list by setting the targets of the assassins appropriately.
	 * 
	 * @param a the ArrayList to perform the operation on
	 */
	public static void derekWazHere(ArrayList<Assassin> a) 
	{
		if (a.size() < 2) {

			return;
		}
		Collections.shuffle(a);
		
		doYourThingDoYourThing(a);
	}
	
	/**
	 * Links the assassins in the list.
	 * <br>
	 * For example:
	 * given ["john", "mary", "susan"]
	 * result is ["john targets mary", "mary targets susan", "susan targets john"]
	 * 
	 * @param a the ArrayList to perform the operation on
	 */
	public static void doYourThingDoYourThing(ArrayList<Assassin> a) {
		
		if (a.size() < 2) {

			return;
		}
		
		for (int i = 0; i < a.size() - 1; i++) {

			a.get(i).setTarget(a.get(i+1));
		}
		a.get(a.size() - 1).setTarget(a.get(0));
	}
}//end class