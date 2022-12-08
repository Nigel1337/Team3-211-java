package home.model;

import javafx.beans.property.SimpleStringProperty;

public class TimetableModel implements ToString {

    private SimpleStringProperty day;
    private SimpleStringProperty time;
    private SimpleStringProperty subject;
    private SimpleStringProperty classRoom;

    public TimetableModel(String day, String time, String subject, String classRoom) {
        this.day = new SimpleStringProperty(day);
        this.time = new SimpleStringProperty(time);
        this.subject = new SimpleStringProperty(subject);
        this.classRoom = new SimpleStringProperty(classRoom);
    }

    public String getDay() {
        return day.get();
    }

    public void setDay(String day) {
        this.day = new SimpleStringProperty(day);
    }

    public String getTime() {
        return time.get();
    }

    public void setTime(String time) {
        this.time = new SimpleStringProperty(time);
    }

    public String getSubject() {
        return subject.get();
    }

    public void setSubject(String subject) {
        this.subject = new SimpleStringProperty(subject);
    }

    public String getClassRoom() {
        return classRoom.get();
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = new SimpleStringProperty(classRoom);
    }

    //toString method
    @Override
    public String toString() {
        return "TimetableModel{" + "day=" + day + ", time=" + time + ", subject=" + subject + ", classRoom=" + classRoom + '}';
    }
}