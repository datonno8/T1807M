package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.HashSet;

public class Controller {
    public Button btn;
    public TextArea txt;

    public  void Submit() {
         HashSet<Integer> SNTArray = new HashSet<>();
        while (SNTArray.size() < 100){
            int x = 30;
            if (x < 2){
                return;
            }
            int squareRoot = (int) Math.sqrt(x);
            for (int i =2; i < squareRoot; i++){
                if (x % i == 0){
                    return;
                }

            }
            return;


        }
        String str = "";
        for (Integer a: SNTArray){
            str += a+"\n";
        }
        txt.setText(str);
    }
}