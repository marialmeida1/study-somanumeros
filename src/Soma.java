import java.util.Scanner; 

public class Soma {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro numero: ");
	    int num1 = entrada.nextInt();

		System.out.print("Segundo numero: ");
	    int num2 = entrada.nextInt();

		int soma = num1 + num2;

	    System.out.println("Soma: " + soma);
	}

}