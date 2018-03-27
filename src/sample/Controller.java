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
    private boolean dotPressed=false;

    public void changeThemeBlue(ActionEvent event){
        menu.setStyle("-fx-background-color: #deeff5");
        grey_color_item.setEnabled(true);
        blue_color_item.setEnabled(false);
        default_color_item.setEnabled(true);
    }

    public void changeThemeDefault(ActionEvent event){
        menu.setStyle("-fx-background-color: ##fbfbfb");
        grey_color_item.setEnabled(true);
        blue_color_item.setEnabled(true);
        default_color_item.setEnabled(false);
    }

    public void changeThemeGrey(ActionEvent event){
        menu.setStyle("-fx-background-color: #e9e9e9");
        grey_color_item.setEnabled(false);
        blue_color_item.setEnabled(true);
        default_color_item.setEnabled(true);
    }

    public void showAbout(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About program");
        alert.setHeaderText(null);
        alert.setContentText("SOVY Calculator version 1.2\nCreated by Boris Galický.\nAll rights reserved.");
        alert.showAndWait();
    }

    public void process(ActionEvent event){
        if(event.getSource() == dot) {
            dotPressed=true;
            if(inProgress==false){
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                dot.setDisable(true);
                clear.setDisable(false);
                text.setText(text.getText() + ".");
            }
            else{
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                dot.setDisable(true);
                clear.setDisable(false);
                text.setText(text.getText() + ".");
            }
        }
        else if (event.getSource() == one) {
            if(inProgress==false){
            minus.setDisable(false);
            divide.setDisable(false);
            plus.setDisable(false);
            multiply.setDisable(false);
            two_exp.setDisable(false);
            three_exp.setDisable(false);
            clear.setDisable(false);
            dot.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
            text.setText(text.getText() + "1");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "1");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "1");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == two) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "2");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "2");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "2");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == three) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "3");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "3");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "3");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == four) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "4");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "4");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "4");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == five) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "5");
                if(inProgress==true){
                    equal.setDisable(false);
                    minus.setDisable(true);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "5");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "5");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == six) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "6");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "6");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "6");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == seven) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "7");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "7");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "7");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == eight) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "8");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "8");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "8");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == nine) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "9");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "9");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "9");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
        }
        else if (event.getSource() == zero) {
            if(inProgress==false){
                minus.setDisable(false);
                divide.setDisable(false);
                plus.setDisable(false);
                multiply.setDisable(false);
                two_exp.setDisable(false);
                three_exp.setDisable(false);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "0");
                if(inProgress==true){
                    equal.setDisable(false);
                }
            }
            else if(inProgress==true){
                minus.setDisable(true);
                text.setText(text.getText() + "0");
                dot.setDisable(false);
                equal.setDisable(false);
                if(text.getText().matches("^.?\\d{1,}[\\.]\\d{1,}$")){
                    dot.setDisable(true);
                }
            }
            else{
                minus.setDisable(false);
                divide.setDisable(true);
                plus.setDisable(true);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                clear.setDisable(false);
                if(dotPressed==false){
                    dot.setDisable(false);
                }
                else if(dotPressed==true){
                    dot.setDisable(true);
                }
                text.setText(text.getText() + "0");
                if(inProgress==true){
                    equal.setDisable(false);
                }
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
            nine.setDisable(false);zero.setDisable(false);dot.setDisable(true);clear.setDisable(true);inProgress=false;dotPressed=false;
        } else if (event.getSource() == divide) {
            dotPressed=false;
            inProgress=true;
            if(inProgress==true){
                equal.setDisable(true);
            }
            firstOperand = Float.parseFloat(text.getText());
            operation = 4;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(false);
            multiply.setDisable(true);
            two_exp.setDisable(true);
            three_exp.setDisable(true);
            dot.setDisable(true);
            text.setText("");
        } else if (event.getSource() == multiply) {
            dotPressed=false;
            inProgress=true;
            if(inProgress==true){
                equal.setDisable(true);
            }
            firstOperand = Float.parseFloat(text.getText());
            operation = 3;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(false);
            multiply.setDisable(true);
            two_exp.setDisable(true);
            three_exp.setDisable(true);
            dot.setDisable(true);
            text.setText("");
        } else if (event.getSource() == minus){
            if(text.getText().trim().isEmpty()){
                text.setText(text.getText() + "-");
                clear.setDisable(false);
                minus.setDisable(true);
                if(inProgress==true){
                    minus.setDisable(true);
                }
            }
            else{
                dotPressed=false;
                inProgress=true;
                if(inProgress==true){
                    equal.setDisable(true);
                }
                firstOperand = Float.parseFloat(text.getText());
                operation = 2;
                divide.setDisable(true);
                plus.setDisable(true);
                minus.setDisable(false);
                multiply.setDisable(true);
                two_exp.setDisable(true);
                three_exp.setDisable(true);
                dot.setDisable(true);
                text.setText("");
                    if(text.getText().matches("^[\\-]{1}$")){
                        minus.setDisable(true);
                    }
            }
        } else if (event.getSource() == plus){
            dotPressed=false;
            inProgress=true;
                if(inProgress==true){
                    equal.setDisable(true);
                }
            firstOperand = Float.parseFloat(text.getText());
            operation = 1;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(false);
            multiply.setDisable(true);
            two_exp.setDisable(true);
            three_exp.setDisable(true);
            dot.setDisable(true);
            text.setText("");

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
            divide.setDisable(false);plus.setDisable(false);minus.setDisable(false);multiply.setDisable(false);two_exp.setDisable(false);three_exp.setDisable(false);one.setDisable(false);
            two.setDisable(false);three.setDisable(false);four.setDisable(false);five.setDisable(false);six.setDisable(false);seven.setDisable(false);eight.setDisable(false);
            nine.setDisable(false);zero.setDisable(false);dot.setDisable(true);equal.setDisable(true);inProgress=false;dotPressed=false;
        }
    }
}