import java.util.Scanner;

public class Soma{

	public static void main(String[] args){
		System.out.println("Digite 2 números");
		Scanner teclado = new Scanner(System.in);
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		
		if(n1 >= n2)
			System.out.println("O resultado de " + n1 + " + " + n2 + " é : " + (n1+n2));
		else
			System.out.println("O resultado de " + n1 + " - " + n2 + " é : " + (n1-n2));
	}

}
