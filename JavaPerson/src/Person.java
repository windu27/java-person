/**
 * Represents a person with a name and address.
 */
public class Person {
    private String name;
    private String address;

    /**
     * Constructs a person object with the specified name and address.
     *
     * @param name    the name of the person
     * @param address the address of the person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the address of the person.
     *
     * @return the address of the person
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets the address of the person.
     *
     * @param address the new address of the person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return this.name + "(" + this.address + ")";
    }
}