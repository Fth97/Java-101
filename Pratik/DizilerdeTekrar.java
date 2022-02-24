package Pratik;

public class DizilerdeTekrar {

	static boolean isFind(int[] duplicate, int value) {
		for (int i : duplicate) {
			if (i == value)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list = { 3, 7, 2, 3, 2, 9, 10, 21, 10, 33, 9, 1 };
		int[] duplicate = new int[list.length];
		int startIndex = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (i != j && (list[i] == list[j])) {
					if (list[i] % 2 == 0) {
						if (!isFind(duplicate, list[i])) {
							duplicate[startIndex++] = list[i];
						}
						break;
					}
				}
			}

		}
		for (int value : duplicate) {
			if (value != 0)
				System.out.println(value);
		}
	}
}