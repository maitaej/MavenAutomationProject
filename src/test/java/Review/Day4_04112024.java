package Review;

import java.util.ArrayList;

public class Day4_04112024 {
    public static void main(String[] args) {
//declare an Array List
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the array list
        countries.add("USA");
        countries.add("India");
        countries.add("Canada");
        countries.add("Uganda");
        countries.add("Nigeria");
        //Declare and define while loop
        int i = 0;
        while (i < countries.size()){
        System.out.println("My current country is " + countries.get(i));
        i = i+1;
    }
        }
    }


