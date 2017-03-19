import java.io.Serializable;

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
public int id;
  public String firstN;
  public String lastN;
  public Assassin target;
  public boolean alive;
  public String email;
  
  public Assassin(int i, String f, String l, String e, Assassin t) {
	  id = i;
	  firstN = f;
	  lastN = l;
	  target = t;
	  alive = true;
	  email = e;
  }
  
  public String toString() {
	  return "id =[" + id + "] Name is [" + firstN + "] [" + lastN + "] This kid is alive: [" + alive + "] target: [" + target + "]"; 
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
  
  public int getID() {
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
}
