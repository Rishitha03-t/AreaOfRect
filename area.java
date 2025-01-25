
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of a and b:");
        int length=sc.nextInt();
        float breadth=sc.nextFloat();
        sc.close();
        System.out.println("area of rectangle:"+ length*breadth);
    }
}
