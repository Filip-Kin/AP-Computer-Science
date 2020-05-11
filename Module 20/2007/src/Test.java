import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println(randomPoints(3) + randomPoints(3));


    }
    public static int randomPoints(int n)
    {
      return (int)(n * Math.random()) + 1;
    }
}