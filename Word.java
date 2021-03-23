//QUESTION LINK: https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

class Word {
		public static String cal(String s) {
				int len = s.length();
				int up = 0;
				int low = 0;
				for(int i=0;i<len;i++) {
						if(Character.isUpperCase(s.charAt(i))) up++;
						else low++;
				}
						if(low > up)
								s = s.toLowerCase();
						else if(low == up)
								s = s.toLowerCase();
						else
								s = s.toUpperCase();
				return s;
		}
		public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				System.out.println(cal(s));
		}
}

