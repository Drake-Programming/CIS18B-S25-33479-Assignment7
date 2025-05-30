package com.example.cis18bs2533479assignment7;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;

public class EventsController {
    @FXML
    private DatePicker cardDatePicker;

    @FXML
    private TextArea cardTextPicker;

    @FXML
    private TextField cardTitlePicker;

    @FXML
    private Label cardInfoLabel;

    @FXML
    private VBox eventList;


    String cardText;
    String cardTitle;
    LocalDate cardDate;

    @FXML
    protected void onSubmitButtonClick() {
        try {
            cardText = cardTextPicker.getText();
            cardTitle = cardTitlePicker.getText();
            cardDate = cardDatePicker.getValue();

            if (cardDate.toString().isEmpty() || cardTitle.isEmpty()) {
                cardInfoLabel.setText("Please fill in all fields");
            } else {
                addEventLabel(cardText, cardTitle, cardDate);

                cardTitlePicker.clear();
                cardTextPicker.clear();
                cardDatePicker.setValue(null);
                cardInfoLabel.setText("Enter in Event Information");
            }
        } catch (NullPointerException e) {
            cardInfoLabel.setText("Please fill in all fields");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    protected void addEventLabel(String cardText, String cardTitle, LocalDate cardDate) {
        int maxWidth = 300;
        Label eventCardTitleLabel = new Label(cardTitle);
        Label eventCardDateLabel = new Label(cardDate.toString());
        Label eventCardTextLabel = new Label(cardText);
        eventCardTextLabel.setWrapText(true);
        eventCardTextLabel.setMaxWidth(maxWidth);

        HBox card = new HBox(eventCardTitleLabel, eventCardDateLabel, eventCardTextLabel);
        card.setStyle("""
           -fx-padding: 8;
           -fx-background-color: #EAEAEA;
           -fx-background-radius: 6;
           """);

        eventList.getChildren().add(card);

    }
}