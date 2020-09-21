import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    T obj;
    static List appleBox = new ArrayList();
    static List orangeBox = new ArrayList();


    public Box() {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void addBox(T obj, float weight) {
        if (weight == 1.0f) {
            appleBox.add(this);
            System.out.println(appleBox.size());
        }   else {
            orangeBox.add(this);
            System.out.println(orangeBox.size());
        }
    }

    public void getWeight (float weight) {
        if (weight == 1.0f) {
            float weigthAll = weight * appleBox.size();
            System.out.println(weigthAll);
        }   else {
            float weigthAll = weight * orangeBox.size();
            System.out.println(weigthAll);
        }

    }

}
