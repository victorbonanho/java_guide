package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// Tipo List - Declaração, instanciação
		// Tamanho variável
		// Facilidade para se realizar inserções e deleções
		// Acesso sequencial aos elementos (O ArrayLIst contorna este problema)
		
		
		//Assuntos pendentes:
		//interfaces, generics e predicados(lambda)
		//List é um tipo interface, preciso já instancia-la
		
		List<String> list = new ArrayList<>(); //entre os símbolos é o generic
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		list.remove("Anna");
		list.remove(1);
		
		//Remove da lista todos os que tiverem o primeiro valor 'M'
		list.removeIf(x -> x.charAt(0) == 'M');
		
		//Encontrar a posição de um elemento
		System.out.println("-----------------");
		System.out.println("Index of Bob " + list.indexOf("Bob"));
		System.out.println("Index of Bob " + list.indexOf("Marco")); //Quando não encontra um elemento ele retorna valor -1
		
		//Filtrar todos que começam com a letra A
		System.out.println("-----------------");
		//Stream aceita expressões do tipo lambda -> Depois precisa converter para tipo list de novo para o stram aceitar
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		//Encontrar o primeiro que começa com a letra A se não encontrar é null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
