package application;

import java.awt.Desktop;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
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
	private TextField a;
	@FXML
	private Label nom;
	@FXML
	private Label prenom;
	@FXML
	private Label fok;
	@FXML
	private Text txt;

	
	
	
	@FXML
	public void connexion() throws IOException {
		Label fokk = new Label("hahah");
		Label fokk2 = new Label();
		User user = Passerelle.login(login.getText(), password.getText());
		if(user.getNom() == null) {
			System.out.println("Echec de la connexion");
		}
		else {
			System.out.println(user);
			System.out.println("La connexion a été effectuée " + user.getPrenom() + " " + user.getNom());
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SampleAccueil.fxml"));
			anchor.getChildren().clear();
			anchor.getChildren().add(fokk);
			anchor.getChildren().add(fokk2);
			fokk.setLayoutX(33);
			fokk.setLayoutY(38);
			fokk2.setLayoutX(85);
			fokk2.setLayoutY(38);
			fokk.setText(user.getNom());
			fokk2.setText(user.getPrenom());
			anchor.getChildren().add(root);
			
			
//			fok.setText(user.getNom());
//			prenom.setText(user.getPrenom());
//			System.out.println("Voila les champs textes : " + nom.getText() + prenom.getText());
			
		}

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
