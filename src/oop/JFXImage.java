import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JFXImage extends Application {
    private static String title;
    private static String url;

    public static void launch(String _title, String _url) {
        title = _title;
        url = _url;
        Application.launch();
    }


    /*public static void main(String[] args) {
        Application.launch(args);
    }*/

    @Override
    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        /*gridpane.setPadding(new Insets(5));
        gridpane.setHgap(10);
        gridpane.setVgap(10);*/

        final ImageView imv = new ImageView();
        final Image image2 = new Image(url, 240, 240, true, true);
        imv.setImage(image2);

        final HBox pictureRegion = new HBox();
        pictureRegion.getChildren().add(imv);
        gridpane.add(pictureRegion, 1, 1);

        primaryStage.setTitle(title);
        Group root = new Group();
        Scene scene = new Scene(root, image2.getWidth(), image2.getHeight(), Color.WHITE);

        root.getChildren().add(gridpane);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}

