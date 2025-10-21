package dk.easv.exercise403.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;

public class ToDoListController {

    @FXML
    private ListView<String> toDoListView;

    @FXML
    private ListView<String> inProgressListView;

    @FXML
    private ListView<String> doneListView;

    //allow editing of to do list
    @FXML
    public void initialize() {
        toDoListView.setEditable(true);
        toDoListView.setCellFactory(TextFieldListCell.forListView());
    }

    @FXML
    private void onCreateNewToDoClick() {
        toDoListView.getItems().add("Write New To-Do Here!");
    }

    @FXML
    private void onMoveRightOneClick(ActionEvent actionEvent) {
        String selectedItem = toDoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            inProgressListView.getItems().add(selectedItem);
            toDoListView.getItems().remove(selectedItem);
        }
    }

    @FXML
    private void OnMoveLeftOneClick(ActionEvent actionEvent) {
        String selectedItem = inProgressListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            toDoListView.getItems().add(selectedItem);
            inProgressListView.getItems().remove(selectedItem);
        }
    }

    @FXML
    private void onMoveRightTwoClick(ActionEvent actionEvent) {
        String selectedItem = inProgressListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            doneListView.getItems().add(selectedItem);
            inProgressListView.getItems().remove(selectedItem);
        }
    }

    @FXML
    private void onMoveLeftTwoClick(ActionEvent actionEvent) {
        String selectedItem = doneListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            inProgressListView.getItems().add(selectedItem);
            doneListView.getItems().remove(selectedItem);

        }
    }

    @FXML
    private void onRemoveToDoClick(ActionEvent actionEvent) {
        String selectedItem = toDoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            toDoListView.getItems().remove(selectedItem);
        }
    }
}
