package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

    public void process(ActionEvent event) {
        if (event.getSource() == one) {
            text.setText(text.getText() + "1");
        } else if (event.getSource() == two) {
            text.setText(text.getText() + "2");
        } else if (event.getSource() == three) {
            text.setText(text.getText() + "3");
        } else if (event.getSource() == four) {
            text.setText(text.getText() + "4");
        } else if (event.getSource() == five) {
            text.setText(text.getText() + "5");
        } else if (event.getSource() == six) {
            text.setText(text.getText() + "6");
        } else if (event.getSource() == seven) {
            text.setText(text.getText() + "7");
        } else if (event.getSource() == eight) {
            text.setText(text.getText() + "8");
        } else if (event.getSource() == nine) {
            text.setText(text.getText() + "9");
        } else if (event.getSource() == zero) {
            text.setText(text.getText() + "0");
        } else if (event.getSource() == clear) {
            text.clear();
            divide.setDisable(false);
            plus.setDisable(false);
            minus.setDisable(false);
            multiply.setDisable(false);
        } else if (event.getSource() == divide) {
            firstOperand = Float.parseFloat(text.getText());
            operation = 4;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(true);
            multiply.setDisable(true);
            text.setText("");
        } else if (event.getSource() == multiply) {
            firstOperand = Float.parseFloat(text.getText());
            operation = 3;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(true);
            multiply.setDisable(true);
            text.setText("");
        } else if (event.getSource() == minus) {
            firstOperand = Float.parseFloat(text.getText());
            operation = 2;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(true);
            multiply.setDisable(true);
            text.setText("");
        } else if (event.getSource() == plus) {
            firstOperand = Float.parseFloat(text.getText());
            operation = 1;
            divide.setDisable(true);
            plus.setDisable(true);
            minus.setDisable(true);
            multiply.setDisable(true);
            text.setText("");
        } else if (event.getSource() == equal) {
            Float secondOperand = Float.parseFloat(text.getText());
            System.out.println("Prvy operand: "+firstOperand);
            System.out.println("Druhy operand: "+secondOperand);
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
            }
            divide.setDisable(false);
            plus.setDisable(false);
            minus.setDisable(false);
            multiply.setDisable(false);
        }
    }
}
