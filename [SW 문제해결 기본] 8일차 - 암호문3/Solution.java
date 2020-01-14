import java.util.ArrayList;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int testCase = 1; testCase <= 10; testCase++) {
			ArrayList<String> cryptograms = new ArrayList<>();
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				String tmp = sc.next();
				cryptograms.add(tmp);
			}
			sc.nextInt();
			sc.nextLine();
			String line = sc.nextLine();
			String[] commands = line.split(" ");

			for (int idx = 0; idx < commands.length;) {
				int x, y;
				switch (commands[idx++]) {
				case "I":
					x = Integer.parseInt(commands[idx++]);
					y = Integer.parseInt(commands[idx++]);
					for (int i = 0; i < y; i++)
						cryptograms.add(x++, commands[idx++]);
					break;
				case "D":
					x = Integer.parseInt(commands[idx++]);
					y = Integer.parseInt(commands[idx++]);
					for (int i = 0; i < y; i++)
						cryptograms.remove(x);
					break;
				case "A":
					y = Integer.parseInt(commands[idx++]);
					for (int i = 0; i < y; i++)
						cryptograms.add(commands[idx++]);
					break;
				}
			}
			System.out.print("#" + testCase + " ");
			for (int i = 0; i < 9; i++)
				System.out.print(cryptograms.get(i) + " ");
			System.out.println(cryptograms.get(9));
		}
	}
}
