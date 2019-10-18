package dad.javafx.geometria;

import dad.javafx.geometria.rectangulo.RectanguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeometriaApp extends Application {

	private RectanguloController rectanguloController;
	// TODO declarar resto de controladores
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		rectanguloController = new RectanguloController();
		// TODO instanciar resto de controladores
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		root.getTabs().add(new Tab("Rectángulo", rectanguloController.getRoot()));
		root.getTabs().add(new Tab("Círculo"));
		root.getTabs().add(new Tab("Triángulo"));
		root.getTabs().add(new Tab("Hexágono"));
		
		Scene scene = new Scene(root, 640, 480);
		
		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
