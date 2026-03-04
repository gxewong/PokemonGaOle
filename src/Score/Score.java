package Score;

import Pokemon.Pokemon;

public class Score {

	public int totalPoints;
	private int pokemonCaught;
	private int totalDamage;
	private int battlesWon;
	private int battlesLose;
	
	public Score(int totalPoints) {
		try {
			this.totalPoints = 0;
		}
		catch (IllegalArgumentException e) {
            System.out.println("Error initializing Score: " + e.getMessage());
            this.totalPoints = 0;
		}
	}

	public void pokeCaught(Pokemon pokemon) {
		try {
			pokemonCaught ++;
			if (pokemon.getGrade() == 1) {
				totalPoints += 500;
			}
			else if (pokemon.getGrade() == 2) {
				totalPoints += 1000;
			}
			else if (pokemon.getGrade() == 3) {
				totalPoints += 1500;
			}
			else if (pokemon.getGrade() == 4) {
				totalPoints += 2000;
			}
			else if (pokemon.getGrade() == 5) {
				totalPoints += 2500;
			}
		}
		catch (IllegalArgumentException e) {
            System.out.println("Error in pokeCaught: " + e.getMessage());
        }
		catch (Exception e) {
            System.out.println("Unexpected error in pokeCaught: " + e.getMessage());
        }
	}
	
	public void totalDamage(double damage) {
		try {
			totalDamage += damage;
			totalPoints += damage*5;
		}
		catch (IllegalArgumentException e) {
            System.out.println("Error in totalDamage: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error in totalDamage: " + e.getMessage());
        }
	}
	
	public void battleWon() {
		try {
            battlesWon++;
            totalPoints += 1000;
        } catch (Exception e) {
            System.out.println("Unexpected error in battleWon: " + e.getMessage());
        }
    }
	
	public void battleLose() {
		try {
            battlesLose++;
            totalPoints -= 500;
            if (totalPoints < 0) {
                System.out.println("Warning: Total points dropped below zero.");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error in battleLose: " + e.getMessage());
        }
    }
	
	public void showResult() {
		try {
            System.out.println("===== Score Summary =====");
            System.out.println("Total Points: " + totalPoints);
            System.out.println("Total Damage: " + totalDamage);
            System.out.println("Pokemon Caught: " + pokemonCaught);
            System.out.println("Battles Won: " + battlesWon);
            System.out.println("Battles Lose: " + battlesLose);
            System.out.println("=========================");
        } catch (Exception e) {
            System.out.println("Error showing results: " + e.getMessage());
        }
    }
}
