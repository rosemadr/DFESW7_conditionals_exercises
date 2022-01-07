package conditionals;

public class UniqueSum {

	public static int uniqueSum(int numOne, int numTwo, int numThree) {

		int result;

		if (numOne == numTwo & numTwo == numThree) {

			numOne = 0;
			numTwo = 0;
			numThree = 0;

		} else {
			if (numOne == numTwo) {
				numOne = 0;
				numTwo = 0;

			}
			if (numOne == numThree) {
				numOne = 0;
				numThree = 0;

			}
			if (numTwo == numThree) {
				numTwo = 0;
				numThree = 0;

			}

		}

		result = numOne + numTwo + numThree;

		return result;

	}

	public static void main(String[] args) {

		System.out.println(uniqueSum(4, 4, 4));

	}

}
