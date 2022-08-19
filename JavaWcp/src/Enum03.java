
public class Enum03 {
	public static void main(String[] args) {
		printDessertName(Dessert.APPLE);
		printAnimalName(Animal.CAT);
 	}
	
	static void printDessertName(Dessert dessert) {
		System.out.println(dessert);
	}
	
	static void printAnimalName(Animal animal) {
		System.out.println(animal);
	}
}
