/**
 * Addition is a set of methods that helps a user to solve 
 * addition problem for 2 random operands
 * @author Muyivu Shafiq
 */

public class AdditionProblem {

    private int x,y,answer;
    
    /**
     * AdditionProblem constructor
     */
    
    public AdditionProblem() {
         x = (int)(10 + 40*Math.random());
         y = (int)(30 * Math.random());
         answer = x + y;
     }

    public String getProblem() {
    	return "Compute the sum: " + x + " + " + y;
    }

    public int getAnswer() {
    	return answer;
    }
}