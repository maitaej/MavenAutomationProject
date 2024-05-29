package Day4_04152024;

import java.util.HashMap;

public class T1_HashMap {
public static void main(String[] args) {
    //create a hashmap consisting of name and age of Triage Students
    HashMap<String, Integer> triageStudents = new HashMap<>();
    //add some values for the triageStudenets hashmap
    triageStudents.put("Oyon" , 25);
    triageStudents.put("Shakeb" , 29);
    triageStudents.put("Tanvir" , 27);
    triageStudents.put("Angie" , 21);
    //print out size of the hashmap
    System.out.println("The size of the hashmap is " + triageStudents.size());
    //print out the contents of the hashmap
    System.out.println(triageStudents);
    //print out Oyons age
    int oyonsAge = triageStudents.get("Oyon");
    System.out.println("Oyon's age is " + oyonsAge);
    //another way of printing oyons age
    System.out.println("Oyon's age is " + triageStudents.get("Oyon"));
    //print out Noyons age only if it exists in the data set
    if (triageStudents.containsKey("Noyon")) {
        System.out.println("Noyon age is" + triageStudents.get("Noyon"));
    }else {
        System.out.println("Noyon does not exist in the data set");
    }//end of if else

}//end of main
}//end of class

