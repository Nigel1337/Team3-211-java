package home.controllers;

import home.model.TimetableModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TimetableController implements Initializable {

    @FXML
    private TableView<TimetableModel> tbData;
    @FXML
    public TableColumn<TimetableModel, String> day;

    @FXML
    public TableColumn<TimetableModel, String> time;

    @FXML
    public TableColumn<TimetableModel, String> subject;

    @FXML
    public TableColumn<TimetableModel, String> classRoom;
    public TimetableController()
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        day.setCellValueFactory(new PropertyValueFactory<TimetableModel,String>("Day"));
        time.setCellValueFactory(new PropertyValueFactory<TimetableModel,String>("Time"));
        subject.setCellValueFactory(new PropertyValueFactory<TimetableModel,String>("Subject"));
        classRoom.setCellValueFactory(new PropertyValueFactory<TimetableModel,String>("ClassRoom"));
        tbData.setItems(timetableModels);
    }

    private ArrayList<TimetableModel> timetable = new ArrayList<TimetableModel>(){
        {
            add(new TimetableModel("Monday", "8:00 - 9:00", "Maths", "A1"));
            add(new TimetableModel("Tuesday", "9:00 - 10:00", "English", "B1"));
            add(new TimetableModel("Wednesday", "10:00 - 11:00", "Science", "C1"));
            add(new TimetableModel("Thursday", "11:00 - 12:00", "History", "D1"));
            add(new TimetableModel("Friday", "12:00 - 13:00", "Geography", "E1"));
        }
    };
    private ObservableList<TimetableModel> timetableModels = FXCollections.observableArrayList(timetable);


}
