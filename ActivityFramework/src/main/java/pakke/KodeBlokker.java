package pakke;

import java.util.ArrayList;
import java.util.List;

public class KodeBlokker {
    private List<String> list =null;

    public List<String> getList() {
        return list;
    }

    public  List<String>  ex1(){
        list = new ArrayList<String>();
        list.add("hello");
        list.add("hello2");
        String s = list.get(0);   // no cast
        return list;
    }



    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        for(String a : list) {
            s.append(a);
        }
        return s.toString();
    }
}
