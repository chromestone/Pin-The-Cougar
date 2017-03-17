import java.util.*;
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
public static void derekWazHere(ArrayList<Assassin> a) {
if (a.size() < 2) {

return;
}
Collections.shuffle(a);
//Assassin curr = a.get(0);
//curr.setTarget(a.get(1));
//curr = a.get(1);
//int i = 2;
for (int i=0;i< a.size();i++) {
if(i=a.size()-1)
{
a.get(i).setTarget(a.get(0));
}
a.get(i).setTarget(a.get(i+1));
}
}//end class
