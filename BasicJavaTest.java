public class BasicJavaTest {
	public static void main (String[] args) {
		int[] myArr = {23,45,12,13,-2,15,2};

		FirstFive test = new FirstFive();
		test.minMaxAvg(myArr);

		test.swapDojo(myArr);

		test.arraySquare(myArr);

		test.printOdd();

		test.arrayShift(myArr);
	}
}