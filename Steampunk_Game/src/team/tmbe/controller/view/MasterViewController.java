package team.tmbe.controller.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MasterViewController {
	@FXML
	private TextArea m_textArea;

	@FXML
	protected void sayHelloTMBE(ActionEvent event) {

		m_textArea.setText(m_textArea.getText() + "Hello TMBE!!\n");

	}

}
