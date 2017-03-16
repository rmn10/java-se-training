/**
 * Created by romario on 2/25/2017.
 */
public class TDistance {
    public static void main(String[] args) {
        final int t=3; //time
        int v1=50, v2=30, s=80; //v1-speed of the first car, v2-speed of the second car, s - previous distance
        int s1=s+(v1+v2)*t;
        System.out.printf("After %d hours distance between car1 and car2 will %d km%n",t,s1);
    }
}
