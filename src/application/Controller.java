package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class Controller {

	@FXML
	private AnchorPane anchor;
	@FXML
	private AnchorPane menu;
	
	public void connexion() throws IOException {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SampleAccueil.fxml"));
		anchor.getChildren().setAll(root);
		System.out.println("La connexion a été effectuée");
	}
	
	public void menu1() throws IOException {
		System.out.println("Click sur le menu 1");
		menu.getChildren().clear();
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SampleMenu.fxml"));
		menu.getChildren().setAll(root);
	}
	
	public void menu2() throws IOException {
		System.out.println("Click sur le menu 2");
		menu.getChildren().clear();
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SampleMenu2.fxml"));
		menu.getChildren().setAll(root);
	}
	
	public void menu3() throws IOException {
		System.out.println("Click sur le menu 3");
		menu.getChildren().clear();
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SampleMenu3.fxml"));
		menu.getChildren().setAll(root);
	}
	
	public void menu4() {
		System.out.println("Click sur le menu 4");
		try {
		    Desktop.getDesktop().browse(new URL("http://licencelerebours.fr/owncloud/index.php/login").toURI());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
