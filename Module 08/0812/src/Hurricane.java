/**
 * @purpose Hurricane class to hold data
 * @author Filip Kin
 * @version 2019-11-21
 */

class Hurricane {
    private int y, p, c;
    private double  w;
    private String n;

    /**
     * Create new hurricane object
     * @param y Year when hurricane happened
     * @param p Hurricane pressure
     * @param w Hurricane wind speeds
     * @param n Hurricane name
     */
    Hurricane(int y, int p, double w, String n) {
        this.y = y;
        this.p = p;
        this.w = w;
        this.n = n;
    }

    void convertWindSpeed() {
         w *= 1.151;
    }

    void assignCategory() {
        if (w<96) {
            c = 1;
        } else if (w<111) {
            c = 2;
        } else if (w<130) {
            c = 3;
        } else if (w<157) {
            c = 4;
        } else {
            c = 5;
        }
    }

    double getWindSpeed() {
        return w;
    }

    int getPressure() {
        return p;
    }

    int getYear() {
        return y;
    }

    String getName() {
        return n;
    }

    int getCategory() {
        return c;
    }
}
