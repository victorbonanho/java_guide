package application;

public class boxing_unboxing_wrapperclasses {

	public static void main(String[] args) {
		// Boxing -> Conversão de um objeto tipo valor para um objeto tipo referência compatível
		// Valor tipo comum e encaixotar em um objeto
		
		//Unboxing ->  Conversão de um objeto tipo referência para um objeto tipo valor compatível
		//int y = (int) obg; -> desencaixotando
		
//		int x = 20;
//		Object obj = x;
//		
//		int y = (int) obj;
		
		//Wrapper classes -> Preferi utilizar este
		//Classes equivalentes aos tipos primitivos
		//Aceita o valor nulo pois é classe e tipos primitivos não aceitam valor nulo
		
		int x = 20;
		Integer obg = x; //Não precisa usar o casting pois já converteu para classe
		int y = obg;
			
	}

}
