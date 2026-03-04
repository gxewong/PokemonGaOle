import java.util.InputMismatchException;
import java.util.Scanner;
import Pokemon.Pokemon;
import Score.Score;

public class Battle {

	private double multiplier;
	private Score scoreBattle;
	
	public Battle(Score scoreBattle) {
		this.scoreBattle = scoreBattle;
	}
	
	// ---------- Multiplier Calculation ----------
	public double multiplier (Pokemon attacker, Pokemon opponent) {
		try {
			if (attacker.type.equalsIgnoreCase("Electric")) {
				if (opponent.type.equalsIgnoreCase("Water")) {
					return multiplier = 1.5;
				}
				else if (opponent.type.equalsIgnoreCase("Electric" )) {
					return multiplier = 0.8;
				}
				else if (opponent.type.equalsIgnoreCase("Grass" )) {
					return multiplier = 0.8;
				}
				else {
					return multiplier = 1.0;
				}
			}
			
			else if (attacker.type.equalsIgnoreCase("Fire")) {
				if (opponent.type.equalsIgnoreCase("Grass")) {
					return multiplier = 1.5;
				}
				else if (opponent.type.equalsIgnoreCase("Fire" )) {
					return multiplier = 0.8;
				}
				else if (opponent.type.equalsIgnoreCase("Water" )) {
					return multiplier = 0.8;
				}
				else {
					return multiplier = 1.0;
				}
			}
			
			else if (attacker.type.equalsIgnoreCase("Grass")) {
				if (opponent.type.equalsIgnoreCase("Water")) {
					return multiplier = 1.5;
				}
				else if (opponent.type.equalsIgnoreCase("Fire" )) {
					return multiplier = 0.8;
				}
				else if (opponent.type.equalsIgnoreCase("Grass" )) {
					return multiplier = 0.8;
				}
				else {
					return multiplier = 1.0;
				}
			}
			
			else if (attacker.type.equalsIgnoreCase("Water")) {
				if (opponent.type.equalsIgnoreCase("Fire")) {
					return multiplier = 1.5;
				}
				else if (opponent.type.equalsIgnoreCase("Water" )) {
					return multiplier = 0.8;
				}
				else if (opponent.type.equalsIgnoreCase("Grass" )) {
					return multiplier = 0.8;
				}
				else {
					return multiplier = 1.0;
				}
			}
		}
		catch (IllegalArgumentException e) {
            System.out.println("Error in multiplier calculation: " + e.getMessage());
        } 
		catch (Exception e) {
            System.out.println("Unexpected error in multiplier: " + e.getMessage());
        }
		return 1.0;
	}
	
