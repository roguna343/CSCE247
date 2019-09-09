/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class WeaponBow implements WeaponBehavior {

	public void attack() { //allows the character to attack with a bow, if armed with said bow.
		System.out.println("Draw and loose an arrow");
	}
}
