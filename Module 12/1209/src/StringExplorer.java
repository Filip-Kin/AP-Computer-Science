import java.util.Arrays;

/**
 * A program to allow students to try out different
 * String methods.
 * <p>
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today ' s date)
 */
public class StringExplorer {

    public static void main(String[] args) {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = \"" + sample + "\"");
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = " + position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = \"" + isEqual + "\"");
        System.out.println();
        System.out.println();

        sample = "    How much wood would a woodchuck chuck if a woodchuck could chuck wood?  ";
        System.out.println("sample = \"    How much wood would a woodchuck chuck if a woodchuck could chuck wood?  \";");
        System.out.println();

        //    trim()
        String trim = sample.trim();
        System.out.println("sample.trim() = \"" + trim + "\"");
        System.out.println("After trim(), sample = \"" + sample + "\"");
        System.out.println();

        //    length()
        System.out.println("sample.length() = " + sample.length());
        System.out.println();

        //    indexOf with one and two parameters
        System.out.println("sample.indexOf(\"wood\") = " + sample.indexOf("wood"));
        System.out.println("sample.indexOf(\"wood\", 27) = " + sample.indexOf("wood", 27));
        System.out.println();

        //    substring() with one and two parameters
        System.out.println("sample.substring(13) = \"" + sample.substring(13) + "\"");
        System.out.println("sample.substring(47, 47+4) = \"" + sample.substring(47, 47 + 4) + "\"");
        System.out.println();

        //    compareTo()
        System.out.println("sample.compareTo(\"She sells sea shells by the seashore.\") = " + sample.compareTo("She sells sea shells by the seashore."));
        System.out.println("\"She sells sea shells by the seashore.\".compareTo(sample) = " + "She sells sea shells by the seashore.".compareTo(sample));
        System.out.println("sample.compareTo(sample) = " + sample.compareTo(sample));
        System.out.println();

        //    split()
        System.out.println("sample.trim().split(\" \") = " + Arrays.toString(sample.trim().split(" ")));
    }

}