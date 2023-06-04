import java.util.Scanner;

public class ArcLength {

    public static float arcLength(int R, int B) {
        float result = 2 * 3.14f * R * (B / 360.0f);
        return Math.round(result * 100.0f) / 100.0f;
    }

    public static void main(String[] args) {
        // INPUT
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int B=sc.nextInt();

        // OUTPUT
        System.out.print(arcLength(R,B));
        sc.close();
    }
}
