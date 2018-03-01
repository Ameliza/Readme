import java.util.Scanner;

public class ParImpar{

	public static void main(String[] args){
		System.out.println("Digite um número inteiro");
		Scanner teclado = new Scanner (System.in);
		int n = teclado.nextInt();

		if((n%2) == 0)
			System.out.println("O número " + n + " é par.");
		else
			System.out.println("O número " + n + " é ímpar.");
	}
}
