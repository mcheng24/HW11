import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a value for coin 1: ");
        int x1 = read.nextInt();
        System.out.println("Enter a value for coin 2: ");
        int x2 = read.nextInt();
        System.out.println("Enter a value for N: ");
        int n = read.nextInt();
        System.out.println("First coin value: " + x1 + "\nSecond coin value: " + x2 + "\nN value: " + n);

        Ncoin obj = new Ncoin(x1, x2, n);
        boolean change = obj.makeChange();
        System.out.println(change);
        if (change) {
            System.out.println("How many of the first coin needed: " + obj.a1 + "\nHow many of the first coin needed: " + obj.a2);
        }
    }
}
