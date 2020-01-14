import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int testCase = 1; testCase <= 10; testCase++) {
			int n = sc.nextInt();
			int[] building = new int[n];
			for (int i = 0; i < n; i++)
				building[i] = sc.nextInt();

			int house = 0;
			for (int i = 2; i < building.length - 2; i++) {
				if (building[i - 1] < building[i] && building[i - 2] < building[i]) {
					if (building[i + 1] < building[i] && building[i + 2] < building[i]) {
						int leftMax = Math.max(building[i - 1], building[i - 2]);
						int rightMax = Math.max(building[i + 1], building[i + 2]);
						int max = Math.max(leftMax, rightMax);
						house += (building[i] - max);
					}
				}
			}
			System.out.println("#" + testCase + " " + house);
		}
	}
}
