package userManagement;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="surname")
    private String surname;
    @Column(name="street_address")
    private String streetAddress;
    @Column(name="city")
    private String city;
    @Column(name="post_code")
    private int postCode;


    public User() {

    }

    public User(String firstName, String surname, String streetAddress, String city, int postCode) {
        this.setFirstName(firstName);
        this.setSurname(surname);
        this.setStreetAddress(streetAddress);
        this.setCity(city);
        this.setPostCode(postCode);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                id +", " +
                firstName + ", " +
                surname + ", " +
                streetAddress + ", " +
                city + ", " +
                postCode + "}\n";
    }

}
