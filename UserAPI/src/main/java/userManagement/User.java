package userManagement;

public class User {
    private String firstName;
    private String surname;
    private String streetAddress;
    private String city;
    private int postCode;


    public User() {

    }

    public User(String firstName, String surname, String streetAddress, String city, int postCode) {
        this.firstName = firstName;
        this.surname = surname;
        this.streetAddress = streetAddress;
        this.city = city;
        this.postCode = postCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }



    public String toString() {
        return "User{ " +
                firstName + ", " +
                surname + ", " +
                streetAddress + ", " +
                city + ", " +
                postCode + "}\n";
    }

}
