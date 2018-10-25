package application;

import java.awt.Desktop;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import recours.User;
import back.Passerelle;

public class Controller {

	@FXML
	private AnchorPane anchor;
	@FXML
	private AnchorPane menu;
	@FXML
	private TextField login;
	@FXML
	private PasswordField password;
	@FXML
	private TextField montext;
	
	public void connexion() throws IOException {

		User user = Passerelle.login(login.getText(), password.getText());
		System.out.println("La connexion a été effectuée " + user.getNom());
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SampleAccueil.fxml"));
		anchor.getChildren().clear();
		anchor.getChildren().add(root);
		montext.setText("juoi");
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
