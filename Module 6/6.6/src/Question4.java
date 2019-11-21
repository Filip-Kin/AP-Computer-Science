public class Question4 {
    public static void main(String[] args) {
        double[] times = {23.0, 26.6, 16.5, 20.8, 21.1, 18.9, 16.6};

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double total = 0;

        for (double time : times) {
            total += time;
            if (time < min) {
                min = time;
            }
            if (time > max) {
                max = time;
            }
        }

        total -= min + max;
        double average = total/(times.length-2);

        System.out.print("Times: ");
        for (double time : times) {
            if (time != min && time != max) {
                System.out.print(time+" ");
            }
        }
        System.out.print("\nAverage: "+average);

    }
}
