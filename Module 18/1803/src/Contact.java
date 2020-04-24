/**
 * Object to store a person's contact information
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */
public class Contact {
    private final String name;
    private final String relation;
    private final String birthday;
    private final String phoneNumber;
    private final String email;

    Contact(final String name, final String relation, String birthday, final String phoneNumber, final String email) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Returns the name of this contact
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the relation of this contact
     * 
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Returns the birthday of this contact
     * 
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Returns the phoneNumber of this contact
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the email of this contact
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public String toString() {
        return String.format("%-20s %-10s %-14s %-14s %s%n", name, relation, birthday, phoneNumber, email);
    }

}