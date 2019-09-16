import java.util.ArrayList;
/**
 * 
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Observer Design Pattern
 * 16 September 2019
 */
 
public class Watchman implements Subject {
	
	private ArrayList<Observer> observers; //the list of observers.
	private int warning = 0; //the number of trumpet calls heard.

	/**
	 * Main constructor; initializes the Arraylist of observers needed for the TownDriver class.
	 */
	public Watchman() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * Registers and adds an observer to the list of observers.
	 * @param observer
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * Removes an observer from the list of observers.
	 * @param observer
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * Notifies and updates the observers with any changes.
	 * @param observer
	 */
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(warning);
		}
	}
	
	/**
	 * Issues a warning to the watchman; the severity of the warning depends on the number of trumpet calls heard.
	 * @param warning - the number of trumpet calls heard; must be either 1 or 2.
	 */
	public void issueWarning(int warning) {
		this.warning = warning;
		
		if(warning == 1) 
			System.out.println("WARNING:  1 trumpet was played!");
		else if(warning == 2) 
			System.out.println("WARNING:  2 trumpets were played!");
	
		notifyObservers();
	}

}
