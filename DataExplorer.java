import javafx.animation.FillTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage; 
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.image.ImageView;

/**
 * Write a description of class DataExplorer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataExplorer extends Application
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DataExplorer
     */
    public DataExplorer()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public void start(Stage stage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.BLACK);
        
        StackPane pane = new StackPane();
        Image worldMap = new Image("MAPS_earth-map.jpg");
        ImageView imgView = new ImageView(worldMap);
        
        pane.getChildren().add(imgView);
        root.getChildren().add(pane);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
