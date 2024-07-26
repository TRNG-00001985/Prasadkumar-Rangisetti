public  abstract class Character {
	protected String name;
	protected String race;
	protected int level;
	protected int health=100;
	public Character(String name, String race, int level) {
		
		this.name = name;
		this.race = race;
		this.level = level;
	}
	
	public void attack(Character enemy) {
		this.health-=30;
		
	}
	public void drinkPotion() {
		this.health+=50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
}
class Human extends Character{
	public Human(String name,int level) {
		super(name,"Human",level);
	}
}
