package home.controllers;
import home.model.TeachersModel;
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

public class TeachersController implements Initializable {

    @FXML
    private TableView<TeachersModel> tbData;
    @FXML
    public TableColumn<TeachersModel, Integer> teacherId;

    @FXML
    public TableColumn<TeachersModel, String> firstName;

    @FXML
    public TableColumn<TeachersModel, String> lastName;

    public TeachersController()
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        teacherId.setCellValueFactory(new PropertyValueFactory<>("TeacherId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        tbData.setItems(teacherModels);
    }

    // using array list
    private ArrayList<TeachersModel> teachers = new ArrayList<TeachersModel>(){
        {
            add(new TeachersModel(1,"Rional", "Messi"));
                    add(new TeachersModel(2,"Amos")); // polymorphic call - constructor overloading
                   add(new TeachersModel(3,"Jordan", "Henderson"));
                    add(new TeachersModel(4,"Katy", "Mors"));
        }
    };
    private ObservableList<TeachersModel> teacherModels = FXCollections.observableArrayList(teachers);



}
