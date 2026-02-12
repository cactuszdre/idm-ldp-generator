public class Calcul {

	public int addition(int val1, int val2) {
		return val1 + val2;
	}

	public int multiplication(int val1, int val2) {
		return val1 * val2;
	}

	public int substraction(int val1, int val2) {
		return val1 - val2;
	}

	public int division(int val1, int val2) {
		return val1 / val2;
	}

	public int square(int val) {
		return val * val;
	}

	public int sqrt(Integer val) {
		return (int)Math.sqrt(val);
	}

	public int factorial(int val) {
		int res = 1;
		for (int i = 1; i <= val; i++) {
			res = res * i;
		}
		return res;
	}

	public int power(int val, int puiss) {
		int res = val;
		for (int i = 1; i < puiss; i++) {
			res = res * val;
		}
		return res;
	}
}
