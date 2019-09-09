/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class Troll extends Character {
	
	public Troll(String name) {
		super(name); //sets the troll's name according to the name taken in by parameter.
		super.setWeaponBehavior(new WeaponAxe()); //sets the troll to be armed with an axe.
	}

	public void display() { //states that the troll is funny.
		System.out.println(this.name + " is a funny troll");
	}
}
