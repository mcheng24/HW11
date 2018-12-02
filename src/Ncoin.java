public class Ncoin {
    /**
     * x1 is the value of the first coin.
     * x2 is the value of the second coin.
     * n is the N value that the coins could make change of.
     * a1 is the amount of first coins you need to make N.
     * a2 is the amount of second coins you need to make N.
     */
    private int x1;
    private int x2;
    private int n;
    private int a1;
    private int a2;
    /**
     * c1 is the value of the first coin.
     * c2 is the value of the second coin.
     */
    public Ncoin(final int c1, final int c2, final int N) {
        x1 = c1;
        x2 = c2;
        n = N;
    }

    public boolean makeChange() {
        if (n == 0) {
            return true;
        }
        int[][] CHENG = new int[][];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                CHENG[i][j] = x1 * i + x2 * j;
                if (CHENG[i][j] == n) {
                    a1 = i;
                    a2 = j;
                    return true;
                }
            }
        }
        return false;
    }
}