	// ---------- Start Battle ----------
	public void StartBattle(Player player, Pokemon opponent, Scanner input) {
	    try {
	    	System.out.println("\n===============================");
			System.out.println("✨ A wild Pokemon " + opponent.getName() + " appeared! ✨");
			System.out.println(opponent);
			System.out.println("===============================\n");

	        Pokemon playerPoke = null;

	        while (true) {
	            player.showPokemon();
				System.out.print("🎯 Please select a Pokemon to battle: ");
	            try {
	                int chosenPoke = input.nextInt();
	                playerPoke = player.playerPokemons.get(chosenPoke - 1);
	                System.out.println();

	                if (!playerPoke.getStatus().equalsIgnoreCase("Fainted")) {
	                    break;
	                } 
	                else {
						System.out.println("⚠️ " + playerPoke.getName() + " has fainted. Choose another Pokémon!");
	                }
	            } 
	            catch (IndexOutOfBoundsException e) {
					System.out.println("❌ Invalid number! Please select a valid Pokemon index.");
	            } 
	            catch (InputMismatchException e) {
					System.out.println("❌ Invalid input! Please enter a number.");
	                input.next(); 
	            }
	        }

	        System.out.println("\n🚨 Battle Start: " + playerPoke.getName() + " VS " + opponent.getName());
			System.out.println("-----------------------------------");
			
			// ----- Battle Loop -----
	        while (true) {
	        	// Player’s turn
	            if (playerPoke.getHealth() > 0) {
	                this.multiplier = multiplier(playerPoke, opponent);
	                opponent.health -= multiplier * playerPoke.getDamage();
	                scoreBattle.totalDamage(multiplier * playerPoke.getDamage());
					System.out.println("💥 " + opponent.name + " took " + multiplier * playerPoke.getDamage() + " damage!");
	            } 
	            
	            
				// Player’s Pokemon fainted
	            else if (playerPoke.getHealth() <= 0) {
	                playerPoke.setStatus("Fainted");
	                playerPoke.setHealth(0);
					System.out.println("💀 " + playerPoke.getName() + " fainted!");
					
	                // Check if player has any alive Pokemon
	                boolean hasAlivePoke = false;
	                for (Pokemon poke : player.playerPokemons) {
	                    if (!poke.getStatus().equalsIgnoreCase("Fainted")) {
	                        hasAlivePoke = true;
	                        break;
	                    }
	                }

	                if (!hasAlivePoke) {
						System.out.println("💥 All your Pokemon have fainted!");
	                    scoreBattle.battleLose();
						System.out.println("❌ Battle Lose!");
	                    System.out.println();
						System.out.println("🎯 Catch Time!");
	                    break;
	                }

					// Ask player to choose another Pokemon
	                while (true) {
						System.out.print("🔄 Do you want to choose another Pokemon to continue the battle (y/n): ");
	                    String chosen = input.next();
	                    System.out.println();

	                    if (chosen.equalsIgnoreCase("y")) {
	                        while (true) {
	                            player.showPokemon();
								System.out.print("🎯 Please select a Pokemon to battle: ");
	                            try {
	                                int newChosen = input.nextInt();
	                                Pokemon newPlayerPoke = player.playerPokemons.get(newChosen - 1);
	                                System.out.println();

	                                if (!newPlayerPoke.getStatus().equalsIgnoreCase("Fainted")) {
	                                    playerPoke = newPlayerPoke;
										System.out.println("✅ " + newPlayerPoke.getName() + " joins the battle!");
	                                    break;
	                                } 
	                                else {
										System.out.println("⚠️ That Pokemon has fainted! Please choose another.");
	                                }
	                            } 
	                            catch (IndexOutOfBoundsException e) {
									System.out.println("❌ Invalid number! Please select a valid Pokemon index.");
	                            } 
	                            catch (InputMismatchException e) {
									System.out.println("❌ Invalid input! Please enter a number.");
	                                input.next(); 
	                            }
	                        }
	                        break;
	                    } 
	                    else if (chosen.equalsIgnoreCase("n")) {
	                        scoreBattle.battleLose();
							System.out.println("❌ Battle Lose!");
							System.out.println("🎯 Catch Time!");
	                        return;
	                    } 
	                    else {
							System.out.println("⚠️ Please enter 'y' or 'n'.");
	                    }
	                }
	            }

	         // Opponent’s turn
	            if (opponent.getHealth() > 0) {
	                this.multiplier = multiplier(opponent, playerPoke);
	                playerPoke.health -= multiplier * opponent.getDamage();
					System.out.println("⚡ " + playerPoke.name + " took " + multiplier * opponent.getDamage() + " damage!");
	            } 
	            else if (opponent.getHealth() <= 0) {
					System.out.println("\n🎉 " + opponent.getName() + " fainted!");
	                opponent.setHealth(0);
					System.out.println("🏆 Congratulations! You won the battle!");
	                scoreBattle.battleWon();
	                System.out.println();
					System.out.println("🎯 Catch Pokemon!");
	                break;
	            }
	        }
	    } 
	    catch (Exception e) {
			System.out.println("⚠️ Unexpected error during battle: " + e.getMessage());
	    }
	}
	
	// ---------- Getter ----------
	public Score getScoreBattle() {
        return scoreBattle;
    }
}
