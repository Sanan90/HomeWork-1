import java.util.ArrayList;
import java.util.List;

public class Orange extends Fruit {

    static List orangeBox = new ArrayList();
    float weight = 1.5f;


    Box<Orange> addBox = new Box();

    public Orange() {
        orangeBox.add(this);
        addBox.addBox(this, weight);
    }

    public void getWeight () {
        addBox.getWeight(weight);

    }


}
