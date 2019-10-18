package dad.javafx.geometria;

import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FigurasApp extends Application {

	private Rectangle rectangleShape;
	private Circle circleShape;
	private Triangle triangleShape;
	private Hexagon hexagonShape;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		rectangleShape = new Rectangle();
		rectangleShape.setWidth(80);
		rectangleShape.setHeight(60);
		rectangleShape.setFill(Color.rgb(0, 162, 232));
		rectangleShape.setStrokeWidth(2);
		rectangleShape.setStroke(Color.BLACK);
		
		circleShape = new Circle();
		circleShape.setRadius(40);
		circleShape.setFill(Color.RED);
		circleShape.setStrokeWidth(2);
		circleShape.setStroke(Color.BLACK);
		
		triangleShape = new Triangle();
		triangleShape.setBase(80);
		triangleShape.setHeight(60);		
		triangleShape.setFill(Color.GREEN);
		triangleShape.setStrokeWidth(2);
		triangleShape.setStroke(Color.BLACK);
		
		hexagonShape = new Hexagon();
		hexagonShape.setRadius(40);
		hexagonShape.setFill(Color.PURPLE);
		hexagonShape.setStrokeWidth(2);
		hexagonShape.setStroke(Color.BLACK);
		
		GridPane root = new GridPane();
		root.setHgap(5);
		root.setVgap(5);
		root.setAlignment(Pos.CENTER);
		root.add(rectangleShape, 0, 0);
		root.add(circleShape, 1, 0);
		root.add(triangleShape, 0, 1);
		root.add(hexagonShape, 1, 1);
		
		Scene scene = new Scene(root, 640, 480);
		
		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
