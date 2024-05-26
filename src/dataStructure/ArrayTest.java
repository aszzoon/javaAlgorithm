package dataStructure;

public class ArrayTest {

	public static void main(String[] args) {

		int [] tennisScore = {39, 21, 49, 89, 63, 91};

		int max = tennisScore[0];
		int min = tennisScore[0];

		for (int i = 1; i < tennisScore.length; i++) {

			if (tennisScore[i] > max) {
				max = tennisScore[i];
			}

			if (tennisScore[i] < min) {
				min = tennisScore[i];
			}

			System.out.println(max);
			System.out.println(min);
		}

	}
}
