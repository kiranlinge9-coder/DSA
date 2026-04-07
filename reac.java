import java.util.Scanner;

public class reac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r= sc.nextFloat();
        float area = 3.14f* r * r;
        sc.close();
        System.out.println(area);
    }
}
