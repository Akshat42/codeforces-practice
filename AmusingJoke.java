//QUESTION LINK: https://codeforces.com/problemset/problem/141/A
import java.util.*;

public class AmusingJoke {
		public static String cal(String a, String b, String c) {
				String ab = a+b;
				char[] aabb = ab.toCharArray();
				char[] cc = c.toCharArray();
				Arrays.sort(aabb);
				Arrays.sort(cc);
				if(Arrays.equals(aabb,cc))
								return "YES";
				return "NO";
				}
		public static void main (String args[]) {
				Scanner sc = new Scanner(System.in);
				String a = sc.nextLine();
				String b = sc.nextLine();
				String c = sc.nextLine();
				System.out.println(cal(a,b,c));
		}
}
