package Day2_04022024;

import java.util.ArrayList;

public class T3_ForLoop {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA"); //index 0
        countries.add("INDIA"); //index 1
        countries.add("PAKISTAN"); //index 2
        countries.add("BANGLADESH"); //index 3
        countries.add("CANADA");// index 4
        //print out all the countries using a for loop
        for (int i = 0; i < countries.size(); i++) {
            //print out which index is at
            System.out.println("The value of i is " + i);
            //print out the country located at index i
            System.out.println("My countries are " + countries.get(i));
        }//end of for loop
    }//end of main
}//end of class