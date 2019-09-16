/**
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Observer Design Pattern
 * 16 September 2019
 * 
 * The Observer interface that will be implemented into the ShopOwner, Teacher and Knight classes.
 */


public interface Observer {
	
	/**
	 * Updates the observer's warning status.
	 * @param warning - the number of trumpet calls heard by the observer; must be 1 or 2.
	 */
	public void update(int warning);

}
