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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button but;

    @FXML
    private ListView<String> c1;

    @FXML
    private ListView<String> c2;

    @FXML
    void But(ActionEvent event) {
        but.getScene().getWindow().hide();
        String message = "";
        ObservableList<String> wuwu;
        wuwu = c1.getSelectionModel().getSelectedItems();

        for (String w: wuwu){
            message += w;
        }
        String message1 = "";

        ObservableList<String> wuwu2;
        wuwu2 = c2.getSelectionModel().getSelectedItems();

        for (String w2: wuwu2){
            message1 += w2;
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("cur2.fxml"));
        try {
            loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Scene scene = new Scene(root,600,400);

        ListView list1  = (ListView) scene.lookup("#f1");
        ListView list2  = (ListView) scene.lookup("#f2");
        Label l1 = (Label) scene.lookup("#l1");
        Label l2 = (Label) scene.lookup("#l2");
        Label l3 = (Label) scene.lookup("#l3");
        Label l4 = (Label) scene.lookup("#l4");
        Label l5 = (Label) scene.lookup("#l5");
        Label l6 = (Label) scene.lookup("#l6");
        Label l7 = (Label) scene.lookup("#l7");
        Label l8 = (Label) scene.lookup("#l8");

        Label d = (Label) scene.lookup("#d");
        Label v = (Label) scene.lookup("#v");

        if(message.equals("самурай")){
            list1.getItems().addAll("фила", "аризона", "чикен", "гуччи");
            list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l1.setText("370");
            l2.setText("420");
            l3.setText("240");
            l4.setText("390");

            d.setText("'Самурай'по адресу ул. Пушкина 7");
        }
        if(message.equals("фабрика")){
            list1.getItems().addAll("запеченая креветка", "запеченый лосось", "запеченый угорь", "запеченый тунец");
            list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l1.setText("380");
            l2.setText("360");
            l3.setText("340");
            l4.setText("370");

            d.setText("'Фабрика' по адресу ул. Пушкина 3");
        }
        if(message.equals("республика")){
            list1.getItems().addAll("фила", "калифорния", "кунсей", "гуччи");
            list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l1.setText("400");
            l2.setText("300");
            l3.setText("320");
            l4.setText("390");

            d.setText("'Республика' по адресу ул. Плеханова 14");
        }
        if(message.equals("пицца паста")){
            list1.getItems().addAll("фила", "сакура", "шанхай", "осака");
            list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l1.setText("400");
            l2.setText("420");
            l3.setText("300");
            l4.setText("290");

            d.setText("'Пицца Паста' находится на ул. Пушкина 7");
        }
        if(message.equals("сушивесла")){
            list1.getItems().addAll("дракон", "сяке унаги", "майами", "италия");
            list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l1.setText("370");
            l2.setText("420");
            l3.setText("240");
            l4.setText("390");

            d.setText("'Сушивесла'по адресу ул. Московская 85а");
        }

        if(message1.equals("дайкон")){
            list2.getItems().addAll("мексика", "зебра", "калифорния", "ямаха");
            list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l5.setText("290");
            l6.setText("320");
            l7.setText("340");
            l8.setText("310");

            v.setText("'Дайкон' по адресу ул. Плеханова 14");
        }
        if(message1.equals("хо.суши")){
            list2.getItems().addAll("канада", "тайга", "аристократ", "токио");
            list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l5.setText("280");
            l6.setText("320");
            l7.setText("410");
            l8.setText("360");

            v.setText("'Хо.суши' по адресу ул. Окружная 115а");
        }
        if(message1.equals("автосуши")){
            list2.getItems().addAll("фила", "калифорния", "италия", "хьюстон");
            list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l5.setText("520");
            l6.setText("490");
            l7.setText("400");
            l8.setText("470");

            v.setText("'Автосуши' по адресу ул. Пушкина 7");
        }
        if(message1.equals("якитория")){
            list2.getItems().addAll("фила", "асахи", "техас", "киото");
            list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            l5.setText("360");
            l6.setText("290");
            l7.setText("310");
            l8.setText("390");

            v.setText("'Якитория' по адресу ул. Строилелей 152б");
        }
        if(message1.equals("суши-бар")){
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        c1.getItems().addAll("самурай", "фабрика", "республика", "пицца паста", "сушивесла");
        c1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        c2.getItems().addAll("дайкон", "хо.суши", "автосуши", "якитория", "суши-бар");
        c2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    }

