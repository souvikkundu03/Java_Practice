package NewPackage2;
/**
 * The class {@code TestScoreDemo} is created for developing a system to manage student records.
 * 
 * The class {@code TestScoreDemo} includes methods for examining
 * if the student is has obtained passing marks or not as well as 
 * an Overriden toString method to provide a meaningful string 
 * representation of the TestScore object.
 *
 * */
/**
 * 
 * @author Souvik
 *
 */
class TestScoreDemo {
	private Integer score;
	//	Constructors
	 /**
     * Parameterized constructor 
     * It takes an integer value and initializes the score attribute.
     *
     * @param score The initial test score.
     */
    public TestScoreDemo(int score) {
        setScore(score);
    }
    
    /**
     * Default constructor that initializes the score to a default value (example 0).
     */
    public TestScoreDemo() {
        this.score = 0;
    }
    
 // Methods

    /**
     * The Getter method to retrieve the current test score.
     *
     * @return The current test score.
     */
    public int getScore() {
        return score;
    }
    
    /**
     * The Setter method to set the test score. Ensures that the score is between 0 and 100 (inclusive).
     * If an invalid score is provided, sets the score to 0.
     *
     * @param score The test score to be set.
     */
    public void setScore(int score) {
    	 // Ensure that the score is between 0 and 100 (inclusive)
        if (score >= 0 && score <= 100)
            this.score = score;
        
        else
        // If an invalid score is provided, set the score to 0
            this.score = 0;
    }
    
    /**
     * Method to check if the test score is passing (score >= 50).
     *
     * returns true if the test score is passing, false otherwise.
     */
    public boolean isPassing() {
        if (score >= 50)
        	return true;
        else
        	return false;
        }
    
    /**
     * toString method for a meaningful string representation of the TestScore object.
     *
     *returns A string representation of the TestScore object.
     */
    @Override
    public String toString() {
        return "The test score is : " + score;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestScoreDemo testScore = new TestScoreDemo(105);
	    System.out.println(testScore);
	    if (testScore.isPassing())
	        System.out.println("The student has Passed.");
	    else 
	        System.out.println("The student has Failed.");

	}

}
