
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Player[] players = new Player[] {new Human("Mitch"), new OddAI("OddAI_No.1"), new EvenAI("EvenAI_No.1")};
		GuessGame game = new GuessGame();
		for(Player p:players) {
			System.out.println("Players Name: "+p.nameSelf());
		}
		
		System.out.println("The number is between: " + game.getMin() + "~" + game.getMax());
		while(true) {
			for(Player p:players) {
				int num = p.guessNum(game.getMin(), game.getMax());
				System.out.println(p.nameSelf() + " guess the number " + num);
				Thread.sleep(1000);
				if(game.compNum(num)) {
					System.out.println(p.nameSelf()+" is win.");
					break;
				}
				Thread.sleep(1000);
				System.out.println("The number is between: " + game.getMin() + "~" + game.getMax());

			}
		}
		
	}

}
