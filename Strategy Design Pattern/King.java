/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class King extends Character {
	
	public King(String name) {
		super(name); //sets the king's name with the name passed through the parent's constructor.
		super.setWeaponBehavior(new WeaponSword()); //arms the king with a sword.
	}
	
	public void display() { //states that the king is a noble king, along with his name.
		System.out.println(this.name + " is a Noble King");
	}

}
