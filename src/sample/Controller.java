package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.awt.*;

public class Controller{
    Float firstOperand = 0f;
    int operation = 0;

    @FXML
    public Button clear;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button multiply;
    @FXML
    private Button divide;
    @FXML
    private TextField text;
    @FXML
    private Button equal;
    @FXML
    private Button two_exp;
    @FXML
    private Button three_exp;
    @FXML
    private Button dot;
    @FXML
    private Pane menu;
    @FXML
    private MenuItem default_color_item;
    @FXML
    private MenuItem blue_color_item;
    @FXML
    private MenuItem grey_color_item;
    private boolean inProgress=false;

    public void changeThemeBlue(ActionEvent event){
        menu.setStyle("-fx-background-color: #deeff5");
        System.out.println("Theme changed to blue!");
        grey_color_item.setEnabled(true);
        blue_color_item.setEnabled(false);
        default_color_item.setEnabled(true);
    }

    public void changeThemeDefault(ActionEvent event){
        menu.setStyle("-fx-background-color: ##fbfbfb");
        System.out.println("Theme changed to white!");
        grey_color_item.setEnabled(true);
        blue_color_item.setEnabled(true);
        default_color_item.setEnabled(false);
    }

    public void changeThemeGrey(ActionEvent event){
        menu.setStyle("-fx-background-color: #e9e9e9");
        System.out.println("Theme changed to grey!");
        grey_color_item.setEnabled(false);
        blue_color_item.setEnabled(true);
        default_color_item.setEnabled(true);
    }

    public void showAbout(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About program");
        alert.setHeaderText(null);
        alert.setContentText("SOVY Calculator version 1.0.\nCreated by Boris Galický.\nAll rights reserved.");
        alert.showAndWait();
    }

    public void process(ActionEvent event) {
        if(event.getSource() == dot) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                dot.setDisable(true);
                text.setText(text.getText() + ".");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                dot.setDisable(true);
                text.setText(text.getText() + ".");
            }
        }
        else if (event.getSource() == one) {
            if(inProgress==false){
            divide.setDisable(false);
            plus.setDisable(false);
            multiply.setDisable(false);
            two_exp.setDisable(false);
            three_exp.setDisable(false);
            text.setText(text.getText() + "1");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "1");
            }
        }
        else if (event.getSource() == two) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "2");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "2");
            }
        }
        else if (event.getSource() == three) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "3");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "3");
            }
        }
        else if (event.getSource() == four) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "4");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "4");
            }
        }
        else if (event.getSource() == five) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "5");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "5");
            }
        }
        else if (event.getSource() == six) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "6");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "6");
            }
        }
        else if (event.getSource() == seven) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "7");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "7");
            }
        }
        else if (event.getSource() == eight) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "8");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "8");
            }
        }
        else if (event.getSource() == nine) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "9");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "9");
            }
        }
        else if (event.getSource() == zero) {
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                text.setText(text.getText() + "0");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                text.setText(text.getText() + "0");
            }
        }
        else if (event.getSource() == three_exp) {
            firstOperand = Float.parseFloat(text.getText());
            operation = 6;
            divide.setDisable(true);plus.setDisable(true);minus.setDisable(true);multiply.setDisable(true);two_exp.setDisable(true);three_exp.setDisable(true);one.setDisable(true);
            two.setDisable(true);three.setDisable(true);four.setDisable(true);five.setDisable(true);six.setDisable(true);seven.setDisable(true);eight.setDisable(true);
            nine.setDisable(true);zero.setDisable(true);dot.setDisable(true);equal.setDisable(false);
        } else if (event.getSource() == two_exp) {
            firstOperand = Float.parseFloat(text.getText());
            operation = 5;
            divide.setDisable(true);plus.setDisable(true);minus.setDisable(true);multiply.setDisable(true);two_exp.setDisable(true);three_exp.setDisable(true);one.setDisable(true);
            two.setDisable(true);three.setDisable(true);four.setDisable(true);five.setDisable(true);six.setDisable(true);seven.setDisable(true);eight.setDisable(true);
            nine.setDisable(true);zero.setDisable(true);dot.setDisable(true);equal.setDisable(false);
        } else if (event.getSource() == clear) {
            text.clear();
            divide.setDisable(true);plus.setDisable(true);minus.setDisable(false);multiply.setDisable(true);two_exp.setDisable(true);three_exp.setDisable(true);
            equal.setDisable(true);one.setDisable(false);
            two.setDisable(false);three.setDisable(false);four.setDisable(false);five.setDisable(false);six.setDisable(false);seven.setDisable(false);eight.setDisable(false);
            nine.setDisable(false);zero.setDisable(false);dot.setDisable(false);inProgress=false;
        } else if (event.getSource() == divide) {
            inProgress=true;
            firstOperand = Float.parseFloat(text.getText());
            operation = 4;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(true);
            multiply.setDisable(true);
            two_exp.setDisable(true);
            three_exp.setDisable(true);
            equal.setDisable(false);
            dot.setDisable(false);
            text.setText("");
        } else if (event.getSource() == multiply) {
            inProgress=true;
            firstOperand = Float.parseFloat(text.getText());
            operation = 3;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(true);
            multiply.setDisable(true);
            two_exp.setDisable(true);
            three_exp.setDisable(true);
            equal.setDisable(false);
            dot.setDisable(false);
            text.setText("");
        } else if (event.getSource() == minus){
            if(text.getText().trim().isEmpty()){
                text.setText(text.getText() + "-");
            }
            else{
                inProgress=true;
                firstOperand = Float.parseFloat(text.getText());
                operation = 2;
                divide.setDisable(true);
                plus.setDisable(true);
                minus.setDisable(false);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                equal.setDisable(false);
                dot.setDisable(false);
                text.setText("");
                    if(text.getText().matches("^[\\-]{1}$")){
                        minus.setDisable(true);
                    }
            }
        } else if (event.getSource() == plus) {
            inProgress=true;
            firstOperand = Float.parseFloat(text.getText());
            operation = 1;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(false);
            multiply.setDisable(true);
            two_exp.setDisable(true);
            three_exp.setDisable(true);
            dot.setDisable(false);
            text.setText("");
            equal.setDisable(false);

        } else if (event.getSource() == equal) {
            Float secondOperand = Float.parseFloat(text.getText());
            switch(operation){
                case 1:
                    Float ans = firstOperand + secondOperand;
                    text.setText(String.valueOf(ans));
                    break;

                case 2:
                    ans = firstOperand - secondOperand;
                    text.setText(String.valueOf(ans));
                    break;

                case 3:
                    ans = firstOperand * secondOperand;
                    text.setText(String.valueOf(ans));
                    break;

                case 4:
                    ans = 0f;
                    try {
                        ans = firstOperand / secondOperand;
                    } catch (Exception e) {
                        text.setText("Error!");
                    }
                    text.setText(String.valueOf(ans));
                    break;

                case 5:
                    ans = firstOperand * firstOperand;
                    text.setText(String.valueOf(ans));
                    break;

                case 6:
                    ans = firstOperand * firstOperand * firstOperand;
                    text.setText(String.valueOf(ans));
                    break;
            }
            divide.setDisable(true);plus.setDisable(true);minus.setDisable(true);multiply.setDisable(true);two_exp.setDisable(true);three_exp.setDisable(true);one.setDisable(true);
            two.setDisable(true);three.setDisable(true);four.setDisable(true);five.setDisable(true);six.setDisable(true);seven.setDisable(true);eight.setDisable(true);
            nine.setDisable(true);zero.setDisable(true);dot.setDisable(true);equal.setDisable(true);inProgress=false;
        }
    }
}
