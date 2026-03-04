import Ball.Ball;
import Ball.PokeBall;
import Ball.GreatBall;
import Ball.UltraBall;
import Ball.MasterBall;
import Pokemon.Pokemon;
import java.util.Random;
import Score.Score;

public class CatchPoke {
	
	private Score scoreCatchPoke;
	
	public CatchPoke(Score scoreCatchPoke) {
		this.scoreCatchPoke = scoreCatchPoke;
	}
	
	public Ball getRandomBall(){
		try {
            Random random = new Random();
            int randomNum = random.nextInt(100);

            if (randomNum >= 0 && randomNum <= 40) {
                return new PokeBall();
            } 
            else if (randomNum > 40 && randomNum <= 65) {
                return new GreatBall();
            } 
            else if (randomNum > 65 && randomNum <= 80) {
                return new UltraBall();
            } 
            else if (randomNum > 80 && randomNum <= 100) {
                return new MasterBall();
            } 
            else {
                return new PokeBall(); 
            }
        } 
		catch (Exception e) {
            System.out.println("Error selecting random ball: " + e.getMessage());
            return new PokeBall(); 
        }
	}
	
	public boolean catchPoke(Player player, Pokemon pokemon) {
		try {
            Ball ball = getRandomBall();
            System.out.println("You randomly got a " + ball.getName() + "!");
            System.out.println("Throwing it at " + pokemon.getName() + "...");

            float baseCatchRate = ball.getCatchRate();
            double healthPercentage = (double) pokemon.getHealth() / pokemon.getMaxHealth();
            double adjustCatchRate = baseCatchRate + (1.0 - healthPercentage) - 0.4;

            if (adjustCatchRate > 1.0) {
                adjustCatchRate = 1.0;
            }

            double randomValue = Math.random();

            if (randomValue <= adjustCatchRate) {
                pokemon.setHealth(pokemon.getMaxHealth()); // Heal after catch
                player.addPokemon(pokemon);

                System.out.println("🎉 Congratulations! You caught " + pokemon.getName() + " with a " + ball.getName() + "!");
                scoreCatchPoke.pokeCaught(pokemon);
                return true;
            } 
            else {
                System.out.println("❌ Oh no! " + pokemon.getName() + " broke free!");
                return false;
            }
        } 
		catch (IllegalArgumentException e) {
            System.out.println("Error in catchPoke: " + e.getMessage());
            return false;
        } 
		catch (ArithmeticException e) {
            System.out.println("Error calculating catch rate: " + e.getMessage());
            return false;
        } 
		catch (Exception e) {
            System.out.println("Unexpected error in catchPoke: " + e.getMessage());
            return false;
        }
	}
	
	public Score getScoreCatchPoke() {
		return scoreCatchPoke;
	}
	

}
