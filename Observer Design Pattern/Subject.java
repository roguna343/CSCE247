/*
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Observer Design Pattern
 * 16 September 2019
 */
public interface Subject {
	
	/**
	 * Registers and adds an observer to the list of observers.
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Removes an observer from the list of observers.
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * Notifies the observers of any changes.
	 */
	public void notifyObservers();

}
