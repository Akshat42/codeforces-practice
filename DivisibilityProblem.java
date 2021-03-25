// QUESTION LINK: https://codeforces.com/problemset/problem/1328/A

import java.util.Scanner;
public class DivisibilityProblem {
		static int cal(int a, int b) {
				int rem = a%b;
				if(rem ==0)
						return 0;
				return b-rem;
		}
		public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while(t-->0) {
						int a = sc.nextInt();
						int b = sc.nextInt();
						System.out.println(cal(a,b));
				}
		}
}
