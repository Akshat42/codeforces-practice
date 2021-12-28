import java.util.*;

public class YoungPhysicist {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xsum = 0;
	int ysum = 0;
	int zsum = 0;
        for (int i = 0; i < n; i++) {
		xsum = xsum + sc.nextInt();
		ysum = ysum + sc.nextInt();
		zsum = zsum + sc.nextInt();
        }
        if(xsum == 0 && ysum == 0 && zsum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
