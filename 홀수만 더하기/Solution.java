import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int testCase = 1; testCase <= T; testCase++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				int n = sc.nextInt();
				if (n % 2 > 0)
					sum += n;
			}
			System.out.println("#" + testCase + " " + sum);
		}
	}
}
