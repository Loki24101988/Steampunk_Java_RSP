package team.tmbe.controller.view;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

public class MenuTestController {
	@FXML
	private MenuBar menubar;

	@FXML
	protected void handleKeyInput() {
		System.out.println("Hallo Welt!");
	}

	@FXML
	protected void isClicked() {
		System.out.println("Hallo welt");
		// this.menubar.setVisible(false);
	}

}
