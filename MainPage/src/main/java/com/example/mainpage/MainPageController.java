package com.example.mainpage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {

    @FXML
    private ComboBox<String> dropMonth;

    @FXML
    private ComboBox<Integer> dropDate;

    @FXML
    private ComboBox<Integer> dropYear;

    @FXML
    private ComboBox<String> dropTime;

    @FXML
    private Button buttonSignout;

    public void initialize(URL url, ResourceBundle resourceBundle){
        ObservableList<String> dropList = FXCollections.observableArrayList("January", "February", "March", "April",
                    "May", "June", "July", "August", "September", "October", "November", "December");
        ObservableList<Integer> dateList = FXCollections.observableArrayList(
                1,2,3,4,5,6,7,8,9,10,
                    11,12,13,14,15,16,17,18,
                    19,20,21,22,23,24,25,26,27,28,29,30,31);
        ObservableList<Integer> yearList = FXCollections.observableArrayList(2022,2023,2024);
        ObservableList<String> timeList = FXCollections.observableArrayList("AM", "PM");

            dropMonth.setItems(dropList);
            dropDate.setItems(dateList);
            dropYear.setItems(yearList);
            dropTime.setItems(timeList);
    }

    public void buttonSignoutOnAction(ActionEvent e){
        Stage stage = (Stage) buttonSignout.getScene().getWindow();
        stage.close();
    }
}