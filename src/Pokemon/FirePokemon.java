package Pokemon;

public class FirePokemon extends Pokemon{
	
	public FirePokemon(int collectionNum, String name, String status, String type, int grade, int health, int maxHealth, int damage) {
		super(collectionNum, name, status, type, grade, health, maxHealth, damage);
	}

	public String toString() {
		return String.format("%-9s Pokemon | %s is a %d-star Electric-type Pokemon. Status: %s, Health: %d, Damage: %d",type, name, grade, status, health, damage);
	}
}
