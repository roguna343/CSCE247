/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class Queen extends Character {
	
	public Queen(String name) {
		super(name); //sets the queen's name according to the name passed by the parameter.
		super.setWeaponBehavior(new WeaponKnife()); //arms the queen with a knife.
	}
	
	public void display() { //states that the queen is beautiful.
		System.out.println(this.name + " is a beautiful queen");
	}

}
