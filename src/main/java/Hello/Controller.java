package Hello;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;

public class Controller {
    private View view = new View();

    EventHandler<ActionEvent> plusEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Expression Buf = new Expression(new Number(view.getFirstResult()),new Number(view.getSecondResult()),'+');
                view.setLabelPlus(Buf.process(view.getSwitchBtn().switchOnProperty().getValue()));
            } catch (MyException e) { view.setLabelPlus(e.getMessage()); }
        }
    };

    EventHandler<ActionEvent> difEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Expression Buf = new Expression(new Number(view.getFirstResult()),new Number(view.getSecondResult()),'-');
                view.setLabelDif(Buf.process(view.getSwitchBtn().switchOnProperty().getValue()));
            } catch (MyException e) { view.setLabelDif(e.getMessage()); }
        }
    };

    EventHandler<ActionEvent> mulEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Expression Buf = new Expression(new Number(view.getFirstResult()),new Number(view.getSecondResult()),'*');
                view.setLabelMul(Buf.process(view.getSwitchBtn().switchOnProperty().getValue()));
            } catch (MyException e) { view.setLabelMul(e.getMessage()); }
        }
    };

    EventHandler<ActionEvent> divEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Expression Buf = new Expression(new Number(view.getFirstResult()),new Number(view.getSecondResult()),'/');
                view.setLabelDiv(Buf.process(view.getSwitchBtn().switchOnProperty().getValue()));
            } catch (MyException e) { view.setLabelDiv(e.getMessage()); }
        }
    };

    public Controller() {
        view.setPlusEvent(plusEvent);
        view.setDifEvent(difEvent);
        view.setMulEvent(mulEvent);
        view.setDivEvent(divEvent);
    }

    public void setGridPane(GridPane gridPane) {view.setGrid(gridPane);}
}
