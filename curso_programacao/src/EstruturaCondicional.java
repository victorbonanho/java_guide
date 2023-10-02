import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		//comparativas
		// > < >= <= == !=
		//logicas
		//&& || !
		//condicional
		//if else
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += + (minutos = 100) * 2;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		//Atribuição cumulativa
		// a += b -> a = a + b
		// a-= b
		// a *= b
		// a /= b
		// a %= b
		
		//switch-case
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		//Ternário
		//(condição) ? valor_se_verdadeiro : valor_se_falso
		
	}

}
