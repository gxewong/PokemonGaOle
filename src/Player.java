import java.util.ArrayList;
import java.util.List;
import Pokemon.Pokemon;

public class Player {

	public String name;
	public List<Pokemon> playerPokemons;
	
	public Player(String name) {
		try {
			if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Player name cannot be null or empty.");
            }
			
			this.name = name;
			this.playerPokemons = new ArrayList<>();
		}
		catch (IllegalArgumentException e){
			System.out.println("Error creating player " + e.getMessage());
		}
	}
	
	public void addPokemon(Pokemon pokemon) {
		try {
		playerPokemons.add(pokemon);
		System.out.println(pokemon);
		System.out.println(name + " caught a Pokemon " + pokemon.getName());
		}
		catch (IllegalArgumentException e){
			System.out.println("Error adding Pokemon: " + e.getMessage());
		}
		catch (Exception e){
			System.out.println("Unexpected error while adding Pokemon: " + e.getMessage());
		}
	}
	
	public void showPokemon() {
		try {
			System.out.println(name + "'s Pokemon Inventory: ");
			
			if (playerPokemons.isEmpty()) {
				System.out.println("You don't have any Pokemon yet.");
			}
			else {
				for (int i = 0; i < playerPokemons.size(); i++) {
					System.out.println((i+1) + ". " + playerPokemons.get(i));
				}
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error showing Pokemon inventory: " + e.getMessage());
		}
	}
	
	public void resetAllPokemonStatus() {
		try {
		    for (Pokemon poke : playerPokemons) {
		        poke.setStatus("Normal");  // Reset status to Normal
		        poke.setHealth(poke.getMaxHealth()); // Optional: heal them fully
		    }
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error resetting Pokemon status: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unexpected errir duding reset: " + e.getMessage());
		}
	}
	
}

