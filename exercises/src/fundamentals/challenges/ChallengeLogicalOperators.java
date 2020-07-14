package fundamentals.challenges;

public class ChallengeLogicalOperators {

	public static void main(String[] args) {

		//trabalho terca e quinta
		//se os dois derem certo, tv 50 polegadas
		//se um dos dois deram certo, tv 32 polegadas
		//nos dois casos eles tomam sorvete
		//nenhum dos dois deu certo, fica todo mundo em casa
		//nao tomou sorvete, ficou salvado
		
		boolean job1 = true;
		boolean job2 = true;
		boolean tv50 = job1 && job2;
		boolean tv32 = job1 ^ job2;
		boolean iceCream = job1 || job2;
		boolean healthy = !iceCream;
		
		System.out.printf("Case %s and %s \n", job1, job2);
		System.out.println("Bought 50 inches TV? " + tv50);
		System.out.println("Bought 32 inches TV? " + tv32);
		System.out.println("Eat an ice cream? " + iceCream);
		System.out.println("Are they Healthy? " + healthy);
		
		job1 = true;
		job2 = false;
		tv50 = job1 && job2;
		tv32 = job1 ^ job2;
		iceCream = job1 || job2;
		healthy = !iceCream;
		
		System.out.printf("\nCase %s and %s \n", job1, job2);
		System.out.println("Bought 50 inches TV? " + tv50);
		System.out.println("Bought 32 inches TV? " + tv32);
		System.out.println("Eat an ice cream? " + iceCream);
		System.out.println("Are they Healthy? " + healthy);
		
		job1 = false;
		job2 = true;
		tv50 = job1 && job2;
		tv32 = job1 ^ job2;
		iceCream = job1 || job2;
		healthy = !iceCream;
		
		System.out.printf("\nCase %s and %s \n", job1, job2);
		System.out.println("Bought 50 inches TV? " + tv50);
		System.out.println("Bought 32 inches TV? " + tv32);
		System.out.println("Eat an ice cream? " + iceCream);
		System.out.println("Are they Healthy? " + healthy);
		
		job1 = false;
		job2 = false;
		tv50 = job1 && job2;
		tv32 = job1 ^ job2;
		iceCream = job1 || job2;
		healthy = !iceCream;
		
		System.out.printf("\nCase %s and %s \n", job1, job2);
		System.out.println("Bought 50 inches TV? " + tv50);
		System.out.println("Bought 32 inches TV? " + tv32);
		System.out.println("Eat an ice cream? " + iceCream);
		System.out.println("Are they Healthy? " + healthy);

		
		
		
	}

}
