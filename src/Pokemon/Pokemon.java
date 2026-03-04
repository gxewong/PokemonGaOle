package Pokemon;

public class Pokemon {

	public int collectionNumber;
	public String name;
	public String status;
	public String type;
	public int grade;
	public int health;
	public int maxHealth;
	public int damage;
	
	public Pokemon(int collectionNum, String name, String status, String type, int grade, int health, int maxHealth, int damage) {
		this.collectionNumber = collectionNum;
		this.name = name;
		this.status = status;
		this.type = type;
		this.grade = grade;
		this.health = health;
		this.maxHealth = maxHealth;
		this.damage = damage;
	}
	

	public int getCollectionNumber() {
		return collectionNumber;
	}

	public void setCollectionNumber(int collectionNumber) {
		this.collectionNumber = collectionNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = Math.max(0, health);
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Pokemon: \ncollectionNumber = " + collectionNumber + "\nname = " + name + "\nstatus = " + status + "\ntype = "
				+ type + "\ngrade = " + grade + "\nhealth = " + health + "\ndamage = " + damage + "\n";
	}
}
