import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Valid inputs
         */
        Ncoin obj = new Ncoin(2,3,10);
        obj.makeChange();
        System.out.println(obj);

        Ncoin obj2 = new Ncoin(5,7,10);
        obj2.makeChange();
        System.out.println(obj2);

        Ncoin obj3 = new Ncoin(1,3,0);
        obj3.makeChange();
        System.out.println(obj3);

        Ncoin obj4 = new Ncoin(8,7,100);
        obj4.makeChange();
        System.out.println(obj4);

        /**
         * Invalid inputs
         */
        Ncoin obj5 = new Ncoin(5,7,-4);
        obj5.makeChange();
        System.out.println(obj5);

        Ncoin obj6 = new Ncoin(-5,7,8);
        obj6.makeChange();
        System.out.println(obj6);
        /**
         * User input
         */
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a value for coin 1: ");
        int x1 = read.nextInt();
        System.out.println("Enter a value for coin 2: ");
        int x2 = read.nextInt();
        System.out.println("Enter a value for N: ");
        int n = read.nextInt();
        System.out.println("First coin value: " + x1 + "\nSecond coin value: " + x2 + "\nN value: " + n);

        Ncoin obj7 = new Ncoin(x1, x2, n);
        obj7.makeChange();
        System.out.println(obj7);
    }
}
