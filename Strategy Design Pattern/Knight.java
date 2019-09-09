/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public class Knight extends Character {
	
	public Knight(String name) {
		super(name); //sets the knight's name with the respective name passed through the parent's constructor.
		super.setWeaponBehavior(new WeaponBow()); //arms the knight with a bow.
	}
	
	public void display() { //states, along with his name, that the knight is valiant.
		System.out.println(this.name + " is a valiant knight");
	}

}
