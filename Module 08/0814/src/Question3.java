public class Question3 {
    public static void main(String[] args) {
        // 29
        System.out.println(daysInFebruary(2020));
        System.out.println(daysInFebruary(2000));
        System.out.println(daysInFebruary(1996));
        System.out.println(daysInFebruary(1992));
        // 28
        System.out.println(daysInFebruary(2013));
        System.out.println(daysInFebruary(1900));
        System.out.println(daysInFebruary(1800));
    }

    public static int daysInFebruary(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return 29;
        return 28;
    }
}
