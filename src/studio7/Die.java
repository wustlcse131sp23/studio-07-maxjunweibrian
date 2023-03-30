package studio7;

public class Die {

	public static void main(String[] args) {
		 Die sus1 = new Die(8);
		 System.out.println(sus1.thrownDice());

	}
	
	private int numSides;
	
	public Die(int numSides) {
		this.numSides = numSides;
	}
		
	public int[] setSides() {
		int[] sus = new int[this.numSides];
		for(int i=1; i<=sus.length-1; i++) {
			sus[i-1] = i;
		}
		return sus;
	}
	
	public int thrownDice() {
		int[] sus = this.setSides();
		int randIndex = (int)(Math.random()*(sus.length-1));
		return sus[randIndex];
	}
}
