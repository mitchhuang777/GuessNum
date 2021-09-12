import java.util.Random;

public class GuessGame {
	private int min = 0;
	private int max = 10000;
	private int correctAns;
	
	public GuessGame() {
		createAnswer();
	}

	public void createAnswer() {
		correctAns = new Random().nextInt(max+1);
	}
	
	public boolean compNum(int number) {
		if(number == correctAns) {
			return true;
		}
		
		else if(number < correctAns) {
			min = number;
		}
		else if(number > correctAns) {
			max = number;
		}
		return false;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
}
