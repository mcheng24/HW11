public class MaxN {

    public int[] maxN(int[] M) {
        int[] MAX = new int[M.length];
        MAX[0] = M[0];
        for (int i = 1; i < M.length; i++) {
            if (MAX[i - 1] > M[i]) {
                MAX[i] = MAX[i - 1];
            } else {
                MAX[i] = M[i];
            }
        }
        return MAX;
    }

    public MaxN(int[] input) {
        int[] MAX = maxN(input);
        for (int i=0; i < input.length; i++) {
            System.out.print(MAX[i] + " ");
        }
    }
}