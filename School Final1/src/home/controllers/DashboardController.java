package home.controllers;

import home.model.StudentsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loadChart();
        loadStudents();
    }

    private void loadChart()
    {

        PieChart.Data slice1 = new PieChart.Data("Due", 213);
        PieChart.Data slice2 = new PieChart.Data("Paid"  , 67);
        PieChart.Data slice3 = new PieChart.Data("Deffered" , 36);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);

    }

    // using array list
    private ArrayList<StudentsModel> students = new ArrayList<StudentsModel>(){
        {
            add(new StudentsModel(1,"Henderson", "Jordan"));
            add(new StudentsModel(2, "Cheems", "Katy"));
            add(new StudentsModel(3,"Amos")); // polymorphic call - constructor overloading
            add(new StudentsModel(4,"Catherine", "Parker"));
        }
    };
    private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(students);


    private void loadStudents()
    {
        studentId.setCellValueFactory(new PropertyValueFactory<>("StudentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        tbData.setItems(studentsModels);
    }

}
