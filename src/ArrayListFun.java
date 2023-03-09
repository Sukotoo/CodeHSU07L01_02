//import ArrayLists


import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        //create an ArrayList of Integers
        //format is ArrayList<E> listName = new ArrayList<E>();
        ArrayList<Integer> intList = new ArrayList<>();
        //create an ArrayList of Doubles
        ArrayList<Double> doubleList = new ArrayList<>();
        //create an ArrayList of Strings
        ArrayList<String> stringLIst = new ArrayList<>();

        //print your list of Doubles
        System.out.println(doubleList);

        //add a new value to the end list of Integers then print it
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        System.out.println(intList);
        //add a new value at a specific index in the Integer then print it
        intList.add(1, 6);
        System.out.println(intList);
        //get the item an index 4 in the Integer array list
        System.out.println(intList.get(4));
        //add a new value to the Integer array list and get its size
        intList.add(10);
        System.out.println(intList.size());
        //set the item at index 3 to be 42.0 in the Doubles array, store that element, then
        // print the new list and the replaced value
        doubleList.add(4.0);
        doubleList.add(7.0);
        doubleList.add(6.78);
        double saved = doubleList.get(3);
        doubleList.add(3, 42.0);
        //remove the item at index 2 in the Doubles array
        doubleList.remove(2);
        System.out.println(doubleList);

    }


}