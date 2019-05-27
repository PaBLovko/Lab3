package Hello;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class View {

    private TextField secondResultText = new TextField("1.1+32.3i");
    private TextField firstResultText = new TextField("1.1e^32.3i");
    private Label labelPlus = new Label();
    private Label labelDifference = new Label();
    private Label labelMul = new Label();
    private Label labelDiv = new Label();
    private Button btnPlus = new Button("+");
    private Button btnDifference = new Button("-");
    private Button btnMul = new Button("*");
    private Button btnDiv = new Button("/");

    private SwitchButton switchButton = new SwitchButton();

    public void setGrid(GridPane grid) {
        grid.add(new Label("Z1 ="), 0, 0);
        grid.add(new Label("Z2 ="), 0, 1);
        grid.add(btnPlus, 0, 2);
        grid.add(btnDifference, 0, 3);
        grid.add(btnMul, 0, 4);
        grid.add(btnDiv, 0, 5);

        grid.add(firstResultText, 1, 0);
        grid.add(secondResultText, 1, 1);
        grid.add(labelPlus, 1, 2);
        grid.add(labelDifference, 1, 3);
        grid.add(labelMul, 1, 4);
        grid.add(labelDiv, 1, 5);

        grid.add(switchButton, 1, 6);
    }

    public SwitchButton getSwitchBtn() {return this.switchButton; }

    public String getFirstResult() {
        return firstResultText.getText();
    }

    public String getSecondResult() {
        return secondResultText.getText();
    }

    public void setLabelPlus(String result) {
        labelPlus.setText(result);
    }

    public void setLabelDif(String result) {
        labelDifference.setText(result);
    }

    public void setLabelMul(String result) {
        labelMul.setText(result);
    }

    public void setLabelDiv(String result) {
        labelDiv.setText(result);
    }

    public void setPlusEvent(EventHandler<ActionEvent> handle) { btnPlus.setOnAction(handle);}

    public void setDifEvent(EventHandler<ActionEvent> handle) { btnDifference.setOnAction(handle);}

    public void setMulEvent(EventHandler<ActionEvent> handle) { btnMul.setOnAction(handle);}

    public void setDivEvent(EventHandler<ActionEvent> handle) { btnDiv.setOnAction(handle);}
}
