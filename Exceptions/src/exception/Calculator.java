package exception;

public class Calculator {
	public int add(int x, int y) {
		try {
			return x + y;
		} catch (Exception ex) {
			return 0;
		}

	}

	// This method could throw an ArithmeticException
	public double divide(int x, int y) {
		try {
			return x / y;
		} catch (ArithmeticException ex) {
			System.out.println(ex);
			return 0;

		}
	}
}
