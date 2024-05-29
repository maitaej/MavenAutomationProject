package Automation_AI02;

import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) {
//Declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA"); //index 0
        countries.add("India"); //index 1
        countries.add("Bangladesh"); //index 2
        countries.add("UK"); // index 3
        countries.add("Egypt"); //index 4
//Declare and define while loop
//Only print out if country is USA or Bangladesh
        int i = 0;
        while (i < countries.size()){
            if (countries.get(i).equals("USA")) {
                System.out.println("The country is " + countries.get(i));
            } else if (countries.get(i).equals("Bangladesh"))
                System.out.println("The country is " + countries.get(i));
            i = i+1;
        }//End of if else
        }//End of loop
    }//End of main











