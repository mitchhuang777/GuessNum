
public abstract class Player {
	private String name;
	public Player(String name) {
		this.name = name;
	}
	
	public String nameSelf() {
		return name;
	}
	
	public abstract int guessNum(int min, int max);
}
