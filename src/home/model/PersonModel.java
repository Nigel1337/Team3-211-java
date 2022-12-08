package home.model;

import javafx.beans.property.SimpleStringProperty;

public class PersonModel implements ToString {
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;

    public PersonModel(){
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
    }
    // Constructor Overloading
    public PersonModel(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    // Constructor Overloading
    public PersonModel(String firstName) {

        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty("");
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName = new SimpleStringProperty(lastName);
    }

    //toString method
    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
}
