import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

//Johnny Palatianos
//Ryan Kushner
//Joshua Zarb
//03-09-2017

public class Assassin implements Serializable
{
	/**
	 * Derek waz here. Btw this is just a generated id so that it can be saved to file
	 */
	private static final long serialVersionUID = -8691498881404609328L;
	/**
	 * WHY DID YOU GUYS MAKE THESE PUBLIC IF YOU MADE GETTER METHODS
	 * "WTF"-Derek Zhang
	 */
	public String id;
  public String firstN;
  public String lastN;
  transient public Assassin target;
  public boolean alive;
  public String email;
  public final String remind;
  
  public Assassin(String i, String f, String l, String e, Assassin t, String r) {
	  id = i;
	  firstN = f;
	  lastN = l;
	  target = t;
	  alive = true;
	  email = e;
	  remind = "yes";
  }
  
  public String toString() {
	  return "id =[" + id + "] Name is [" + firstN + "] [" + lastN + "] This kid is alive: [" + alive + "] target: [" + targetInfo() + "]"; 
  }
  
  /**
   * Use this to output target info, DO NOT INQUIRE TARGET'S TARGET
   * that's very dangerous. #targetception
   * 
   * @return
   */
  private String targetInfo() {
	  
	  return "id =[" + target.id + "] Name is [" + target.firstN + "] [" + target.lastN + "]";
  }
  
  public void setTarget(Assassin x) {
	  target = x;
	  return;
  }

  public void kill(Assassin victim) {
	  victim.alive = false;
	  this.target = victim.target;
	  return;
  }
  
  public boolean isAlive() {
	  return alive;
  }
  
  public String getID() {
	  return id;
  }
  
  public String getName() {
	  return firstN + " " + lastN;
  }
  
  public String getEmail() {
	  return email;
  }
  
  public Assassin getTarget() {
	  return target;
  }
  
  /**
   * You guys are the best programmers for neglecting this method. Poor .equals() method.
   * I love you equals method. Who's a good boy (returns true). Yes you are, you're a good boy. *pats on the method HEADer*
   */
  @Override
  public boolean equals(Object obj) {
	  
	  if (obj instanceof Assassin) {
		  
		  Assassin other = (Assassin) obj;
		  
		  return this.id == other.id;
	  }
	  
	  return false;
  }
  
  public boolean seniorCheck()
	{
		Scanner in = new Scanner(System.in);
		try
		{
			in = new Scanner(new File("IDs.txt"));
		}
		catch(Exception e)
		{
			System.out.println("Cannot Find File");
		}
		
		ArrayList<String> id = new ArrayList<>();
		while(in.hasNext())
		{
			String temp = in.nextLine();
			id.add(temp.trim());
			System.out.println(temp);
		}
		if(id.contains(this.getID()))
			return true;
		return false;
	}
  
  public static void main(String[] args) 
  {
	  Assassin john = new Assassin("313126", "John", "Pats", "313126@mcpsmd.net", new Assassin("31126", "John", "Pats", "313126@mcpsmd.net", null, ""), "");
	  System.out.println(john);
	  System.out.println(john.seniorCheck());
  }

}