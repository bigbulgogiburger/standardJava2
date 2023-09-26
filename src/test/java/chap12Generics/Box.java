package chap12Generics;

import java.util.ArrayList;

public class Box<T> {

    ArrayList<T> list = new ArrayList<>();
     T item;

    void add(T item){
        list.add(item);
    }

    T get(int i){
        return list.get(i);
    }

    int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }

    public ArrayList<T> getList() {
        return list;
    }
}
