package application;

import java.awt.Desktop;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
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
		ListView<String> list = new ListView<String>();
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
			anchor.getChildren().add(list);
			list.setLayoutX(702);
			list.setLayoutY(188);
			list.setPrefWidth(195);
			list.setPrefHeight(411);
			fokk.setLayoutX(33);
			fokk.setLayoutY(38);
			fokk2.setLayoutX(85);
			fokk2.setLayoutY(38);
			fokk.setText(user.getNom());
			fokk2.setText(user.getPrenom());
			ObservableList<String> item = FXCollections.observableArrayList ("Sami Thairi", "Ayoub Mourague", "Jerame Arulnesan");
			list.setItems(item);
			list.getSelectionModel().selectedIndexProperty().addListener(observable -> System.out.printf("Indice sélectionné: %d", list.getSelectionModel().getSelectedIndex()).println()); 
			list.getSelectionModel().selectedItemProperty().addListener(observable -> System.out.printf("Valeur sélectionnée: %d", list.getSelectionModel().getSelectedItem()).println());
			anchor.getChildren().add(root);
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
