//https://codeforces.com/problemset/problem/1409/A

import java.util.Scanner;
public class YetAnotherTwoIntegers {
		public static void main (String args[]) {
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while(t-->0) {
						int a = sc.nextInt();
						int b = sc.nextInt();
						int sub = 10;
						int count = 0;
						if(a < b) {
								while(a != b) {
										int temp = a + sub;
										if(temp <= b) {
												a = temp;
												count++;
										}
										else {
												temp = temp - sub;
												sub--;
										}	
								}
						} 
						if(a > b) {
								while(a!=b) {
										int temp = a-sub;
										if(temp >= b) {
												a = temp;
												count++;
										}
										else
												sub--;
								}
						}
						System.out.println(count);
				}
		}
}
