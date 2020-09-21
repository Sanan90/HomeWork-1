import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Apple extends Fruit {

    static List appleBox = new ArrayList();
    public float weight = 1.0f;

    Box<Apple> addBox = new Box();

    public Apple() {
        appleBox.add(this);
        addBox.addBox(this, weight);
    }

    public void getWeight () {
        addBox.getWeight(weight);
    }




}
