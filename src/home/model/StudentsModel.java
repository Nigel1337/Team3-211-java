package home.model;


import javafx.beans.property.SimpleIntegerProperty;

// This class is a child class of PersonModel
public class StudentsModel extends PersonModel implements ToString {

    private SimpleIntegerProperty studentId;

    public StudentsModel(){

    }

    public StudentsModel(Integer studentId, String firstName, String lastName) {
        super(firstName, lastName);
        this.studentId = new SimpleIntegerProperty(studentId);
    }

    public StudentsModel(Integer studentId, String firstName) {
        super(firstName);
        this.studentId = new SimpleIntegerProperty(studentId);
    }

    public int getStudentId() {
        return studentId.get();
    }

    public void setStudentId(int studentId) {
        this.studentId = new SimpleIntegerProperty(studentId);
    }


    //toString method
    @Override
    public String toString() {
        return "StudentsModel{" + "studentId=" + studentId + ", " + super.toString();
    }
}