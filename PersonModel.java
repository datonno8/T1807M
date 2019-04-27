package ASM2;

import java.util.ArrayList;

public class PersonModel<E> {
    ArrayList<Controller> List =  new ArrayList<>();
    public  void add(Student e){
        List.add(e);
    }
    public  void input(){
        for(Controller item: List){
            item.toString();
        }
    }

}
