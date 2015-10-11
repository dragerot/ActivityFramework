package pakke.process;

import java.util.ArrayList;

/**
 E - Element (used extensively by the Java Collections Framework)
 K - Key
 N - Number
 T - Type
 V - Value
 S,U,V etc. - 2nd, 3rd, 4th types
 */
public class Aktivities<T> {

    Input<T> input;

    public Aktivities(T t){
        input= new Input<T>(t);
    }

    public Input<T> getInput() {
        return input;
    }

    public void setInput(Input<T> input) {
        this.input = input;
    }
}
