//Johnny Palatianos
//Ryan Kushner
//Joshua Zarb
//03-09-2017

public class Assassin
{
  public int id;
  public String firstN;
  public String lastN;
  public Assassin target;
  public boolean alive;
  
  public Assassin(int i, String f, String l, Assassin t) {
	  id = i;
	  firstN = f;
	  lastN = l;
	  target = t;
	  alive = true;
  }
  
  public String toString() {
	  return "id = " + id + ". Name is " + firstN + " " + lastN + ". This kid is alive: " + alive + " target:" + target; 
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
  
  public Assassin getTarget() {
	  return target;
  }
}
