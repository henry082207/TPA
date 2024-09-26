package pjl11;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		int n, r = 1, i = 1;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		n = Ler.nextInt();
	    Ler.close();
		
		while (i <= n ) {
			r *= i;
			i++;
		}
		System.out.println("O fatorial do numero escolhido é: " + r);
	}
}