/*
 * Rawlings Oguna - roguna@email.sc.edu
 * CSCE 247-001 - Software Engineering
 * Assignment: Strategy Design Pattern
 * 9 September 2019
 */
public abstract class Character {
	
	protected String name; //name of the character
	protected WeaponBehavior weaponBehavior; //weapon behavior of the character's weapon
	
	public Character(String name) { //sets the character's name with the one passed as the parameter.
		this.name = name;
	}
	
	public void attack() { //allows the character to attack with their respective weapon
		this.weaponBehavior.attack();
	}

	protected void setWeaponBehavior(WeaponBehavior wb) { //sets the character's weapon behavior
		this.weaponBehavior = wb;
	}
	
	public abstract void display(); //displays the character's unique message, along with their name
}
