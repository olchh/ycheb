package com.example.ycheb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button enter;

    @FXML
    private ListView<String> firstList;

    @FXML
    private ListView<String> secondList;

    @FXML
    void enter_click(ActionEvent event) {

        String choice = ""; //обьект, в который записывается значение при выборе
        ObservableList<String> object; //оюьект листа, который мы выбрали и записывает в мессэдж
        object = firstList.getSelectionModel().getSelectedItems();

        for (String o: object){
            choice += o;
        }
        String choice1 = "";

        ObservableList<String> object2;
        object2 = secondList.getSelectionModel().getSelectedItems();

        for (String o2: object2){
            choice1 += o2;
        }

        if(choice1.equals("") || choice.equals("")){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }
        else {
            enter.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cur2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 500, 300);

            ListView list1 = (ListView) scene.lookup("#listOfFirst");
            ListView list2 = (ListView) scene.lookup("#listOfSecond");
            Label l1 = (Label) scene.lookup("#l1");
            Label l2 = (Label) scene.lookup("#l2");
            Label l3 = (Label) scene.lookup("#l3");
            Label l4 = (Label) scene.lookup("#l4");
            Label l5 = (Label) scene.lookup("#l5");
            Label l6 = (Label) scene.lookup("#l6");
            Label l7 = (Label) scene.lookup("#l7");
            Label l8 = (Label) scene.lookup("#l8");

            Label d = (Label) scene.lookup("#firstPrice");
            Label v = (Label) scene.lookup("#secondPrice");

            if (choice.equals("самурай")) {
                list1.getItems().addAll("фила", "аризона", "чикен", "гуччи");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("370");
                l2.setText("420");
                l3.setText("240");
                l4.setText("390");

                d.setText("'Самурай'по адресу ул. Пушкина 7");
            }
            if (choice.equals("фабрика")) {
                list1.getItems().addAll("запеченая креветка", "запеченый лосось", "запеченый угорь", "запеченый тунец");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("380");
                l2.setText("360");
                l3.setText("340");
                l4.setText("370");

                d.setText("'Фабрика' по адресу ул. Пушкина 3");
            }
            if (choice.equals("республика")) {
                list1.getItems().addAll("фила", "калифорния", "кунсей", "гуччи");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("400");
                l2.setText("300");
                l3.setText("320");
                l4.setText("390");

                d.setText("'Республика' по адресу ул. Плеханова 14");
            }
            if (choice.equals("пицца паста")) {
                list1.getItems().addAll("фила", "сакура", "шанхай", "осака");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("400");
                l2.setText("420");
                l3.setText("300");
                l4.setText("290");

                d.setText("'Пицца Паста' находится на ул. Пушкина 7");
            }
            if (choice.equals("сушивесла")) {
                list1.getItems().addAll("дракон", "сяке унаги", "майами", "италия");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("370");
                l2.setText("420");
                l3.setText("240");
                l4.setText("390");

                d.setText("'Сушивесла'по адресу ул. Московская 85а");
            }

            if (choice1.equals("дайкон")) {
                list2.getItems().addAll("мексика", "зебра", "калифорния", "ямаха");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("290");
                l6.setText("320");
                l7.setText("340");
                l8.setText("310");

                v.setText("'Дайкон' по адресу ул. Плеханова 14");
            }
            if (choice1.equals("хо.суши")) {
                list2.getItems().addAll("канада", "тайга", "аристократ", "токио");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("280");
                l6.setText("320");
                l7.setText("410");
                l8.setText("360");

                v.setText("'Хо.суши' по адресу ул. Окружная 115а");
            }
            if (choice1.equals("автосуши")) {
                list2.getItems().addAll("фила", "калифорния", "италия", "хьюстон");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("520");
                l6.setText("490");
                l7.setText("400");
                l8.setText("470");

                v.setText("'Автосуши' по адресу ул. Пушкина 7");
            }
            if (choice1.equals("якитория")) {
                list2.getItems().addAll("фила", "асахи", "техас", "киото");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("360");
                l6.setText("290");
                l7.setText("310");
                l8.setText("390");

                v.setText("'Якитория' по адресу ул. Строилелей 152б");
            }
            if (choice1.equals("суши-бар")) {
                list2.getItems().addAll("норвегия", "монреаль", "рататуй", "прада");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("370");
                l6.setText("350");
                l7.setText("230");
                l8.setText("420");

                v.setText("'Суши-бар' по адресу ул. Коммунистическая 10");
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstList.getItems().addAll("самурай", "фабрика", "республика", "пицца паста", "сушивесла");
        firstList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        secondList.getItems().addAll("дайкон", "хо.суши", "автосуши", "якитория", "суши-бар");
        secondList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    }

