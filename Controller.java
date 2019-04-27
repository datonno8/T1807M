package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button btn;
    public TextArea txt;

    public void initialize(URL location, ResourceBundle resource){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (Integer i = 600; i > 0; i -= 1 ){
                    txt.setText(i.toString());
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }

            }
        });
    }

}
