/*
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Observer Design Pattern
 * 16 September 2019
 */
public class Knight implements Observer {
	
	private Subject watchman; //the Subject instance that will be observed.
	
	/**
	 * main constructor; initializes the watchman 
	 * @param watchman - the Subject instance that will be observed.
	 */
	public Knight(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	/**
	 * responsible for the knight's warning status depending on the number of trumpet calls heard.
	 * @param warning - the number of trumpet calls heard by the knight.
	 */
	public void update(int warning) {
		if(warning == 1) 
			System.out.println("Knight: Helps everyone get home safe");
		else if (warning == 2)
			System.out.println("Knight: Prepares for battle");
	}

}
