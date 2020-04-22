import java.util.ArrayList;

class test {
    public static void main(String[] args) {
        ArrayList< Integer > a = new ArrayList< Integer >();
        ArrayList b = a;
        a.add(new Integer(4));
        b.add(new Integer(5));
        a.add(new Integer(6));
        System.out.println(b.size());
    }

    public double divideThese(double a, double b) {
        return a/b;
    }

    public double calcTip(double percent, double mealCost) {
        return mealCost*percent;
    }

    public double calcTip(double mealCost) {
        return mealCost*.175;
    }
}
