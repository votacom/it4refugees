package replaceArrays;

/**
 * Created by johannesvass on 07.12.16.
 */
public class Person {

    private String firstname;
    private String lastname;


    /**
     * Constructs a new Person.
     *
     * @param firstname the firstname
     * @param lastname the lastname
     */
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Constructs a new Person.
     *
     * @param name All names of the person separated by spaces
     */
    public Person(String name) {
        String[] parts = name.split(" ");
        this.firstname = parts[0];

        String lastname = "";
        for(int i = 1; i < parts.length; i++) {
            lastname += parts[i] + " ";
        }

        // remove the additional whitespace at the end of lastname
        this.lastname = lastname.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    /************ Don't mind the methods below this line for now, we will explain them to you soon **********/

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;
        return firstname.equals(person.firstname) && lastname.equals(person.lastname);

    }
}
