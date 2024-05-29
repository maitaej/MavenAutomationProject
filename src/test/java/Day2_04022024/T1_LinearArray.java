package Day2_04022024;

public class T1_LinearArray {
public static void main(String[] args) {
    //declare a string array variable
    String[] studentNames;
    //store some values in the string array
    studentNames = new String[]{"Abdul", "Ahmad", "Anderson", "Wahid"};
    //print out index 0 from studentNames array
    //array starts with 0
    System.out.println("The value of index 0 is " + studentNames[0]);
    //print out Anderson from the studentNames array
    System.out.println(" The student name is " + studentNames[2]);
    //print out Wahid from the studentNames array
    System.out.println("The student name is " + studentNames[3]);
    //declare and store student grades
    int[] studentGrades = new int[] {90,93,94,99};
    //print out grade 93 from array
    System.out.println("Student grade is "+ studentGrades[1]);
}//end of main method
}//end of class