import java.util.Scanner;

public class JavaBasicSec7 {

	public static void main(String[] args) {
		//Restrições para nomes de variáveis
		// não pode começar com dígito: usar letra ou _
		//não usar acentos ou til
		//não pode ter espaços em branco
		//Sugestão: use nomes que tenham um significado ex: 
		//int _5minutes
		//int salario
		//int salarioDoFuncionario
		
		//Camel Case: lastName
		// - usado para, pacotes, atributos, métodos, variáveis e parâmetros
		
		//PascalCAse: PRoductService
		// - usado para classes
		
		//Operadores bitwise
		//& -> operação "E" bit a bit
		//| -> operação "OU" bit a bit
		//^ -> operação "OU-exclusivo" bit a bit -> XOR ->  quando apenas UMA das proposições for verdadeira
		
		//split		
//		String s = "potato apple lemon";
//		
//		String[] vect = s.split(" ");
//		
//		System.out.println(vect[0]);
//		System.out.println(vect[1]);
//		System.out.println(vect[2]); 
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
