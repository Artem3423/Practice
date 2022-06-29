package sample;

//импорт библиотек
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override   //метод запуска окна приложения
    public void start(Stage primaryStage) throws Exception{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Решение уравнений");
        primaryStage.setScene(new Scene(root, 400, 220));
        primaryStage.getIcons().add(new Image("file:icon.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
