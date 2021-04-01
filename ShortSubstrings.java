// QUESTION LINK:https://codeforces.com/problemset/problem/1367/A

import java.util.Scanner;
public class ShortSubstrings {
		public static void main (String args[]) {
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				sc.nextLine();
				while(t-->0) {
						String s = sc.nextLine();
						int len = s.length();
						String res =  new String(Character.toString(s.charAt(0)));
						for(int i = 1; i< len-1; i = i + 2) {
								res = res + Character.toString(s.charAt(i));
						}
						res = res + s.charAt(len-1);
						System.out.println(res);
				}
		}
}
