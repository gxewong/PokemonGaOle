import Pokemon.Pokemon;
import Pokemon.FirePokemon;
import Pokemon.ElectricPokemon;
import Pokemon.GrassPokemon;
import Pokemon.WaterPokemon;
import java.util.ArrayList;

public class CreatePokemon {
	
	protected ArrayList<Pokemon> Stage1Pokemon = new ArrayList<>();
	protected ArrayList<Pokemon> Stage2Pokemon = new ArrayList<>();
	protected ArrayList<Pokemon> Stage3Pokemon = new ArrayList<>();
	protected ArrayList<Pokemon> Stage4Pokemon = new ArrayList<>();	
	protected ArrayList<Pokemon> Stage5Pokemon = new ArrayList<>();


	public void createPokemons() {
		Pokemon electricPokemon1 = new ElectricPokemon(1, "Magnemite","Normal","Electric", 1, 60, 60, 15);
		Pokemon electricPokemon2 = new ElectricPokemon(2, "Elekid","Normal","Electric", 1, 65, 65, 20);
		Pokemon electricPokemon3 = new ElectricPokemon(3, "Pikachu","Normal","Electric", 2, 90, 90, 35);
		Pokemon electricPokemon4 = new ElectricPokemon(4, "Flaaffy","Normal","Electric", 2, 85, 85, 30);
		Pokemon electricPokemon5 = new ElectricPokemon(5, "Electabuzz","Normal","Electric", 3, 100, 100, 50);
		Pokemon electricPokemon6 = new ElectricPokemon(6, "Raichu","Normal","Electric", 3, 105, 105, 55);
		Pokemon electricPokemon7 = new ElectricPokemon(7, "Jolteon","Normal","Electric", 4, 110, 110, 60);
		Pokemon electricPokemon8 = new ElectricPokemon(8, "Manectric","Normal","Electric", 4, 115, 115, 65);
		Pokemon electricPokemon9 = new ElectricPokemon(9, "Zapdos","Normal","Electric", 5, 130, 130, 75);
		Pokemon electricPokemon10 = new ElectricPokemon(10, "Zeraora","Normal","Electric", 5, 140, 140, 80);

		Pokemon firePokemon1 = new FirePokemon(11, "Numel", "Normal", "Fire", 1, 65, 65, 10);
		Pokemon firePokemon2 = new FirePokemon(12, "Slugma", "Normal", "Fire", 1, 60, 60, 15);
		Pokemon firePokemon3 = new FirePokemon(13, "Charmander", "Normal", "Fire", 2, 85, 85, 20);
		Pokemon firePokemon4 = new FirePokemon(14, "Vulpix", "Normal", "Fire", 2, 90, 90, 30);
		Pokemon firePokemon5 = new FirePokemon(15, "Growlithe", "Normal", "Fire", 3, 100, 100, 45);
		Pokemon firePokemon6 = new FirePokemon(16, "Magmar", "Normal", "Fire", 3, 110, 110, 50);
		Pokemon firePokemon7 = new FirePokemon(17, "Arcanine", "Normal", "Fire", 4, 120, 120, 65);
		Pokemon firePokemon8 = new FirePokemon(18, "Rapidash", "Normal", "Fire", 4, 115, 115, 70);
		Pokemon firePokemon9 = new FirePokemon(19, "Charizard", "Normal", "Fire", 5, 140, 140, 80);
		Pokemon firePokemon10 = new FirePokemon(20, "Entei", "Normal", "Fire", 5, 150, 150, 85);


		Pokemon grassPokemon1 = new GrassPokemon(21, "Seedot", "Normal", "Grass", 1, 60, 60, 5);
		Pokemon grassPokemon2 = new GrassPokemon(22, "Bellsprout", "Normal", "Grass", 1, 65, 65, 10);
		Pokemon grassPokemon3 = new GrassPokemon(23, "Chikorita", "Normal", "Grass", 2, 90, 90, 25);
		Pokemon grassPokemon4 = new GrassPokemon(24, "Hoppip", "Normal", "Grass", 2, 85, 85, 30);
		Pokemon grassPokemon5 = new GrassPokemon(25, "Gloom", "Normal", "Grass", 3, 100, 100, 40);
		Pokemon grassPokemon6 = new GrassPokemon(26, "Bayleef", "Normal", "Grass", 3, 105, 105, 45);
		Pokemon grassPokemon7 = new GrassPokemon(27, "Leafeon", "Normal", "Grass", 4, 115, 115, 55);
		Pokemon grassPokemon8 = new GrassPokemon(28, "Roserade", "Poisoned", "Grass", 4, 120, 120, 60);
		Pokemon grassPokemon9 = new GrassPokemon(29, "Venusaur", "Normal", "Grass", 5, 135, 135, 70);
		Pokemon grassPokemon10 = new GrassPokemon(30, "Celebi", "Normal", "Grass", 5, 130, 130, 75);
	
		Pokemon waterPokemon1 = new WaterPokemon(31, "Barboach", "Normal", "Water", 1, 65, 65, 10);
		Pokemon waterPokemon2 = new WaterPokemon(32, "Remoraid", "Normal", "Water", 1, 60, 60, 15);
		Pokemon waterPokemon3 = new WaterPokemon(33, "Squirtle", "Normal", "Water", 2, 90, 90, 25);
		Pokemon waterPokemon4 = new WaterPokemon(34, "Psyduck", "Normal", "Water", 2, 95, 95, 30);
		Pokemon waterPokemon5 = new WaterPokemon(35, "Wartortle", "Normal", "Water", 3, 110, 110, 40);
		Pokemon waterPokemon6 = new WaterPokemon(36, "Dewott", "Normal", "Water", 3, 100, 100, 45);
		Pokemon waterPokemon7 = new WaterPokemon(37, "Gyarados", "Normal", "Water", 4, 125, 125, 60);
		Pokemon waterPokemon8 = new WaterPokemon(38, "Vaporeon", "Normal", "Water", 4, 120, 120, 65);
		Pokemon waterPokemon9 = new WaterPokemon(39, "Blastoise", "Normal", "Water", 5, 140, 140, 75);
		Pokemon waterPokemon10 = new WaterPokemon(40, "Suicune", "Normal", "Water", 5, 150, 150, 80);
		
		//add the stage 1 pokemons in the ArrayList
		Stage1Pokemon.add(electricPokemon1);
		Stage1Pokemon.add(electricPokemon2);
		Stage1Pokemon.add(firePokemon1);
		Stage1Pokemon.add(firePokemon2);
		Stage1Pokemon.add(grassPokemon1);
		Stage1Pokemon.add(grassPokemon2);
		Stage1Pokemon.add(waterPokemon1);
		Stage1Pokemon.add(waterPokemon2);
		
		//add the stage 2 pokemons in the ArrayList
		Stage2Pokemon.add(electricPokemon3);
		Stage2Pokemon.add(electricPokemon4);
		Stage2Pokemon.add(firePokemon3);
		Stage2Pokemon.add(firePokemon4);
		Stage2Pokemon.add(grassPokemon3);
		Stage2Pokemon.add(grassPokemon4);
		Stage2Pokemon.add(waterPokemon3);
		Stage2Pokemon.add(waterPokemon4);
		
		//add the stage 3 pokemons in the ArrayList
		Stage3Pokemon.add(electricPokemon5);
		Stage3Pokemon.add(electricPokemon6);
		Stage3Pokemon.add(firePokemon5);
		Stage3Pokemon.add(firePokemon6);
		Stage3Pokemon.add(grassPokemon5);
		Stage3Pokemon.add(grassPokemon6);
		Stage3Pokemon.add(waterPokemon5);
		Stage3Pokemon.add(waterPokemon6);

		//add the stage 4 pokemons in the ArrayList
		Stage4Pokemon.add(electricPokemon7);
		Stage4Pokemon.add(electricPokemon8);
		Stage4Pokemon.add(firePokemon7);
		Stage4Pokemon.add(firePokemon8);
		Stage4Pokemon.add(grassPokemon7);
		Stage4Pokemon.add(grassPokemon8);
		Stage4Pokemon.add(waterPokemon7);
		Stage4Pokemon.add(waterPokemon8);
		
		//add the stage 5 pokemons in the ArrayList
		Stage5Pokemon.add(electricPokemon9);
		Stage5Pokemon.add(electricPokemon10);
		Stage5Pokemon.add(firePokemon9);
		Stage5Pokemon.add(firePokemon10);
		Stage5Pokemon.add(grassPokemon9);
		Stage5Pokemon.add(grassPokemon10);
		Stage5Pokemon.add(waterPokemon9);
		Stage5Pokemon.add(waterPokemon10);

	}
	
	public ArrayList<Pokemon> getStage1PokemonList(){
		return Stage1Pokemon;
	}
	
	public ArrayList<Pokemon> getStage2PokemonList(){
		return Stage2Pokemon;
	}
	
	public ArrayList<Pokemon> getStage3PokemonList(){
		return Stage3Pokemon;
	}
	
	public ArrayList<Pokemon> getStage4PokemonList(){
		return Stage4Pokemon;
	}
	
	public ArrayList<Pokemon> getStage5PokemonList(){
		return Stage5Pokemon;
	}
	


}
