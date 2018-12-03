import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Valid inputs
         */
        Ncoin obj = new Ncoin(2,3,10);
        obj.makeChange();
        //obj.getCoins();
        System.out.println(obj);
        /*Ncoin obj2 = new Ncoin(5,7,10);
        boolean change2 = obj2.makeChange();
        System.out.println(change2);
        if (change2) {
            System.out.println("How many of the first coin needed: " + obj2.a1 + "\nHow many of the first coin needed: " + obj2.a2);
        }
        Ncoin obj3 = new Ncoin(1,3,0);
        boolean change3 = obj3.makeChange();
        System.out.println(change3);
        if (change3) {
            System.out.println("How many of the first coin needed: " + obj3.a1 + "\nHow many of the first coin needed: " + obj3.a2);
        }
        Ncoin obj4 = new Ncoin(8,7,100);
        boolean change4 = obj4.makeChange();
        System.out.println(change4);
        if (change4) {
            System.out.println("How many of the first coin needed: " + obj4.a1 + "\nHow many of the first coin needed: " + obj4.a2);
        }*/
        /**
         * Invalid inputs
         */
        /*Ncoin obj5 = new Ncoin(5,7,-4);
        boolean change5 = obj5.makeChange();
        System.out.println(change5);
        if (change5) {
            System.out.println("How many of the first coin needed: " + obj5.a1 + "\nHow many of the first coin needed: " + obj5.a2);
        }
        Ncoin obj6 = new Ncoin(-5,7,8);
        boolean change6 = obj6.makeChange();
        System.out.println(change6);
        if (change6) {
            System.out.println("How many of the first coin needed: " + obj6.a1 + "\nHow many of the first coin needed: " + obj6.a2);
        }
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a value for coin 1: ");
        int x1 = read.nextInt();
        System.out.println("Enter a value for coin 2: ");
        int x2 = read.nextInt();
        System.out.println("Enter a value for N: ");
        int n = read.nextInt();
        System.out.println("First coin value: " + x1 + "\nSecond coin value: " + x2 + "\nN value: " + n);

        Ncoin obj7 = new Ncoin(x1, x2, n);
        boolean change7 = obj7.makeChange();
        System.out.println(change7);
        if (change7) {
            System.out.println("How many of the first coin needed: " + obj7.a1 + "\nHow many of the first coin needed: " + obj7.a2);
        }*/
    }
}
