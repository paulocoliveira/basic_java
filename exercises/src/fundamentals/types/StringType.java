package fundamentals.types;

public class StringType {

	public static void main(String[] args) {
		System.out.println("Hello everybody!".charAt(4));
		String s = "Good Afternoon";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Good"));
		System.out.println(s.toLowerCase().startsWith("good"));
		System.out.println(s.length());
		System.out.println(s.endsWith("Afternoon"));
		System.out.println(s.equals("good afternoon"));
		System.out.println(s.equalsIgnoreCase("good afternoon"));
		
		var firstName = "Pedro";
		var lastName = "Santos";
		var age = 33;
		var salary = 12345.987;
		
		System.out.println("First Name: " + firstName + 
							"\nLast Name: " + lastName + 
							"\nAge: " + age + 
							"\nSalary: " + salary +
							"\n\n");

		System.out.printf("Mister %s %s is %d years old and earns $%.2f.", firstName, lastName, age, salary);
		
		String sentence = String.format("\nMister %s %s is %d years old and earns $%.2f.", firstName, lastName, age, salary);
		System.out.println(sentence);
		
		System.out.println("Any Sentence".contains("Sent"));
		System.out.println("Any Sentence".indexOf("Sent"));
		System.out.println("Any Sentence".substring(4));
		System.out.println("Any Sentence".substring(4,8));
		
	}

}
