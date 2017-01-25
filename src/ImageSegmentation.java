
import org.opencv.core.Core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ImageSegmentation extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("ImageSeg.fxml"));
			Scene scene = new Scene(root, 1000, 800);
			primaryStage.setScene(scene);

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Controller.SEGMENTATION_TYPE = Controller.THRESHOLDING;
		String path = "C:\\Users\\Olusiak\\Downloads\\Ki67 baza-20161012T160623Z\\Ki67 baza\\ROI wyciête\\";
		Controller.redStainsFilename = path + "col2.jpg";
		Controller.blueStainsFilename = path + "col1(2).jpg";
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		launch(args);

	}
}