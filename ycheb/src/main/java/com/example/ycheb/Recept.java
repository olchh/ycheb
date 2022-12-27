package com.example.ycheb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;



public class Recept {
    int p1 = 0;
    int p2 = 0;

    @FXML
    private Button butt;

    @FXML
    private Button nah;

    @FXML
    private ListView<String> f1;

    @FXML
    private ListView<String> f2;
    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Label l7;

    @FXML
    private Label l8;

    @FXML
    private Label d;

    @FXML
    private Label v;

    @FXML
    private Button back;

    @FXML
    private Label name;

    @FXML
    private Label price;

    JOptionPane JOptionPane;

    @FXML
    public void Back(ActionEvent event) {
        Stage stageCLose = (Stage) back.getScene().getWindow();
        stageCLose.close();
    }

    @FXML
    void Nah(ActionEvent event) {
        Stage stageCLose = (Stage) nah.getScene().getWindow();
        stageCLose.close();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("cur.fxml"));
        try {
            loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Scene scene = new Scene(root,500,300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Butt(ActionEvent event) {
        String message = "";
        ObservableList<String> wuwu;
        wuwu = f1.getSelectionModel().getSelectedItems();

        for (String w: wuwu){
            message += w;
        }
        String message1 = "";

        ObservableList<String> wuwu2;
        wuwu2 = f2.getSelectionModel().getSelectedItems();

        for (String w2: wuwu2){
            message1 += w2;
        }
        if (message.equals("") || message1.equals("")){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }
        else {
            butt.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cur3.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 500, 300);
            Label price = (Label) scene.lookup("#price");
            Label name = (Label) scene.lookup("#name");

            if ((1 + f1.getSelectionModel().getSelectedIndex()) == 1) {
                p1 = Integer.parseInt(l1.getText().trim());
            }
            if ((1 + f1.getSelectionModel().getSelectedIndex()) == 2) {
                p1 = Integer.parseInt(l2.getText().trim());
            }
            if ((1 + f1.getSelectionModel().getSelectedIndex()) == 3) {
                p1 = Integer.parseInt(l2.getText().trim());
            }
            if ((1 + f1.getSelectionModel().getSelectedIndex()) == 4) {
                p1 = Integer.parseInt(l2.getText().trim());
            }

            if ((5 + f2.getSelectionModel().getSelectedIndex() == 5)) {
                p2 = Integer.parseInt(l5.getText().trim());
            }
            if ((5 + f2.getSelectionModel().getSelectedIndex() == 6)) {
                p2 = Integer.parseInt(l6.getText().trim());
            }
            if ((5 + f2.getSelectionModel().getSelectedIndex() == 7)) {
                p2 = Integer.parseInt(l7.getText().trim());
            }
            if ((5 + f2.getSelectionModel().getSelectedIndex() == 8)) {
                p2 = Integer.parseInt(l8.getText().trim());
            }

            if (p1 > p2) {
                price.setText(String.valueOf(p2));
                name.setText(d.getText());
            } else {
                price.setText(String.valueOf(p1));
                name.setText(v.getText());
            }

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }

    }
}
