/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class WeaponKnife implements WeaponBehavior {

	public void attack() { //allows the character to attack with a knife, if armed with said knife.
		System.out.println("Slice with knife");
	}
}
