import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Pokemon.Pokemon;
import Score.Score;
import Score.TopScore;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		TopScore topScore = new TopScore(0);
		CreatePokemon createPokemon = new CreatePokemon();
		createPokemon.createPokemons();
		
		// ===================== Game Start =====================
		System.out.println("🎮 Welcome to Pokemon Ga-Ole 🎮");
		System.out.print("Please enter your name: ");
		String name = input.next();
		Player player = new Player(name);
		System.out.println("👋 Welcome " + name + "!");
		System.out.println();
		while (true) {
			try {
		        // ===================== Main Menu =====================
				System.out.println("======================================");
				System.out.println("🏆 Main Menu");
				System.out.println("======================================");
				System.out.println("[1] Battle and Catch!");
				System.out.println("[2] View Top Score");
				System.out.println("[3] View Saved Pokemon");
				System.out.println("[4] Exit");
				System.out.print("Select an option: ");
				int option = input.nextInt();
				System.out.println();
				
				switch (option) {
				case 1:
		            // ===================== Battle and Catch =====================
					System.out.println("======================================");
					System.out.println("🔥 Battle and Catch!");
					System.out.println("======================================");
					
					Pokemon opponent1 = null;
					Pokemon opponent2 = null;
					int selection;
					Score score = new Score(0);
					
		            // ---------- Stage Selection ----------

					while(true) {
						System.out.println("⭐ Select the stage you want to take on:");
						System.out.println("Stage 1: ★☆☆☆☆");
						System.out.println("Stage 2: ★★☆☆☆");
						System.out.println("Stage 3: ★★★☆☆");
						System.out.println("Stage 4: ★★★★☆");
						System.out.println("Stage 5: ★★★★★");
						System.out.print("Selection: ");
						
						if (input.hasNextInt()) {
							selection = input.nextInt();
						}
						else {
							System.out.printf("❌ Invalid input. Please enter %d-%d\n", 1, 5);
							input.next();
							System.out.println();
							continue;
						}
						
						try {
							switch (selection) {
							//Stage 1: 2 Star
							case 1:
								ArrayList<Pokemon> stage1List = createPokemon.getStage1PokemonList();
								opponent1 = stage1List.get(random.nextInt(stage1List.size()));
								break;
							case 2:
								ArrayList<Pokemon> stage2List = createPokemon.getStage2PokemonList();
								opponent1 = stage2List.get(random.nextInt(stage2List.size()));
								break;
							//Stage 1: 3 Star
							case 3:
								ArrayList<Pokemon> stage3List = createPokemon.getStage3PokemonList();
								opponent1 = stage3List.get(random.nextInt(stage3List.size()));
								break;
							//Stage 1: 4 Star
							case 4:
								ArrayList<Pokemon> stage4List = createPokemon.getStage4PokemonList();
								opponent1 = stage4List.get(random.nextInt(stage4List.size()));
								break;
							//Stage 1: 5 Star
							case 5: 
								ArrayList<Pokemon> stage5List = createPokemon.getStage5PokemonList();
								opponent1 = stage5List.get(random.nextInt(stage5List.size()));
								break;
							default:
								System.out.println("❌ Please enter 1-5.");
								break;
							}
						}
						catch (Exception e) {
							System.out.println("⚠️ Error selecting stage: " + e.getMessage());
		                    continue;
		                }

						
						
						ArrayList<Pokemon> AllPokemon = new ArrayList<>();
						AllPokemon.addAll(createPokemon.getStage1PokemonList());
						AllPokemon.addAll(createPokemon.getStage2PokemonList());
						AllPokemon.addAll(createPokemon.getStage3PokemonList());
						AllPokemon.addAll(createPokemon.getStage4PokemonList());
						AllPokemon.addAll(createPokemon.getStage5PokemonList());
						
						opponent2 = AllPokemon.get(random.nextInt(AllPokemon.size()));
						
						if (opponent1 != null && opponent2 != null) {
							System.out.println("\n🎯 Stage Ready! Moving to Catch Time...");
							break;
						}
					}
					
					
					
					// ---------- Catch Time ----------
					System.out.println("\n🎁 Pokemon Given!");
					ArrayList<Pokemon> freePokemon = new ArrayList<>();
					freePokemon.addAll(createPokemon.getStage1PokemonList());
					freePokemon.addAll(createPokemon.getStage2PokemonList());
					freePokemon.addAll(createPokemon.getStage3PokemonList());
			
					Pokemon freePoke1 = freePokemon.get(random.nextInt(freePokemon.size()));
					Pokemon freePoke2 = freePokemon.get(random.nextInt(freePokemon.size()));
					Pokemon freePoke3 = freePokemon.get(random.nextInt(freePokemon.size()));
					
					player.addPokemon(freePoke1);
					player.addPokemon(freePoke2);
					player.addPokemon(freePoke3);
					System.out.println();
					
					
					
					// ---------- Depart for Battle ----------
					System.out.println("🚨 A wild Pokemon appeared!");
					System.out.println(opponent1);
					System.out.println(opponent2);
					System.out.println("⚔️ Prepare for battle!");
					System.out.println();
					
					
					// ---------- Battle Sequence ----------
					Battle FirstBattle = new Battle(score);
					FirstBattle.StartBattle(player, opponent1, input);
					System.out.println();
					CatchPoke FirstCatch = new CatchPoke(score);
					FirstCatch.catchPoke(player, opponent1);
					System.out.println();
					
					Battle SecondBattle = new Battle(score);
					SecondBattle.StartBattle(player, opponent2, input);
					System.out.println();
					CatchPoke SecondCatch = new CatchPoke(score);
					SecondCatch.catchPoke(player, opponent2);
					System.out.println();
					
			
					// ---------- Extra Battle ----------
					int randomNum = random.nextInt(10);
					
					if (randomNum > 6) {
						System.out.println("⚡ EXTRA BATTLE ⚡");
						ArrayList<Pokemon> AllPokemon = new ArrayList<>();
						AllPokemon.addAll(createPokemon.getStage1PokemonList());
						AllPokemon.addAll(createPokemon.getStage2PokemonList());
						AllPokemon.addAll(createPokemon.getStage3PokemonList());
						AllPokemon.addAll(createPokemon.getStage4PokemonList());
						AllPokemon.addAll(createPokemon.getStage5PokemonList());
						
						Pokemon OpponentExtraBattle = AllPokemon.get(random.nextInt(AllPokemon.size()));
						
						Battle ExtraBattle = new Battle(score);
						ExtraBattle.StartBattle(player, OpponentExtraBattle, input);
						System.out.println();
						CatchPoke ExtraCatch = new CatchPoke(score);
						ExtraCatch.catchPoke(player, OpponentExtraBattle);
						System.out.println();
					}
					
					// ---------- End of Battle and Score ----------
					System.out.println("🏁 Game Over! Here's your final score:");
					score.showResult();
					topScore.setTopScore(score.totalPoints);
					System.out.println();
					player.resetAllPokemonStatus();
					continue;
				
				case 2:
					// ===================== View Top Score =====================
					System.out.println("🏆 Top Score:");
					System.out.println(topScore.toString());
					System.out.println();
			        continue;
			        
				case 3: 
					// ===================== View Saved Pokemon =====================
					System.out.println("📖 Saved Pokemon:");
					player.showPokemon();
					System.out.println();
					continue;
					
				case 4:
					// ===================== Exit =====================
					System.out.println("👋 Exiting...");
					System.out.println("✅ You have successfully exited.");
					return;
				default:
					System.out.println("👋 Exiting...");
					System.out.println("✅ You have successfully exited.");
					return;
				}
			}
			catch (Exception e) {
				System.out.println("⚠️ Error giving free Pokémon: " + e.getMessage());
	        }
		}
	}
}
	
	
			




