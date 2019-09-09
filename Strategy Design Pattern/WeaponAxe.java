/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class WeaponAxe implements WeaponBehavior {

	public void attack() { //allows the character to swing an axe, if armed with an axe.
		System.out.println("Swing an axe");
	}

}
