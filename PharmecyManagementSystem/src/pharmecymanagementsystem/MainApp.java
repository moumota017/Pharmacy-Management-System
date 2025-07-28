package pharmecymanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainLayout.fxml"));
        primaryStage.setTitle("Pharmacy Management System");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    
    }

    public static void main(String[] args) {
        DBUtil.connect();  // initialize DB connection
        launch(args);
        DBUtil.disconnect();
   }
}
