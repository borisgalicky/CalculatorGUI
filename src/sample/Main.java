package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("SOVY Calculator");
        primaryStage.setResizable(false);
        Scene scene = new Scene(root, 450,350);
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event){
                switch(event.getCode()){
                    case NUMPAD1: System.out.println("1");

                    break;

                    case NUMPAD2: System.out.println("2");
                    break;

                    case NUMPAD3: System.out.println("3");
                    break;

                    case NUMPAD4: System.out.println("4");
                    break;

                    case NUMPAD5: System.out.println("5");
                    break;

                    case NUMPAD6: System.out.println("6");
                    break;

                    case NUMPAD7: System.out.println("7");
                    break;

                    case NUMPAD8: System.out.println("8");
                    break;

                    case NUMPAD9: System.out.println("9");
                    break;

                    case NUMPAD0: System.out.println("0");
                    break;

                    case ADD: System.out.println("+");
                    break;

                    case SUBTRACT: System.out.println("-");
                    break;

                    case DIVIDE: System.out.println("/");
                    break;

                    case MULTIPLY: System.out.println("*");
                    break;

                    case BACK_SPACE: System.out.println("CLEAR");
                    break;

                    case ENTER: System.out.println("=");
                    break;

                    case DECIMAL: System.out.println(".");
                    break;
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
