package Lambda;

public class FindMatchingAnimals {
	private static void print(Animal animal ,  CheckTrait trait){
		if(trait.test(animal)){
			System.out.println("Animal");
		}
	}

	public static void main(String[] args) {
		Animal fish = new Animal("fish", false, true);
		Animal kangoroo = new Animal("kangaroo", true, false);

		print(fish, a -> a.canHop());
		print(kangoroo, a -> a.canSwim());
		//private static void print(Animal animal ,  CheckTrait trait)
		//a -> a.canHop
		/*
		  "a" 
		    the left side of the arrow operator -> indicates
			the input parameters for the lambda expression. It can be consumed by a functional
			interface(CheckTrait) whose abstract method has the same number of parameters and compatible
			data types.
		 a.canHop ( a.toString incompatibil  pentru  ca toString nu returneaza un boolean)
		  	The right side is referred to as the body of the lambda expression. It can be
			consumed by a functional interface whose abstract method returns a compatible data
			type.
		 
		 */
	}
}
