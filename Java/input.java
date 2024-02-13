import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer :");
        System.out.println("Enter an float :");
        System.out.println("Enter an double :");
        System.out.println("Enter an string :");
        System.out.println("Enter the Single String :");
        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        double c = scanner.nextDouble();
        String d = scanner.nextLine();
        String e = scanner.next();
        System.out.println("Result :" + a);
        System.out.println("Result :" + b);
        System.out.println("Result :" + c);
        System.out.println("Result :" + e);
        System.out.println("Result :" + d);
        scanner.close();
    }
}
