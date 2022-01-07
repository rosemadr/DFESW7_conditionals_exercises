package conditionals;

public class BlackJack {

	public static int playBlackJack(int numOne, int numTwo) {

		int result = numOne;

		if (numOne * numTwo != 0) {

			if (numOne <= 21 && numTwo <= 21) {

				if (numTwo > numOne) {
					result = numTwo;
				}
			} else {
				result = 0;

			}

		}

		return result;

	}

	public static void main(String[] args) {

		System.out.println(playBlackJack(0, 1));

		System.out.println(playBlackJack(1, 1));

		System.out.println(playBlackJack(21, 1));

		System.out.println(playBlackJack(4, 7));

		System.out.println(playBlackJack(22, 8));

	}
}
