public class Main {

	public static void main(String[] args){
		for(int i = 0; i < 100; i++){
			if(fibonnaci(i) > 100)
				break;
			else System.out.println(fibonnaci(i));
		}
	}

	private static int fibonnaci(int i) {
		if(i == 0 || i == 1) return i;
		if(i == 2) return 1;
		return fibonnaci(i - 1) + fibonnaci (i - 2);		
	}
}