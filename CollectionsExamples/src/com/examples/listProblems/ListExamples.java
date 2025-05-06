package com.examples.listProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat");
        //List can be created using List.of. However list created like above, is immutable. That means cannot be modified.
        //When no modifications is required in the created list. Only accessing is required, then can create list as mentioned above. Else need to create by creating an Arraylist/ linkedlist/ vector object.
        for(String value: list) {
            System.out.println(value);
        }

        //Above list can be passed in the constructor as an argument, so that the list is converted to arraylist type
        List<String> arrayList= new ArrayList<>(list);
        //Adding element in an arraylist. Element can be added without specifying index. Gets added at the end of list
        arrayList.add("Dog");
        System.out.println(arrayList);
        // Element can be added at specific index
        arrayList.add(1, "Ant");
        for(String value: arrayList) {
            System.out.println(value);
        }
        System.out.println(arrayList);
        System.out.println("Element at index 1: "+arrayList.get(1));
        //can replace the element in specific index
        arrayList.set(2,"Ball");
        System.out.println(arrayList);
        //Can remove element from specific index or element itself by providing the value
        arrayList.remove(2);
        System.out.println(arrayList);

        //similarly can create linked list and vector
        //All these types have the same functions in accessing, setting, removing, adding the values to the list
        //But which type to use when is based on the data structure used behind these type
        //Arraylist and Vector use Arrays behind. Hence accessing the element is easy and fast. Where as inserting or removing is timeconsuming.
        //LinkedList uses double linked list behind. Hence removing or adding element is easy and fast. Where as accessing element is time consuming
        //Vector has all synchronized methods. Hence for threadsafe implementation, need to go with Vector.
        //Arraylist is used when list is widely used for accessing the values. But no multiple modifications or deletions are needed.
        //Linkedlist is used when list has to be modified frequently but accessing is not much used.
        //To access the elements from the list, along with for, enhanced for, we can also use iterator()

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //when to use iterator -> need to iterate the list and remove any elements from list.
        //when to use for -> need to iterate the list and get the values from list.
        Iterator<String> iterator1 = arrayList.iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().endsWith("t")) {
                iterator1.remove();
            }
        }

        System.out.println(arrayList);
    }
}
