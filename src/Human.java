import java.util.Scanner;

public class Human extends Player{
	
	public Human(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String nameSelf() {
		// TODO Auto-generated method stub
		return super.nameSelf();
	}

	@Override
	public int guessNum(int min, int max) {
		// TODO Auto-generated method stub
		int guess;
		Scanner scanner = new Scanner(System.in);
		guess = scanner.nextInt();
		
		return guess;
	}
	
	
}
