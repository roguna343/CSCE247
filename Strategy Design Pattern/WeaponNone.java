/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class WeaponNone implements WeaponBehavior {
	
	public void attack() { //allows the character to state that they have no weapon.
		System.out.println("Oh no! I lost my weapon");
	}

}
