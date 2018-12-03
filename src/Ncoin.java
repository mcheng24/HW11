import java.util.Arrays;

public class Ncoin {
    /**
     * x1 value of first coin.
     * x2 value of second coin.
     * c stores the amount needed of each coin.
     * n is the N value that the coins could make change of.
     * cAmount is the amount of coins needed of each to make n.
     * CHENG is a boolean array that determines whether the first and second coin add up to n.
     */
    private int x1;
    private int x2;
    private int n;
    private int[][] c;
    private boolean[] CHENG;
     /**
     * x1 is the value of the first coin.
     * x2 is the value of the second coin.
     */
    public Ncoin(final int coin1, final int coin2, final int N) {
        x1 = coin1;
        x2 = coin2;
        n = N;
        CHENG = new boolean[n + 1];
        c = new int[n+1][2];
    }

    /**
     * @return if a combination of coins add up to a value N
     */
    public boolean[] makeChange() {
        if (n < 0 || x1 <= 0 || x2 <= 0 || x1 > n || x2 > n) {
            return CHENG;
        }
        CHENG[0] = true;
        for (int i = 1; i <= n; i++) {
            if (i>= x1 || i >= x2) {
                CHENG[i] = CHENG[i - x1] || CHENG[i - x2];
                if (CHENG[i] && CHENG[i] == CHENG[i - x1]) {
                    c[i][0] += c[i-x1][0] + 1;
                    c[i][1] += c[i-x1][1];
                } else if (CHENG[i] && CHENG[i] == CHENG[i - x2]) {
                    c[i][1] += c[i-x2][1] + 1;
                    c[i][1] += c[i-x2][0];
                }
            }
        }
        return CHENG;
    }
    @Override
    public String toString() {
        return Arrays.toString(CHENG) +
                "\n" + Arrays.deepToString(c);
    }
}
