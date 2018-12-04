import java.util.Arrays;

public class Ncoin {
    /**
     * x1 value of first coin.
     * x2 value of second coin.
     * n is the N value that the coins could make change of.
     * c is a counter array that stores the amount needed of each coin to make up n.
     * ***c[i][0] stores the amount of the first coin needed to add up to i.
     * ***c[i][1] stores the amount of the second coin needed to add up to i.
     * CHENG is a boolean array that determines whether the first and second coin add up to n.
     */
    private int x1;
    private int x2;
    private int n;
    private int[][] c;
    private boolean[] CHENG;
     /**
     * Basic Constructor
     */
    public Ncoin(final int coin1, final int coin2, final int N) {
        if (coin1 < 0 || coin2 < 0 || N < 0) {
            System.out.println("Invalid Input");
        } else {
            x1 = coin1;
            x2 = coin2;
            n = N;
            CHENG = new boolean[n + 1];
            c = new int[n + 1][2];
        }
    }

    /**
     * Modifies CHENG array and counter array to check how many coins are needed to sum up to n.
     * @return a boolean array CHENG that stores if a combination exists that adds to n.
     */
    public boolean[] makeChange() {
        if (n < 0 || x1 <= 0 || x2 <= 0) {
            System.out.println("Invalid Input");
            return null;
        }
        CHENG[0] = true;
        for (int i = 1; i <= n; i++) {
            if (i>= x1 || i>= x2) {
                if (i - x2 < 0) {
                    CHENG[i] = CHENG[i - x1];
                    if (CHENG[i]) {
                        c[i][0] += c[i - x1][0] + 1;
                        c[i][1] += c[i - x1][1];
                    }
                } else if (i - x1 < 0) {
                    CHENG[i] = CHENG[i - x2];
                    if (CHENG[i]) {
                        c[i][1] += c[i - x2][1] + 1;
                        c[i][1] += c[i - x2][0];
                    }
                } else {
                    CHENG[i] = CHENG[i - x1] || CHENG[i - x2];
                    if (CHENG[i] && CHENG[i] == CHENG[i - x1]) {
                        c[i][0] += c[i - x1][0] + 1;
                        c[i][1] += c[i - x1][1];
                    }else if (CHENG[i] && CHENG[i] == CHENG[i - x2]) {
                        c[i][1] += c[i - x2][1] + 1;
                        c[i][1] += c[i - x2][0];
                    }
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
