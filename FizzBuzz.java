package conditionals;

public class FizzBuzz {

	public static String fizzBuzz(int num) {

		String result = "";

		if (num % 3 == 0) {

			result = "Fizz";

		}
		if (num % 5 == 0) {

			result = result.concat("Buzz");

		} else {

			result = Integer.toString(num);
		}

		return result;

	}

	public static void main(String[] args) {

		System.out.println(fizzBuzz(53));

	}

}
