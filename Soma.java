import java.util.Scanner;

/**
* Esse programa consiste em fazer a soma de números maiores ou iguais 
* ao primeiro número inserido e fazer a subtração, caso o segundo número
* inserido seja maior.
*
* @author Ameliza
*/

public class Soma{

	/**
	* Método principal
	*/

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
