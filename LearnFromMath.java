// QUESTION LINK: https://codeforces.com/problemset/problem/472/A

import java.util.Scanner;
class LearnFromMath {
		public static void main (String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				if(n%2 ==0)
						System.out.println(n/2+" "+n/2);
				else {
						int a = n/2;
						int b = n/2+1;
						while((a%3 !=0||a%2 !=0) || (b%2 !=0|| b%3 !=0)){
								a--;
								b++;
						}
						System.out.println(a+" "+b);
				}
		}
}
