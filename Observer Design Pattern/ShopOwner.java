/*
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Observer Design Pattern
 * 16 September 2019
 */
public class ShopOwner implements Observer {

	private Subject watchman; //the Subject object that will be observed.
	
	/**
	 * Initializes the watchman (in this case, the shop owner) that will be observed.
	 * @param watchman - the Subject object that will be observed.
	 */
	public ShopOwner(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	/**
	 * Displays the shop owner's warning message according to the number of trumpet calls heard.
	 * The number of trumpet calls are passed through the update() method as an int argument, warning.
	 * @param warning - the number of trumpet calls the Shop Owner hears; must be either 1 or 2.
	 */
	public void update(int warning) {
		if(warning==1)
			System.out.println("Shop Owner: Close down shop and head home");
		else if (warning==2)
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
		
	}
}
