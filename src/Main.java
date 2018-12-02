//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int[] input1 = {1,3,1,4,1,1,5,1,1,9};
        MaxN obj1 = new MaxN(input1);
        System.out.print(obj1);
        System.out.println();

        int[] input2 = {9,1,1,1,2,1,2,3,4,10};
        MaxN obj2 = new MaxN(input2);
        System.out.print(obj2);
        System.out.println();

        int[] input3 = new int[10];
        for(int i = 0; i < input3.length; i++) {
            input3[i] = (int)(Math.random()*20 + 1);
        }
        System.out.println("Numbers Generated: " + Arrays.toString(input3));
        MaxN obj3 = new MaxN(input3);
        System.out.print(obj3);
        System.out.println();
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a value for coin 1: ");
        int x1 = read.nextInt();
        System.out.println("Enter a value for coin 2: ");
        int x2 = read.nextInt();
        System.out.println("Enter a value for N: ");
        int n = read.nextInt();
        System.out.println("First coin value: " + x1 + "\n Second coin value: " + x2 + "\n N value: " + n);

        
        System.out.println("How many of the first coin needed: " + a1 + "\n How many of the first coin needed: " + a2);
    }
}
