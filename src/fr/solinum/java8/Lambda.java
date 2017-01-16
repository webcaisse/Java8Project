package fr.solinum.java8;

public class Lambda {

	
	public static void main (String arggs[]){

		Operation adding = (int a , int b) -> {
			return a+b;
		};
		Operation sub = (int a , int b) -> a-b;

		
		
		System.out.println("1 + 3 vaut ="+ adding.op(1, 3));
		
		System.out.println("1 - 3 vaut ="+sub.op(1, 3));
	}
	
	/**
	 * interface Operation
	 * @author Belhadj
	 *
	 */
	interface Operation {
		int op (int a, int b);
	}

	
	
}
