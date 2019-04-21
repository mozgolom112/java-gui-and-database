package ru.overtired.javafx.sample3.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import ru.overtired.javafx.sample3.models.Crew;
import ru.overtired.javafx.sample3.utils.HibernateManager;

public class MainController {

    @FXML
    private VBox vboxLayout;

    @FXML
    private void loadCrew() {
        HibernateManager instance = HibernateManager.getInstance();
        for (Crew crew : instance.getAllCrew()) {
            final String labelText = String.format(
                    "\nSurname: %s\nFirstname: %s\nSecondname: %s\nID: %s\nBirth year: %s\nStatus: %s",
                    crew.getSurname(),
                    crew.getFirstname(),
                    crew.getSecondname(),
                    crew.getID(),
                    crew.getYear(),
                    crew.getDescribeStatus().getType()
            );
            vboxLayout.getChildren().add(new Label(labelText));
            vboxLayout.requestLayout();
        }
    }
}
