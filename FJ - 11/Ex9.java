public class Main {

	public static void main(String[] args){
		for(int i = 1; i < 10; i++){
			System.out.println("O fatorial de " + i + " é: " + fat(i));
		}
	}

	private static int fat(int i) {
		if(i == 0) return 1;
		return i * fat(i - 1);
	}
}