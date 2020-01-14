import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int testCase = 1; testCase <= T; testCase++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			long profit = 0, max= -1;
			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] > max)
					max = arr[i];
				else
					profit += (max - arr[i]);
			}
			System.out.println("#" + testCase + " " + profit);
		}
	}
}
