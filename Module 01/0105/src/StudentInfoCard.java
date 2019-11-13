import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Purpose: Give Mr. Shelton information about myself
 *
 * @author Filip Kin
 * @version 2019-09-09
 */
public class StudentInfoCard {
    public static void main(String[] args) {
        // Banner
        System.out.print("+------------------------------+\n");
        System.out.println("|                              |");
        System.out.println("|   Student Information Card   |");
        System.out.println("|                              |");
        System.out.println("+------------------------------+");
        System.out.println();

        // Basic information
        System.out.print("Name: ");
        System.out.println("Filip Kin");
        System.out.print("Birthday: ");
        System.out.println("2003-01-10");
        System.out.print("Age: ");
        try {
            long now = new Date().getTime();
            long birth = new SimpleDateFormat("yyyy-MM-dd").parse("2003-01-10").getTime();
            System.out.println((now - birth)/1000/60/60/24/365);
        } catch(ParseException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println();

        // School information
        System.out.print("School: ");
        System.out.println("Oxford Virtual Academy");
        System.out.print("Grade: ");
        System.out.println("11th");
        System.out.print("City of residence: ");
        System.out.println("Troy, Michigan");
        System.out.println();

        // Contact information
        System.out.print("Home Phone: ");
        System.out.println("N/A");
        System.out.print("Cell Phone: ");
        System.out.println("(248) 946-6028");
        System.out.print("Email Address: ");
        System.out.println("70898@oxfordwildcats.org");
        System.out.print("Availability: ");
        System.out.println("8:00am - 3:30pm EST Mon-Fri");
        System.out.println();

        // Parent's contact information
        System.out.println("Dad's contact information");
        System.out.print("Cell Phone: ");
        System.out.println("(313) 347-3004");
        System.out.print("Email: ");
        System.out.println("jacek_kin@yahoo.com");
        System.out.println();

        // Experience
        System.out.print("Current math class: ");
        System.out.println("Pre-calculus\n");
        System.out.print("Programming experience: ");
        System.out.print("I've been programming since I was 12 years old.\n" +
                "I know Python, JavaScript, and some basic Java and C.\n" +
                "I've done a lot of work on web stuff, I know HTML, CSS, and PHP.\n" +
                "I own filipkin.com and filipk.in.\n" +
                "I've had experience with Linux server administration, and usually develop on Kubuntu 18.04\n" +
                "I have a linux server in my house which runs some of my applications and is a file server.\n" +
                "My GitHub has some of my projects https://github.com/Filip9696\n" +
                "although I loose motivation to work on most my projects halfway through.\n\n");
        System.out.print("Why am I taking this course? ");
        System.out.println("I want to get more experience with Java, beyond the basic introduction I've had.\n" +
                "I'm on a FRC robotics team and I want to be on the programming team, but I'm not too comftable with Java yet\n" +
                "I want to go to MIT for Computer Science, and this class would look good on my transcript, and college credit?\n" +
                "I was going to take a basic coding class with OVA, but when I looked through the course content,\n" +
                "I realized we didn't write Hello, World in python until halfway though the semester so I needed something more difficult");
    }
}
