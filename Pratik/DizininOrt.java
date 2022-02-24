package Pratik;

public class DizininOrt {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		double hSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			hSum+=1.0/numbers[i];
		}

		System.out.println(sum / numbers.length);
		System.out.println(hSum);
	}

}
