// QUESTION LINK: https://codeforces.com/problemset/problem/200/B

import java.util.Scanner;
import java.util.stream.*;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = n * 100;
        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        double sum = DoubleStream.of(a).sum();
        double res = (sum / total) * 100;
        System.out.println(res);
    }
}