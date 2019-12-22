/**
 * @purpose Computer Aided Tomato Tosser, for perfect performer humiliation, every time.
 * @author Filip Kin
 * @version 2019-11-21
 */

public class TomatoTosser {
    public static void main(String[] args) {
        /*
         * Hmm, tomatoes are weird fruits. Oh and they get thrown at bad performers
         * Great idea! But how fast should I throw them at...
         * I know! Let's have a baseball pitcher throw it
         *
         * Hey Google, What's the fastest baseball pitch ever: 105.1 MPH by Aroldis Chapman.
         * I feel like a tomato hitting a human at 49 m/s would cause some major damage
         * force = mass * acceleration, average tomato is .17 kg
         * Assuming the tomato takes it's entire width to splatter and slow down, about .03175m
         * I forgot how to do this properly, so yolo, it would be splattered in about .001 seconds
         * It would actually be much faster but idk how to calculate that accurately
         * .17*(49/.001)=8330 newtons, it takes about 3300N to break a rib, a femur? 4000N
         * Yeah, don't get hit by tomatoes flying at 110mph, much less a baseball
         *
         * I just remembered something, air resistance exists... what's the terminal velocity of a tomato
         * OF COURSE someone did a research paper on it
         * The most dense, best shaped, perfect tomato for throwing has a max speed of...
         * .014 m/s
         * ...That's disappointing, but it's alright I didn't specify *where* this trial is being run
         * So... the international space station seems like a good place,
         * but then the acceleration due to gravity doesn't exist, so infinitely far throws, voyager 3 is a tomato
         */
        int[] vArr = {70, 75, 80, 85, 90, 95, 100, 105, 110};
        int[] aArr = {25, 30, 35, 40, 45, 50};
        Tomato[][] arr = new Tomato[vArr.length][aArr.length];

        System.out.print("Tomato Toss Distances (meters)\n  MPH");

        for (int j = 0; j < aArr.length; j++) {
            System.out.printf("%7d deg", aArr[j]);
        }
        System.out.print("\n=========================================================================");

        for (int i = 0; i < vArr.length; i++) {
            System.out.printf("%n%4d ", vArr[i]);
            for (int j = 0; j < aArr.length; j++) {
                arr[i][j] = new Tomato(vArr[i], aArr[j]);
                arr[i][j].calculateDistance();
                System.out.printf("%11.2f", arr[i][j].getd());
            }
        }
    }
}
