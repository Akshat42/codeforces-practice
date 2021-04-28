import java.util.Scanner;

public class GeorgeAndAccommodation {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int count = 0;
    while (t-- > 0) {
      int peopleLiving = sc.nextInt();
      int capacity = sc.nextInt();
      if (capacity - peopleLiving >= 2) count++;
    }
    System.out.println(count);
  }
}
