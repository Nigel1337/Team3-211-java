package home.model;

import javafx.beans.property.SimpleIntegerProperty;

// This class is a child class of PersonModel
public class TeachersModel extends PersonModel implements ToString {
    private SimpleIntegerProperty teacherId;

    public TeachersModel(){
    }

    public TeachersModel(Integer teacherId, String firstName, String lastName) {
        super(firstName, lastName);
        this.teacherId = new SimpleIntegerProperty(teacherId);
    }

    public TeachersModel(Integer teacherId, String firstName) {
        super(firstName);
        this.teacherId = new SimpleIntegerProperty(teacherId);
    }

    public int getTeacherId() {
        return teacherId.get();
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = new SimpleIntegerProperty(teacherId);
    }

    //toString method
    @Override
    public String toString() {
        return "TeachersModel{" + "teacherId=" + teacherId + ", " + super.toString();
    }

}
