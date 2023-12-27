package staff;

import java.util.Date;

public abstract class Person {
    private int idCard;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String phoneNumber;

    public Person(int idCard, String firstName, String lastName,Date birthDate, String email, String phoneNumber) {
        this.idCard = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate=birthDate;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    //getters
    public int getIdCard() {
        return idCard;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setters
    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName= lastName;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    public String toString() {
        return "staff.Person{" +
                "idCard=" + idCard +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
