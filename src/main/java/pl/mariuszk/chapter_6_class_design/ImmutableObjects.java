package pl.mariuszk.chapter_6_class_design;

import java.util.ArrayList;
import java.util.List;

public class ImmutableObjects {

    public static void main(String[] args) {
        Example e = new Example();
        // mutable instance field can be modified without setter
        e.getListField().add("B");
        System.out.println(e.getListField());

        List<String> param = new ArrayList<>();
        param.add("C");
        Example e2 = new Example(param);
        // a defensive copy prevents from modifying e2.listField value
        param.add("D");
        System.out.println(e2.getListField());
    }
}

final class Example {

    private final List<String> listField;

    Example() {
        listField = new ArrayList<>();
        listField.add("A");
    }

    // there's a risk that caller keeps a reference to the listFieldParam object
    // and can use it to modify instance field's value
//    Example(List<String> listFieldParam) {
//        this.listField = listFieldParam;
//    }

    // solution: creating a defensive copy
    Example(List<String> listFieldParam) {
        this.listField = new ArrayList<>(listFieldParam);
    }

    // a getter for mutable instance field - field's value can be modified
    List<String> getListField() {
        return listField;
    }

    // solution: wrapper methods
    int getListFieldSize() {
        return listField.size();
    }

    String getListFieldItem(int idx) {
        return listField.get(idx);
    }

    // another solution: creating a copy of mutable instance field
    List<String> getListField2() {
        return new ArrayList<>(listField);
    }
}

