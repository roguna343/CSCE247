/*
 * @author Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment - Observer Design Pattern
 * 16 September 2019
 */
public class Teacher implements Observer {
	
	private Subject watchman;
	
	/**
	 * Initializes the Teacher, of whom will be observed.
	 * @param watchman - the Subject object that will be observed.
	 */
	public Teacher(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	
	/**
	 * Updates the Teacher's warning status, depending on the number of trumpet calls heard.
	 * The number of trumpet calls are passed through the update() method as an int argument, warning.
	 * @param warning - the number of trumpet calls the Teacher hears; must be either 1 or 2.
	 */
	public void update(int warning) {
		if(warning == 1)
			System.out.println("Teacher: Helps get every kid home safe");
		else if(warning == 2)
			System.out.println("Teacher: Brings all students to the underground shelter");
	}

}
