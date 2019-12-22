public class Question2 {
    public static void main(String[] args) {
        System.out.println(convertTime("18:12"));
        System.out.println(convertTime("12:12"));
        System.out.println(convertTime("00:12"));
    }

    // precondition: the String value of the time parameter is valid and between
    // 00:00 and 23:59 and has a length of 5 characters.
    public static String convertTime(String worldFormat) {
        int h = Integer.parseInt(worldFormat.substring(0,2));
        String d = " AM";
        if (h>=12) { d = " PM"; h-=12; }
        if (h==0) h=12;
        return h+worldFormat.substring(2)+d;
    }
}
