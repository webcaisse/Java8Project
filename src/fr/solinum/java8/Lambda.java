package fr.solinum.java8;

public class Lambda {

	
	public static void main (String arggs[]){

		Adding adding = (int a , int b) -> a+b;
		
		Substruction sub = (int a , int b) -> a-b;
		
		System.out.println("1 + 3 vaut ="+new Lambda().add(1, 3, adding));
		
		System.out.println("1 - 3 vaut ="+new Lambda().sub(1, 3, sub));
	}
	
	/**
	 * interface Adding
	 * @author Belhadj
	 *
	 */
	interface Adding {
		int some (int a, int b);
	}
	
	/**
	 * interface Substruction
	 * @author Belhadj
	 *
	 */
	interface Substruction {
		int sub (int a, int b);
	}
	
	private int add (int a, int b, Adding adding){
		return adding.some(a, b);
	}
	
	
	private int sub (int a, int b, Substruction sub){
		return sub.sub(a, b);
	}
	
}
