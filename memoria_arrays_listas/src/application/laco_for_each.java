package application;

public class laco_for_each {

	public static void main(String[] args) {
		// Sintaxe opcional e simplificada para percorrer coleções
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
