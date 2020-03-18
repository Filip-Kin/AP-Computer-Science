public class Test {
    public static void main(String[] args) {
        System.out.println(recur(10));
    }

    public static int recur(int n)
    {
        if(n < 4)
        {
            return 2;
        }
        else
        {
            return recur(n / 4) + 2;
        }
    }
}
