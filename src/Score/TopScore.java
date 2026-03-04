package Score;

public class TopScore extends Score {
	private int topScore;

	public TopScore(int totalPoints) {
		super(totalPoints);
		try {
            this.topScore = totalPoints;
        } 
		catch (IllegalArgumentException e) {
            System.out.println("Error initializing TopScore: " + e.getMessage());
        }
	}

	public int getTopScore() {
		return topScore;
	}

	public void setTopScore(int totalPoints) {
		try {
            if (totalPoints > topScore) {
                topScore = totalPoints;
                System.out.println("New top score updated: " + topScore);
            } 
            else {
                System.out.println("No update: Given points are less than current top score.");
            }
        } 
		catch (IllegalArgumentException e) {
            System.out.println("Error setting top score: " + e.getMessage());
        } 
		catch (Exception e) {
            System.out.println("Unexpected error in setTopScore: " + e.getMessage());
        }
	}

	@Override
	public String toString() {
		try {
            return String.format("Top Score: %d", topScore);
        } 
		catch (Exception e) {
            System.out.println("Error generating toString: " + e.getMessage());
            return "Top Score: (Error)";
		}
	}
}
