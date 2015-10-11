package pakke;

public class Box<T> {
    // T stands for "Type"
    private T t;

    public Box(T t){
        this.t=t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
