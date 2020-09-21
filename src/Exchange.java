import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exchange <T> {
    T[] obj;
    List <T> lists = new ArrayList<>();

    public Exchange() {
        this.lists = lists;
    }

    public T[] getObj() {
        return obj;
    }

    public void setObj(T[] obj) {
        this.obj = obj;
    }

    public List arrInList (T[] arr) {
        lists = (Arrays.asList(arr));
        System.out.println(lists);
        return lists;
    }

}