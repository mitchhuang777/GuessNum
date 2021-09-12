import java.util.Random;

public class EvenAI extends AI{

	public EvenAI(String name) {
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
		if(min == max) {
			return min;
		}
		int rand;
		do {
			rand = new Random().nextInt(max-min)+min;
		}while(rand%2 != 0 || rand>max || rand<min);
		
		return rand;
	}
	
}
