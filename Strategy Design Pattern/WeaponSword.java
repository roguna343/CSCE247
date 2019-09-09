/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class WeaponSword implements WeaponBehavior {
	
	public void attack() { //allows the character to attack with a sword, if armed with said sword.
		System.out.println("Lunge and strike with sword");
	}

}
