public class arrPlacesExchange <T> {
    T[] arr;
    int i;
    int j;

    public arrPlacesExchange() {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public T[] arrPlaces(T array[], Integer i, Integer j) {
        T a = array[i];
        T b = array[j];
        array[i] = b;
        array[j] = a;
        return array;
    }

}
