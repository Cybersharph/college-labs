
public class MathQuiz {
	
	public static void main(String[] args) {
	      System.out.print("Enter your name: ");
	      String name = TextIO.getln();
	      System.out.println("Pleased to meet you, " + name);
	      
	      // A new instance of the AdditionProblem class
	      AdditionProblem problem = new AdditionProblem();
	     
	      // Display problem statement to the user
	      System.out.println(problem.getProblem());
	      
	      // Get user answer
	      System.out.print("Answer: ");
	      int userAnswer = TextIO.getInt();
	      
	      // Check user input and compare with actual answer | Give feedback
	      if (userAnswer == problem.getAnswer()) {
	    	  System.out.println("Correct, the answer is: " + Integer.toString(userAnswer));
	      } else {
	    	  System.out.println("Not Correct, the correct answer is: " + problem.getAnswer());
	      }
	}
}
