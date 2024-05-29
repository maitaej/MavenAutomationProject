package Automation_AI01;

import java.util.ArrayList;

public class Assignment_2 {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> region = new ArrayList<>();
        //add some values to the regions array list
        region.add("NorthEast"); //index 0
        region.add("NorthWest"); //index 1
        region.add("SouthEast"); //index 2
        region.add("SouthWest"); //index 3
        region.add("MidWest");   // index 4
        //print out all the regions using a for loop
        //declare an arraylist integer
        ArrayList<Integer> areaCode = new ArrayList<>();
        //add some values to the areaCode array list
        areaCode.add(718); //index 0
        areaCode.add(907); //index 1
        areaCode.add(305); //index 2
        areaCode.add(281); //index 3
        areaCode.add(270); //index 4
        //print out all the area codes using a for loop
        //declare an arraylist integer
        for (int i = 0; i < region.size(); i++) {
        System.out.println("My region is " + region.get(i) + " and my area code is " + areaCode.get(i) );
        }//end of for loop
    }//end of main
}//end of class


