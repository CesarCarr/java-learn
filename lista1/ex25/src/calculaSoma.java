import java.util.Scanner;

public class calculaSoma {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double num=1, soma=0;
		int quant, i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite quantos valores serao somados: ");
		quant = input.nextInt();
		System.out.println("\nDigite os valores a serem somados.");
		for(i = 0; i < quant; i++) {
			System.out.print("Digite o proximo valor: ");
			num = input.nextDouble();
			soma += num;	
		}
		System.out.println("\nO valor da soma eh: " + soma);
	}
}